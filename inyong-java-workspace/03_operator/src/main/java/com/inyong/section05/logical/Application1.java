package com.inyong.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /*
        논리 연산자
        1. 논리 값 (true/false)
        2. 결과값 또한 논리값으로 도출
        3. 종류
            1) 논리 연결 연산자 (이항 연산자)
                - &&  and
                - ||  or
            2) 논리 부정 연산자 (단항 연산자)
                ! - **불리언 값(boolean)**을 반대로 뒤집음
         */

        System.out.println(true && false);
        System.out.println(true || false);

        System.out.println(!true);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a < b && c < d);
        System.out.println(a < b && c < d );
        System.out.println(a > b && c > b);

        System.out.println(a > b || c < d);
        System.out.println(a < b || c < a);

    }
}
