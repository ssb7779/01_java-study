package com.podoseee.section01.interface_implements;

public class Application {
    public static void main(String[] args) {
        /*
            ## 인터페이스 구현 방식1 ##
         */

        Calculator sumCalc = new SumCalculator();
        System.out.println("덧셈결과 : " + sumCalc.calc(5, 7));

        Calculator subCalc = new SubCalculator();
        System.out.println("뺄셈결과 : " + subCalc.calc(5, 7));

        /*
            단점.
         */

    }
}
