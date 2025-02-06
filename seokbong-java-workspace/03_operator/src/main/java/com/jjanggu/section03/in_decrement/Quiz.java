package com.jjanggu.section03.in_decrement;

public class Quiz {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = (++a) + b;
        int d = c / a;
        int e = c % a;
        int f = e++;
        int g = (--b) + (d--);
        int h = 2;
        int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
    }
}
