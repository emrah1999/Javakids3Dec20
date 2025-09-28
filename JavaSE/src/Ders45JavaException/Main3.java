package Ders45JavaException;

public class Main3 {
    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr={1,2,3};
        try {
            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }
        finally {
            System.out.println("Ben her halda calishir");
        }
    }
}
