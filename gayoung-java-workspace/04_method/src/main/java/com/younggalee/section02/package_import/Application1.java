package com.younggalee.section02.package_import;

public class Application1 {
    public static void main(String[] args) {
        /*
           ## 패키지 ##
           1. 자바 클래스를 저장하는 폴더
           2. 클래스들의 기능과 역할에 따라 패키지를 구분하여 저장
           3. 패키지가 다르면 동일한 이름의 클래스 작성이 가능
           4. 실제 클래스명은 패키지까지 함께 포함해서 표기하기 때문
         */

        // 같은 패키지 내의 클래스는 바로 사용할 수 있었으나, 외부의 클래스는 import 해주어야한다.
        // 기본적으로 클래스명만 작성시 동일한 패키지내에서 클래스 탐색

        /*
            ## 다른 패키지에 존재하는 클래스의 메소드 호출 방법 ##
            1. 클래스명 작성시 패키지까지 포함한 전체 이름을 작성
            ex. com.younggalee.section01.method.Calculator calc = new ~~();
            (하지만 이는 작성마다 매번 긴 이름을 작성하여야함.)

            2. import 문 사용

         */
    }
}
