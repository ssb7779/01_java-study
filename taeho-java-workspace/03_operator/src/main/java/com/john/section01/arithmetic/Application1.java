package com.john.section01.arithmetic;

/* 산술연산자
    1. 이항연산자
    2. 종류 - 덧셈 뺄셈 곱셈 나누기 나머지
    3. 우선순위 (*, /, %) => (+, -)
 */

public class Application1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}
