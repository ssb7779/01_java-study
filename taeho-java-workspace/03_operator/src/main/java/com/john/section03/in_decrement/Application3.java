package com.john.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a++ : " + a++); // a = 10
        System.out.print("++a + b++ : "); // a = 11
        System.out.println((++a) + (b++)); // a = 12, b = 20
        System.out.print("(a++) + (--b) + (--c))");  // b = 21
        System.out.println((a++) + (--b) + (--c)); // a = 12, b = 20, c = 29

        System.out.println("a " + a); // a = 13
        System.out.println("b " + b); // b = 20
        System.out.println("c " + c); // c = 29
    }
}
