package Ders38JavaPractiseAndMultitreading;

public class Thread1 extends Thread {
    @Override
    public void run(){
        System.out.println("Thread1 calisti");
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
