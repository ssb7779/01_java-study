package com.sotogito.section04.comparison;

public class Application1 {
    private final static Application1 app1 = new Application1();

    public static void main(String[] args) {
        /**
         * ## 비교연산자
         * 1. 이항 연산자
         * 2. 연산 결과값은 true false
         * 3. 종류 > <= >= < => < == !=
         */

        int a = 10;
        int b = 25;

        System.out.println("a == b" + (a == b));
        System.out.println("a != b" + (a != b));

        boolean result = a > b;
        System.out.println("result" + result);

        System.out.println((a * 2) > (b * 2));

        System.out.println("a는 짝수인가: " + (a % 2 == 0));
        System.out.println("a는 홀수인가: " + (a % 2 ==1));


    }

    public static Application1 getApp1() {
        return app1;
    }

    public static Application1 getApp12(){
        return new Application1();
    }


}
