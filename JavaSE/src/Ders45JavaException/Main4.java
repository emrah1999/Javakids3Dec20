package Ders45JavaException;

public class Main4 {
    public static void main(String[] args) {
        Calc calc=new Calc();
        try{
            System.out.println(calc.qaliq(9,0));
            System.out.println(calc.divide(9,0));
            System.out.println(calc.divide(9,3));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
