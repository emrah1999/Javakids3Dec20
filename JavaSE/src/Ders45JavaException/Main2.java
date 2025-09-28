package Ders45JavaException;

import Ders32OOP4cuhisse.Car;

public class Main2 {
    public static void main(String[] args) {
        int a=6;
        int b=0;
        Car car=new Car("BMW",2020);

        try{
            car.toString();
            try{
                System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
