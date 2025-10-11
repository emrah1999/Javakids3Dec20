package Ders39MultiThreading2;

public class AdiClass {
    public int metod(int a){
        a+=5;
        return a;
    }

    public void metod2(Bank bank){
        bank.setBalance(bank.getBalance()-5);
    }
}
