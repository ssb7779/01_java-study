package com.podoseee.section01.stream;

import com.podoseee.dto.Snack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    /*
        ## java.util.stream.Stream ##
     */

    public static void main(String[] args) {

        /*
            ## Stream 생성 ##
         */

        Stream<String> fruits = Stream.of("키위", "사과", "바나나", "배", "복숭아");

        Integer[] arr = {10, 9, 2, 1, 5, 34, 23, 9};
        Stream<Integer> nums = Arrays.stream(arr); // int[] 이였다면 IntStream 으로 반환됨

        // list.of(Snack, Snack, ..) => unmodifiable , Arrays.asList(Snack, Snack, ..) => fixed-size
        List<Snack> snacks = List.of(new Snack("먹태깡", "농심", 2000)
                          , new Snack("홈런볼", "롯데", 1500)
                          , new Snack("수미칩", "롯데", 2500)
                          , new Snack("자갈치", "농심", 700));
        Stream<Snack> snackStream = snacks.stream();

        // * count() : 스트림 내의 요소 개수 반환
        System.out.println("snack 개수: " + snackStream.count());

        // * distinct() : 스트림 내의 중복요소 없앤 후 Stream 반환
        System.out.println("num 중복제거 후 개수: " + nums.distinct().count());

        // * sorted() : 스트림 내의 요소들을 오름차순 정렬시킨 Stream 반환
        // * forEach(Consumer) : Stream내의 요소들에 순차접근하면서 전달된 Consumer 객체의 accept 메소드 실행
        //                       즉, 요소를 순회하면서 실행시키고자 할 내용의 람다식을 전달하면 됨
        fruits.sorted()
                .forEach(System.out::println/*fruit -> System.out.println(fruit)*/);


    }
}
