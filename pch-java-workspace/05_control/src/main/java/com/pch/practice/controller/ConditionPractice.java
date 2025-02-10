package com.pch.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        String str[] = {"입력", "수정", "조회", "삭제", "종료"};

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". " + str[i]);
        }

        int choice = sc.nextInt();

        System.out.println(str[choice - 1] + " 메뉴입니다.");
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한 개 입력하세요: ");
        int n = sc.nextInt();

        if (n < 1) System.out.println("양수만 입력해주세요.");
        else if (n % 2 == 1) System.out.println("홀수다");
        else System.out.println("짝수다");
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어점수 : ");
        int KOR = sc.nextInt();
        System.out.print("수학점수 : ");
        int MATH = sc.nextInt();
        System.out.print("영어점수 : ");
        int ENG = sc.nextInt();

        int sum = KOR + MATH + ENG;
        double avg = sum / 3;

        System.out.println("국어 : " + KOR);
        System.out.println("수학 : " + MATH);
        System.out.println("영어 : " + ENG);
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.1f", avg);
        if (KOR >= 40 && MATH >= 40 && ENG >= 40 && avg >= 60) System.out.println("축하합니다, 합격입니다!");
        else System.out.println("비난합니다, 불합격입니다!");
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12 사이의 정수 입력 : ");
        int n = sc.nextInt();
        String s = "";
        switch (n) {
            case 1, 2, 12:
                s = "겨울";
                break;
            case 3, 4, 5:
                s = "봄";
                break;
            case 6, 7, 8:
                s = "여름";
                break;
            case 9, 10, 11:
                s = "가을";
                break;
            default:
                s = "잘못 입력된 달";
        }

        System.out.println(n + "월은 " + s + "입니다.");
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        String id = "asdf";
        String password = "asdf1234";

        System.out.print("아이디: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호: ");
        String inputPassword = sc.nextLine();

        if (!id.equals(inputId)) System.out.println("아이디가 틀렸습니다");
        else if (!password.equals(inputPassword)) System.out.println("비밀번호가 틀렸습니다.");
        else System.out.println("로그인 성공");
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("권한을 확인하고자 하는 회원 등급 :");
        String role = sc.nextLine();

        if (role.equals("관리자")) {
            System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
        } else if (role.equals("회원")) {
            System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
        } else if (role.equals("비회원")) {
            System.out.println("게시글 조회");
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("키(m)를 입력해 주세요 : ");
        double h = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해 주세요 : ");
        double w = sc.nextDouble();

        double BMI = w / (h * h);

        System.out.println("BMI 지수 : " + BMI);
        if (BMI < 18.5) System.out.println("저체중");
        else if (BMI < 23) System.out.println("정상체중");
        else if (BMI < 25) System.out.println("과체중");
        else if (BMI < 30) System.out.println("과체중");
        else System.out.println("고도비만");
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("피연산자1 입력 :");
        int a = sc.nextInt();
        System.out.print("피연산자2 입력 :");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자를 입력(+,-,*,/,%) :");
        char c = sc.nextLine().charAt(0);

        int ans = 0;

        switch (c) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            case '%':
                ans = a % b;
                break;
        }

        System.out.println(a + " " + c + " " + b + " = " + c);
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("중간 고사 점수 :");
        int mid = sc.nextInt();
        System.out.print("기말 고사 점수 :");
        int fin = sc.nextInt();
        System.out.print("과제  점수 :");
        int homework = sc.nextInt();
        System.out.print("출석 회수 :");
        int attend = sc.nextInt();

        double dmid = mid / 5;
        double dfin = fin / 10 * 3;
        double dhomework = homework / 10 * 3;

        double sum = dmid + dfin + dhomework + attend;

        System.out.printf("중간 고사 점수(20) : %.1f", dmid);
        System.out.printf("기말 고사 점수(30) : %.1f", dfin);
        System.out.printf("과제 점수(30) : %.1f", dhomework);
        System.out.printf("출석 점수(20) : %.1f", (double) attend);
        System.out.printf("총점 : %.1f", sum);
        if (attend > 13 && sum > 69) System.out.println("PASS");
        else {
            if (attend < 14) System.out.println("FAIL [출석 횟수 부족] (" + attend + "/20)");
            else System.out.printf("FAIL [점수 미달] (총점 %f)", sum);
        }
    }

    public void menuView() {
        Scanner sc = new Scanner(System.in);

        System.out.println("실행할 기능을 선택하세요.\n" +
                "1. 메뉴 출력\n" +
                "2. 짝수/홀수\n" +
                "3. 합격/불합격\n" +
                "4. 계절\n" +
                "5. 로그인\n" +
                "6. 권한 확인\n" +
                "7. BMI\n" +
                "8. 계산기\n" +
                "9. 점수 결과 출력");

        int n = sc.nextInt();
        switch (n) {
            case 1:
                practice1();
                break;
            case 2:
                practice2();
                break;
            case 3:
                practice3();
                break;
            case 4:
                practice4();
                break;
            case 5:
                practice5();
                break;
            case 6:
                practice6();
                break;
            case 7:
                practice7();
                break;
            case 8:
                practice8();
                break;
            case 9:
                menuView();
                break;
            default:
                break;
        }
    }
}