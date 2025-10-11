package Ders39MultiThreading2;

import Ders31OOP3cuhiss.B;

public class Main4 {
    public static void main(String[] args) {
        Bank bank=new Bank(1000);

        BankThread[] bankThreads=new BankThread[1000];

        for(BankThread bankThread:bankThreads){
            bankThread=new BankThread(bank);
            bankThread.start();
        }

        try {
            Thread.sleep(2000);
            System.out.println("Balance " +bank.getBalance());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
