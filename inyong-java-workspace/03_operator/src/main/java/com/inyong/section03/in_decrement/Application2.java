package com.inyong.section03.in_decrement;

public class Application2 {
    public static void main(String[] args) {

        int a = 10;
        int b = ++a;

        System.out.printf("%d %d\n", a, b);

        int c = 10;
        int d = c++;
        System.out.printf("%d %d\n", c, d);


        int num1= 20;
        int num2= 20;
        int result1 = ++num1 *3;
        int result2 = num2++ *3;
        System.out.println(result1);
        System.out.println(result2);
    }
}
