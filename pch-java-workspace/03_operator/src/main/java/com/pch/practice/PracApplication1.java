package com.pch.practice;

public class PracApplication1 {
    public static void main(String[] args) {
        int a = 11;
        int b = -5;
        int c = a++ - b--;
        int d = ++c + a--;

        System.out.println("a: " + a); //  a: ?
        System.out.println("b: " + b); //  b: ?
        System.out.println("c: " + c); //  c: ?
        System.out.println("d: " + d); //  d: ?
    }
}
