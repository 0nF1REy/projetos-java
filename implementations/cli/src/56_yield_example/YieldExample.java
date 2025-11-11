class ForeverThread extends Thread {
    public void run() {
        
        int i = 0;

        while (true) {
            System.out.println("Loop " + i++);
            Thread.yield();
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {

        ForeverThread thread = new ForeverThread();
        thread.start();

        for (int j = 0; j < 5; j++) {
            System.out.println("Thread principal executando " + j);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread principal terminou (a outra thread continua executando)");
    }
}
