package com.ibe6.section05.logical;

public class Application6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        boolean c = a > b; // a=2, b=3, c=false
        boolean d = ++a <= b++; // a=3, b=3(4), c=false, d=true

        System.out.println(a); //3
        System.out.println(b); //4
        System.out.println(c); //false
        System.out.println(d); //ture

        System.out.println(c != d); // ture
        System.out.println(b % a == 1); // ture
        System.out.println(a == 3 && b == 4); // ture && ture => ture
        System.out.println(!d || a - b > 0); // false || false => false

        //                      true   &&               true
        System.out.println( !(c == d) && ( (a*b == 10) || (b % 2 == 0) ) ); // true

    }
}
