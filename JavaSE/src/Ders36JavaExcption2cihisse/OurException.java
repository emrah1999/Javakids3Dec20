package Ders36JavaExcption2cihisse;

public class OurException extends ArithmeticException{
    public String internalMessage;
    public OurException(String message,String internalMessage){
        super(message);
        System.out.println(internalMessage);
    }
}
