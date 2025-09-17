package Ders31OOP3cuhiss;

public class Eagle implements  Eatable,Flyable,Runnable{

    @Override
    public void eat(String food) {
        System.out.println("Eagle is eating: " + food);
    }


    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void run() {
        System.out.println("Eagle is running");
    }
}
