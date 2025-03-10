import java.util.concurrent.CompletableFuture;

public class ConcurrentTaskCoordinator {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Iniciando as tarefas de casa...");
        System.out.println("----------------------------------------");

        // Tarefa de esperar a entrega (assíncrona)
        CompletableFuture<Void> esperaEntrega = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Esperando o entregador...");
                Thread.sleep(3000); // leva 3 segundos
                System.out.println("Entrega recebida!");
            } catch (InterruptedException e) {
                System.err.println("Erro ao esperar a entrega.");
            }
        });

        // Tarefa de cozinhar (assíncrona)
        CompletableFuture<Void> cozinhar = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Começando a cozinhar o arroz...");
                Thread.sleep(2000); // leva 2 segundos
                System.out.println("Arroz cozido!");
            } catch (InterruptedException e) {
                System.err.println("Erro ao cozinhar o arroz.");
            }
        });

        // Tarefa de limpar a casa (assíncrona)
        CompletableFuture<Void> limparCasa = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Começando a limpar a casa...");
                Thread.sleep(1000); // leva 1 segundo
                System.out.println("Casa limpa!");
            } catch (InterruptedException e) {
                System.err.println("Erro ao limpar a casa.");
            }
        });

        // Espera todas as tarefas terminarem
        CompletableFuture<Void> todasTarefas = CompletableFuture.allOf(esperaEntrega, cozinhar, limparCasa);

        // Espera o fim de todas as tarefas antes de finalizar o programa
        todasTarefas.join();

        System.out.println("----------------------------------------");
        System.out.println("Todas as tarefas concluídas. Fim do dia!");
        System.out.println("========================================");
    }
}
