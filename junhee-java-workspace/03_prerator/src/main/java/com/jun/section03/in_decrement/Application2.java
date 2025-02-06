package com.jun.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;

        System.out.printf("a : %d, b : %d\n", a, b); // a = 11, b = 11

        int c = 10;
        int d = c++;

        System.out.printf("c : %d, d : %d\n", c, d); // c = 11, d = 10 c가 먼저 증가 d는 나중에 증가

        System.out.println("============");

        int num1 = 20;
        int result1 = ++num1 * 3; // num1 = 21 result1 = 63

        System.out.println(num1);

        int num2 = 20;
        int result2 = num2++ * 3; //

        System.out.println(result2);
    }
}
