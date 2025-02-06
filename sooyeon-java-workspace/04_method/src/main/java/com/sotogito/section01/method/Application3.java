package com.sotogito.section01.method;

public class Application3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(10, 3);
        calculator.sum(10.5, 12.3);
        calculator.sum(1, 2, 3);

        calculator.minus(10, 3);
    }
}
