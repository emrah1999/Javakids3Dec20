package Ders31OOP3cuhiss;

public class Fish implements Eatable,Swimmable {
    @Override
    public void eat(String food) {
        System.out.println("Fish is eating " + food);
    }


    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
