package com.pch.section05.logical;

public class Application5 {
    public static void main(String[] args) {
        int num1 = 10;
        boolean result1 = (num1<5)&&(++num1>0);
        System.out.println(num1);

        int num2 = 10;
        boolean result2 = (num2<20)||(++num2<0);
        System.out.println(num2);
    }
}
