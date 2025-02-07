package com.younggalee.practice;

public class PracApplication2 {
    public static void main(String[] args) {

        char a = 'Z'; // A+ ~
        System.out.println(!(a >= 'A' && a <= 'Z')); //  F

        int b = 3;
        int c = 10;
        System.out.println(c >= 5 || b < 0 && b > 2); //  T

    }
}