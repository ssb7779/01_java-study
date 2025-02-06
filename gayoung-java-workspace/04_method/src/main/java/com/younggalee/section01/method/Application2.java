package com.younggalee.section01.method;

public class Application2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        /*
            ## 인자(인수) ##
            1. argument
            2. 메소드 호출시 메소드의 매개변수로 전달할 데이터를 의미
         */
        calc.printIntNumber(3);
        calc.printIntNumber('가');

        calc.printDoubleNumber(30);
        calc.printDoubleNumber(30.0);
        calc.printDoubleNumber('a');

        calc.printNumber(230,30.2);
    }
}
