package com.kyungbae.practice;

public class PracApplication1 { // class start

    public static void main(String[] args) { // main start

//        1. 실행 결과 예측
        int a = 11;
        int b = -5;
        int c = a++ - b--; // a=11(12), b=-5(-6), c=16
        int d = ++c + a--; // a=12(11), b=-6, c=17, d=29

        System.out.println("a: " + a); //  a: 11
        System.out.println("b: " + b); //  b: -6
        System.out.println("c: " + c); //  c: 17
        System.out.println("d: " + d); //  d: 29

    } // main end

} // class end