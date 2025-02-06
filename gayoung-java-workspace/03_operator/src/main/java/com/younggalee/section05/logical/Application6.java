package com.younggalee.section05.logical;

public class Application6 {
    public static void main(String[] args) {
         int a = 2;
         int b = 3;
         boolean c = a > b; // false
         boolean d = ++a <= b++;  // true   3 4
        System.out.println(a); // 3
        System.out.println(b);  // 4
        System.out.println(c); // f
        System.out.println(d);  // t

        System.out.println(c != d);  // t
        System.out.println(b % a == 1);  //t
        System.out.println(a == 3  && b == 4);  // t
        System.out.println(!d || a -b > 0);  // f

        System.out.println(!(c == d) && ((a * b == 10) || (b % 2 == 0)));  // t

    }
}
