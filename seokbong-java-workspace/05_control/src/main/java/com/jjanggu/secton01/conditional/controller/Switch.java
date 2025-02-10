package com.jjanggu.secton01.conditional.controller;
import java.util.Scanner;
public class Switch {

    /*
        ## switch문 ##
        1. 여러 케이스들 중 실행할 코드를 선택할 수 있는 구문
        2. 실행할 코드들은 case별로 작성
        3. switch문에 작성한 표현식의 결과값과 일치하는 case문이 실행
        5. 유의사항
           1) 표현식에는 byte, short, int, char, String(JDK 1.7이상)타입 중 하나만 작성가능
           2) 특정 case문만 실행하고 자동으로 switch 전체블럭을 빠져나가질 않음
              따라서 각 case 별 실험내용 뒤에 break; 직접 작성해야

     */








    public void testBasicSwitch(){
        Scanner sc = new Scanner(System.in);
        ;
    }

    public void testSwitchExample(){
        /*
            실습.
            사용자에게 "사이다, 콜라, 환타, 박카스, 핫식스" 중
            구매할 한 개의 음료명을 입력받아
            해당 음료명이
            사이다일 경우 : "500원을 투입해주세요"
            콜라 : " 600
            환타 : " 700
            박카스 : 2000
            핫식스 : 10000
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("====== Vending Marchine ======");
        System.out.println("사이다 콜라 환타 박카스 핫식스");
        System.out.println("==============================");

        System.out.println("\n구매할 음료 : ");
        String order = sc.nextLine();

        int price = 0; // 음료 가격을 기록할 변수
        switch(order){
            case "사이다" :
                price = 500;
                break;
            case "콜라" :
                price = 600;
                break;
            case "환타" :
                price = 700;
                break;
            case "박카스" :
                price = 2000;
                break;
            case "핫식스" :
                price = 10000;
                break;
            //default :
                //System.out.println("잘못 선택하셨습니다. 프로그램을 종료합니다.");
               //return;
        }

        if(price != 0){
            System.out.println(order + "을(를) 선택하셨습니다.");
            System.out.println(price + "원을 투입해주세요.");
        }else{
            System.out.println("잘못 선택하셨습니다. 프로그램을 종료합니다.");
        }

    }

    public void testSwitchExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("성별(m/f) : ");
        char gender = sc.nextLine().charAt(0);

        String genderStr = ""; // 남학생 또는 여학생의 결과를 기록할 변수

        switch(gender) {
            case 'm' : case 'M' : genderStr = "남학생"; break;
            case 'f' : case 'F' : genderStr = "여학생"; break;
            default:
                System.out.println("성별을 잘못입력하셨습니다.");
        }

        if (!genderStr.equals("")) {
            System.out.println(genderStr);
        }

    }

    public void testSwitchExample3() {

        /*
            실습.
            사용자에게 특정 월(1~12) 입력받아
            해당 달의 마지막 날짜 출력

            1 3 5 7 8 10 12 => 31일
            4 6 9 11 => 30일
            2 => 28일 또는 29일이다

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("월(1~12) 입력:");
        int month = sc.nextInt();


        switch(month){
            case 1, 3, 5, 7, 8 ,10, 12 :
                System.out.println("해당 달은 31일까지입니다.");
                break;
            case 4, 6 ,9, 11 :
                System.out.println("해당 달은 30일까지입니다.");
                break;
            case 2 :
                System.out.println("해당 달은 28일 또는 29일까지입니다.");
                break;
            default :
                System.out.println("월을 잘못 입력하셨습니다.");
        }

    }


}
