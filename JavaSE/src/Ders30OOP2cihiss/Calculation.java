package Ders30OOP2cihiss;

public class Calculation {
    public void sum(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a ,int b){
        System.out.println(a-b);
    }
    public int multiple(int a ,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            System.out.println("Bolen 0 olamaz");
            return 0;
        }
        return a/b;
    }
    public void qaliq(int a,int b){
        if (b==0){
            System.out.println("Bolen 0 olamaz");
            return;
        }
        System.out.println(a%b);
    }

}
