package com.Kyungbae.section03.constant;

public class Application1 { // class start

    public static void main(String[] args) { // static main start
        /*
        int age = 18;
        System.out.println(age);
        age = age + 1;  // 변수는 값 변경 가능
        System.out.println(age);
         */

        /*
            # 상수
            1. 기록 후 변경이 불가능한 값
            2. 상수명은 대문자로 작성 (권장)
            [표현법]
            final 자료형 상수명;
         */

        final int AGE = 20;
        final String USER_NAME = "Kyungbae"; // 상수에서 단어 구분 시 언더바 사용 (권장)
//        AGE = 21;

    } // static main end

    /*
        # 명명규칙 (Naming Convention)
        1. Camel case (낙타표기법)
            - 각 단어의 시작 문자를 대문자로 작성
            - 단, 시작 문자의 첫 글자는 소문자
            - Java 변수명, 메소드명
            ex) userName, userProfileImage, selectUserInfo

        2. Pascal case
            - 시작 문자의 첫 글자 또한 대문자로 작성
            - Java 클래스명, 인터페이스명
            ex) User, Member, UserColor

        3. Snake case
            - 언더바를 이용하여 단어를 연결
            - Java 상수명, DB 관련 테이블명
            ex) USER_PROFILE_URL

        4. Dash case
            - 대쉬를 이용하여 단어를 연결
            - Java 사용 불가
            - 프론트 웹 개발 시 사용
            ex) user-profile-image

     */



} // class end
