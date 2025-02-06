package com.younggalee.practice;

public class PracApplication1 {
    public static void main(String[] args) {

        int a = 11;
        int b = -5;
        int c = a++ - b--;  // 11(12) - -5 (-6) : 16
        int d = ++c + a--;  // 17 + 12(11)

        System.out.println("a: " + a); //  a: ? 11
        System.out.println("b: " + b); //  b: ?  -6
        System.out.println("c: " + c); //  c: ? 17
        System.out.println("d: " + d); //  d: ? 29

    }
}