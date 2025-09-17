package Ders31OOP3cuhiss;

public class Main2 {
    public static void main(String[] args) {
        Lion lion=new Lion();
        Eagle eagle=new Eagle();
        Fish fish=new Fish();

        lion.eat("meat");
        lion.run();

        fish.eat("plankton");
        fish.swim();

        eagle.eat("fish");
        eagle.fly();
        eagle.run();
    }
}
