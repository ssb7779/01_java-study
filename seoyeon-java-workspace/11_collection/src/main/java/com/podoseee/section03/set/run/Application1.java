package com.podoseee.section03.set.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /*
            ## Set 컬렉션 ##

            ## java.util.HashSet ##
         */

        Set set = new HashSet();

        // * add(E e)
        set.add("안녕");
        set.add(10);
        set.add(10.2);
        set.add("안녕");

        System.out.println("set: " + set);   // 순서 유지 안됨, 중복 허용 안됨

        System.out.println("==============================");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(5);
        //integerSet.add(10.3);
        //integerSet.add("안녕");
        integerSet.add(1);
        integerSet.add(10);

        System.out.println("integerSet : " + integerSet);

        // * size()
        System.out.println("integerSet의 size : " + integerSet.size());

        System.out.println("========================");

        Set<Integer> lotto = new HashSet<>();
        int count = 0;
        while(lotto.size() < 6){
            lotto.add((int)(Math.random() * 45 + 1));
            count++;
        }

        System.out.println("lotto : " + lotto);
        System.out.println("반복수행횟수 : " + count);

        System.out.println("========================");

        // * Set.of(E e1, E e2, ..) : 인자로 전달된 요소들이 담겨있는 Set 반환 (unmodifiable set)
        Set<String> stringSet = Set.of("java", "mysql", "jdbc", "mybatis", "spring");
        System.out.println("stringSet : " + stringSet);

        //stringSet.add("jpa"); // 추가 불가

        // 특정 값 하나만을 반환받을 순 없고 모든 요소 순회는 가능
        // 방법1. 향상된 for문
        for(String str : stringSet){
            System.out.println(str);
        }
        System.out.println("---------");

        // 방법2. 배열로 변경한 후 순회
        Object[] stringArr = stringSet.toArray();
        for(int i=0; i<stringArr.length; i++){
            System.out.println(stringArr[i]);
        }
        System.out.println("---------");

        // 방법3. List로 변경한 후 순회
        //List<String> stringList = new ArrayList<>();
        //stringList.addAll(stringSet);
        List<String> stringList = new ArrayList<>(stringSet);
        for(int i=0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
        // 보통 사용하는 경우 => Set을 중복제거한 후 List로 변환해서 사용
        System.out.println("---------");

        // 방법4. 반복자(Iterator) 사용
        // * iterator() : 컬렉션내의 요소들을 Iterator 공간에 담아 반환
        Iterator<String> iterator = stringSet.iterator();

        // * Iterator객체.next() : Iterator 공간내의 요소 꺼내 반환
        // * Iterator객체.hasNext() : Iterator 공간내의 요소가 있을 경우 true반환

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
            ## Iterator ##
         */
    }
}
