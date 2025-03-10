import java.time.LocalTime;

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

        // Variáveis
        String hello = "Olá";
        String world = "Mundo";
        
        System.out.println("===========");
        System.out.println(hello + "," + " " + world + "!"); 
        System.out.println("===========");
        
        System.out.println("A versão do atual do Java é: " + System.getProperty("java.version"));
        
        LocalTime agora = LocalTime.now();
        System.out.println("Hora atual: " + agora);
    }
}

