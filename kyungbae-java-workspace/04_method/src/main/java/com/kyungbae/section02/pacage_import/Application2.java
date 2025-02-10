package com.kyungbae.section02.pacage_import;

import com.kyungbae.section01.method.Calculator;

public class Application2 {

    public static void main(String[] args) {

        /*
            # import 문
            1. 해당 클래스에서 사용할 다른 패키지의 클래스를 선언해두는 구문
            2. package 선언문 하단에 작성
            3. 한번만 선언해두면 매번 실제클래스명(패키지 포함)을 작성할필요 없음

            # 다른 패키지에 존재하는 클래스의 메소드 호출 방법2
            사용할 클래스를 import문을 통해 선언해두기

            # 패키지 안에 모든 class 를 가져올 때
            com.packagename.packagename.*
         */
        Calculator calc = new Calculator();
        calc.sum(1,3);

    } // main end

} // class end
