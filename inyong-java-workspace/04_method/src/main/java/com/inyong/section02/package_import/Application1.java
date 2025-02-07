package com.inyong.section02.package_import;

public class Application1 {
    public static void main(String[] args) {

        /*
        패키지
        일반적으로 기능과 역할에 따라 구분
        패키지가 다르면 동일한 이름의 클래스 가능
        실제 클래스명은 패키지까지 함께 포함해서 표기함
        calculator == com.inyong.section01.method.calculator

        동일한 패키지 내에서 클래스 탐색
        1. 클래스명 작성시 패키지 까지 포함한 전체 이름
        2.

         */

        com.inyong.section01.method.Calculator calculator = new com.inyong.section01.method.Calculator();
    }
}
