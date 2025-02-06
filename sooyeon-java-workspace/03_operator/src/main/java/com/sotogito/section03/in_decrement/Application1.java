package com.sotogito.section03.in_decrement;

public class Application1 {
    public static void main(String[] args) {
        /**
         * ## 증감연산자
         * 1. 단항 연산자
         * 2. 종류 : ++ --
         * [증감연산자] 변수 or 변수 [증감연산자]
         *
         * 3. 작성 위치
         * - 전위 연산 ++변수
         *  선증감 후처리
         *
         * - 후위 연산 변수 ++
         * 선처리 후증감
         */

        //전위 연산
        int num1 = 10;

        System.out.println("최초 num1 = " + num1);
        System.out.println("1 증가 후 num1 = " + ++num1);
        System.out.println("2 증가 후 num1 = " + ++num1);
        System.out.println("3 증가 후 num1 = " + ++num1);
        System.out.println("최종 = " + num1);
        //System.out.println("증가 후 num1 = " num1++);
        // System.out.println("증가 후 num1 = " num1);

        int num2 = 10;
        System.out.println("최초 num1 = " + num2);
        System.out.println("1 증가 후 num1 = " + num2++);
        System.out.println("2 증가 후 num1 = " + num2++);
        System.out.println("3 증가 후 num1 = " + num2++);
        System.out.println("최종 = " + num2);
    }
}
