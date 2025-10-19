// Criando uma classe que implementa Runnable
class MyRunnable implements Runnable {
    private String nome;

    public MyRunnable(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        // Este código será executado em paralelo
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + " executando... passo " + i);
            try {
                Thread.sleep(1000); // pausa por 1 segundo
            } catch (InterruptedException e) {
                System.out.println(nome + " foi interrompida.");
            }
        }
        System.out.println(nome + " terminou!");
    }
}

// Classe principal
class TestRunnable {
    public static void main(String[] args) {
        // Criando os objetos Runnable
        MyRunnable r1 = new MyRunnable("Runnable 1");
        MyRunnable r2 = new MyRunnable("Runnable 2");

        // Criando as threads a partir dos Runnables
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Iniciando as threads
        t1.start();
        t2.start();

        System.out.println("Threads iniciadas!");
    }
}
