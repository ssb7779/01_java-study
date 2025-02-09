package com.seungjoo.section01.controller;

import java.util.Scanner;

public class If {
    /*
        ##단일 if문
        1. 특정 조건을 만족하는 경우에만 실행하는 코드 작성시 사용
        2. 특정 조건에 만족할 경우 실행할 코드는 중괄호 {}로 묶어 다른 코드와 구분함
            (단, 실행할 코드가 1줄일 경우 {} 생략 가능)
        3. 작성형식
            if(조건식){
                조건식이 참일 경우 실행구문
                조건식이 참일 경우 실행구문
            }
     */


    public void testBasicIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수: ");
        int score = sc.nextInt();

        if (score > 60)
            System.out.println("통과");
    }

    public void testBasicElse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수: ");
        int score = sc.nextInt();


        if (score > 60)
            System.out.println("통과");
        else {
            System.out.println("미통과");
        }
    }

    public void testBasicElseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수: ");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60 && score < 80) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }

    public void testIfExample(){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이:");
        int age = sc.nextInt();
        if(age < 13) {
            System.out.println("어린이");
        }else if(age <= 19){
            System.out.println("청소년");

        }else{
            System.out.println("성인");
        }
    }
    public void testIfExample1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("나이:");
        int age = sc.nextInt();
        String result;
        if(age < 13) {
            System.out.println("어린이");
        }else if(age <= 19){
            System.out.println("청소년");

        }else{
            System.out.println("성인");
        }
    }

    public void testIfExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.nextLine();

        System.out.println("성별(M/F):");

        char gender = sc.nextLine().toUpperCase().charAt(0);

        if(gender == 'M') {
            System.out.println(name + "님은 남학생입니다.");
        }else if(gender == 'F') {
            System.out.println(name + "님은 여학생입니다.");
        }



    }

    public void testIfExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름");
        String name = sc.nextLine();

//        if(name == "홍길동"){
//            System.out.println("반갑습니다.");
//
//        }
//        else{
//            System.out.println("안녕히가세요.");
//        }
        /*
         #동등비교
         1.기본자료형 (boolean, char, byte, short, int, long, float, double)
           - 일치 : ==
           - 불일치 : !=
         2. 참조 자료형(String, 기본자료형을 제외한 모든 타입)
            - 일치 : 비교대상1.equals(비교대상2)
            - 불일치 : !
         */
        if(name.equals("홍길동")) {
            System.out.println("반갑습니다.");
        }else{
            System.out.println("안녕하세요");
        }
    }

    // ======== 조건문 중첩 ==========
    public void testNestedIf(){

        Scanner sc = new Scanner(System.in);
        System.out.println("정수(양수) 입력:");
        int num = sc.nextInt();
        if(num <= 0){ //양수가 아닐 경우
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");


        }else{   //양수일 경우
            if(num %3 == 0){
                System.out.println("3의 배수입니다.");

            }else{
                System.out.println("3의 배수가 아닙니다.");

            }

        }

    }

    public void testNestedIfExample1() {
        /*
        실습.
        사용자에게 학년과 점수를 입력받아 합격 여부를 판별하여 출력하고자 한다.
        사용자가 입력한 학년이
        1~3학년일 경우 : 60점 이상이면 "합격", 아니면 "불합격:
        4~6학년일 경우 : 70점 이상이면 "합격", 아니면 "불합격" 출력




       */

        Scanner sc = new Scanner(System.in);
        System.out.println("학년:");
        int num = sc.nextInt();
        sc.nextLine();
        int score = sc.nextInt();

        if (num >= 1 && num <= 3) {
            if (score >= 60) {
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }

        } else if (num >= 4 && num <= 6) {
            if (score >= 70) {
                System.out.println("합격");

            } else {
                System.out.println("불합격");
            }
        }
    }

       public void testNestedIfExample2(){
            /*
            실습.
            사용자에게 주민번호(-포함 14글자)를 입력받고
            잘 입력했을 경우 => 성별을 판별해서 "남자" 또는 "여자" 출력
            잘못 입렷했을 경우 => "잘못입력하셨습니다"
             */



        Scanner sc = new Scanner(System.in);
           System.out.println("주민번호 입력: ");
           String num = sc.nextLine();
           if(num.length() == 14){
               if(num.charAt(7) == '2' || num.charAt(7) == '4') {
                   System.out.println("여자");
           }else if(num.charAt(7) == '1' || num.charAt(7) == '3') {
                   System.out.println("남자");
               }else{
                   System.out.println("성별을 잘못 입력하셨습니다.");
               }
        }else{
               System.out.println("글자수를 잘못 입력하셨습니다.");
           }











    }
}
