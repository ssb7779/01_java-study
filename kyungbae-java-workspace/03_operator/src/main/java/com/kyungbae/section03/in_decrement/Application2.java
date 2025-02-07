package com.kyungbae.section03.in_decrement;

public class Application2 { // class start

    public static void main(String[] args) { // main start

        int a = 10;
        int b = ++a; // a = 11
        System.out.printf("a = %d, b = %d\n", a, b); // a = 11 b = 11

        int c = 10;
        int d = c++; // d = 10, c = 11
        System.out.printf("c = %d, d = %d\n", c, d);

        System.out.println("----------------");

        int num1 = 20;
        int result1 = ++num1 * 3;
        System.out.printf("num1 = %d, result1 = %d\n", num1, result1);

        int num2 = 20;
        int result2 = num2++ * 3;
        System.out.printf("num2 = %d, result2 = %d\n", num2, result2); // 21, 60

    } // main end


} // class end
