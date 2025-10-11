package Ders39MultiThreading2;

public class Main5 {
    public static void main(String[] args) {
        AdiClass adiClass=new AdiClass();
        int a=5;
        int b=adiClass.metod(a);

        System.out.println(b);

        Bank bank=new Bank(100);

        adiClass.metod2(bank);

        System.out.println(bank.getBalance());

    }
}
