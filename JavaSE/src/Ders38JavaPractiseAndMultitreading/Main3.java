package Ders38JavaPractiseAndMultitreading;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Start code");

        Thread1 thread1 = new Thread1();
        Thread3 thread3 = new Thread3();

        thread1.setPriority(2);
        thread3.setPriority(10);

        thread1.start();
        thread3.start();

        System.out.println("End code");
    }
}
