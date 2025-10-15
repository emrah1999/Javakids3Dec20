package Ders40Collections1;

import Ders32OOP4cuhisse.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        System.out.println(numbers);

        HashSet<Integer> numberSet=new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(10);
        numberSet.add(30);
        System.out.println(numberSet);

        TreeSet<Integer> numberTreeSet=new TreeSet<>();
        numberTreeSet.add(10);
        numberTreeSet.add(20);
        numberTreeSet.add(40);
        numberTreeSet.add(30);
        System.out.println(numberTreeSet);

        TreeSet<String> stringTreeSet=new TreeSet<>();
        stringTreeSet.add("Ali");
        stringTreeSet.add("Veli");
        stringTreeSet.add("Ayse");
        System.out.println(stringTreeSet);

        Car car1=new Car("BMW",2020);
        Car car2=new Car("BMW",2020);
        Set<Car> carSet=new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet);
    }
}
