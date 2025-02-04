package com.sotogito.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        /**
         * ## 자바에서 취급하는 값
         * 1. 숫자형 - 정수, 실수
         * 2. 문자형 - 문자, 문자열
         * 3. 논리형 - 참, 거짓
         */

        //1. 숫자
        System.out.println(1);

        //2. 문자
        System.out.println('S');
        //3. 문자열
        System.out.println("Hello World");

        //4. 논리
        System.out.println(true);
        System.out.println(false);

        //5. 연산 결과 출력
        System.out.println(123 + 345);
        System.out.println(1.23 + 3.45); // 컴퓨터에서 실수값 연산 오차가 생길 수 있음
        System.out.println(123 - 345);
        System.out.println(123 / 345);
        System.out.println(123 * 345);
        System.out.println(123 % 345);

        System.out.println('a' + 1); //98
        System.out.println("a" + 1); //a1
        System.out.println("a" + 1 + 2 + '!'); //a12!
        System.out.println("a" + 1 + 2 + '!'); //a12!
        System.out.println("a" + (1 + 2) + '!'); //a3!
    }

}
