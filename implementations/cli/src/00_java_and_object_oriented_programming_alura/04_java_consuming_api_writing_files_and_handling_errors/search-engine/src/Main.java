import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        CepLookup cepLookup = new CepLookup();

        System.out.println("Digite um número de CEP para consulta: ");
        var cep = reading.nextLine();

        try {
            Address newAddress = cepLookup.addressLookup(cep);
            System.out.println(newAddress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
