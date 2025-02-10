package com.seungjoo.section02.loop.run.controller;

import java.util.Scanner;

public class While {
    public void testBasicWhile() {
//        System.out.println("안녕하세요");    //ctrl + d -> 해당구문 복사
//        System.out.println("안녕하세요");
//        System.out.println("안녕하세요");
//        System.out.println("안녕하세요");
//        System.out.println("안녕하세요");
//        System.out.println("안녕하세요");

        int count = 0;
        while (count < 5) {
            System.out.println("안녕하세요");
            count++;
        }
    }

        public void testWhileExample() {
            int num = 1;

            while (num <= 5) {
                System.out.println(num++);
            }


        }

        public void testWhileExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int inputNum = sc.nextInt();

        int num = 1;
        while(num < inputNum){
            System.out.println(num++);
        }
        }

        /*
         # do while문
         1.while문은 조건식에 따라, 변수의 초기값에 따라 반복문이 단한번도 실행되지 않을 수 있음.
         2. do while 문을 사용하면 조건식과 상관 없이 반드시 최초 1번은 실행함
         3. 작성 형식
            do{
                조건식이 참일 경우 반복적으로 실행할 구문
                }while(조건식);

         */
        public void testBasicDoWhile() {


            do {
                System.out.println("조건식과 상관없이 최초 1번은 동작됨");
            } while (false);
        }
        public void testDoWhileExample1() {
            Scanner sc = new Scanner(System.in);
            System.out.println("정수 입력:");
            int inputNum = sc.nextInt();

            int num = 1;
            do{

                System.out.println(num++);
        }while(num <= inputNum);



































        }



























































    }
