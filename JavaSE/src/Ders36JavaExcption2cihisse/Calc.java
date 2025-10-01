package Ders36JavaExcption2cihisse;

public class Calc {
    public void divide(int a,int b) throws Exception{
        if(b==0){
            throw new OurException("0 bolmek olmaz","no divide by zero");
        }else {
            System.out.println(a/b);
        }
    }
}
