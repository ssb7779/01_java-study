package com.jun.section01.conditional.controller;


import java.util.Scanner;

public class Switch {

    /*
        ## switch문 ##
        1. 여러 케이스들 중 실행할 코드를 선택할 수 있는 구문
        2. 실행할 코드들은 case별로 작성 (case문)
        3. switch문에 작성한 표현식의 결과값과 일치하는 case문이 실행
        4. 작성 형식 ───────────────────────┐
           │ switch(표현식) { 				│
           │	case 값1: 실행구문1; break; │
           │	case 값2: 실행구문2; break;	│
           │    case 값3: 실행구문3; break;	│
           │    [default: 실행구문4;] 		│
           │ }                       		│
           └────────────────────────────────┘
        5. 유의사항
           1) 표현식에는 byte, short, int, char, String(JDK 1.7이상) 타입 중 하나만 작성가능
           2) 특정 case문만 실행하고 자동으로 switch 전체블럭을 빠져나가질 않음
              따라서 각 case 별 실행내용 뒤에 break; 를 직접 작성해야됨
     */

    public void testBasicSwitch(){

        /*
            사용자에게 저우를 입력받아
            1일 경우 "빨간색"
            2일 경우 "파란색"
            3일 경우 "초록색"
            잘못 입력했을 경우 "잘못입력" 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(1~3): ");
        int num = sc. nextInt();
        switch(num){
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
                System.out.println("잘못입력하셨습니다");

        }
    }

    public void testSwitchExample1(){

        /*
            실습
            사용자에게 "사이다, 콜라, 환타, 박카스, 핫식스" 중
            구매할 한 개의 음료명을 입력받아
            해당 음료명이
            사이다일 경우 :"500원을 투입해주세요"
            콜라일 경우   :"600원을 투입해주세요"
            환타일 경우   :"700원을 투입해주세요"
            박카스일 경우 :"2000원을 투입해주세요"
            핫식스일 경우 :"10000원을 투입해주세요"
         */

        System.out.println("======= Vending Machine ======");
        System.out.println("사이다 콜라 환타 박카스 핫식스");
        System.out.println("==============================");

        Scanner sc = new Scanner(System.in);
        System.out.print("\n구매할 음료: ");
        String order = sc.nextLine();

        int price = 0; // 음료 가격을 기록할 변수
        switch(order){
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

        }

        System.out.println("잘못 선택하셧습니다. 프로그램을 종료합니다.");
        //return;

       // if(price != 0) {// price 정상 가격이 기록됐을 경우
            System.out.println(order + "을(를) 선택하셨습니다");
            System.out.println(price + "원을 투입해주세요.");
        }

        public void testSwitchExample2(){

        Scanner sc = new Scanner(System.in);
            System.out.print("성별(m/f): ");
            char gender = sc. nextLine().charAt(0);

            String genderStr = "";

            switch(gender){
                // case 'm' : case 'M'
                case 'm':
                case 'M': genderStr = "남학생"; break;
                case 'f':
                case 'F': genderStr = "여학생"; break;
                default:
                    System.out.println("성별을 잘못입력하셨습니다.");

            }

            if(!genderStr. equals("")) {
                System.out.println(genderStr);
            }

    }

    public void testSwitchExample3(){

        /*
            실습.
            사용자에게 특정 월(1~12)을 입력받아
            해당 달의 마지막 날짜 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력(1~12): ");

        int mon =sc. nextInt();

        switch(mon) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("해당 달은 31일까지입니다.");
                break;
            case 4, 6, 9, 11:
                System.out.println("해당 달은 30일까지입니다");
                break;
            case 2 :
                System.out.println("해당 달은 28일 또는 29일까지입니다");
                break;
            default:
                System.out.println("월을 잘못 입력하셨습니다");
        }
    }
}
