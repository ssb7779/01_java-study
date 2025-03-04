package com.sotogito.section03.provide_functional_interface;

import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Application1 {
    /**
     * 표준 함수형 ㅅ인터페이스
     * - Consumer
     * - Supplier
     * - Function
     * - Operator
     * - Predicate
     */

    public static void main(String[] args) {
        /**
         * ## java.util.function.Consumer
         * 특정 값을 전달 받고 사용만하는 소비자의 역할
         * 매갭젼수 있고 리턴값이 없는 accept 메서드 존재
         *
         */

        //<T> 객체를 받아서 사용
        Consumer<String> consumer = string -> System.out.println(string+"입력됨");
        consumer.accept("Efweffawefaef");

        //<T,U> 객체 2개를 받아서 사용
        BiConsumer<String, LocalTime> biConsumer = (str,time) -> System.out.println(str+":"+time);
        biConsumer.accept("dsf",LocalTime.now());

        
    }
}
