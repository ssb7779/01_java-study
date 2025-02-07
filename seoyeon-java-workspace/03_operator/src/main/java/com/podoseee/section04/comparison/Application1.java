package com.podoseee.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*
        ## 비교 연산자 ##
        1. 이항 연산자
        2. 연산 결과값은 true(참), false(거짓)을 반환
        3. 종류
            1) 대소비교 : < > <= >=
            2) 동등비교 : == !=
     */
        int a = 10;
        int b = 25;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        boolean result = a > b;
        System.out.println("result : " + result);

        System.out.println((a * 2) > (b / 5));
        
        System.out.println("a가 짝수인가 : " + ( a % 2 == 0));
        System.out.println("a가 짝수인가 : " + ( a % 2 != 1));
        System.out.println("a가 홀수인가 : " + ( a % 2 == 1));
        System.out.println("a가 홀수인가 : " + ( a % 2 != 0));
    }
}
