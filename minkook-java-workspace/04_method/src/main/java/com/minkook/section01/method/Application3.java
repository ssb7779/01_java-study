package com.minkook.section01.method;

public class Application3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum(1,2);
        calc.sum(1.0,2.0);

        calc.minus(3,2);
    }
}
