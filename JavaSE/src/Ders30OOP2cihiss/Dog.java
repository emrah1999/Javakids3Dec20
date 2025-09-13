package Ders30OOP2cihiss;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
        System.out.println("Dog constructor");
    }
    @Override
    public void print(){
        super.print();
    }
}
