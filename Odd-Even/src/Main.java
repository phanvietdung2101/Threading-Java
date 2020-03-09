public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        oddThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }
        evenThread.start();
    }
}
