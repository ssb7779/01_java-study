package com.sotogito.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /**
         * ## 다른 클래스의 메서드 호출 방법
         * 1. 객체 생성 : 클래스명 변수명 = new 클래스명();
         * 2. 메서드 호출 : 변수명.호출할메서드명();
         */

        Calculator calculator = new Calculator();
//        calculator.info1();
//        calculator.info2();
        calculator.information();

    }
}
