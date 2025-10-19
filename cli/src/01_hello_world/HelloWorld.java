import java.time.LocalTime;
import java.time.LocalDate;

/* 
    Entrypoint
    Main
    Classe: Uma estrutura que define algum conceito do mundo real
    Boilerplate java
    A classe LocalTime foi importada para trabalhar com tempo, sem a necessidade de uma data completa. 
    Ela permite manipular e exibir apenas o horário (hora, minuto, segundo e nanosegundos).
*/

public class HelloWorld {
    public static void main(String[] args) {

        /**
         *  Sintaxe de declaração das variáveis no Java
         *  <tipo> identificador;
         *  <tipo> identificador; = valor;
         *  Variáveis tem escopos: bloco de comandos no qual
         *  a variável foi declarada..
         */

        // Declaração de variáveis
        String hello = "Olá";
        String world = "Mundo";
        LocalDate dataAtual = LocalDate.now();

        // Instanciando a classe TimeDisplay
        TimeDisplay timeDisplay = new TimeDisplay();

        // Exibindo as mensagens de saudação e dados
        System.out.println("===========");
        System.out.println(hello + "," + " " + world + "!");

        System.out.println("===========");
        System.out.println("Versão do Java em uso: " + System.getProperty("java.version"));
        System.out.println("===========");

        // Exibindo a data atual
        System.out.println("Data atual: " + dataAtual);
        System.out.println("===========");

        // Exibindo a hora atual
        timeDisplay.displayTime();
    }

    // Classe interna para exibir a hora atual
    static class TimeDisplay {
        public void displayTime() {
            LocalTime horaAtual = LocalTime.now();

            System.out.println("Hora atual: " + horaAtual);
            System.out.println("===========");
        }
    }
}
