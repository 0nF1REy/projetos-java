class Chew extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(getName() + " " + i);
        }
    }
}

public class TestChew {
    public static void main(String[] args) {
        // Criando e iniciando duas threads (poderiam ser mais)
        Chew t1 = new Chew();
        t1.setName("Trabalho A");

        Chew t2 = new Chew();
        t2.setName("Trabalho B");

        // Iniciando as threads (isso faz o método run() rodar em paralelo)
        t1.start();
        t2.start();

        System.out.println("Threads iniciadas!");
    }
}
