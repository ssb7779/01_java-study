package com.minkook.section02.package_import;
import com.minkook.section01.method.Calculator;
public class Application2 {
    public static void main(String[] args) {

        /*
            ## import 문 ##
            1. 해당 클래스에서 사용할 다른 패키지의 클래스를 선언해두는 구문
            2. package 선언문 하단에 작성

            ## 다른 패키지에 존재하는 클래스의 메소드 호출 방법2(채택)##
         */

        Calculator calc = new Calculator();
        calc.sum(3,5);
    }
}
