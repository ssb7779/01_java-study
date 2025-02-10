package com.minkook.section01.conditional.controller;

import java.util.Scanner;

public class Switch {
    public void testBasicSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(1~3): ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("빨간색 ");
                break;
            case 2:
                System.out.println("파란색");
                break;
            case 3:
                System.out.println("노란색");
                break;
            default:
                System.out.println("색없음");
                break;
        }
    }

    public void testSwitchExamp1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("구매할 음료명: ");
        String drink = sc.nextLine();

        switch (drink){
            case "사이다":
                System.out.println("500원을 투입해주세요.");
                break;
            case "콜라":
                System.out.println("600원을 투입해주세요.");
                break;
            case "환타":
                System.out.println("700원을 투입해주세요.");
                break;
            case "박카스":
                System.out.println("2000원을 투입해주세요.");
                break;
            case "핫식스":
                System.out.println("10000원을 투입해주세요.");
                break;
        }
    }
    public void testSwithExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f): ");

        char gender = sc.nextLine().charAt(0);
        String strGender = "";
        switch (gender){
            case 'm':
            case 'M': strGender = "남학생"; break;
            case 'f':
            case 'F': strGender = "여학생"; break;
            default:
                System.out.println("성별을 잘못입력하셨습니다.");
        }
        if(!strGender.equals("")){
            System.out.println(strGender);
        }
    }

    public void testSwitchExmaple3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("월(1~12): ");
        int day = sc.nextInt();


        switch(day){
            case 1,3,5,7,9,10,12:
                System.out.println("해당 달은 31일까지입니다.");
                break;
            case 4,6,11:
                System.out.println("해당 달은 30일까지입니다.");
                break;
            case 2:
                System.out.println("해당 달은 28일 또는 29일까지입니다.");
                break;
        }




    }
}
