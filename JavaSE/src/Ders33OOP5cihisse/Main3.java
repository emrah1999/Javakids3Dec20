package Ders33OOP5cihisse;

public class Main3 {
    public static void main(String[] args) {
        MainClass mainClass=new MainClass();
        MainClass.InnerClass innerClass=mainClass.new InnerClass();
        innerClass.b=10;
        System.out.println(innerClass.b);

        MainClass.InnerClass2 innerClass2=mainClass.new InnerClass2();
        System.out.println(innerClass2.c);

        mainClass.method2();
    }
}
