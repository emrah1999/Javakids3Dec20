package Ders34OOP6cihisseTekrar;

public class Main2 {
    public static void main(String[] args) {
        Flyable flyable=new Flyable() {
            @Override
            public void fly(String name) {
                System.out.println(name+" is flying");
            }
        };
        flyable.fly("eagle");

        Flyable flyable1=new Flyable() {
            @Override
            public void fly(String name) {
                System.out.println(name+" is flying");
            }
        };
        flyable1.fly("butterfly");
    }
}

