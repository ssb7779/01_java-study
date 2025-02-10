package com.sotogito.section01.control.controller;

import java.util.Scanner;

public class Switch {
    /**
     * ## switch - case 별로 작성 - 표현식의 결과값과 일치하는 case문이 실행 - 표현식에는 byte,short,int,char,String중 하나만 작성 가능
     */

    public void testBasicSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수(1~3) : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("빨");
                break;

            case 2:
                System.out.println("파");
                break;
            case 3:
                System.out.println("초");
                break;
            default:
                System.out.println("잘못입력하였습니다.");
        }
    }

    public void testSwitchExample1() {
        /**
         * 1. 사이다, 콜라, 환타, 박카스,핫식스 중 한가지를 입력받는다.
         * 2. 구매 비용을 출력한다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("구매할 음료 한가지를 입력해주세요 : ");
        String drink = sc.nextLine();

        int price = 0;

        switch (drink) {
            case "사이다":
                price = 500;
                break;

            case "콜라":
                price = 600;
                break;
            case "환타":
                price = 700;
                break;
            case "박카스":
                price = 2000;
                break;
            case "핫식스":
                price = 10000;
                break;
            default:
                System.out.println("잘못입력하였습니다.");
        }

        if (price != 0) {
            System.out.printf("%d원을 투입해주세요.", price);
        } else {
            System.out.println("잘못입력하였습니다.");
        }
    }

    public void testSwitchExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("성별m/f : ");
        char gender = sc.nextLine().charAt(0);

        String genderStr = "";

        switch (gender) {
            case 'm':
            case 'M':
                genderStr = "남";
                break;
            case 'f':
            case 'F':
                genderStr = "여";
                break;
        }

        if (!genderStr.equals("")) {
            System.out.println(genderStr);
        }
    }


    public void testSwitchExample3() {
        /**
         * 1~12월을 입력받아 해당 달의 마지막 날짜 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("달 : ");
        int month = sc.nextInt();

        int lastDay = 0;
        switch (month) {
            case 1 ,3,5,7,8,10,12 : 
                lastDay = 31;
                break;
            case 4,6,9,11:
                lastDay = 30;
                break;
            case 2 :
                lastDay = 28;
                break;
        }

        System.out.println(lastDay);


    }
}
