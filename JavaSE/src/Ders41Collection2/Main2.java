package Ders41Collection2;

import Ders31OOP3cuhiss.A;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        ArrayClass arrayClass=new ArrayClass(4);
        arrayClass.add(1);
        arrayClass.add(2);
        arrayClass.add(4);
        arrayClass.add(6);
        arrayClass.add(7);
        arrayClass.add(9);

        System.out.println(arrayClass);
    }
}
