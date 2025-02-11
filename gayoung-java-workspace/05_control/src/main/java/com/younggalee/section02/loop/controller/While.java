package com.younggalee.section02.loop.controller;

import java.util.Scanner;

public class While {
    /*
    # while문 #
    1. 특정 조건을 만족하는 경우, 반복해서 실행할 코드 작성
    2. 반복 실행할 코드는 중괄호 {}로 묶어 다른 코드와 구분해줘야함.
     */

    public void testBasicWhile(){
        int count = 0;

        while(count < 5){
            System.out.println("안녕하세요");
            count++; //count += 1;
        }
    }

    public void testWhileExample1(){
         int num = 0;

         while(num < 5){
             ++num;
             System.out.println(num);
         }
    }

    public void testWhileExample2(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while (i < num){
            ++i;
            System.out.println(i);
        }
    }

    /* do while문 ***최초 1번은 돌아가야할 경우 사용
    1. while문은 조건식에 따라, 변수의 초기값에 따라 반복문이 단 한번도 실행되지 않을 수 있음.
    2. 반면에 do while문을 사용하면 조건식과 상관없이 반드시 최초 1번은 실행함.

    do {
        조건식이 참일 경우 반복적으로 실행할 구분
    } while (조건식);
     */

    public void testBasicDoWhile(){
        do {
            System.out.println("조건식과 상관없이 최초 1번은 동작됨");
        }while(false);
    }

    public void testDoWhileExample1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력 : ");
        int inputNum = sc.nextInt();

        int num = 1;
        do {
            System.out.println(num++);
        } while(num <= inputNum);  //while() ";" 붙음 *****
    }
}