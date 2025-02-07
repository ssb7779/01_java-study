package com.pch.practice;

public class PracApplication2 {
    public static void main(String[] args) {
        /**
         * 문제
         * 너비 12.5, 높이 36.4를 변수에 저장하고
         * 각 너비와 높이에 해당하는 사각형의 넓이, 둘레를 계산하여 출력하시오.
         */

        double w = 12.5;
        double h = 36.4;

        System.out.println("면적 : " + (w*h));
        System.out.println("둘레 : " + (w+h)*2);
    }
}
