package com.sotogito.section02.package_import;

import com.sotogito.section01.method.Calculator;

public class Application2 {
    /**
     * ##다른 패키지에 존재하는 클래스의 메서드 호출 방법
     * ## import문
     * - 해당 클래스에서 사용할 다른 패키지의 클래스를 선언해두는 구문
     * - package선언문 하단에 작성
     * - 선언 후 재활용
     */


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(20, 0);
    }
}
