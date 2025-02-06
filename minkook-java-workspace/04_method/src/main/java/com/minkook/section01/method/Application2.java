package com.minkook.section01.method;

public class Application2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printIntNumber(5);
        calc.printIntNumber(10);
//        calc.printIntNumber(5.7); //에러발생 (int 매개변수에 double 못받음)
        calc.printDoubleNumber(20.5);
        calc.printDoubleNumber(30); //정상수행 double형  자동형변환

        calc.printNumber(10,20.5);

        //호출하고자 하는 메소드의 매개변수 선언부에 선언한대로
        //자료형과 개수, 순서가 일치하게 인자값을 전달해야함

    }
}
