package Ders33OOP5cihisse;

public class MainClass {
    public int a;

    class InnerClass{
        int b;
        public InnerClass(){
            b=5;
        }
    }
    class InnerClass2{
        int c;

    }

    public void method2(){
        class LocalClass{
            int d;
        }
        LocalClass localClass=new LocalClass();
        localClass.d=15;
        System.out.println(localClass.d);
    }
}
