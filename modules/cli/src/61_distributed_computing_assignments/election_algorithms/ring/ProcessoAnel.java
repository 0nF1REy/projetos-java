import java.util.Collections;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProcessoAnel extends Thread {

    private final int id;
    private boolean ativo;
    private int coordenadorId;
    private ProcessoAnel sucessor;
    private boolean ehParticipante; // Para saber se já está em uma eleição

    private final BlockingQueue<MensagemAnel> caixaDeEntrada = new LinkedBlockingQueue<>();

    public ProcessoAnel(int id) {
        this.id = id;
        this.ativo = true;
        this.coordenadorId = -1;
        this.ehParticipante = false;
        setName("Processo-" + id);
    }

    public void setSucessor(ProcessoAnel sucessor) {
        this.sucessor = sucessor;
    }

    public int getProcessoId() {
        return id;
    }

    public void desativar() {
        this.ativo = false;
        this.coordenadorId = -1; // Perde a noção de quem é o coordenador
        System.out.println("! P" + id + " foi desativado.");
    }

    public void ativar() {
        if (this.ativo) return;
        this.ativo = true;
        System.out.println("! P" + id + " foi reativado e vai iniciar uma eleição.");
        iniciarEleicao();
    }

    public void entregarMensagem(MensagemAnel msg) {
        if (this.ativo) {
            caixaDeEntrada.add(msg);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                MensagemAnel msg = caixaDeEntrada.take();
                if (ativo) {
                    processarMensagem(msg);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void processarMensagem(MensagemAnel msg) {
        if (msg.getTipo() == TipoMensagemAnel.ELEICAO) {
            // Se eu sou o iniciador da eleição (meu ID já está na lista)
            if (msg.getListaIds().contains(this.id)) {
                // FASE 1 TERMINOU: A mensagem deu a volta completa.
                System.out.println("P" + id + " recebeu a mensagem de eleição de volta. Lista: " + msg.getListaIds());
                
                // Determina o novo coordenador (maior ID na lista)
                int novoCoordenador = Collections.max(msg.getListaIds());
                System.out.println("P" + id + " determinou que P" + novoCoordenador + " é o vencedor.");

                // FASE 2 COMEÇA: Anunciar o vencedor
                MensagemAnel anuncio = new MensagemAnel(TipoMensagemAnel.COORDENADOR, novoCoordenador);
                enviarMensagem(anuncio);

            } else {
                // FASE 1 CONTINUA: Processo intermediário.
                System.out.println("P" + id + " recebeu ELEIÇÃO. Adicionando seu ID e repassando...");
                msg.adicionarId(this.id);
                this.ehParticipante = true;
                enviarMensagem(msg);
            }

        } else if (msg.getTipo() == TipoMensagemAnel.COORDENADOR) {
            // Se eu sou o novo coordenador, a mensagem de anúncio para aqui.
            if (this.id == msg.getCoordenadorId()) {
                System.out.println("P" + id + " (o novo coordenador) recebeu a confirmação. Anúncio completo.");
            } else {
                 // Recebi o anúncio, atualizo meu estado e repasso a mensagem.
                System.out.println("P" + id + " recebeu o anúncio: P" + msg.getCoordenadorId() + " é o novo coordenador. Repassando...");
                enviarMensagem(msg);
            }
            
            this.coordenadorId = msg.getCoordenadorId();
            this.ehParticipante = false; // A eleição terminou para mim.
        }
    }

    public void iniciarEleicao() {
        if (!ativo) {
            System.out.println("P" + id + " está inativo e não pode iniciar eleição.");
            return;
        }
        if (ehParticipante) {
            System.out.println("P" + id + " já está participando de uma eleição.");
            return;
        }
        
        System.out.println("P" + id + " iniciou uma eleição.");
        this.ehParticipante = true;

        // FASE 1 COMEÇA: Cria a mensagem e envia para o sucessor
        MensagemAnel msg = new MensagemAnel(TipoMensagemAnel.ELEICAO);
        msg.adicionarId(this.id);
        enviarMensagem(msg);
    }
    
    private void enviarMensagem(MensagemAnel msg) {
        System.out.println("P" + id + " -> enviando " + msg.getTipo() + " -> P" + sucessor.getProcessoId());
        sucessor.entregarMensagem(msg);
    }
}