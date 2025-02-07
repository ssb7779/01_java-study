package com.john.section01.method;

/*
    같은 패키지의 다른 클래스인 Calculator 내의 메서드를 호출
    1. 객체 생성 : [Class Name] [name] = new [Class name];
 */
public class Application1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.info();
        calculator.info2();

        calculator.information();

        calculator.info3();


    }
}
