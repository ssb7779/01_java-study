package com.kyungbae.section05.logical;

public class Application6 { // class start

    public static void main(String[] args) { // main start

        // simple test

        int a = 2;
        int b = 3;
        boolean c = a > b;
        boolean d = ++a <= b++;

        System.out.println(a);  // 3
        System.out.println(b);  // 4
        System.out.println(c);  // false
        System.out.println(d);  // true

        System.out.println(c != d); // true
        System.out.println(b % a == 1); // true
        System.out.println(a == 3 && b == 4);   // true
        System.out.println(!d || a - b > 0);    // false

        System.out.println( !(c == d) && ((a * b == 10) || (b % 2 == 0)));  // true
//                              true    &&   ( false || true )
//                              true    &&          ture

    } // main end

} // class end
