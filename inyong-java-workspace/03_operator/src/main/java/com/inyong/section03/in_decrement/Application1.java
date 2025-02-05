package com.inyong.section03.in_decrement;

public class Application1 {
    public static void main(String[] args) {
        /*
        증감 연산자
        1. 단항 연산자
        2. 종류

            1) ++ : 변수에 담긴 값을 1 증가시켜주는 연산자

            2) -- : 변수에 담긴 값을 1 감소

            작성 위치
            1) 전위 연산 - [연산자][변수] 선 증감 후 처리
            2) 후위 연산 - [변수][연산자] 선 처리 후 증감

         */

        int num1 = 10;
        System.out.println(num1--);
        System.out.println(num1);
        System.out.println(++num1);
        System.out.println(num1);
        System.out.println(num1++);
        System.out.println(num1);

    }
}
