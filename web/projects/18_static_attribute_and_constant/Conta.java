public class Conta {
    // Atributo estático compartilhado entre todas as instâncias
    static double saldoContaConjunta = 0.0;
    double saldo;
    final static double TAXA_SERVICOS = 10.5; // Snake Case

    // Método para depositar um valor no saldoContaConjunta
    public void depositarContaConjunta(double valor) {
        saldoContaConjunta += valor;
    }

    public void depositarConta(double valor) {
        saldo += valor;
    }
}