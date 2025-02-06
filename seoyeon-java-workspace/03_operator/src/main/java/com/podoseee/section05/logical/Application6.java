package com.podoseee.section05.logical;

public class Application6 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        boolean c = a > b; // a=2, b=3, c=false
        boolean d = ++a <= b++; // a=3, b=3(4), c=false, d=true

        System.out.println(a); //3  내가쓴오답:2
        System.out.println(b); //4  내가쓴오답:3
        System.out.println(c); //false
        System.out.println(d); //true

        System.out.println(c != d); //true
        System.out.println(b % a == 1); //true
        System.out.println(a == 3 && b == 4); //true && true => true 내가쓴오답:false
        System.out.println(!d || a - b > 0); //false

        //                  true     &&  (    false    ||     true    )
        System.out.println(!(c == d) && ((a * b == 10) || (b % 2 == 0))); //true 내가쓴오답:false
    }
}
