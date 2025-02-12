package com.ibe6.section02.package_import;

import com.ibe6.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {

        /*
            ## import문 ##
            1. 해당 클래스에서 사용할 다른 패키지의 클래스를 선언해두는 구문
            2. package 선언문 하단에 작성
            3. 한 번만 선언해두면 매번 실제 클래스명(패키지포함)을 번거롭게 작성할 필요 X

            ## 다른 패키지에 존재하는 클래스의 메소드 호출 방법2 (채택)
            사용할 클래스를 import문을 통해 선언해두기
         */
        Calculator calc = new Calculator();
        calc.sum(3, 5);
    }
}
