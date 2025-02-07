package com.inyong.section05.logical;

public class Application6 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        boolean c = a > b;
        boolean d = ++a <= b++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //false
        System.out.println(d); //true

        System.out.println(c != d); // true
        System.out.println(b% a == 1); //true
        System.out.println(a == 3 && b==4); //true
        System.out.println(!d || a-b > 0); //false

        System.out.println(!(c==d) && (( a*b == 10) || (b%2==0))); //true
    }
}
