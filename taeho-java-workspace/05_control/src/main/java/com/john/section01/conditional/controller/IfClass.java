package com.john.section01.conditional.controller;

import java.util.Scanner;

public class IfClass {
    /*
        ## 단일 if 구문
        1. 특정 조건을 만족하는 경우에만 실행
        2. { }(중괄호) 로 묶어 다른 코드와 구분. (한 줄인 경우 괄호를 생략가능하지만 작성하는 것을 권장)
        3. if(조건) {

            }
        
        ## else 구문
        1. if 구문의 마지막에 추가할 수 있는 구문
        2. if, else if 를 만족하지 않는 경우 실행하고자 하는 코드 작성
        3. if(조건) {

            } else{

            }
        ## else if 구분
        1. if 구문 뒤에 추가적으로 조건을 추가할 때 작성하는 구문
        2. 여러개 작성 가능
        3. if(조건) {

            } else if{

            } else if{

            } else {

            }
     */
    public void testBasicIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        }
    }
    public void testBasicElse(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("미통과");
        }
    }
    public void testBasicElseIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("통과");
        } else if (score >= 60 && score < 80) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }

    public void testIfExample(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /*
        if (age <= 13) {
            System.out.println("어린이");
        } else if(age <= 19){
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
         */
        String result;
        if (age <= 13) {
            result = "어린이";
        } else if(age <= 19){
            result = "청소년";
        } else {
            result = "성인";
        }
        System.out.println("나이는: " + result);
    }

    public void testIfExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("성별을 입력하세요(M/F): ");
        char gender = sc.nextLine().toUpperCase().charAt(0);

        /*
        if (gender == 'M') {
            System.out.println(name + "님은 남학생입니다");
        } else if (gender == 'F') {
            System.out.println(name + "님은 여학생입니다");
        } else{
            System.out.println("잘못된 입력값입니다");
        }
         */

        String result = "";
        if (gender == 'M') {
            result = "남학생";
            System.out.println(name + " 님은 " + result + "입니다");
        } else if (gender == 'F') {
            result = "여학생";
            System.out.println(name + " 님은 " + result + "입니다");
        } else{
            System.out.println("잘못된 입력값입니다. 다시 입력하세요");
//            testIfExample2();
//            return;
        }
    }

    public void testIfExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        /* 기본자료형 간의 비교는 == 이 가능하지만
        참조자료형의 경우는 에러 발생
        참조형 String 의 경우 A.equals(B)를 사용하여 비교
        if (name == "홍길동"){
            System.out.println("반갑습니다");
        } else{
            System.out.println("안녕히가세요");
        }
         */

        if (name.equals("홍길동")){
            System.out.println("반갑습니다");
        } else{
            System.out.println("안녕히가세요");
        }
    }
    public void testNestedIf(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("양수가 아닙니다");
        } else{
            if (n % 3 == 0){
                System.out.println("3의 배수입니다");
            } else{
                System.out.println("3의 배수가 아닙니다");
            }
        }
    }

    public void testNestedIfExample(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학년을 입력하세요 ");
        int n = sc.nextInt();
        System.out.print("점수를 입력하세요 ");
        int score = sc.nextInt();
//        if (n >= 1 && n <= 3){
//            if (score >= 60){
//                System.out.print("합격");
//            }else{
//                System.out.print("불합격");
//            }
//        }else if(n >= 4 && n <= 6){
//            if (score >= 70){
//                System.out.print("합격");
//            }else{
//                System.out.print("불합격");
//            }
//        }else{
//            System.out.print("잘못된 값입니다. 프로그램 종료");
//        }

        int passScore = 0;

        if (n >= 1 && n <=3){
            passScore = 60;
        } else if (n >= 4 && n <=6){
            passScore = 70;
        } else{
            System.out.print("잘못된 값입니다. 프로그램 종료");
        }

        if (score >= passScore){
            System.out.println("합격");
        } else{
            System.out.println("불합격");
        }
    }

    public void testNestedIfExample2(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() == 14){
            if(s.charAt(6) == '-'){
                char gender = s.charAt(7);
                if(gender == '1' || gender == '3'){
                    System.out.println("남자");
                }else if (gender == '2' || gender == '4'){
                    System.out.println("여자");
                }else{
                    System.out.println("잘못 입력 하셨습니다.");
                }
            }else{
                System.out.println("잘못 입력 하셨습니다.");
            }
        }else{
            System.out.println("잘못 입력 하셨습니다.");
        }
    }


}
