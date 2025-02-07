package com.jun.section01.method;

public class Application2 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        /*
            ## 인자(인수) ##
            1. argument
            2. 메소드 호출시 메소드의 매개변수로 전달할 데이터를 의미
         */
//        calc.printIntNumber(10);
//        calc.printImtNumber(5.7); // 에러발생 (int 매개변수에 double 담기 불가)
//        calc.printDoubleNumber(20.5);
//        calc.printDoubleNumber(30); // 정상수행 (double 매개변수에 int 담기 가능, 자동형변환)

        calc.printNumber(10,20.5);

        // 호출하고자 하는 메소드의 매개변수 선언부에 선언한대로
        // 자료형과 개수, 순서가 일치하게 인자값을 전달해야됨
    }
}
