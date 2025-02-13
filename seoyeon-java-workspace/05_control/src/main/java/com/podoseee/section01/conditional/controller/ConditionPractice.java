package com.podoseee.section01.conditional.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력\n2. 수정\n3. 조회 \n4. 삭제 \n5. 종료");
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.print("입력");
                break;
            case 2:
                System.out.print("수정");
                break;
            case 3:
                System.out.print("조회");
                break;
            case 4:
                System.out.print("삭제");
                break;
            case 5:
                System.out.print("종료");
                break;
            default:
                System.out.print("잘못 입력하셨습니다.");
                return;
        }
        System.out.println(" 메뉴입니다.");
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else System.out.println("홀수다");
        } else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int scoreKor = sc.nextInt();
        System.out.print("수학점수 : ");
        int scoreMath = sc.nextInt();
        System.out.print("영어점수 : ");
        int scoreEng = sc.nextInt();

        int average = (scoreKor + scoreMath + scoreEng) / 3;

        if (scoreKor >= 40 && scoreMath >= 40 && scoreMath >= 40) {
            if (average >= 60) {
                System.out.println("축하합니다, 합격입니다!");
            } else System.out.println("불합격입니다.");
        } else System.out.println("불합격입니다.");
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt();
        String season = sc.nextLine();
        /*
        if (month == 1 || month == 2 || month == 12) {
            season = "겨울";
        } else if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else {
            season = "잘못 입력된 달";
        }
        */

        System.out.print(month + "월은 ");

        switch(month){
            case 1: case 2: case 12:
                System.out.print("겨울입니다.");
                break;
            case 3: case 4: case 5:
                System.out.print("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.print("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.print("가을입니다.");
                break;
            default :
                System.out.print("잘못 입력된 달입니다.");
        }

    }
}
