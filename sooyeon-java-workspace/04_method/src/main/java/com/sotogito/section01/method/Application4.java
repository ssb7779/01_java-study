package com.sotogito.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = calculator.returnIntNumber();
        System.out.println(number);

        System.out.println(calculator.multiply(1,1));
        System.out.println(calculator.divide(1,1));
        System.out.println(calculator.divide(1,1));


        int minNumber = calculator.calculateMinNumber(1,2);
        int maxNumber = calculator.calculateMaxNumber(1,2);
    }
}
