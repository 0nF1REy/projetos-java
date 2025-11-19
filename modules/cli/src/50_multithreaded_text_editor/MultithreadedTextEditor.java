import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MultithreadedTextEditor {
    private static StringBuilder documento = new StringBuilder();
    private static boolean executando = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Thread 1: Verificação ortográfica (rodando em segundo plano)
        Thread verificadorOrtografico = new Thread(() -> {
            while (executando) {
                try {
                    Thread.sleep(5000); // verifica a cada 5 segundos
                    synchronized (documento) {
                        if (documento.length() > 0) {
                            System.out.println("\n[Verificador] Verificando ortografia...");
                            // Simulação simples: apenas verifica se há a palavra "erro"
                            if (documento.toString().contains("erro")) {
                                System.out.println("[Verificador] Palavra suspeita encontrada: 'erro'");
                            } else {
                                System.out.println("[Verificador] Nenhum erro encontrado.");
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread 2: Salvamento automático (rodando em segundo plano)
        Thread salvamentoAutomatico = new Thread(() -> {
            while (executando) {
                try {
                    Thread.sleep(10000); // salva a cada 10 segundos
                    synchronized (documento) {
                        salvarDocumento(documento.toString());
                        System.out.println("[Salvamento] Documento salvo automaticamente.");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Inicia as threads de segundo plano
        verificadorOrtografico.start();
        salvamentoAutomatico.start();

        // Thread principal: leitura e edição do texto
        System.out.println("=== Editor de Texto Multithread ===");
        System.out.println("Digite seu texto abaixo (digite 'sair' para encerrar):");

        while (true) {
            String linha = scanner.nextLine();

            if (linha.equalsIgnoreCase("sair")) {
                executando = false;
                break;
            }

            synchronized (documento) {
                documento.append(linha).append("\n");
            }
        }

        // Finaliza as threads antes de encerrar
        try {
            verificadorOrtografico.join();
            salvamentoAutomatico.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        scanner.close();
        System.out.println("Programa encerrado. Documento final salvo.");
    }

    // Método auxiliar para salvar o conteúdo em um arquivo
    private static void salvarDocumento(String conteudo) {
        try (FileWriter writer = new FileWriter("documento.txt")) {
            writer.write(conteudo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o documento: " + e.getMessage());
        }
    }
}
