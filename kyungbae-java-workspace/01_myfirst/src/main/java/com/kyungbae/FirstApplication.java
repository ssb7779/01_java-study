package com.kyungbae;

// single line comment

/*
    multi line comment
    여기도 주석
    여기도 주석
 */

/**
 * documentation comment
 * (문서주석)
 * API 문서로 제공하기 위한 주석
 * 작성자, 작성일자, 설멍
 *
 * @author kyungbae
 * @version 0.1
 */



public class FirstApplication { // class start

    public void abc() { // 기능 메소드
        // abc method start

    } // abc method end

    public void randomname() { // randomname method start

    } // randomname method end

    /*
    public static void main(String[] args) { // 실행 메소드

        System.out.println("\tstart");
        System.out.print("1\n"); // escape 문자: \n == 한칸 내리기
        System.out.println('a');
        System.out.println("\"Hello \\World\""); // \" == "출력 \\ == \출력
        System.out.print("\tend\n"); // \t == tab(띄기)

        // 유동적인 문자 삽입
        System.out.printf("이곳은 %s입니다. 오늘은 %d월 %d일 입니다.", "SSG", 2, 3);
        // %s는 문자 %d는 숫자

    } // 실행 메소드 끝
    */

    public static void main(String[] args) {

        System.out.println("새로운\n세상");

    }


} // class end
