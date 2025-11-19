public class Mensagem {
    private final TipoMensagem tipo;
    private final int remetenteId;

    public Mensagem(TipoMensagem tipo, int remetenteId) {
        this.tipo = tipo;
        this.remetenteId = remetenteId;
    }

    public TipoMensagem getTipo() {
        return tipo;
    }

    public int getRemetenteId() {
        return remetenteId;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "tipo=" + tipo + ", remetenteId=" + remetenteId + '}';
    }
}