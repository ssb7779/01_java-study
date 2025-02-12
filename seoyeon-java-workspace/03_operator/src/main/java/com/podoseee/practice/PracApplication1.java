package com.podoseee.practice;

public class PracApplication1 {
    public static void main(String[] args) {

        int a = 1;; // a = 1
        int b = -5; // b = -5
        int c = a++ - b--; // a=1(2), b=-5(-6), 1-(-5)=6
        int d = ++c + a--; // a=2(1), b=-6, c=6, d=7+2(1)=9(8)

        System.out.println("a: " + a); // a: 1
        System.out.println("b: " + b); // b: -6
        System.out.println("c: " + c); // c: 7
        System.out.println("d: " + d); // d: 9
    }
}
