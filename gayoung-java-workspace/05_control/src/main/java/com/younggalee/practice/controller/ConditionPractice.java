package com.younggalee.practice.controller;
import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n5. 종료");

        System.out.print("메뉴 번호를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int menuIndex = sc.nextInt();

        switch (menuIndex) {
            case 1:
                System.out.println("입력 메뉴입니다.");
                break;
            case 2:
                System.out.println("수정 메뉴입니다.");
                break;
            case 3:
                System.out.println("조회 메뉴입니다.");
                break;
            case 4:
                System.out.println("삭제 메뉴입니다.");
                break;
            case 5:
                System.out.println("프로그램이 종료됩니다.");
                break;
        }
    }

    public void practice2() {
        System.out.print("숫자를 한 개 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("국어점수 : ");
        int scoreKo = sc.nextInt();
        System.out.print("수학점수 : ");
        int scoreMth = sc.nextInt();
        System.out.print("영어점수 : ");
        int scoreEn = sc.nextInt();
        System.out.println();

        int totalScore = scoreKo + scoreMth + scoreEn;
        double avg = totalScore / 3.0;

        if (avg >= 60) {
            if (scoreKo >= 40 && scoreMth >= 40 && scoreEn >= 40) {
                System.out.printf("국어 : %d\n" +
                        "수학 : %d\n" +
                        "영어 : %d\n" +
                        "합계 : %d\n평균 %.1f점 합격입니다!",scoreKo, scoreMth, scoreEn,totalScore,avg);
            } else {
                System.out.println("불합격입니다.");
            }
        } else {
            System.out.println("불합격입니다.");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt();

        switch (month) {
            case 1, 2, 12:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("여름");
                break;
            case 6, 7, 8:
                System.out.println("가을");
                break;
            case 9, 10, 11:
                System.out.println("봄");
                break;
            default:
                System.out.println("잘못 입력된 달");
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        int pw = sc.nextInt();

        if (id.equals("rkduddl1717")) {
            if (pw == 1717) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패. 비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("로그인 실패. 아이디가 틀렸습니다.");
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String grade = sc.nextLine();

        switch (grade) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리");
                break;
            case "회원":
                System.out.println("게시글 작성, 댓글 작성");
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
        System.out.println("키(m)를 입력해 주세요 : ");
        double height = sc.nextDouble();
        System.out.println("몸무게(kg)를 입력해 주세요 : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("BMI 지수 : " + bmi);

        if(bmi < 18.5){
            System.out.println("저체중");
        }else if(bmi >= 18.5 && bmi < 23){
            System.out.println("정상체중");
        }else if(bmi >= 23 && bmi < 25){
            System.out.println("과체중");
        }else {
            System.out.println("비만");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        String operator = sc.nextLine();

        if (num1 > 0 && num2 > 0) {

            switch (operator) {
                case "+":
                    System.out.printf("%d %s %d = ", num1, operator, num2);
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.printf("%d %s %d = ", num1, operator, num2);
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.printf("%d %s %d = ", num1, operator, num2);
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.printf("%d %s %d = ", num1, operator, num2);
                    System.out.println(num1 / num2);
                    break;
                case "%":
                    System.out.printf("%d %s %d = ", num1, operator, num2);
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("연산자를 잘못입력하셨습니다. 프로그램을 종료합니다.");

            }
        } else {
            System.out.println("잘못 입력하셨습니다. 양수가 아닙니다.");
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("중간 고사 점수 :  ");
        int scoreM = sc.nextInt();
        System.out.print("기말 고사 점수 :  ");
        int scoreF = sc.nextInt();
        System.out.print("과제 점수 :  ");
        int scoreAssign = sc.nextInt();
        System.out.print("출석 점수 :  ");
        int scoreAttend = sc.nextInt();
        String result = "";

        double totalScore = scoreM * 0.2 + scoreF * 0.3 + scoreAssign * 0.3 + scoreAttend * 0.2;

        System.out.println("===========결과==========");

        if (totalScore >= 70) {
            result = "PASS";
        } else {
            result = "FAIL";
            System.out.printf("%s [점수 미달] (총점 %.1f)\n", result, totalScore);
        }

        if (scoreAttend >= 20 * 0.7) {
            result = "PASS";
        } else {
            result = "FAIL";
            System.out.printf("%s [출석 횟수 부족] (%d/20)\n", result, scoreAttend);
        }

        if (result.equals("PASS")) {
            System.out.println(scoreM * 0.2);
            System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수(30) : %.1f\n출석 점수(20) : %.1f\n총점 : %.1f\n", scoreM * 0.2, scoreF * 0.3, scoreAssign * 0.3, scoreAttend * 0.2, totalScore);
            System.out.println(result);
        }

    }


    public void practice10() {

        System.out.println("1. 메뉴 출력\n2. 짝수/홀수\n3. 합격/불합격\n4. 계절\n5. 로그인\n6. 권한 확인\n7. BMI\n" +
                "8. 계산기\n" +
                "9. 점수 결과 출력인");
        System.out.println();
        System.out.print("선택 : ");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println();

        switch (index) {
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