package com.ibe6.section01.conditional.controller;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConditionPractice {

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 출력 =====");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.println("================");
        System.out.print("메뉴 번호를 입력하세요: ");
        int menu = sc.nextInt();
        switch (menu) {
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
                System.out.println("종료 메뉴입니다.");
                break;
        }
        if (menu == 5) { // 종료 버튼 눌렀을 경우
            System.out.println("프로그램이 종료됩니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한 개 입력하세요: ");
        int num = sc.nextInt();

        if (num >= 0 && num % 2 == 0) {
            System.out.println("짝수다");
        } else if (num >= 0 && num % 2 != 0) {
            System.out.println("홀수다");
        } else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어점수: ");
        int kor = sc.nextInt();
        System.out.print("수학점수: ");
        int math = sc.nextInt();
        System.out.print("영어점수: ");
        int eng = sc.nextInt();

        int sum = kor + math + eng;
        double avg = sum / 3.0;

        // 각각 40점 이상이면서 평균이 60점 이상일 경우 => 합격
        // 불합격인 경우 => 불합격

        if ( kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) {
            System.out.println("국어점수: " + kor);
            System.out.println("수학점수: " + math);
            System.out.println("영어점수: " + eng);
            System.out.println("합계: " + sum);
            System.out.println("평균: " + avg);
            System.out.println("축하합니다. 합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }

    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        /*
        if(month == 1 || month == 2 || month == 12) {
	    season = "겨울";
        } else if(month >= 3 && month <= 5) {
	    season = "봄";
        } else if(month >= 6 && month <= 8) {
	    season = "여름";
        } else if(month >= 9 && month <= 11) {
	    season = "가을";
        } else {
	    season = "잘못 입력된 달";
         */

        System.out.print("1~12사이의 정수 입력: ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 2, 12:
                System.out.println(month + "월은 겨울입니다.");
                break;
            case 3, 4, 5:
                System.out.println(month + "월은 봄입니다.");
                break;
            case 6, 7, 8:
                System.out.println(month + "월은 여름입니다.");
                break;
            case 9, 10, 11:
                System.out.println(month + "월은 가을입니다.");
            default:
                System.out.println(month + "월은 잘못 입력된 달입니다.");
        }



    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호: ");
        int pw = sc.nextInt();

        String hostId = "jy";
        int hostPw = 1234;

        if (id.equals (hostId) && pw == hostPw) {
            System.out.println("로그인 성공!");
        }else if (!id.equals(hostId)) {
            System.out.println("아이디가 틀렸습니다.");
        }else if (pw != hostPw) {
            System.out.println("비밀번호가 틀렸습니다.");

        }else {
            System.out.println("다시 입력해주세요.");

        }




    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("권한을 확인하고자 하는 회원 등급: ");
        String grade = sc.nextLine();

        switch (grade) {
            case "관리자":
                System.out.println("회원관리, 게시글 관리 \n게시글 작성, 게시글 조회 \n댓글 작성");
                break;
            case "회원":
                System.out.println("게시글 작성, 게시글 조회 \n댓글 작성");
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

        /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 | 정상체중 | 과체중 | 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중,  18.5이상 23미만일 경우 정상체중,
        23이상 25미만일 경우 과체중, 25이상 30미만일 경우 비만,
        30이상일 경우 고도 비만
         */

        System.out.print("키(m)를 입력해주세요: ");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해주세요: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height*height); // bmi 기록 변수

        System.out.println("BMI지수: " + bmi);
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >=18.5 && bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi >=23 && bmi < 25) {
            System.out.println("과체중");
        } else if (bmi >=25 && bmi < 30) {
            System.out.println("비만");
        } else {
            System.out.println("고도 비만");

        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
    /*
    키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰
    연산 결과를 출력하세요.
    단,  양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
    “잘못 입력하셨습니다. 프로그램을 종료합니다.”  출력하시오.
    printf()문을 이용하여 결과를 출력해보시오.
     */

        System.out.println("피연산자1 입력: ");
        int num1 = sc.nextInt();
        System.out.println("피연산자2 입력: ");
        int num2 = sc.nextInt();
        System.out.println("연산자를 입력(+,-,*,/,%): ");
        char operator = sc.nextLine().charAt(0);

        /*


         */




        System.out.println();





    }

}
