import java.util.ArrayList;
import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {
        int i, j;
        Rr proc[] = new Rr[10];

        for (i = 0; i < proc.length; i++)
            proc[i] = new Rr();

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de processos: ");
        int num = in.nextInt();
        if (num < 2 || num > proc.length) {
            System.out.println("Número de processos inválido (2..10).");
            return;
        }

        for (i = 0; i < num; i++) {
            proc[i].indice = i;
            System.out.print("Digite o ID do processo [" + i + "]: ");
            proc[i].id = in.nextInt();
            proc[i].estado = "ativo";
            proc[i].f = 0;
        }

        for (i = 0; i < num - 1; i++) {
            for (j = 0; j < num - 1 - i; j++) {
                if (proc[j].id > proc[j + 1].id) {
                    Rr tmp = proc[j];
                    proc[j] = proc[j + 1];
                    proc[j + 1] = tmp;
                }
            }
        }

        System.out.println("Lista ordenada de processos:");
        for (i = 0; i < num; i++) {
            System.out.println(" [" + i + "] " + proc[i].id + " (" + proc[i].estado + ")");
        }

        int coordIndex = num - 1;
        System.out.println("\nO processo " + proc[coordIndex].id + " foi escolhido como coordenador (inicial).");

        while (true) {
            System.out.println("\n1. Eleição  2. Sair");
            int opcao = in.nextInt();

            for (i = 0; i < num; i++) proc[i].f = 0;

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o índice do processo que iniciará a eleição (0.." + (num - 1) + "): ");
                    int initiator = in.nextInt();
                    if (initiator < 0 || initiator >= num) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(proc[initiator].id);

                    int start = initiator;
                    int current = (initiator + 1) % num;

                    do {
                        if ("ativo".equals(proc[current].estado) && proc[current].f == 0) {
                            System.out.println("Processo " + proc[start].id + " enviou mensagem para " + proc[current].id);
                            proc[current].f = 1;
                            start = current;
                            arr.add(proc[current].id);
                        }
                        current = (current + 1) % num;
                    } while (current != initiator);

                    System.out.println("Processo " + proc[start].id + " enviou mensagem para " + proc[initiator].id);

                    int max = -1;
                    for (int idVal : arr) {
                        if (idVal > max) max = idVal;
                    }

                    System.out.println("\nO processo " + max + " foi escolhido como coordenador");

                    for (i = 0; i < num; i++) {
                        if (proc[i].id == max) {
                            coordIndex = i;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Programa encerrado.");
                    in.close();
                    return;

                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
        }
    }
}

class Rr {
    public int indice;
    public int id;
    public int f;
    public String estado;
}
