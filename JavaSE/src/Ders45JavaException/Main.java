package Ders45JavaException;

public class Main {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Ben her halda calishir");
        }
    }
}
