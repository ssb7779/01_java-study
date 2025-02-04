package com.pch.practice;

public class PracApplication4 {
    public static void main(String[] args) {
        /**
         * 문제
         * 문자형 변수 선언 후 ‘a’ 대입 한 후
         * ‘a’ 문자가 가지는 유니코드 값을 출력하시오.
         */

        char c = 'a';

        System.out.printf("문자 %c의 unicode : %d", c, (c-0));
    }
}
