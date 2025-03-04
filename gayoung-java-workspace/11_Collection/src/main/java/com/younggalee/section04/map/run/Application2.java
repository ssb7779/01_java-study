package com.younggalee.section04.map.run;

import com.younggalee.section04.map.dto.Snack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {
        Map<String, Snack> map = new HashMap<>();

        // put(K key, V value)
        map.put("다이제", new Snack("초코맛", 1500));
        map.put("칸쵸", new Snack("딸기맛", 1500));
        map.put("새우깡", new Snack("짠맛", 500));

        map.put("포테이토칩", new Snack("짠맛", 500));
        System.out.println(map);
        map.put("새우깡", new Snack("바나나맛", 5200)); // 키값이 같으면 덮어씌어짐
        System.out.println(map);

        Snack s = map.get("다이제");
        System.out.println(s);
        System.out.println(map.size());

        // replace(K key, V value) : key 찾아서 해당 value로 변경
        map.replace("다이제", new Snack("아주 단맛", 50000));
        System.out.println(map);

        map.remove("다이제");
        System.out.println(map);

        // 순회하기
        // 방법1. keySet()
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " : " + map.get(key));
        }

        //방법2. Iterator
        Iterator<String> itKey = keys.iterator();
        while(itKey.hasNext()){
            String key = itKey.next();
            Snack value = map.get(key);
            System.out.println(key + " : " + value);
        }

        // 방법3. entrySet()
        Set<Map.Entry<String, Snack>> entrySet = map.entrySet();
//        for (Map.Entry<String, Snack> entry : entrySet){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        Iterator<Map.Entry<String, Snack>> itEntry = entrySet.iterator();
        while (itEntry.hasNext()){
            Map.Entry<String, Snack> entry = itEntry.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
