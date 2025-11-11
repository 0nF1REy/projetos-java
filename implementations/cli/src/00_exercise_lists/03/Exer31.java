import java.text.DecimalFormat;

public class Exer31 {
    public static void main (String[] args) {

        double salario = 1000; // salário inicial em 1995
        double percentual = 1.5; // reajuste de 1996

        salario += (salario / 100) * percentual; // salário de 1996

        DecimalFormat format = new DecimalFormat("#,###.00"); // sempre 2 casas decimais, # = Número

        for (int i = 1997; i <= 2025; i++) {
            percentual += 0.1;
            salario += (salario / 100) * percentual;
            System.out.println(i + " = R$ " + format.format(salario) + " - " + String.format("%.1f", percentual) + "%");
        }
    }
}
