package com.minkook.section01.conditional.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴번호를 입력하세요: ");
        int menuNum = sc.nextInt();

        switch (menuNum){
            case 1:
                System.out.println("입력 메뉴입니다");
                break;
            case 2:
                System.out.println("수정 메뉴입니다");
                break;
            case 3:
                System.out.println("조회 메뉴입니다");
                break;
            case 4:
                System.out.println("삭제 메뉴입니다");
                break;
            case 5:
                System.out.println("프로그램이 종료됩니다.");
                return;

        }
    }

    public void practice2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 한 개 입력하세요 ");
        int num = sc.nextInt();

        if(num >= 0){
            if(num % 2 == 1){
                System.out.println("홀수다");
            }else if(num % 2 == 0){
                System.out.println("짝수다");
            }
        }else {
            System.out.println("양수만 입력해주세요.");
        }


    }

    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수: ");
        int korean = sc.nextInt();

        System.out.print("수학점수: ");
        int math = sc.nextInt();

        System.out.print("영어점수: ");
        int english = sc.nextInt();

        boolean limited = ((korean >= 40 && math >= 40 && english >= 40) ? true:false);
        int sumScore = (korean + math+ english);
        int avgScore = (korean + math+ english)/3;

        if(limited = true && (avgScore >= 60 && avgScore <=100)){
            System.out.println("합계: "+sumScore);
            System.out.println("평균: "+avgScore);
            System.out.println("축하합니다 합격입니다.");
        }else {
            System.out.println("불합격입니다.");
        }
    }

    public void practice4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~12 사이의 정수 입력: ");
        int month = sc.nextInt();

        switch (month){
            case 1,2,12:
                System.out.println(month + "월은 겨울입니다." );
                break;
            case 3,4,5:
                System.out.println(month + "월은 봄입니다." );
                break;
            case 6,7,8:
                System.out.println(month + "월은 여름입니다." );
                break;
            case 9,10,11:
                System.out.println(month + "월은 가을입니다." );
                break;
            default:
                System.out.println(month + "월은 잘못된 계절입니다." );

        }

    }

    public void practice5(){
        Scanner sc = new Scanner(System.in);
        String tempId = "boram";
        int tempPassword = 1234;

        System.out.print("아이디: ");
        String id = sc.nextLine();

        System.out.print("패스워드: ");
        int password = sc.nextInt();


        if(id.equals(tempId) && (password == tempPassword)){
            System.out.println("로그인 성공");
        }else if(!id.equals(tempId) &&(password == tempPassword)){
            System.out.println("아이디가 틀렸습니다.");
        }else if(id.equals(tempId) &&(password != tempPassword)){
            System.out.println("비밀번호가 틀렸습니다.");
        }

    }

    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("권한을 확인하고자 하는 회원등급: ");
        String grade = sc.nextLine();

        if(grade.equals("관리자")){
            System.out.println("회원관리" + "," + "게시글관리");
            System.out.println("게시글 작성" + "," +"댓글작성");
            System.out.println("게시글 조회");
        }else if(grade.equals("회원")){
            System.out.println("게시글 작성" + "," +  "게시글 조회");
            System.out.println("댓글작성");
        }else if(grade.equals("비회원")){
            System.out.println("게시글 조회");

        }else {
            System.out.println("잘못 입력했습니다.");
        }
    }

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("키(m)를 입력해 주세요: ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.print("몸무게(kg)를 입력해 주세요: ");
        double weight = sc.nextDouble();
        sc.nextLine();

        double bmi = weight/(height *height);


        System.out.printf("BMI 지수: %.15f\n",bmi);


        if(bmi < 18.5){
            System.out.println("저체중");
        }else if((bmi >= 18.5 && bmi < 23.0)){
            System.out.println("정상체중");
        }else if((bmi >= 23.0 && bmi < 25.0)){
            System.out.println("과체중");
        }else if((bmi >= 30.0)) {
            System.out.println("고도 비만");
        }

    }

    public void practice8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("피연산자1 입력: ");
        int p1 = sc.nextInt();
        if(p1 < 0){
            System.out.println("양수가 아닙니다");
            return;
        }


        System.out.print("피연산자1 입력: ");
        int p2 = sc.nextInt();
        sc.nextLine();
        if(p2 < 0){
            System.out.println("양수가 아닙니다");
            return;
        }

        System.out.print("연산자를 입력:");
        char op = sc.nextLine().charAt(0);

        switch (op){
            case '/':
                System.out.println(p1 + "/" + p2 + "=" + (p1 / p2));
                break;
            case '+':
                System.out.println(p1 + "+" + p2 + "=" + (p1 + p2));
                break;
            case '-':
                System.out.println(p1 + "-" + p2 + "=" + (p1 - p2));
                break;
            case '*':
                System.out.println(p1 + "*" + p2 + "=" + (p1 * p2));
                break;
            case '%':
                System.out.println(p1 + "%" + p2 + "=" + (p1 % p2));
                break;
            default:
                System.out.println("연산을 잘못입력했습니다.");
                break;

        }



    }

    public void practice9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("중간 고사 점수: ");
        int midS = sc.nextInt();

        System.out.print("기말 고사 점수: ");
        int endS = sc.nextInt();

        System.out.print("과제 점수: ");
        int homeworkS = sc.nextInt();

        System.out.print("출석 회수: ");
        int attendS = sc.nextInt();

        double dmidS = ((double)midS * 20  ) /100;
        double dendS = ((double)endS * 30  ) /100;
        double dhomeworkS = ((double)homeworkS * 30  ) /100;
        double dattendS = ((double)attendS * 20 ) /100;
        double res = (dmidS + dendS +dhomeworkS +dattendS);

        System.out.println("===========결과==========");
        System.out.printf("중간 고사 점수(20): %.1f\n", dmidS);
        System.out.printf("기말 고사 점수(30): %.1f\n", dendS);
        System.out.printf("과제 고사 점수(30): %.1f\n", dhomeworkS);
        System.out.printf("출석 고사 점수(20): %.1f\n", dattendS);

        if(res <= 100.0) {
            System.out.printf("총점: ", res);
        }









    }

    public void menuView(){
        Scanner sc = new Scanner(System.in);
        System.out.print("실행할 기능을 선택하세요");

        int num = sc.nextInt();

        if(num == 1){
            practice1();
        }else if(num == 2){
            practice2();
        }else if(num == 3){
            practice3();
        }else if(num == 4){
            practice4();
        }else if(num == 5){
            practice5();
        }else if(num == 6){
            practice6();
        }else if(num == 7){
            practice7();
        }else if(num == 8) {
            practice8();
        }else{
            practice9();
        }

    }

}
