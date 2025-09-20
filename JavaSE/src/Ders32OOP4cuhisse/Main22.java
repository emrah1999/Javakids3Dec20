package Ders32OOP4cuhisse;

public class Main22 {
    public static void main(String[] args)  throws CloneNotSupportedException{
        Car car=new Car("BMW",30000);
        Car car2=new Car("BMW",30000);

        if (car.equals(car2)){
            System.out.println("Aynı araba");
        } else {
            System.out.println("Farklı araba");
        }

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());

        car=null;
        System.gc();
        System.out.println(car);

    }
}
