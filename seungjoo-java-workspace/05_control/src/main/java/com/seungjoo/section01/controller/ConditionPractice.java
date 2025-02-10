package com.seungjoo.section01.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력하세요: ");
        int menu = sc.nextInt();
        String answer = "";
        switch (menu) {
            case 1:
                answer = "입력";
                break;
            case 2:
                answer = "수정";
                break;
            case 3:
                answer = "조회";
                break;
            case 4:
                answer = "삭제";
                break;
            case 5:
                answer = "종료";


                break;

        }
        System.out.println(answer + " 메뉴입니다.");
        if (answer.equals("종료")) {
            System.out.println("프로그램이 종료됩니다.");
        }


    }


    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요:");
        int num = sc.nextInt();
        if (num > 0 && num % 2 == 0) {
            System.out.println("짝수다");
        } else if (num > 0 && num % 2 == 1) {

            System.out.println("홀수다");
        } else if (num <= 0) {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수:");

        int kor= sc.nextInt();
        sc.nextLine();
        System.out.println("수학점수:");
        int math = sc.nextInt();
        sc.nextLine();
        System.out.println("영어점수");
        int eng = sc.nextInt();


        int sum = kor + math + eng;
        double avg = sum / 3.0;

        if (kor >=40 && math >= 40 && eng >= 40 && avg >= 60.0) {
            System.out.println("국어 :" + kor);
            System.out.println("수학 :" + math);
            System.out.println("영어 :" + eng);
            System.out.println("합계 :" + sum);
            System.out.println("평균 :" + avg);
            System.out.println("축하합니다, 합격입니다!");

        }else{
            System.out.println("불합격입니다.");
        }

    }
    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력:");
        String season = "";
        int num = sc.nextInt();
        switch(num){
            case 1,2,12: season = "겨울";
            break;
            case 3,4,5: season = "봄";
                break;
            case 6,7,8: season = "여름";
                break;
            case 9,10,11: season = "가을";
                break;
            default:
                season = "잘못 입력된 달";

        }
        System.out.println(num + "월은 " + season +"입니다.");

    }

    public void practice5() {

        String id1 = "이승주";
        int num1 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디");
        String id = sc.nextLine();
        System.out.println("패스워드");
        int num = sc.nextInt();
        if(id1.equals(id) && num == num1){
            System.out.println("로그인 성공");
        }else if(id1.equals(id) && num != num1){
            System.out.println("비밀번호가 틀렸습니다.");

        }else if(!id1.equals(id)){
            System.out.println("아이디가 틀렸습니다.");
        }


    }
    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("권한을 확인하고자 하는 회원 등급:");
        String name = sc.nextLine();

        if(name.equals("관리자")){
            System.out.println("회원관리, 게시글 관리");

        }else if(name.equals("회원")){
            System.out.println("게시글 작성, 댓글 작성");

        }else if(name.equals("비회원")){
            System.out.println("게시글 조회");
        }else{
            System.out.println("잘못 입력했습니다.");
        }
    }
    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("키(m)를 입력해주세요:");
        double height = sc.nextDouble();
        sc.nextLine();
        System.out.println("몸무게(kg)를 입력해주세요:");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        if(bmi <18.5){
            System.out.println("BMI 지수 : " + bmi);
            System.out.println("저체충");
        }else if (bmi >= 18.5 && bmi < 25){
            System.out.println("BMI 지수 : " + bmi);
            System.out.println("정상체충");

        }else if (bmi >= 25 && bmi < 30) {
            System.out.println("BMI 지수 : " + bmi);
            System.out.println("과체충");
        }else{
            System.out.println("BMI 지수 : " + bmi);
            System.out.println("고도 비만");
        }


    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("피연산자2 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자를 입력(+,-,*,/,%) :");
        String str = sc.nextLine();

        int result = 0;

        if(str.equals("+") && num1 >0 &&num2 > 0){
            result = num1 + num2;
        }else if (str.equals("-")&& num1 >0 &&num2 > 0){
            result = num1 - num2;
        }else if (str.equals("*")&& num1 >0 &&num2 > 0){
            result = num1 * num2;
        }else if (str.equals("/")&& num1 >0 &&num2 > 0){
            result = num1 / num2;
        }else{
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");

        }

        System.out.println(num1+str+num2 + "=" + result);

    }
    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("중간고사 점수:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("기말고사 점수:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("과제 점수");
        int num3 = sc.nextInt();
        sc.nextLine();
        System.out.println("출석 회수");
        int num4 = sc.nextInt();

        double middle_score = 0.2*num1;
        double final_score = 0.3*num2;
        double assignment = 0.3*num3;
        double attendance = num4;

        double ii = 14.0;

        double sum = middle_score + final_score + assignment + attendance;
        System.out.println(sum);
        if(sum >= 70.0 && attendance >= ii){
            System.out.println("중간고사 점수(20):" + middle_score);
            System.out.println("기말고사 점수(30):" + final_score);
            System.out.println("과제 점수(30):" + assignment);
            System.out.println("출석 점수(20):" + attendance);
            System.out.println("총점:" + sum);
            System.out.println("PASS");
        }else{
            System.out.println("FAIL [점수 미달](총점" + sum + ")");
        }

    }
    public void menuView() {
        Scanner sc = new Scanner(System.in);
        System.out.println('실행할 기능을 선택하세요.');
        System.out.println("1");

    }



}

