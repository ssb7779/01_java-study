package com.pch.section06.ternary;

public class Application6 {
    public static void main(String[] args) {
        /*
            두 정수값과 하나의 연산기호를 통해서 연산 결과 출력

            + 인 경우 => 두 정수값의 덧셈결과
            - 인 경우 => 두 정수값의 뺄셈결과
            잘못된 경우 => "잘못된 연산기호입니다" 출력
         */

        int num1 = 1;
        int num2 = 2;
        char op = '+';

        String ans = (op == '+') ? String.valueOf(num1 + num2) : (op == '-') ? String.valueOf(num1 - num2) : "잘못된 연산기호입니다.";

        System.out.println(ans);
    }
}
