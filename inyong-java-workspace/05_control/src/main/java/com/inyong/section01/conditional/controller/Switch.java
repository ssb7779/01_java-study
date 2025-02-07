package com.inyong.section01.conditional.controller;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        case 별로 작성

        switch {
        case 값1: 실행구문1; break;
        case 값2: 실행구문2; break;

        유의 사항
        표현식에는 byte, short, int, char, String(JDK 1.7 이상) 타입 중 하나만 작성 가능
        특정 case문만 실행하고 자동으로 switch문을 빠져나감
        따라서 각 case별 실행 내용 뒤에 break;fmf 직접 작성

         */
    }

    public void testBasicSwitch() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("빨간색");
                break;
            case 2:
                System.out.println("파랑색");
                break;
            case 3:
                System.out.println("노란색");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
                break;

        }


    }

    public void testSwitchExample1() {
        Scanner sc = new Scanner(System.in);
        String drink = sc.next();

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
                System.out.println("잘못선택하셨습니다. 프로그램을 종료합니다.");
        }

        if (price != 0) {
            System.out.println(drink + "을 선택하셨습니다.");
            System.out.println(price + "원을 투입해주세요");
        }

    }

    public void testSwitchExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("성별 m/f")
        ;
        char gender = sc.nextLine().charAt(0);

        String genderStr = "";

        switch (gender) {
            case 'm' | 'M':
                genderStr = "남학생";
                break;
            case 'f' | 'F':
                genderStr = "여학생";
                break;
            default:
                System.out.println("성별을 잘못입력하셨습니다.");
        }

        if (!genderStr.equals("")) {
            System.out.println(genderStr + "입니다");

        }


    }

    public void testSwitchExample3() {
        Scanner sc = new Scanner(System.in);
        int drink = sc.nextInt();

        switch (drink) {
            case 1 | 3, 5, 7, 8, 10, 12:
                System.out.println("31일");
                break;
            case 4 | 6, 9, 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28일 또는 29일");
                break;
            default:
                System.out.println("잘못 입력 했슴둥");
        }
    }
}
