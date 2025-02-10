package com.sotogito.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();

        String function = "";
        switch (num) {
            case 1:
                function = "입력";
                break;
            case 2:
                function = "수정";
                break;
            case 3:
                function = "조회";
                break;
            case 4:
                function = "삭제";
                break;
            case 5:
                function = "종료";
                break;
            default:
                System.out.println("존재하지 않는 기능입니다.");
        }
        System.out.printf("%s메뉴입니다.", function);
    }

    public void practice2() {
        int num = sc.nextInt();

        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }
        } else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice3() {
        boolean isPass = false;

        System.out.println("국어점수 : ");
        int korean = sc.nextInt();

        System.out.println("수학점수 : ");
        int math = sc.nextInt();

        System.out.println("영어점수 : ");
        int english = sc.nextInt();

        if (korean >= 40 && math >= 40 && english >= 40) {
            int total = korean + math + english;
            int avg = total / 3;

            if (avg >= 60) {
                isPass = true;
            }
        }

        if (isPass) {
            System.out.println("축하합니다! 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public void practice4() {
        System.out.println("1~12사이의 정수 입력 : ");
        int month = sc.nextInt();

        String season = "";
        switch (month) {
            case 1, 2, 12:
                season = "겨울";
                break;
            case 3, 5:
                season = "봄";
                break;
            case 6, 8:
                season = "여름";
                break;
            case 9, 11:
                season = "가을";
                break;
            default:
                season = "잘못 입력된 달";
        }

        if (!season.equals("잘못 입력된 달")) {
            System.out.printf("%d월은 %s입니다.", month, season);
        } else {
            System.out.printf("%d월은 잘못 입력된 달입니다.", month);
        }
    }

    public void practice5() {
        String id = "sotogito";
        int pw = 123545;

        System.out.println("아이디 : ");
        String inputID = sc.nextLine();

        System.out.println("비밀번호 : ");
        int inputPW = sc.nextInt();
        sc.nextLine();

        if (!id.equals(inputID)) {
            System.out.println("아이디가 틀렸습니다.");
        } else if (pw != inputPW) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            System.out.println("로그인 성공");
        }
    }

    public void practice6() {
        /**
         * 관리자, 회원, 비회원
         *
         * 관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
         * 회원 : 게시글 작성, 게시글 조회, 댓글 작성
         * 비회원 : 게시글 조회
         *
         *
         * 회원관리, 게시글 관리
         * 게시글 작성, 댓글 작성
         * 게시글 조회
         */

        System.out.println("권한을 확인하고자 하는 회원 등급 : ");
        String memberType = sc.nextLine();
        String printout = "";

        switch (memberType) {
            case "관리자":
                printout += "회원관리, 게시글 관리\n";
            case "회원":
                printout += "게시글 작성, 댓글 작성\n";
            case "비회원":
                printout += "게시글 조회\n";
            default:
                System.out.println("잘못 입력했습니다.");
        }

        if (!printout.equals("")) {
            System.out.println(printout);
        }
    }

    public void practice7() {
        System.out.println("키(m)를 입력해 주세요 : ");
        double height = sc.nextDouble();

        System.out.println("몸무게(kg)를 입력해 주세요 : ");
        double weight = sc.nextDouble();

        double BMI = weight / (height * height);
        String resultBMI = "";

        if (BMI > 30) {
            resultBMI = "고도 비만";
        } else if (BMI >= 25) {
            resultBMI = "비만";
        } else if (BMI >= 23) {
            resultBMI = "과체중";
        } else if (BMI >= 18.5) {
            resultBMI = "정상체중";
        } else {
            resultBMI = "저체중";
        }

        if (!resultBMI.equals("")) {
            System.out.printf("BMI 지수 : %f", BMI);
            System.out.println(resultBMI);
        }
    }

    public void practice8() {
        System.out.println("피연산자1 입력 : ");
        int num1 = sc.nextInt();

        System.out.println("피연산자2 입력 : ");
        int num2 = sc.nextInt();

        System.out.println("연산자를 입력(+,-,*,/,%) : ");
        char opr = sc.nextLine().charAt(0);

        int result = 0;

        switch (opr) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
        }

        System.out.printf("%d %c %d = %d", num1, opr, num2, result);
    }


    public void practice9() {
        /**
         * 중간고사(100) 20%
         * 기말고사(100) 30%
         * 과제점수(100) 30%
         * 출석횟수(20) 20%
         * -> pass or fail
         */

        boolean isScoreConfirmation= false;
        boolean isAttendanceConfirmation= false;

        System.out.println("중간 고사 점수 : ");
        int midterm = sc.nextInt();

        System.out.println("기말 고사 점수 : ");
        int finalExam = sc.nextInt();

        System.out.println("과제 점수 : ");
        int task = sc.nextInt();

        System.out.println("출석 회수 : ");
        int attendance = sc.nextInt();

        double midtermScore = midterm * 0.2;
        double finalScore = finalExam * 0.3;
        double taskScore = task * 0.3;
        double attendanceScore = attendance * 0.2;
        double total = midtermScore + finalScore + taskScore + attendanceScore;

        if (total >= 70) {
            int attendancePercent = (attendance / 20) * 100;
            if (attendancePercent > 70) {
                isScoreConfirmation = true;
                isAttendanceConfirmation = true;
            }else {
                isScoreConfirmation = true;
            }
        }

        System.out.println("===========결과==========");
        if (isScoreConfirmation) {
            if(isAttendanceConfirmation){
                System.out.printf("중간 고사 점수(20) : %.1f\n",midtermScore);
                System.out.printf("기말 고사 점수(30) : %.1f\n",finalScore);
                System.out.printf("과제 점수(30) : %.1f\n",taskScore);
                System.out.printf("출석 점수(20) : %.1f\n",attendanceScore);
                System.out.printf("총점 : %.1f\n",total);
                System.out.print("PASS");
            }else {
                System.out.printf("FAIL [출석 횟수 부족] (%d/20)",attendance);
            }
        }else {
            System.out.printf("FAIL [점수 미달] (총점 %.1f)",total);
            System.out.printf("FAIL [출석 횟수 부족] (%d/20)",attendance);
        }
    }

}
