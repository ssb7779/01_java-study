package com.inyong.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*
        1. 이항연산자
        2. 연산 결과 값은 true(참), false(거짓)을 반환
        3. 종류
            1) 대소비교 : < > <= >=
            2) 동등비교 : == !=
         */
        int a = 10;
        int b = 25;

        System.out.println(a == b);
        System.out.println(a != b);

        boolean result = a > b;
        System.out.println(result);

        System.out.println((a * 2) > (b / 5));
        System.out.println(a % 2 == 0);
        System.out.println(b % 2 == 0);
        System.out.println(a % 2 != 0);
    }
}
