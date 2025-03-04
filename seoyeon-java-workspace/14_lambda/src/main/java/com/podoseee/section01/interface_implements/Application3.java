package com.podoseee.section01.interface_implements;

public class Application3 {
    public static void main(String[] args) {
        /*
            ## 인터페이스 구현 방식3 ##

         */

        Calculator mod = (num1, num2) -> num1 % num2;
        System.out.println("나머지 결과: " + mod.calc(10, 3));

        //
        //


    }
}
