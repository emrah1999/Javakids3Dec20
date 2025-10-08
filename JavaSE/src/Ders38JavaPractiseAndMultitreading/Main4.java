package Ders38JavaPractiseAndMultitreading;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Start code");

        Thread1 thread1 = new Thread1();
        Thread3 thread3 = new Thread3();

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();

        System.out.println("End code");
    }
}
