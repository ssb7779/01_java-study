package com.pch.section01.method;
public class Application1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.info1(1, 2);
        calculator.info2(1, 2);
        calculator.info3(1, 2);
        calculator.info4(1, 2);
        calculator.info5(1, 2);

        Calculator calculator2 = new Calculator(5,6);
    }
}
