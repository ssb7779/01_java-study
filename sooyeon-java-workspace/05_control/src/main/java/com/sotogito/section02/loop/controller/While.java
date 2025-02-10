package com.sotogito.section02.loop.controller;

import java.util.Scanner;

public class While {
    /**
     * 1. 특정 조건을 만족하는 경우 반복
     * 2.
     */

    public void testBasicWhile() {
        int count = 0;

        while (count < 5) {
            System.out.println("안녕하세요.");
            count++;
        }
    }

    public void testWhileExample1() {
        int num = 1;
        while (num <= 5)
            System.out.println(num++);
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int inputNum = sc.nextInt();

        int num = 1;
        while (num <= inputNum) {
            System.out.println(num++);
        }
    }

    /**
     * ## do while
     * 조건을 나중에 확인하여 일단 한번은 실행됨
     */
    public void testBasicDoWhile() {
        do {
            System.out.println("1번 출력");
        } while (false);
    }

    public void testDoWhileExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int inputNum = sc.nextInt(); //음수의 경우 최초 1은 출력
        int num = 1;

        do {
            System.out.println(num++);
        } while (num <= inputNum);
    }

}
