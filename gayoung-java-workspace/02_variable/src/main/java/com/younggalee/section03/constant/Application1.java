package com.younggalee.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## 상수 constant ##
            1. 값을 기록하기 위해 메모리상에 할당되는 공간
            2. 단, 한번 담긴 값을 변경할 수는 없음.
            3. 상수명은 다 대문자로 작성하는 것을 권장
               (변수와 차이를 두기 위해)
            4. 단어에 구분을 주고자 할 경우 _ 사용

         */
        final int AGE = 20;
        final String USER_NAME = "younggalee";

        /*
            ## 개발시 사용하는 4가지 명명규칙(Naming Convention) ##
            1. Camel Case
               : 각 단어의 시작문자를 대문자로 작성해서 연결하는 방식
                 단, 시작 문자의 첫 글자는 소문자로 시작
               : 자바 일반 변수, 메소드 명   ex String userName;
            2. Pascal Case
               : Camel Case와 동일하나 시작문자의 첫 글자도 대문자로 작성하는 방식
               : 자바 클래스명, 인터페이스명
               : UserColor
            3. snake Case
               : 자바 상수명, DB관련 테이블명, 컬럼명
               : USER_PROFILE_URL
            4. Dash Case
               : 자바에서는 사용불가
               : 주로 프론트 웹 개발시 사용
               : user- profile-image
         */

    }
}
