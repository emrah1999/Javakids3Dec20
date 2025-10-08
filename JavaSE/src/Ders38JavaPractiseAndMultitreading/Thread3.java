package Ders38JavaPractiseAndMultitreading;

public class Thread3 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread3 calisti");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
