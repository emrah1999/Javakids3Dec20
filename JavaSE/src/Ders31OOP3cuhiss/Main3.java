package Ders31OOP3cuhiss;

public class Main3 {
    public static void main(String[] args) {
        Eatable lion=new Lion();
        Eatable eagle=new Eagle();
        Eatable fish=new Fish();
        lion.eat("meat");
        eagle.eat("rabbit");
        fish.eat("fish");


        Calculator calculator=new Calculator();
        calculator.sum(3,5);
        calculator.sum(3,5,6);
        calculator.sum(3,5,7,9);
    }
}
