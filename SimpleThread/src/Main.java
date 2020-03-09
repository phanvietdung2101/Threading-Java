public class Main extends Thread{
    public static void main(String[] args) {
        NumberGenerator r1 = new NumberGenerator();
        NumberGenerator r2 = new NumberGenerator();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
