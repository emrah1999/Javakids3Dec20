package Ders38JavaPractiseAndMultitreading;

import Ders31OOP3cuhiss.A;

public class Main {
    public static void main(String[] args) {
        int a=AClass.b;
        AClass obj1=new AClass();
        obj1.a=5;
        AClass.b=10;
        AClass obj2=new AClass();
        obj2.a=7;
        AClass.b=15;

        System.out.println("obj1.a = " + obj1.a); //20  5
        System.out.println("obj2.a = " + obj2.a); //35  7
        System.out.println("obj2.b = " + AClass.b); //75
    }
}
