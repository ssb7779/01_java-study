package com.younggalee.section01.method;

public class Application3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.sum(5, 10);
        calc.sum(10.2, 20.3);
        calc.sum(10, 20.3);
        calc.sum(10.2, 20);

    }
}
