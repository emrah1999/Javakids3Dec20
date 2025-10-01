package Ders35JavaException;

public class Calc {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Bolen 0 ola bilmez");
        } else {
            return a / b;
        }
    }

    public int qaliq(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Bolen 0 ola bilmez");
        } else {
            return a % b;
        }
    }
}
