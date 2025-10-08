package Ders38JavaPractiseAndMultitreading;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start code");

//        Thread1 thread1=new Thread1();
//        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        System.out.println("End code");
    }
}
