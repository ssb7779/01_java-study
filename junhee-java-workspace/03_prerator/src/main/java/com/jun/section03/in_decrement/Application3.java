package com.jun.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++); // a = 10 (11로 증가예정) 10 출력
        System.out.println(++a + b++); // a = 12, b = 20(21로 증가예정) 32출력
        System.out.println(a++ + --b + --c); // a = 12(13으로 증가예정), b = 20, c = 29 61출력

        System.out.println(a); // a = 13
        System.out.println(b); // b = 20
        System.out.println(c); // c = 29
    }
}
