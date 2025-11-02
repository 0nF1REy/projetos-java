class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) {
        myThread mythread = new myThread();

        System.out.println("isAlive: " + mythread.isAlive());
        mythread.start();
        System.out.println("isAlive: " + mythread.isAlive());

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {}

        System.out.println("isAlive (depois do fim): " + mythread.isAlive());
    }
}
