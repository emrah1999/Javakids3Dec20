package Ders30OOP2cihiss;

public class Cat extends Animal implements Eatable{
    public Cat(String name){
        super(name);
        System.out.println("Cat constructor");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
