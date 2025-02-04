package com.jun.section03.constant;

import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {

        int age = 18;
        System.out.println(age);
        age = 19; // 변수는 값 변경 가능
        System.out.println(age);

        /*
            ## 상수 ##
            1. 값을 기록하기 위해 메모리상에 할당되는 공간
            2. 단, 한번 담긴 값을 변경할 수 없음
            3. 상수명은 모두 대문자로 작성하는걸 권장

            [표현법] final  자료형 상수명
         */
        final int AGE = 20;
        final String USER_NAME = "Junhee";
//           AGE = 21;
//           USER_NAME = "Junhee"
     }

     /*
        ## 개발시사용하는 4가지 명명규칙(Naming convention) ##
        1. Camel Case
           - 각 단어의 시작문자를 대문자로 작성해서 연걸하는 방식
           - 단, 시작 문자의 첫 글자는 소문자로 시작
           - 자바 변수명, 메소드명
            ex) userName, userProfileImage, seletUserInfo

        2. Pascal Case
           - Camel Case와 동일하나 시작 문자의 첫 글자를 대문자로 작성하는 방식
           - 자바 클래스명, 인터페이스명
             ex) UserColor, MemberRule, PracticeApplication

        3. Snake Case
           - 언더바(_)를 이용해서 각 단어를 연결하는 방식
           - 자바 상수명, DB관련 테이블명,칼럼명
             ex) USER_PROFILE_URL

        4. Dash Case
           - 대쉬(-)를 이용해서 각 단어를 연결하는 방식
           - 자바에서는 사용 불가
           - 주로 프론트 앱 개발시 사용
             ex) user-profile-image
      */


}
