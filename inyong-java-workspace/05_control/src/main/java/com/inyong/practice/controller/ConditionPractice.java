package com.inyong.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("입력");
                break;
            case 2:
                System.out.println("수정");
                break;
            case 3:
                System.out.println("조회");
                break;
            case 4:
                System.out.println("삭제");
                break;
            case 5:
                System.out.println("종료");
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한 개 입력하세요");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("양수만 입력해 주세요");
        }

        System.out.println("num");

    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어");
        int korean = sc.nextInt();
        System.out.println("수학");
        int math = sc.nextInt();
        System.out.println("영어");
        int english = sc.nextInt();

        double avg = (korean + math + english) / 3.0;

        System.out.println(avg);
        if (!(korean < 40 && math < 40 && english < 40 && avg < 60)) {
            System.out.println("불합격 입니다.");
        } else {
            System.out.println("합격 입니다!");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
            case 9, 10, 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못 입력된 달");
        }
    }


    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디");
        String id = sc.next();
        System.out.println("비번");
        String pw = sc.next();


        if (!(id.equals("boram"))) {
            System.out.println("아이디가 틀렸습니다.");

        } else if (!pw.equals("1234")) {
            System.out.println("비밀번호가 틀렸습니다.");

        } else {
            System.out.println("로그인 성공");
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("관리자 / 회원 / 비회원");

        String user = sc.next();

        switch (user) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "회원":
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "비회원":
                System.out.println("게시글 조회");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }

    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("키");
        double high = sc.nextDouble();
        System.out.println("몸무게");
        double weight = sc.nextDouble();

        double bmi = weight / (high * high);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("과체중");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("비만");
        } else if (bmi >= 30) {
            System.out.println("고도 비만");
        }
    }


    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("피연산자1");
        int num1 = sc.nextInt();
        System.out.println("피연산자2");
        int num2 = sc.nextInt();
        System.out.println("연산자");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println(num1 + "+" + num2 + "=" + num2 + num1);
        }
        if (operator.equals("-")) {
            System.out.println(num1 + "-" + num2 + "=" + (num2 - num1));
        }
        if (operator.equals("*")) {
            System.out.println(num1 + "*" + num2 + "=" + (num2 * num1));
        }
        if (operator.equals("/")) {
            System.out.println(num1 + "/" + num2 + "=" + (num2 / num1));
        }
        if (operator.equals("%")) {
            System.out.println(num1 + "%" + num2 + "=" + (num2 % num1));
        }


    }


    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("중간고사");
        int midtermScore = sc.nextInt();
        double midtermRate = midtermScore * 0.2;
        System.out.println(midtermRate);

        System.out.println("기말고사");
        int finalScore = sc.nextInt();
        double finalRate = finalScore * 0.3;
        System.out.println(finalRate);
        ;
        System.out.println("과제점수");
        int assignmentScore = sc.nextInt();
        double assignmentRate = assignmentScore * 0.3;
        System.out.println(assignmentRate);

        System.out.println("출석횟수");
        int attendanceCount = sc.nextInt();
        double attendanceRate = attendanceCount * 0.2;
        System.out.println(attendanceRate);


        double totalScore = midtermRate + finalRate + assignmentRate + attendanceCount;

        System.out.println("=======결과==========");

        if (attendanceCount < 20 * 0.7) {
            System.out.printf("Fail [출석횟수 부족] (%d/20) \n", attendanceCount);
        }

        if( totalScore < 70) {
            System.out.printf("Fail 점수 미달 [%.1f]", totalScore);
        } else if (totalScore >= 70) {
            System.out.printf("%.1f \n %.1f \n %.1f \n %.1f \n %.1f \n Pass ", midtermRate, finalRate, assignmentRate, attendanceRate, totalScore);
        }
    }

}
