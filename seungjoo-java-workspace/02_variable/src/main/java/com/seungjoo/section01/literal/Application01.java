package com.seungjoo.section01.literal;

import org.w3c.dom.ls.LSOutput;

public class Application01 {

    public static void main(String[] args) { // 클래스의 진짜 이름은 패키지까지 포함한게 진짜 이름임
        //패키지명은 소문자, 클래스명은의 시작은 대문자로
        //출력문과 같은 것은 클래스 안에 두는 것인 아닌 메서드 안에 두어야함!!

        /*
          ##자바에서 취급하는 값의 종류##
          1. 숫자형 (정수, 실수)
          2. 문자형 (문자, 문자열)
          3. 논리형 (참, 거짓)
         */

        // 1. 숫자 : 따옴표 없이 작성
        System.out.println(123);
        System.out.println(1.23);

        //2. 문자(한 글자) : 홑따옴표 같이 작성
        System.out.println('a');
//        System.out.println('abc'); 커맨드 슬러시 ->주석처리

        //3. 문자열(여러 글자) : 쌍 따옴표 같이 작성
        System.out.println("안녕");
        System.out.println("a");

        //4. 논리
        System.out.println(true);
        System.out.println(false);

        //5. 연산결과 출력
        System.out.println(123+456);
        System.out.println(1.23-0.12);
        // *곱셉, /(나누기의 몫), %(나누기의 나머지)

        //5_2) 문자와 숫자간의 연산결과
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);

        // 5_3) 문자열과 그외 값 간의 연산 결과

        System.out.println("a" + 1); //하나의 문자열로 연이어지는 특성을 가지게 됨 "a1"
        System.out.println(1+"a"); //"1a"
        System.out.println("안녕"+true); //"안녕true"
        System.out.println("안녕" + (1 + 2) + '!');
    }
}
