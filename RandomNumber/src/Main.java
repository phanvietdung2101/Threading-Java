import java.util.Random;

public class Main {
    static int num = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            public void run(){
                while (true) {
                    try {
                        num = new Random().nextInt(20);
                        System.out.println("t1:" + num);
                        Thread.sleep(2000);
                    } catch (InterruptedException e){
                        System.out.println("Break t1");
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                while (true){
                    try {
                        num = num * num;
                        System.out.println("t2:" + num);
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        System.out.println("Break t2");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
