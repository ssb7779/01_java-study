package com.seungjoo.section01.method;

public class Application2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.printIntNumber(10);
        calc.printIntNumber(5);
        //calc.printIntNumber(10.5); 정상수행x, int형 매개변수에 double형을 못담아서
        calc.printDoubleNumber(10); //double형 매개변수에는 int형 넣으면 자동 형변환 되어서 수행 가능

        calc.printNumber(10,20.5); //내가 전달한 순서대로 매개변수에 담김
    }
}
