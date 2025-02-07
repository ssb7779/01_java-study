package com.younggalee.section06.ternary;

public class Application6 {
    public static void main(String[] args) {
        /*
            두 정수값과 하나의 연산기호(+,-)를 통해서 연산결과를 출력
         */
        int num1 = 5;
        int num2 = 10;

        char op = '+';

        String result = op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "잘못된 연산기호입니다.");
        System.out.printf("%d %c %d = %s\n", num1, op, num2, result);
    }
}
