package com.john.section03.in_decrement;

public class Quiz {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = (++a) + b;
        // a = 6, b = 10, c = 15
        int d = c / a;
        // d = 2
        int e = c % a;
        // e = 4
        int f = e++;
        // f = 4
        int g = (--b) + (d--);
        // b = 9, d = 1, g = 11
        int h = 2;
        int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);


    }
}
