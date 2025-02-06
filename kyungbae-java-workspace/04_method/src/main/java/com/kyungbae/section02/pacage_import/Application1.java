package com.kyungbae.section02.pacage_import;

public class Application1 {

    public static void main(String[] args) {
        /*
            # 패키지
            1. package
            2. 자바 클래스를 저장하는 폴더
            3. 일반적으로 클래스들의 기능과 열할에 따라 패키지를 구분하여 저장
            4. 패키지가 다르면 동일한 이름의 클래스 만들기 가능
            5. 실제 클래스명은 패키지까지 포함하는 이름
                ex) Calculator == com.kyungbae.section01.method.Calculator
         */

//        Calculator calc = new Calculator();
//        기본적으로 클래스명만 작성 시 동일한 패키지 내에서 클래스 탐색

        /*
            # 다른 패키지에 존재하는 클래스의 메소드 호출 방법1
            클래스명 작성시 패키지까지 포함한 전체 이름 작성
                ex)com.kyungbae.section01.method.Calculator
            단점 : 긴 이름 작성으로 인한 번거로움
         */
        com.kyungbae.section01.method.Calculator calc = new com.kyungbae.section01.method.Calculator();
        calc.sum(1,2);


    } // main end

} // class end
