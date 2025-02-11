package com.pch.section03.etc.controller;

import java.util.Scanner;

public class Break {
    /*
        ## break문 ##

        1.  break문으로 switch문을 종료시킬 수 있듯이
            while문이나 for문 같은 반복문에서도 반복문을 강제로 종료시킬 수 있음

        2.  주로 반복문 안에서 반복문이 종료될 조건과 함께 사용

        3.  유의사항
            - 중첩 반복문일 경우 break문이 속해있는 최근접의 반복문만 종료됨

     */
    public void testBasicBreak(){
        /*
            매번 1 ~ 100 사이의 랜덤수가 발생되면서 출력됨
            이 때 발생된 랜덤값이 5의 배수일 경우 반복이 종료되도록 하시오.
         */
        int n = 3;
        while(n%5!=0){
            n = (int)(Math.random()*100+1);
            System.out.println("랜덤수 : "+n);
        }
    }

    public void testBreakExample1(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("문자열 입력 종료 원하면 exit 입력 : ");
            String input = sc.nextLine();

            System.out.println(input+"의 굴자수는 "+input.length()+" 입니다");
        }
    }
}
