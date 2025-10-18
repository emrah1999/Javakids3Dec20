package Ders40Collections1;

import Ders31OOP3cuhiss.A;
import Ders32OOP4cuhisse.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();
        names.add("Ali");
        names.add("Rehman");
        names.add("Sema");
        names.add("Sema");
        System.out.println(names);

        System.out.println(names.size());

        names.remove("Sema");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(2);
        Integer eded=20;
        number.remove(eded);
        System.out.println(number);

        Set<Integer> numbers2=new TreeSet<>(number);

        ArrayList<Car> cars=new ArrayList<>();

        cars.add(new Car("BMW",2020));
        cars.add(new Car("Audi",2021));



    }
}
