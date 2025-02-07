package com.podoseee.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num = calc.returnIntNumber();
        System.out.println(num);

        System.out.println((calc.returnIntNumber()));

        System.out.println(calc.multiply(3,10));
        System.out.println(calc.divide(5, 3));
        System.out.println(calc.divide(3.0, 1.2));

        System.out.println(calc.max(7,2));
        System.out.println(calc.min(10,8));

    }
}
