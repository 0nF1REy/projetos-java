import java.util.ArrayList;
import java.util.List;

public class MensagemAnel {
    private final TipoMensagemAnel tipo;
    private final List<Integer> listaIds;
    private int coordenadorId;

    // Construtor para mensagem de ELEIÇÃO
    public MensagemAnel(TipoMensagemAnel tipo) {
        if (tipo != TipoMensagemAnel.ELEICAO) {
            throw new IllegalArgumentException("Use este construtor apenas para mensagens de ELEIÇÃO.");
        }
        this.tipo = tipo;
        this.listaIds = new ArrayList<>();
    }

    // Construtor para mensagem de COORDENADOR
    public MensagemAnel(TipoMensagemAnel tipo, int coordenadorId) {
        if (tipo != TipoMensagemAnel.COORDENADOR) {
            throw new IllegalArgumentException("Use este construtor apenas para mensagens de COORDENADOR.");
        }
        this.tipo = tipo;
        this.coordenadorId = coordenadorId;
        this.listaIds = null; // Não usado neste tipo de mensagem
    }

    public TipoMensagemAnel getTipo() {
        return tipo;
    }

    public List<Integer> getListaIds() {
        return listaIds;
    }

    public int getCoordenadorId() {
        return coordenadorId;
    }

    public void adicionarId(int id) {
        if (this.tipo == TipoMensagemAnel.ELEICAO) {
            this.listaIds.add(id);
        }
    }
}