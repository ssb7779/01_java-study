package com.kyungbae.section01.conditional.controller;

import java.util.Scanner;

public class Switch {

    public void testBasicSwitch () {

        Scanner sc = new Scanner(System.in);
        System.out.print("색을 고르시오(1~3) : ");
        int num = sc.nextInt();

        String color = null;
        switch (num) {
            case 1:
                color = "빨간색";
                break;
            case 2:
                color = "파란색";
                break;
            case 3:
                color = "초록색";
                break;
            default:
                color = "잘못입력";
        }
        System.out.println(color);

    } // tBS end

    public void testSwitchExample1() {
        /*
            사이다 콜라 환타 박카스 핫식스 중
            구매할 한개의 음료명을 입력받아 해당 음료명이
            사이다일경우 : 500원을 넣어주세요
              콜라일경우 : 600원을 넣어주세요
              환타일경우 : 700원을 넣어주세요
            박카스일경우 : 2000원을 넣어주세요
            핫식스일경우 : 10000원을 넣어주세요
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("=======     자판기    ========");
        System.out.println("사이다 콜라 환타 박카스 핫식스");
        System.out.println("==============================");
        System.out.print("구매하실 음료를 입력해주세요 : ");
        String drink = sc.nextLine();

        int num = 0;
        switch (drink) {
            case "사이다":
                num = 500;
                break;
            case "콜라":
                num = 600;
                break;
            case "환타":
                num = 700;
                break;
            case "박카스":
                num = 2_000;
                break;
            case "핫식스":
                num = 10_000;
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }
        if (num != 0) {
            System.out.println(num + "원을 투입해주세요.");
        }


    } // tSE1 end

    public void testSwitchExample2 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f) : ");
        char gender = sc.nextLine().charAt(0);

        String genderStr = ""; // 남학생 또는 여학생을 기록할 변수

        switch (gender) {
            case 'm' :
            case 'M' : genderStr = "남학생"; break;
            case 'f' :
            case 'F' : genderStr = "여학생"; break;
            default:
                System.out.println("없는 성별입니다.");
        }
        if (!genderStr.equals("")) {
            System.out.println(genderStr);
        }
    } // tSE2 end

    public void testSwitchExample3() {
        /*
            사용자에게 특정 월(1~12)을 입력받아
            해당 달의 마지막 날짜 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요(1~12) :");
        int month = sc.nextInt();

        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
        }
        if (month != 0) {
            System.out.printf("%d월은 %d일 까지 있습니다", month, days);
        }
    }

} // class end
