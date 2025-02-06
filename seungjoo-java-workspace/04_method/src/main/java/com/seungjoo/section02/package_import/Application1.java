package com.seungjoo.section02.package_import;
import com.seungjoo.section01.method.Calculator;

public class Application1 {
    public static void main(String[] args) {

        /*
        ##패키지
        1.package
        2. 자바 클래스를 저장하는 폴더
        3. 일반적으로 클래스들의 기능과 역할에 따라 패키지를 구분하여 저장
        4. 패키지가 다르면 동일한 이름의 클래스 만들기 가능
        5.실제 클래스명은 패키지까지 함께 포함해서 표기함.
         */

        //Calculator calc = new Calculator();
        //클래스를 찾을 때 같은 패키지 안에서 찾음. 그래서 바로 못찾음, 기본적으로 클래스명만 작성시 동일한 패키지내에서 클래스 탐색

        /*
         ## 다른 패키지에 존재하는 클래스의 메소드 호출 방법1##
         클래스명 작성시 패키지까지 포함한 전체 이름을 작성하기
         단점 : 클래스명 작성시마다 매번 긴 이름 써야됨(번거로움)



         */
        com.seungjoo.section01.method.Calculator calc = new com.seungjoo.section01.method.Calculator();


        /*

           ##import문
           1. 해당 클래스에서 사용할 다른 패키지의 클래스를 선언해두는 구문
           2. package 선언문 하단에 작성
           3. 한 번만 선언해두면 매번 실제클래스명(패키지포함)을 번거롭게 작성할 필요x

           ## 다른 패키지에 존재하는 클래스의 메소드 호출 방법2(채택)
               사용할 클래스를 import문을 통해 선언해두기
         */
        Calculator calc2 = new Calculator();
        calc2.sum(3,5);


    }
}
