import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do primeiro vetor (x y): ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.println("Digite os valores do segundo vetor (x y): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        // Instanciação de objetos
        Vector2d v1 = new Vector2d(x1, y1);
        Vector2d v2 = new Vector2d(x2, y2);

        System.out.println("V1: " + v1);
        System.out.println("V2: " + v2);
        System.out.println("Produto interno: " + v1.dot(v2));
        System.out.println("Magnitude de V1: " + v1.magnitude());
        System.out.println("Magnitude de V2: " + v2.magnitude());

        sc.close();
    }
}
