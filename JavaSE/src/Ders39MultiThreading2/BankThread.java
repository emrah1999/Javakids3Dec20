package Ders39MultiThreading2;

public class BankThread extends  Thread{
    Bank bank;

    public BankThread(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run(){
        bank.withdraw1(1);
    }
}
