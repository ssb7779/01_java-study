package com.pch.section02.package_import;

import com.pch.section01.method.Calculator;

public class Application1 {
    public static void main(String[] args) {
        /**
         * 패키지가 다르면 동일한 이름의 클래스 생성 가능
         *
         * 기본적으로 클래스명만 작성시 동일한 패키지 내에서 클래스 탐색
         */

        Calculator calculator = new Calculator();
        calculator.sum(4, 6);
    }
}
