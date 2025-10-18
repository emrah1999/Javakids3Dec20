package Ders41Collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        // Map<Key,Value>
        map.put(0,"Ali");
        map.put(1,"Veli");
        map.put(2,"Can");
        System.out.println("Map: "+map);

        Map<String,String> cities=new HashMap<>();
        cities.put("AZ","Baku");
        cities.put("TR","Istanbul");
        cities.put("US","Washington");
        System.out.println("Cities: "+cities);

        Map<String,Integer> country=new TreeMap<>();
        country.put("Spain",10);
        country.put("Erebistan",20);
        country.put("USA",20);
        System.out.println("Country: "+country);

        System.out.println(country.get("USA"));

        System.out.println(country.containsKey("sdfsd"));

        Map<String,Integer> country2=new HashMap<>(country);
        System.out.println("Country2: "+country2);

        country.remove("USA");
        System.out.println("Country after remove: "+country);
        System.out.println(country.containsValue(10));

        Set<Map.Entry<String,Integer>> entries=country.entrySet();
        System.out.println("Entries: "+entries);


    }
}
