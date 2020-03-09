public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int i = 2;
        while(i < Integer.MAX_VALUE){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime)
                System.out.println("fast "+ i);
            i++;
        }
    }
}
