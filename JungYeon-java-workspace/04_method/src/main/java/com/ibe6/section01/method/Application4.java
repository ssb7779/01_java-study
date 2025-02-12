package com.ibe6.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application4 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num = calc.returnIntNumber();
        System.out.println(num);

        System.out.println(calc.returnIntNumber());


        System.out.println(calc.multiply(3, 10));
        System.out.println(calc.divide(5, 3));
        System.out.println(calc.divide(3.0, 1.2));

        System.out.println(calc. max(5,4));
        System.out.println(calc. min(6,2));

        System.out.println(10);
        System.out.println(1.3);
        System.out.println('a');
        System.out.println("안녕");

    }
}
