public class Metodos {
    public static void main(String[] args) {
        // ativarSoneca();
        String mensagemDoAlarme = agendarAlarme(12, 30); // Argumentos
        System.out.println(mensagemDoAlarme);
    }

    /*
     * Sintaxe de declaração de métodos no Java:
     * <tipo do retorno do metodo> identificador(<tipo> parâmetro) {
     * <bloco de comandos>
     * }
     */
    static void ativarSoneca() {
        System.out.println("Só mais 5 minutinhos :P");
    }

    static String agendarAlarme(int hora, int minutos) {
        // 12:00
        return "Seu alarme foi configurado às " + hora + ":" + minutos;
    }
}
