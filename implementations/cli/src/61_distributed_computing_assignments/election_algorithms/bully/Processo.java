import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

public class Processo extends Thread {

    private final int id;
    private boolean ativo;
    private int coordenadorId;
    private boolean esperandoResposta; // Flag para controlar o timeout da eleição

    private final List<Processo> todosProcessos;
    private final BlockingQueue<Mensagem> caixaDeEntrada = new LinkedBlockingQueue<>();

    // Timeouts simulados em milissegundos
    private static final int TIMEOUT_RESPOSTA = 2000; // Tempo para esperar uma RESPOSTA
    private static final int TIMEOUT_COORDENADOR = 4000; // Tempo para esperar um anúncio de COORDENADOR

    public Processo(int id, List<Processo> todosProcessos) {
        this.id = id;
        this.ativo = true;
        this.coordenadorId = -1; // -1 indica que não sabe quem é o coordenador
        this.esperandoResposta = false;
        this.todosProcessos = todosProcessos;
        setName("Processo-" + id);
    }

    public int getProcessoId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    // Método para simular uma falha no processo
    public void desativar() {
        this.ativo = false;
        System.out.println("! P" + id + " foi desativado (falhou).");
    }

    // Método para simular a recuperação do processo
    public void ativar() {
        if (this.ativo) return;
        this.ativo = true;
        System.out.println("! P" + id + " foi reativado e vai iniciar uma eleição.");
        iniciarEleicao();
    }
    
    // Método para um processo externo entregar uma mensagem
    public void entregarMensagem(Mensagem msg) {
        if (this.ativo) {
            this.caixaDeEntrada.add(msg);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Processa a próxima mensagem na caixa de entrada
                Mensagem msg = caixaDeEntrada.take();
                if (ativo) {
                    processarMensagem(msg);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void processarMensagem(Mensagem msg) {
        System.out.println("P" + id + " recebeu: " + msg.getTipo() + " de P" + msg.getRemetenteId());

        switch (msg.getTipo()) {
            case ELEICAO:
                // Se eu tenho um ID maior, respondo e começo minha própria eleição
                if (this.id > msg.getRemetenteId()) {
                    enviarMensagem(msg.getRemetenteId(), new Mensagem(TipoMensagem.RESPOSTA, this.id));
                    iniciarEleicao();
                }
                break;

            case RESPOSTA:
                // Recebi uma resposta de um processo maior, então eu perdi a eleição.
                // Agora só preciso esperar o anúncio do vencedor.
                this.esperandoResposta = false;
                break;

            case COORDENADOR:
                // Um novo coordenador foi eleito. Atualizo minha variável.
                this.coordenadorId = msg.getRemetenteId();
                System.out.println("P" + id + " reconhece P" + this.coordenadorId + " como o novo coordenador.");
                break;
        }
    }

    public synchronized void iniciarEleicao() {
        System.out.println("P" + id + " iniciou uma eleição.");

        // Encontra todos os processos com ID maior que o meu
        List<Processo> processosSuperiores = todosProcessos.stream()
                .filter(p -> p.getProcessoId() > this.id)
                .collect(Collectors.toList());

        if (processosSuperiores.isEmpty()) {
            // Se não há processos com ID maior, eu sou o coordenador.
            anunciarVitoria();
            return;
        }

        // Envia mensagem de ELEICAO para todos os processos superiores
        for (Processo p : processosSuperiores) {
            enviarMensagem(p.getProcessoId(), new Mensagem(TipoMensagem.ELEICAO, this.id));
        }

        this.esperandoResposta = true;

        // Inicia um "timer" para esperar por respostas (RESPOSTA)
        new Thread(() -> {
            try {
                Thread.sleep(TIMEOUT_RESPOSTA);
                // Se após o timeout, a flag 'esperandoResposta' ainda for true,
                // significa que ninguém com ID maior respondeu. Então eu ganhei.
                if (this.esperandoResposta) {
                    anunciarVitoria();
                }
                // Se a flag for false, significa que recebemos uma RESPOSTA e
                // agora estamos apenas esperando o anúncio do COORDENADOR de quem nos respondeu.
                // Um timeout adicional poderia ser implementado aqui para o caso de o vencedor falhar antes de anunciar.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    private void anunciarVitoria() {
        System.out.println("P" + id + " se declara o novo COORDENADOR!");
        this.coordenadorId = this.id;
        
        // Anuncia para todos os processos (incluindo ele mesmo) que é o novo coordenador
        for (Processo p : todosProcessos) {
            enviarMensagem(p.getProcessoId(), new Mensagem(TipoMensagem.COORDENADOR, this.id));
        }
    }
    
    private void enviarMensagem(int destinatarioId, Mensagem msg) {
        // Encontra o processo de destino na lista e entrega a mensagem
        todosProcessos.stream()
            .filter(p -> p.getProcessoId() == destinatarioId && p.isAtivo())
            .findFirst()
            .ifPresent(p -> {
                System.out.println("P" + id + " -> enviando " + msg.getTipo() + " -> P" + destinatarioId);
                p.entregarMensagem(msg);
            });
    }
}