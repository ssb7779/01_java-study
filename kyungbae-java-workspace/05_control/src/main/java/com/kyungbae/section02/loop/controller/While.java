package com.kyungbae.section02.loop.controller;

import java.util.Scanner;

public class While {

    public void testBasicWhile() {

        // "안녕하세요" 5번 출력

        int count = 0;
        while(count < 5){ // true 인 동안 반복 // false가 나올시 해제
            System.out.println("안녕하세요");
            count++;
        }

    } // tBW end

    public void testWhileExample1() {

        // 1부터 5까지 1씩 증가되는 값을 출력

        int num = 1;
        while (num < 6) { // num <=5
            System.out.println(num++);
        }

    } // tWE1

    public void testWhileExample2() {
        // 1부터 사용자가 입력한 수까지 1씩 증가되는 값 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 :");
        int inputNum = sc.nextInt();

        int num = 1;
        while (num <= inputNum) {
            System.out.println(num++);
        }

    } // tWE2 end

    public void testBasicDoWhile() {
        /*
        do { // 최초 1회 실행
        }while();  // 반복 실행 ** while문 이후 세미콜론(;) 사용

         */
        do {
            System.out.println("최초 1회 실행");
        }while(false);

    } // tBDW end

    public void testDoWhileExample1() {
        // 사용자가 음수를 작성했을때도 최소 1은 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수입력 : ");
        int inputNum = sc.nextInt();

        int num = 1;
        do {
            System.out.println(num++);
        }while (num <= inputNum);

    } // tDWE1 end

} // end class
