package com.john.section01.literal;

/*
    ## 자바 값의 종류
    1. 숫자형
    2. 문자형
    3. 논리형
 */

/* 같은 패키지에 같은 이름의 클래스는 생성불가, 다른 패키지의 경우 가능
    Application1 실제이름 => com.john.section.literal.Application1
 */
public class Application1 {
    public static void main(String[] args) {

        // 숫자형
        System.out.println(123);
        System.out.println(1.23);

        // 문자형(단일문자)
        System.out.println('a');
        System.out.println("a"); // 단일 문자X 문자열

        // 문자형(문자열)
        System.out.println("Hello World");
        System.out.println("A");
        
        // 논리형
        System.out.println(true);
        System.out.println(false);
        
        // 연산
        System.out.println(123 + 456);
        System.out.println(1.23 - 0.12); // 실수값 연산의 경우 오차 발생 가능성

        // ASCII 자동 치환
        System.out.println('ㅁ' + 1);
        System.out.println('ㅁ' * 3);
        System.out.println('ㅁ' % 2);

        // 문자열 + 그외 타입( + 의 경우에만 한함)
        System.out.println("a" + 1);
        System.out.println(1 + "A");
        System.out.println(true + "ㅁㅁㅁ");

        System.out.println("안녕" + 1 + 2 + true + "!");
    }
}
