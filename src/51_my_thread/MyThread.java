// Criando uma classe que estende Thread
class MyThread extends Thread {
    private String nome;

    public MyThread(String nome) {
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
class TesteThread {
    public static void main(String[] args) {
        // Criando e iniciando duas threads
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start(); // inicia a execução da thread 1
        t2.start(); // inicia a execução da thread 2

        System.out.println("Threads iniciadas!");
    }
}
