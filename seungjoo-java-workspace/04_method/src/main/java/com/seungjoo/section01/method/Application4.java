package com.seungjoo.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int num = calc.returnIntNumber();
        System.out.println(num);


        System.out.println(calc.divide(3,2));
        System.out.println(calc.divide(3.0,2.0));

        System.out.println(calc.max(2,3));
        System.out.println(calc.min(2,3));
    }
}
