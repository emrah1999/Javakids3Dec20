package Ders41Collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPraktika {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Rehman");
        list.add("Yusif");
        list.add("Aliimran");
        list.add("Sema");
        list.add("Ali");
        list.add("Yusif");
        list.add("Sema");
        System.out.println(list);

        Map<String,Integer> map=new HashMap<>();
        for(String name:list){  //name=Ali
            if(map.containsKey(name)){
                int count=map.get(name); //count=1
                map.replace(name,count+1);
            }else{
                map.put(name,1);
            }
            // ali=1,rehman=1
        }
        System.out.println(map);

    }
}
