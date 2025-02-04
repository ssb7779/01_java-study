package com.john.section03.constant;

/* 상수
    1. 값을 저장하기 위해 메모리에 할당되는 공간
    2. 한번 저장한 값을 변경할 수 없음
    3. 전체 이름을 대문자로 작성하는 것을 권장
    선언방법 : final [type] [name];
    복수의 명사로 선언하고자 하는 경우 _ 를 사용

   변수의 명명규칙들
   1. Camel Case
        - 각 단어의 시작문자를 대문자로 작성하여연결
        - 가장 처음 첫글자는 소문자
        - 변수 및 메서드등에 사용
        - ex) String userName;
        - ex) searchUserName(){}
   2. Pascal Case
        - Camel Case와 동일하지만 가장 처음 첫글자도 대문자로 작성
        - 클래스 및 인터페이스
        - ex) class UserInfo
   3. Snake Case
        - 언더바 _ 를 이용해서 각 단어를 연결
        - 상수 선언, DB 테이블,컬럼등에 사용
   4. Dash Case
        - 대쉬 - 를 이용해서 각 단어를 연결
        - 자바에서는 사용할 수 없음
 */
public class Application1 {
    public static void main(String[] args) {
        // 변수의 경우, 변경가능
        int age = 10;
        System.out.println(age);
        age = 20;
        System.out.println(age);

        final int AGE = 10;
        System.out.println(AGE);
//        AGE = 30;

        final String USER_NAME = "John";
    }


}
