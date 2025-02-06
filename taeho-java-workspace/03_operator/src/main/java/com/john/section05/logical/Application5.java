package com.john.section05.logical;

/*
    ## short circuit
    1. && : 두 논리값모두 true여야 최종 true
    => && 기준 좌측 연산 결과가 false 인 경우 우측 연산은 실행되지 않음
    2. || : 두 논리값 중 하나라도 true라면 최종 true
    => || 기준 좌측 연산 결과가 true 인 경우 우측 연산은 실행되지 않음
 */
public class Application5 {
    public static void main(String[] args) {
        int num1 = 10;
        boolean result1 = (num1 < 5) && (++num1 > 0);

        int num2 = 10;
        boolean result2 = (num2 < 20) || (++num2 <0);

        System.out.println("num1: " + num1);
        System.out.println("result1 = " + result1);
        System.out.println("num2: " + num2);
        System.out.println("result2 = " + result2);
    }
}
