package com.minkook.section02.loop.controller;

import java.util.Scanner;

public class While {
    public void testBasicWhile(){
        //안녕하세요 5번출력
        /*
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
         */
        int count = 0;
        while(count < 5){
            System.out.println("안녕하세요");
            count++;
        }

    }

    public void testBasicDoWhile(){
        //안녕하세요 5번출력
        /*
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
               System.out.println("안녕하세요");
         */
        int count = 0;
        do {
            System.out.println("조건식과 상관없이 최초 1번은 동작됨");
        }while (false);

    }

    public void testDoWhileExample1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력");
        int inputNum = sc.nextInt();

        int num = 1;
        do{
            System.out.println(num++);
        }while(num <= inputNum);
    }
}
