package com.john.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 번호를 입력하세요 ");
        int n = sc.nextInt();
        String s = "";
        switch (n) {
            case 1:
                s = "입력";
                break;
            case 2:
                s = "출력";
                break;
            case 3:
                s = "조회";
                break;
            case 4:
                s = "삭제";
                break;
            case 5:
                s = "종료";
                break;
            default:
                System.out.println("잘못입력하셨습니다");
                break;
        }
        if (!s.isEmpty()) {
            System.out.println(s + " 메뉴입니다");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("검사할 숫자를 입력해주세요: ");
        int n = sc.nextInt();
        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("짝수다");
            } else {
                System.out.println("홀수다");
            }
        } else {
            System.out.println("양수만 입력해주세요");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수: ");
        int korean = sc.nextInt();
        System.out.print("수학점수: ");
        int math = sc.nextInt();
        System.out.print("영어점수: ");
        int english = sc.nextInt();
        int sum = korean + math + english;
        double average = (double) sum / 3;
        if ((korean >= 40) &&
                (math >= 40) &&
                (english >= 40) &&
                (average >= 40)) {
            System.out.println("축하합니다, 합격입니다!");
            System.out.println("국어점수: " + korean);
            System.out.println("수학점수: " + math);
            System.out.println("영어점수: " + english);
            System.out.println("합계점수: " + sum);
            System.out.println("평균점수: " + average);
        } else {
            System.out.println("불합격입니다");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12 사이의 정수 입력: ");
        int n = sc.nextInt();
        String season = "";
        switch (n) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "잘못 입력된 달";
                break;
        }
        System.out.println(n + "월은 " + season + "입니다");
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        String savedId = "111";
        String savedPwd = "1111";
        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호: ");
        String password = sc.nextLine();
        if (id.equals(savedId) && password.equals(savedPwd)) {
            System.out.println("로그인 성공");
        } else {
            if (!id.equals(savedId)) {
                System.out.println("아이디가 틀렸습니다");
            } else {
                System.out.println("비밀번호가 틀렸습니다");
            }
        }

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("권한을 확인하고자 하는 회원 등급: ");
        String grade = sc.nextLine();

        switch (grade) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리");
            case "회원":
                System.out.println("게시글 작성, 댓글 작성");
            case "비회원":
                System.out.println("게시글 조회");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("키(m)를 입력해주세요 ");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해주세요 ");
        double weight = sc.nextDouble();
        double BMI = weight / (height * height);

        if (BMI <= 18.5) {
            System.out.println("BMI 지수: " + BMI);
            System.out.println("저체중");
        } else if (BMI < 23) {
            System.out.println("BMI 지수: " + BMI);
            System.out.println("정상체중");
        } else if (BMI < 25) {
            System.out.println("BMI 지수: " + BMI);
            System.out.println("과체중");
        } else if (BMI < 30) {
            System.out.println("BMI 지수: " + BMI);
            System.out.println("비만");
        } else {
            System.out.println("BMI 지수: " + BMI);
            System.out.println("고도 비만");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 입력: ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 입력: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자를 입력(+,-,*,/,%): ");
        char mark = sc.nextLine().charAt(0);

        int result = 0;

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }

        if (mark != '+' && mark != '-' && mark != '*' && mark != '/') {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
        switch (mark) {
            case '+':
                result = num1 + num2;
                System.out.printf("%d %s %d = %d", num1, mark, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%d %s %d = %d", num1, mark, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%d %s %d = %d", num1, mark, num2, result);
                break;
            case '/':
                result = num1 / num2;
                System.out.printf("%d %s %d = %d", num1, mark, num2, result);
                break;
            case '%':
                result = num1 % num2;
                System.out.printf("%d %s %d = %d", num1, mark, num2, result);
                break;
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("중간 고사 점수: ");
        int medScore = sc.nextInt();
        System.out.print("기말 고사 점수: ");
        int finalScore = sc.nextInt();
        System.out.print("과제 점수: ");
        int workScore = sc.nextInt();
        System.out.print("출석 횟수: ");
        int attendance = sc.nextInt();

        double medScorePer = (double) medScore / 100 * 20;
        double finalScorePer = (double) finalScore / 100 * 30;
        double workScorePer = (double) workScore / 100 * 30;
        double attendancePer = (double) attendance / 20 * 100;
        double attendancePerScore = (double) attendance / 20 * 100 * 0.2;

        double sum = medScorePer + finalScorePer + workScorePer + attendancePerScore;

        System.out.println("===========결과==========");
        System.out.println("중간 고사 점수(20) :" + medScorePer);
        System.out.println("기말 고사 점수(30) :" + finalScorePer);
        System.out.println("과제 점수(30) :" + workScorePer);
        System.out.println("출석 점수(20) :" + attendancePerScore);
        System.out.println("총점: " + sum);
        if ((sum >= 70) && attendancePer >= 70 ) {
            System.out.println("PASS");
        }else{
            if(sum<= 70 && attendance < 14){
                System.out.printf("FAIL [점수 미달](총점 %.1f) \n", sum);
                System.out.printf("FAIL [출석 횟수 부족](%d/20)", attendance);
            }else if(attendance < 14){
                System.out.printf("FAIL [출석 횟수 부족](%d/20)", attendance);
            }
            else{
                System.out.printf("FAIL [점수 미달](총점 %.1f)", sum);
            }
        }
    }

    public void menuView() {
        Scanner sc = new Scanner(System.in);

        System.out.print("실행할 기능을 선택하세요. \n");
        System.out.println("""
                1)메뉴 출력
                2)짝수/홀수
                3)합격/불합격
                4)계절
                5)로그인
                6)권한 확인
                7)BMI
                8)계산기
                9)점수 결과 출력
                """);
        int tester = sc.nextInt();
        System.out.println("선택: " + tester);

        switch (tester) {
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
                practice9();
                break;
        }
    }
}
