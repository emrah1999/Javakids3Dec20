package Ders39MultiThreading2;

public class Main {
    public static void main(String[] args) {
        MyThread thread1=new MyThread();

        Thread thread=new Thread(new MyThread2());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();

    }
}
