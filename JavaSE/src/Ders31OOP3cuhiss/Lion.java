package Ders31OOP3cuhiss;

public class Lion implements Eatable,Runnable{
    String name;

    @Override
    public void eat(String food) {
        System.out.println("Lion is eating: " + food);
    }

    @Override
    public void run() {
        System.out.println("Lion is running");
    }

    @Override
    public String toString() {
        return "Lion{name='" + name + "'}";
    }
}
