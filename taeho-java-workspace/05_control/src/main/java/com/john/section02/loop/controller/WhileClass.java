package com.john.section02.loop.controller;

/*
    ## While
    1. 특정 조건을 만족하는 경우 코드를 반복
    2. 조건문과 마찬가지로 반복 실행할 코드를 { } 내에 작성
    3. 무한루프가 되지 않도록 반드시 탈출 조건 필요
    4. do{} ~ while {} 문을 사용하는 경우, 조건식과 상관없이 최초 1번 실행
 */

import java.util.Scanner;

public class WhileClass {
    public void testBasicWhile() {
        /*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
         */

        int count = 0;
        while (count < 5) {
            System.out.println("Hello World");
            count++;
        }

    }

    public void testWhileExample(){
        int num = 1;
        while (num <= 5) {
            System.out.println(num++);
        }
    }

    public void testWhileExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNum = sc.nextInt();

        int num = 1;
        while (num <= inputNum) {
            System.out.println(num++);
        }
    }

    public void testBasicDoWhile() {
        do {
            System.out.println("최초 실행");
        } while(false);
    }

    public void testDoWhileExample1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNum = sc.nextInt();

        int num = 1;

        do {
            System.out.println(num++);
        }while (num <= inputNum);
    }
}
