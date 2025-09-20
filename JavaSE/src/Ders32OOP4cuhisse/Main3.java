package Ders32OOP4cuhisse;

public class Main3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car=new Car("BMW",30000);
        Car car2= (Car) car.clone();

        car.model="Mercedes";
        car2.price=44000;

        System.out.println(car.model);
        System.out.println(car2.model);


        System.out.println(car.price);
        System.out.println(car2.price);
    }
}
