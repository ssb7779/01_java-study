package com.minkook.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num = calc.returnIntNumber();
        System.out.println("숫자: " + num + "입니다");

        System.out.println(calc.multiply(3, 10));
        System.out.println(calc.divide(5, 3));
        System.out.println(calc.divide(5.0, 3.0));

        System.out.println("두 수중 큰값은 " + calc.max(3,5) + "입니다");
        System.out.println("두 수중 작은값은 " + calc.min(6,3) + "입니다");

    }
}
