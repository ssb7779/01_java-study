package com.john.section01.conditional.controller;

import java.util.Scanner;

/*
    ## Switch
    1. 여러 케이스 중 실행할 코드를 선택할 수 있는 구문
    2. 실행할 코드는 case별 작성
    3. break 문을 만나기 전까지 아래 구문들이 실행됨.
 */
public class SwitchClass {
    public void testBasicSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("빨간색");
                break;
            case 2:
                System.out.println("파간색");
                break;
            case 3:
                System.out.println("초록색");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
                break;
        }
    }

    public void testSwitchExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========vending machine========");
        System.out.println("사이다  콜라  환타  박카스  핫식스");
        System.out.println("========vending machine========");
        System.out.print("구매할 음료명을 적어주세요: ");

        String str = sc.nextLine();
        int price = 0;

        switch (str) {
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
                break;
//                return;
        }

        if (price == 0) {
            System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
        } else {
            System.out.println(str + "을(를) 선택하셨습니다.");
            System.out.println(price + "원을 투입해주세요");
        }
    }

    public void testSwitchExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f): ");
        char gender = sc.nextLine().charAt(0);

        String genderStr = "";

        switch (gender) {
            case 'm':
            case 'M':
                genderStr = "남학생";
                break;
            case 'f':
            case 'F':
                genderStr = "여학생";
                break;
            default:
                System.out.println("성별을 잘못 입력하셨습니다");
        }
        if (genderStr.equals("")) {
            System.out.println(genderStr + "입니다");
        }
//        if (!genderStr.isEmpty()) {
//            System.out.println(genderStr + "입니다");
//        }
    }

    public void testSwitchExample3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력해주세요 ");

        int month = sc.nextInt();
        int day = 0;
        switch (month) {
            case 1,3,5,7,8,10,12:
                day = 31;
                System.out.println("31일입니다");
                break;
            case 4,6,9,11:
                day = 30;
                System.out.println("30일입니다");
                break;
            case 2:
                day = 28;
                System.out.println("28일 또는 29일 입니다");
                break;
            default:
                System.out.println("월을 잘못 입력하셨습니다");
                break;
        }
        if (day > 0){
            if(day == 31){
                System.out.println("31일입니다");
            } else if (day == 30) {
                System.out.println("30일입니다");
            } else{
                System.out.println("28일 또는 29일 입니다");
            }
        }
    }
}
