package com.sotogito.section05.logical;

public class Application6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        boolean c = a > b;
        boolean d = ++a <= b++;

        System.out.println(a); //3
        System.out.println(b); //4
        System.out.println(c); //F
        System.out.println(d); //3<=4 T

        System.out.println(c != d);//t
        System.out.println(b % a == 1); //t
        System.out.println(a == 3 && b == 4); //t
        System.out.println(!d || a - b > 0); //f

        System.out.println(!(c == d) && ((a * b == 10) || (b % 2 == 0))); //fixme
        System.out.println(!(false) && ((a * b == 10) || (b % 2 == 0)));
        System.out.println(true && ((a * b == 10) || (b % 2 == 0)));
    }

}
