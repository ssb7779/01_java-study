package com.younggalee.section01.conditional.controller;
import java.util.Scanner;

public class Switch {
    /*
    switch문
    switch문에 작성한 표현식의 결과값과 일치하는 case문이 실행
    switch, case:, break****, [default]:
    break 없으면 이후 케이스 구문 모두 실행됨. 주의.

    >유의사항
    표현식에는 byte, short, int, char, String(JDL 1.7이상) 타입중 하나만 작성가능 (실수불가) *********** ex) double은 불가
    특정 case문만 실행하고 자동으로 switch {} 블럭 빠져나가지 않음.
    따라서 각 case 별 실행내용 뒤에 break; 직접 작성해야함.
     */

    public void testBasicSwitch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~3 사이의 정수를 입력하세요 : ");

        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.print("빨강색");
                break;
            case 2:
                System.out.print("파랑색");
                break;
            case 3:
                System.out.print("초록색");
                break;
            default:
                System.out.println("다시 입력하세요");
        }

    }

    public void testSwitchExample1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~3 사이의 정수를 입력하세요 : ");

        String soda = sc.nextLine();
        switch(soda){
            case "사이다":
                System.out.print("500원을 투입해주세요.");
                break;
            case "콜라":
                System.out.print("600원을 투입해주세요.");
                break;
            case "환타":
                System.out.print("700원을 투입해주세요.");
                break;
            case "박카스":
                System.out.print("2000원을 투입해주세요.");
                break;
            case "핫식스":
                System.out.print("10000원을 투입해주세요.");
                break;

        }

    }

    public void testSwitchExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(m/f) : ");
        char gender = sc.nextLine().charAt(0);

        String genderStr = "";

        switch(gender){
            case 'm':
            case 'M': genderStr = "남"; break;
            case 'f':
            case 'F': genderStr = "여"; break;
        }
        if (!genderStr.equals("")){
            System.out.println(genderStr);
        }

    }

    public void testSwitchExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력: ");
        int month = sc.nextInt();

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31일");
                break;
            case 4, 6, 9, 11:
                System.out.println("30일");
                break;
            case 2:
                System.out.println("28일");
                break;
            default:
                System.out.println("다시 입력해라");
        }
    }


}




















