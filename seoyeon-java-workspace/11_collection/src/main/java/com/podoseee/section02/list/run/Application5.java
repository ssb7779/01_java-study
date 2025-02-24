package com.podoseee.section02.list.run;

import java.util.LinkedList;

public class Application5 {
    public static void main(String[] args) {
        /*
            ## java.util.LinkedList ##
         */
        LinkedList<String> list = new LinkedList<>();

        // * add(E e)
        list.add("포도씨");
        list.add("수박씨");
        list.add("복숭아씨");
        // * add(int index, E e)
        list.add(1, "사과씨");

        System.out.println(list);

        // * size()
        // * get(int index)
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // * addFirst(E e) : 첫 번째 위치에 전달한 요소를 추가
        list.addFirst("배씨");
        System.out.println(list);

        // * addLast(E e) : 마지막 위치에 전달한 요소를 추가
        list.addLast("키위씨");
        System.out.println(list);

        // * getFirst() / getLast() : 첫 번째 또는 마지막 위치의 요소를 반환
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // * remove(int index)
        list.remove(1);
        System.out.println(list);

        // * removeFirst() / removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
