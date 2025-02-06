package com.sotogito.section06.ternary;

public class Application6 {
    /**
     * 두 정수값과 하나의 연산기호를 통해서 연산 결과를 출력
     * <p>
     * 연산기호 +,-에 따른 결과값 출력
     * 연산 기호가 잘못 되어있을 경우 "잘못된 연산 기호입니다 출력
     */

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        char op = 'ㅈ';
        /**
         * 1. 연산 기호가 맞는지
         * 2. 연산
         */

        System.out.println((op == '+' || op == '-') ?
                (op == '+') ? (num1 + num2) : (num1 - num2)
                : "잘못된 연산기호입니다.");


        String result = ((op == '+' || op == '-') ?
                (op == '+') ? (num1 + num2) + "" : (num1 - num2) + ""
                : "잘못된 연산기호");

        result = (op == '+') ? (num1 + num2) + "" : (op == '-') ? (num1 - num2) + "" : "잘못된 연산기호입니다.";


        System.out.printf("%d %c %c = %s\n", num1, op, num2, result);
    }

}
