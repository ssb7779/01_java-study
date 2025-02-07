package com.podoseee.section03.in_decrement;

public class Application3 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++); // a=10(11) => 10출력
        System.out.println(++a + b++); // a=12, b=20(21) => 32출력
        System.out.println(a++ + --b + --c); // a=12(13), b=20, c=29 => 61출력

        System.out.println(a); // 13
        System.out.println(b); // 20
        System.out.println(c); // 29
    }
}
