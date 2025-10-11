package Ders39MultiThreading2;

public class Main2 {
    public static void main(String[] args) {
        MyThread3 thread1=new MyThread3();
        MyThread thread2=new MyThread();
        thread1.setPriority(10);
        thread2.setPriority(1);
        thread2.start();
        thread1.start();
    }
}
