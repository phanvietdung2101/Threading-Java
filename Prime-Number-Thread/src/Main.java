public class Main {
    public static void main(String[] args) {
        Thread fastThread = new Thread(new OptimizedPrimeFactorization());
        Thread slowThread = new Thread(new LazyPrimeFactorization());

        fastThread.start();
        slowThread.start();
    }
}
