package com.kyungbae.section01.method;

public class Application2 { // class start

    public static void main(String[] args) { // main start

        Calculator calc = new Calculator();

        /*
            # 인자 (인수)
            1. argument
            2. 메소드 호출 시 메소드의 매개변수로 전달할 데이터
         */
/*
        calc.printIntNumber(10);
//        calc.printIntNumber(1.1); // 에러 발생 => double => int X
        calc.printDoubleNumber(5.5);
        calc.printDoubleNumber(50); // 자동 형변환 발생 int => double
 */
        calc.printNumber(10, 1.1); // 매개변수에 순서대로 담긴다

    } // main end


} // class end
