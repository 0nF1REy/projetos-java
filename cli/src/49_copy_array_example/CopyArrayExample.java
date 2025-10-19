public class CopyArrayExample {
    public static void main(String[] args) {
        byte[] original = {10, 20, 30, 40, 50, 60, 70, 80};

        // índice inicial para copiar (começa em original[2], que é 30)
        int off = 2;

        // quantidade de elementos a copiar
        int len = 4;

        byte[] copia = new byte[len];

        // Copiando os elementos do array original
        for (int i = 0; i < len; i++) {
            copia[i] = original[off + i];
        }

        System.out.print("Array original: ");
        printArray(original);

        System.out.print("Array copiado (off=" + off + ", len=" + len + "): ");
        printArray(copia);
    }

    private static void printArray(byte[] arr) {
        for (byte b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
