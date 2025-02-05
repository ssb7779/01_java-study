package com.younggalee.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;

        System.out.printf("a = %d, b = %d\n", a, b);

        int c = 10;
        int d = c++;
        System.out.printf("c = %d, d = %d\n", c, d);

        System.out.println("==========================");
        int num1 = 20;
        int result1 = ++num1 *3;
        System.out.printf("result1 = %d\n", result1);
        int num2 = 20;
        int result2 = num2++ *3;
        System.out.printf("result2 = %d\n", result2);


    }
}
