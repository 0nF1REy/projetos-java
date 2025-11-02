class SleepTest extends Thread {

    public void run()
    {
        System.out.println("Tempo zero");
        try {
            sleep(500);
        }
        catch (InterruptedException e) {}
        System.out.println("meio segundo depois!");
    }

    public static void main(String[] args) {
        
        SleepTest myThread = new SleepTest();
        
        myThread.start();
    }
}