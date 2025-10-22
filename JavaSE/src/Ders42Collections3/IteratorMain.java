package Ders42Collections3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(20);
        sayilar.add(12);
        sayilar.add(17);
        System.out.println(sayilar);
        Collections.shuffle(sayilar);
        System.out.println(sayilar);
        Iterator iterator=sayilar.iterator();
//        for (Integer number:sayilar){
//            if(number%2==0){
//                sayilar.remove(number);
//            }
//        }
        while(iterator.hasNext()){
            Integer number= (Integer) iterator.next();
            if(number%2==0){
                iterator.remove();
            }
        }
        System.out.println(sayilar);
    }
}
