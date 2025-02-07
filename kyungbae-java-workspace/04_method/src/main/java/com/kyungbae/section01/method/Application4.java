package com.kyungbae.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num = calc.returnIntNumber();
        System.out.println(num);
        System.out.println(calc.returnIntNumber());

        System.out.println(calc.multiply(3,4));
        System.out.println(calc.divide(12,3));
        System.out.println(calc.divide(15,4.4));

        System.out.println(calc.max(14,3));
        System.out.println(calc.min(1,-3));


    } // main end

} // class end
