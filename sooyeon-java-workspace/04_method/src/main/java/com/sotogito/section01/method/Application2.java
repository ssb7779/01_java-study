package com.sotogito.section01.method;

public class Application2 {
    public static void main(String[] args) {
        /**
         * ## 인자,인수
         * 메개변수 호출 시 메서드의 매개변수로 전달할 데이터
         */
        Calculator calc = new Calculator();
        calc.printIntNumber(1);
        calc.printDoubleNumber(1.0);
        calc.printDoubleNumber(20);

        //호출하고자하는 메서드의 매개변수의 상태에 맞게 인자값을 전달해야한다.
    }
}
