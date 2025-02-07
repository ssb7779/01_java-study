package com.pch.section01.condotional.controller;

import java.util.Scanner;

public class Switch {
    public void switch1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력(1~30: ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("빨간색");
                break;
            case 2:
                System.out.println("파란색");
                break;
            case 3:
                System.out.println("초록색");
                break;
            default:
                System.out.println("wrong input");
        }
    }

    public void testSwitchExample1(){
        System.out.println("========== Vending Marchin ==========");
        System.out.println("사이다 콜라 환타  박카스 핫식스");
        System.out.println("=====================================");
        
    }
}
