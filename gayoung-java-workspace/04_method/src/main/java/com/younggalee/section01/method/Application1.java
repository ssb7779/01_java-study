package com.younggalee.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## 다른 클래스의 메소드 호출방법 ##
            1. 객체 생성 : 클래스명 사용할이름 = new 클래스명();
            // 기본자료형, 참조자료형(String, 클래스들)
            2. 메소드호출 : 사용할이름.호출할메소드명();
         */
        Calculator calc = new Calculator(); //객체생성구문
//        calc.info1();
//        calc.info2();
        calc.information();
    }
}