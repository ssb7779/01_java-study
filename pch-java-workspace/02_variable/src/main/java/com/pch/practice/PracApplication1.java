package com.pch.practice;

public class PracApplication1 {
    public static void main(String[] args) {
        /**
         * 문제
         *
         * 정수형 변수 2개를 선언하여 각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기 곱하기, 나누기, 나머지를 다음과 같이 출력하시오.
         */
        int a = 20;
        int b = 30;

        System.out.println("더하기 결과 : " + (a+b));
        System.out.println("빼기 결과  : " + (a-b));
        System.out.println("곱하기 결과 : " + (a*b));
        System.out.println("나누기 결과 : " + (a/b));
        System.out.println("나머지 결과 : " + (a%b));
    }
}
