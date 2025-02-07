package com.pch.section02.variable;

public class Application4 {
    public static void main(String[] args) {
        /*
            ## System.out.printf()
            System.out.printf();
         */

        double d1 = 1.12345677;
        double d2 = 4.67;

        System.out.printf("%f %f\n", d1, d2);
        System.out.printf("%.3f %1f\n", d1, d2);

        char ch = 'a';
        String str = "Hello";

        System.out.printf("%c %s\n", ch, str);
    }
}
