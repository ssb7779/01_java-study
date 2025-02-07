package com.minkook.section02.package_import;

public class Application1 {
    public static void main(String[] args) {

        /*
            ## 패키지 ##
            1. package
            2. 자바클래스를 저장하는 폴더
            3. 일반적으로 클래스들의 기능과 역할에 따라 패키지를 구분하여 저장
            4. 패키지가 다르먄 동일한 이름의 클래스 만들기 가능
            5. 실제 클래스명은 패키지까지 함께 표함해서 표기함
                ex)Calculator == com.minkook.section01.methode.Calculator.java
         */

        //    Calculator calc = new Calculator();
        // 기본적으로 클래스명만 작성시 동일한 패키지호출후 생성
        // 단점 너무 긴 코드를 작성해야함 -> 가독성이 떨어짐
        com.minkook.section01.method.Calculator calculator = new com.minkook.section01.method.Calculator();
        calculator.printNumber(3,5);


    }



}
