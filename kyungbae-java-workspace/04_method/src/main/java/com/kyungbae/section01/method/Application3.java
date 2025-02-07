package com.kyungbae.section01.method;

public class Application3 { // class start

    public static void main(String[] args) { // main start

        Calculator calc = new Calculator();

        calc.sum(10, 3);        // 자동으로 알맞는 메소드로 찾아감
        calc.sum(10.2, 5.5);
        calc.minus(20, 33);

    } // main end

} // class end
