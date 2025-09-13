package Ders30OOP2cihiss;

public class Main {
    public static void main(String[] args) {
        Calculation calculation=new Calculation();

        calculation.sum(4,5);
        calculation.sub(9,5);
        System.out.println(calculation.multiple(4,5));
        System.out.println(calculation.divide(4,0));
        calculation.qaliq(5,2);
    }
}
