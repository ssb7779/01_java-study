package com.john.section05.logical;

public class Application3 {
    public static void main(String[] args) {

        char ch ='a';

//        boolean result = ((ch >= 65) && (ch <= 90));
        boolean result = ((ch >= 'A') && (ch <= 'Z'));

        System.out.println(result);

        char ch2 = 'A';
        boolean result2 = ((ch2 >= 'A') && (ch2 <= 'Z'));
        System.out.println(result2);

    }
}
