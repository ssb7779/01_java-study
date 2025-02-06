package com.podoseee.section03.in_decrement;

public class Application2 {
    public static void main(String[] args){
        int a = 10;
        int b = ++a; // a=11, b=11
        System.out.printf("a : %d, b: %d\n", a, b);

        int c = 10;
        int d = c++; // c=11, d=10
        System.out.printf("c : %d, d: %d\n", c, d);

        System.out.println("=========");

        int num1 = 20;
        int result1 = ++num1 * 3; // num1=21, result1=21*3=63
        System.out.printf("num1 : %d, result1 : %d\n", num1, result1);

        int num2 = 20;
        int result2 = num2++ * 3; // num2=21, result2=20*3=60
        System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
    }
}
