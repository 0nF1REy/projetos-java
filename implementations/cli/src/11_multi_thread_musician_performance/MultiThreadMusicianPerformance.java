class MultiThreadMusicianPerformance implements Runnable {
    private String musicianName;

    // Construtor com o nome correto
    public MultiThreadMusicianPerformance(String musicianName) {
        this.musicianName = musicianName;
    }

    // Método obrigatório da interface Runnable
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(musicianName + " está tocando a nota: " + i);
            try {
                Thread.sleep(1000); // Simula o tempo entre cada nota
            } catch (InterruptedException e) {
                System.out.println(musicianName + " foi interrompido no meio da música!");
            }
        }
        System.out.println(musicianName + " terminou sua parte da música.");
    }

    public static void main(String[] args) {
        System.out.println("O maestro levanta a batuta! O dueto vai começar...");

        // Criando e iniciando dois músicos (threads)
        Thread musician1 = new Thread(new MultiThreadMusicianPerformance("Guitarrista"));
        Thread musician2 = new Thread(new MultiThreadMusicianPerformance("Baterista"));

        musician1.start(); // O guitarrista começa a tocar
        musician2.start(); // O baterista começa a tocar

        System.out.println("Os músicos estão tocando simultaneamente...");
    }
}
