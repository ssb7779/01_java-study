package com.kyungbae.section03.in_decrement;

public class Application3 { // class start

    public static void main(String[] args) { // main start
        /*

         */


        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++);    // a = 10
        System.out.println(++a + b++);  // a = 12 b = 20 => 32
        System.out.println(a++ + --b + --c);    // a = 12 b = 20 c = 29 => 61

        System.out.println(a);  // a = 13
        System.out.println(b);  // b = 20
        System.out.println(c);  // c = 29


    } // main end


} // class end
