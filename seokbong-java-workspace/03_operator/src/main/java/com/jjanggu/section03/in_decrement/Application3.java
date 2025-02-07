package com.jjanggu.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++); // a=10 출력 => a=11
        System.out.println((++a) + (b++)); // 12+20=32 출력 => b=21
        System.out.println((a++) + (--b) + (--c)); // 12+20+29=61 출력 => a=13

        System.out.println(a); //13
        System.out.println(b); //20
        System.out.println(c); //29
    }
}
