package Ders36JavaExcption2cihisse;

public class Main3 {
    public static void main(String[] args) {
        Car car=new Car();
        try {
            car.calc(car);
        }catch (ClassCastException | ArithmeticException e){
            System.out.println(e.getMessage());
        }

        Calc calc=new Calc();
        try {
            calc.divide(3,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
