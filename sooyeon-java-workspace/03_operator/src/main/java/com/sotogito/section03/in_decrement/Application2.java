package com.sotogito.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;

        System.out.printf("a = %d, b = %d\n", a, b);

        int c = 10;
        int d = c++;

        System.out.printf("a = %d, b = %d\n", c, d);

        int num1 = 20;
        int result = ++num1 * 3; // 증감연산자 -> 곱하기
        System.out.printf("result = %d\n", result);
    }
}
