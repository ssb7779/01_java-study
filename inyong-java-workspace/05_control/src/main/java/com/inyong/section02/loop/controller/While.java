package com.inyong.section02.loop.controller;

import java.util.Scanner;

public class While {
    public void testBasicWhile(){
        // do 조건식이 참일 경우 반복적으로 실행할 구문 -> 무조건 한번은 실행함.
        // while(조건식) -> 조건식이 참 일때 반복 실행
        int count = 0;

        while(count < 5){
            count++;
            System.out.print("안녕");
        }

    }

    public void testBasicDoWhile(){
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        int num = 1;
        do{
            System.out.println(num++);
        } while(num <= inputNum);
    }
}