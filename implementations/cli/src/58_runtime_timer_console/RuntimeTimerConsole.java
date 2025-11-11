public class RuntimeTimerConsole {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        while (true) {
            long elapsed = (System.currentTimeMillis() - startTime) / 1000;

            long hours = elapsed / 3600;
            long minutes = (elapsed % 3600) / 60;
            long seconds = elapsed % 60;

            System.out.printf("\rTempo de execução: %02d:%02d:%02d", hours, minutes, seconds);

            Thread.sleep(1000);
        }
    }
}
