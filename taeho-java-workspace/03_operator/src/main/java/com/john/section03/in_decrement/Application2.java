package com.john.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;

        System.out.printf("a: %d, b: %d\n", a, b);

        int c = 10;
        int d = c++;
        System.out.printf("c: %d, d: %d\n", c, d);

        System.out.println("==============");

        int num1 = 20;
        int result = ++num1 * 3;
        System.out.println("result: " + result);
        System.out.println("num1: " + num1);

        int num2 = 20;
        int result2 = num2++ * 3;
        System.out.println("result2: " + result2);
        System.out.println("num2: " + num2);

    }
}
