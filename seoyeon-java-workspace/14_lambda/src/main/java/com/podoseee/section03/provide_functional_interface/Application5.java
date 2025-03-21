package com.podoseee.section03.provide_functional_interface;

import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        /*
            ## java.util.function.Predicate ##
            매개변수와 boolean 리턴값이 있는 test 메소드 존재
            특정 값을 전달받아 비교판별한 후 true|false 값을 반환하는 내용으로 주로 작성

            public interface Predicate<T> {
                boolean test(T t);
            }
        */

        // 1. Predicate<T> { boolean test(T t) } : T를 조사하여 boolean을 반환
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인: " + predicate.test("123"));
        System.out.println("문자열인지 확인: " + predicate.test(123));

        Predicate<Integer> isEven = value -> value % 2 == 0;
        System.out.println("짝수인지 확인: " + isEven.test(4));
        System.out.println("짝수인지 확인: " + isEven.test(5));

        System.out.println("==================================");

        givePredicate( name -> name.charAt(0) == '이');
    }

    public static void givePredicate(Predicate<String> predicate){
        System.out.println(predicate.test("이서연"));
    }
}
