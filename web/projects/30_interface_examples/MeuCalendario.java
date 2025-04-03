public class MeuCalendario implements ConstantesDatas {
    public static void main(String[] args) {

        int totalMeses = MESES_POR_ANO;
        int totalDias = MESES_POR_ANO * DIAS_POR_MES;
        int totalSemanas = SEMANAS_POR_ANO;

        System.out.println("=====================");
        System.out.println("O primeiro mês do ano é " + MES_INICIAL);
        System.out.println("O ano possui " + totalMeses + " meses.");
        System.out.println("O ano possui aproximadamente " + totalDias + " dias.");
        System.out.println("O ano possui " + totalSemanas + " semanas.");
        System.out.println("=====================");
    }
}
