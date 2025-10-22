package Ders42Collections3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(60);
        sayilar.add(20);
        sayilar.add(30);
//        TreeSet<Integer> tSet = new TreeSet<>(sayilar);
        Collections.sort(sayilar);
        System.out.println("TreeSet: " + sayilar);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ali", 45,3));
        people.add(new Person("Veli", 25,4));
        people.add(new Person("Rehman", 24,6));
        people.add(new Person("Sema", 25,1));
        people.add(new Person("Aliimran", 34,0));
        System.out.println("Before Sort: " + people);
        Collections.sort(people);
        System.out.println("After Sort: " + people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        });

        Collections.sort(people,Comparator.comparing(Person::getAge));
        System.out.println("After Sort with Age: " + people);

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("After Sort with Name: " + people);

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int ageCompare=o1.age - o2.age;
                if(ageCompare==0){
                    return o1.name.compareTo(o2.name);
                }else{
                    return ageCompare;
                }
            }
        });

        System.out.println("After Sort with Age and Name: " + people);

        Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        System.out.println("After Sort with Age and Name: " + people);

    }
}
