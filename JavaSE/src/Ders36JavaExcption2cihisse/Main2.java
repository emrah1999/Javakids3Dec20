package Ders36JavaExcption2cihisse;

public class Main2{
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }

    public static void m2(){
        try {
            m3();
        }catch (Exception e){
            System.out.println("Exception hadisesi bash verdi");
        }

    }

    public static void m3(){
        System.out.println(5/0);


    }

}
