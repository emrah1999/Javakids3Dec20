package Ders37JavaDate1;
public class Main {
    public static void main(String[] args) {
        try{
            checkNumber(3);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkNumber(int a) throws ArithmeticException{
        if(a<5){
            throw new ArithmeticException("eded 5den kicik ola bilmez");
        }else{
            System.out.println("Eded 5den boyukdur");
        }
    }
}
