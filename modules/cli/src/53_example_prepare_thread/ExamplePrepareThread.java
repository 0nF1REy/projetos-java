class WorkerThread extends Thread {
    private String name;

    public WorkerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " está executando!");
    }
}

public class ExamplePrepareThread {
    public static void main(String[] args) {
        // Criamos as threads (elas ainda NÃO estão executando)
        WorkerThread t1 = new WorkerThread("Thread A");
        WorkerThread t2 = new WorkerThread("Thread B");
        WorkerThread t3 = new WorkerThread("Thread C");

        System.out.println("Threads criadas, mas ainda não iniciadas...");

        // Fazemos outras coisas antes de iniciar
        System.out.println("Preparando o ambiente...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Agora, iniciamos as threads
        System.out.println("Iniciando threads!");
        t1.start();
        t2.start();
        t3.start();
    }
}
