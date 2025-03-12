import java.util.Random;

public class StaticAttributeAndConstant {
    public static void main(String[] args) {

        // Static:
        // 1. Quando não precisamos de objetos!
        // 2. Constantes
        // 3. Classes utilitárias

        Conta contaAlan = new Conta();
        Conta contaYuffie = new Conta();

        contaAlan.depositarContaConjunta(100.0);
        contaYuffie.depositarConta(25.455);

        Random random = new Random();
        float numeroDaSorte = 1 + (random.nextFloat() * 99);

        System.out.println("======================");

        // Ambos os objetos compartilham o saldoContaConjunta porque é estático
        System.out.println("O saldo da conta conjunta é: R$ " + Conta.saldoContaConjunta);

        System.out.println("Saldo da conta de Alan: R$ " + contaAlan.saldo);
        System.out.println("Saldo da conta de Yuffie: R$ " + Math.round(contaYuffie.saldo));

        System.out.println("- - - - - - - - - -");
        System.out.println("A taxa cobrada pela utilização do serviço é: R$ " + Conta.TAXA_SERVICOS);
        System.out.println("Agradecemos por utilizar o nosso sistema!");
        System.out.println("Número da sorte: " + Math.round(numeroDaSorte));

        System.out.println("======================");
    }
}