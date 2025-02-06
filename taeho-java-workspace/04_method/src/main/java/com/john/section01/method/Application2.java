package com.john.section01.method;

/*
    ## 인자
    - method 호출 시, 메서드의 매개변수로 전달한 데이터를 의미
 */
public class Application2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.printIntNumber(2);
        calc.printDoubleNumber(5);
        calc.printDoubleNumber(6.0);

        calc.printNumber(10,20.5);

    }
}
