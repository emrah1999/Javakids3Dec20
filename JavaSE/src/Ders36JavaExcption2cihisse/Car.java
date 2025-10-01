package Ders36JavaExcption2cihisse;

public class Car {
    public void calc(Object car) throws ClassCastException,ArithmeticException{
        if (car instanceof Car){
            System.out.println("Bu bir mashindir");
        }else{
            throw new ClassCastException("Bu mashin deyil");
        }
    }
    public void mw(){

    }
}
