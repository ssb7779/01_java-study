package com.seungjoo.section01.controller;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {



    /*
    ##유의 사항
    1)표현식에는 byte, short, int, char, String(JDK 1.7이상) 타입 중 하나만 작성가능
    2) 특정 case문만 실행하고 자동으로 switch 전체블록을 빠져나가질 않음
        따라서 각 case 별 실행 내용 뒤에 break;를 직접 작성해야됨.

     */


    Scanner sc = new Scanner(System.in);
    System.out.println("정수(1~3):");
    int num = sc.nextInt();

    switch (num) {
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
            System.out.println("잘못입력하셨습니다.");
    }
}

public void testSwitchExample(){
    System.out.println("=============================vending machine==============");
    System.out.println("사이다 콜라 환타 박카스 핫식스");
    System.out.println("==========================");

    Scanner sc = new Scanner(System.in);
    System.out.println("\n구매할 음료:");
    String order = sc.nextLine();

    int price = 0;
    switch(order) {
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
        case "핫식스":
            price = 10000;
            break;
        default:
            System.out.println("잘못 선택하셨습니다. 프로그램을 종료합니다.");
            //return;
    }
    System.out.println(order + "을(를) 선택하셨습니다.");
    System.out.println(price + "원을 투입해주세요.");
    }

    public void testSwitchExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("성별(m/f):");
        char gender = sc.nextLine().charAt(0);

        String genderStr = "";
        switch(gender) {
            case 'm':
            case 'M':genderStr = "남학생"; break;
            case 'f':
            case 'F': genderStr = "여학생"; break;
            default:
                System.out.println("성별을 잘못입력하셨습니다.");
        }
        if(!genderStr.equals("")){
            System.out.println(genderStr);
        }
    }
        public void testSwithchExample(){
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            switch(answer){
                case 1,3,5,7,8,10,12:
                    System.out.println("해당 달은 31일까지입니다.");
                    break;
                case 4,6,9,11:
                    System.out.println("해당 달은 30일까지입니다.");
                    break;
                case 2:
                    System.out.println("해당 달은 28일 또는 29일까지입니다.");
                    break;
                default:
                    System.out.println("월을 잘못 입력하셨습니다.");

        }




}
    }