package com.john.section6.ternary;

/*
    두 정수값과 하나의 연산기호를 통해 연산 결과 출력
    연산기호가 + 인 경우 덧셈 출력, - 인 경우 뺄셈 출력, 그외 "잘못된 연산 기호"
 */
public class Application6 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        char op = '+';

        String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "잘못된 연산기호"));
        System.out.println(op == '+' ? (num1 + num2) : op == '-' ? (num1 - num2) : "잘못된 연산기호");
        System.out.printf("%d %c %d = %s\n", num1, op, num2, result);
    }
}
