package com.pch.section02.loop.controller;

import java.util.Scanner;

public class While {

    public void testBasicWhile(){
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");

        int n = 0;
        while(n++<5){
            System.out.println("안녕하세요");
        }
    }

    public void testWhileExample1(){
        int num = 1;
        while(num<6){
            System.out.println(num++);
        }
    }

    public void testWhileExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int inputNum = sc.nextInt();

        int num = 1;
        while(num<=inputNum){
            System.out.println(num++);
        }
    }
}
