package Ders39MultiThreading2;

public class Bank {
    private  Integer balance;

    public String lock=new String();

    public Bank(Integer balance){
        this.balance=balance;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    public synchronized void withdraw(Integer amount){
        this.balance=this.balance-amount;
    }
    public  void withdraw1(Integer amount){
        synchronized (lock){
            this.balance=this.balance-amount;
        }



    }
}
