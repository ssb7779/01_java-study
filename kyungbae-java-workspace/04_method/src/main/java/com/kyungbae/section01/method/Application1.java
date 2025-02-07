package com.kyungbae.section01.method;

public class Application1  { // class start

    public static void main(String[] args) { // main start

//        Calculator 클래스 내의 메소드를 호출 => 메소드 실행
     /*
        # 다른 클래스의 메소드 호출방법
        1. 객체 생성 :
            클래스명 사용할이름 = new 클래스명();
        2. 메소드 호출 :
            사용할이름.호출할메소드명();
      */

        Calculator calc = new Calculator();
//        calc.info1();
//        calc.info2();
        calc.information();

    } // main end

} // class end
