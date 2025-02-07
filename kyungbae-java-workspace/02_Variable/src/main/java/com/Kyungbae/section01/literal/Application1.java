package com.Kyungbae.section01.literal;

/*
    패키지의 이름 :
    com.kyungbae.section01.literal.Application1
 */

public class Application1 { // class start

    public static void main(String[] args) { // static main start

        // 1. 숫자 : 정수, 실수 == 따옴표 없이 작성
        System.out.println(123);
        System.out.println(1.23);

        // 2. 문자 (한글자) == 홀따옴표 사용, 쌍따옴표도 가능
        System.out.println('A');
        System.out.println('가');
        System.out.println("B");
        System.out.println('?');
        System.out.println('\\');

        // 3. 문자열 (여러글자) == 쌍따옴표 사용
        System.out.println("ABC");
        System.out.println("가나다");

        // 4. 논리
        System.out.println(true);
        System.out.println(false);

        // 5. 연산
        // 5-1 숫자간 연산
        System.out.println(14 + 12);
        System.out.println(4 * 8);
        System.out.println(56 / 8);
        System.out.println(73 % 8); // 나누기 나머지
        System.out.println(32.4 - 1.1); // 실수값 연산에는 오차가 생길 수 있다

        // 5-2 문자와 숫자간 연산
        System.out.println('a' + 1); // 유니코드 번호
        System.out.println('ㄱ' + 1);
        System.out.println('$' + 1);
        System.out.println(0x41 + 1); // 16진수
        System.out.println('4' + 1);

        // 5-3 문자열과 그외 값간 연산
        System.out.println("가" + "나"); // == 가나 <- 쌍따옴표만 가능
        System.out.println(1 + "일");
        System.out.println("안녕" + true);
        System.out.println("하이" + 1 + 2 + "!");
        System.out.println("하이" + ((1 + 2) + 2) + "!");


    } // static main end

    /*
    public static void sub(String[] args){

    }

     */

} // class end
