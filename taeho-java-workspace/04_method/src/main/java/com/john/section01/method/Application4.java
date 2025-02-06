package com.john.section01.method;

public class Application4 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.returnIntNumber();

        int a = calc.returnIntNumber();
        System.out.println(a);

        System.out.println(calc.returnIntNumber());

        calc.multiply(1,2);

        System.out.println(calc.divide(1,2));
        System.out.println(calc.divide(1.1,2.2));

        System.out.println(calc.max(1,2));
        System.out.println(calc.max(3,2));
        System.out.println(calc.min(1,2));
    }
}
