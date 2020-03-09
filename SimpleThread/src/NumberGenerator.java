public class NumberGenerator implements Runnable {
    int value = 0;

    @Override
    public void run() {
        while(value < 10){
            try {
                System.out.println(value + " - hashcode:" + this.hashCode());
                value += 1;
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
