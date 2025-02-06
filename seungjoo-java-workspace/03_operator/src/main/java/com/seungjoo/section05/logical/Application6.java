package com.seungjoo.section05.logical;

public class Application6 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        boolean c = a>b;
        boolean d = ++a <= b++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(c != d);
        System.out.println(b % a == 1);
        System.out.println(a==3 && b == 4);
        System.out.println(!d || a-b> 0);

        System.out.println(!(c==d) && ((a*b == 10) || (b %2 ==0)));
    }
}
