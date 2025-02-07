package com.sotogito.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++);
        System.out.println(++a + b++);
        System.out.println(a++ + --b + --c);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
