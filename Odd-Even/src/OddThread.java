public class OddThread extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 10; i = i + 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
