import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class JavaUtilsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(frase);
        System.out.println("Palavras da frase:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println("\nDigite seu e-mail para validação:");
        String email = scanner.nextLine();
        boolean emailValido = Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email);
        System.out.println("E-mail é válido? " + emailValido);

        Integer[] numeros = new Integer[5];
        Random random = new Random();
        System.out.println("\nNúmeros aleatórios:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
            System.out.print(numeros[i] + " ");
        }

        Arrays.sort(numeros);
        System.out.println("\nOrdenados (crescente): " + Arrays.toString(numeros));

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordenados (decrescente): " + Arrays.toString(numeros));

        Date agora = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataFormatada = formato.format(agora);

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(agora);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int ano = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);

        System.out.println("\nData atual com Date: " + agora);
        System.out.println("Data formatada com SimpleDateFormat: " + dataFormatada);
        System.out.printf("Data obtida com Calendar: %02d/%02d/%04d %02d:%02d\n", dia, mes, ano, hora, minuto);

        scanner.close();
    }
}
