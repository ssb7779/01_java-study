package com.jmk.section01.literal;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## Java에서 취급하는 값의종류##
            1. 숫자형 (정수,실수)
            2. 문자형 (문자,문자열)
            3. 논리형( 참 true, 거짓 false)
         */


        // 1. 숫자 : 따옴표없이 작성
        System.out.println(123);
        System.out.println(12.3);

        //2. 문자(한글자) : 홀따옴표같이 작성
        System.out.println('a');
        //System.out.println('abc');

        //3. 문자열(여러글자): 쌍따옴표 같이 작성
        System.out.println("안녕");
        System.out.println("A");

        //4. 논리
        System.out.println(true);
        System.out.println(false);

        //5. 연산결과 출력
        //5_1) 숫자간의 입출력
        System.out.println(123 + 456);
        System.out.println(1.23 - 0.12); //컴퓨터에서의 실수 연산은 불완전해서 오차가 생길 수 있음.
        // *(곱셉) , /,%

        //5_2) 문자와 숫자간의 연산결과
        System.out.println('a' + 1); //98
        System.out.println('a' - 1);
        System.out.println('a' * 2);

        //5-3) 문자열과 그의 값 간의 연산 결과

        System.out.println("a" + 1); //"a1"
        System.out.println(1 + "a"); //"1a"
        System.out.println("안녕" + true);
        System.out.println("안녕" + 1 + 2 + '!');
        System.out.println("안녕" + (1 + 2) + '!');
    }
}
