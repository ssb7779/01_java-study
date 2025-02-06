package com.sotogito.practice;

public class PracApplication2 {
    /**
     * f
     * t || f || t = t
     */

    public static void main(String[] args) {

        char a = 'Z';
        System.out.println(!(a >= 'A' && a <= 'Z')); //  ?

        int b = 3;
        int c = 10;
        System.out.println(c >= 5 || b < 0 && b > 2); //  ?

    }
}
