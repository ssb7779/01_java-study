package com.minkook.section01.conditional.controller;

import java.util.Scanner;

public class If {
    public void testBasicIf() {
        Scanner sc  = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();
        if(score >= 60) {
            System.out.println("통과");
        }

    }

    public void testBasicElse() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        if(score >= 60) {
            System.out.print("통과");
        }else {
            System.out.print("미통과");
        }

    }

    public void testBasicElseIf() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        if(score >= 80) {
            System.out.println("합격");
        }else if (score >= 60 && score < 80) {
            System.out.println("재평가");
        }else {
            System.out.println("불합격");
        }
    }

    public void testIfExample() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이: ");
        int age = sc.nextInt();
        String res;

        if(age <= 13) {
            res = "어린이";
        }else if(age <= 19) {
            res = "청소년";
        }else {
            res = "성인";
        }

        System.out.println(res);

    }

    public void testIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().toUpperCase().charAt(0);

/*        if(gender == 'M'){
            System.out.println(name + "님은 남학생입니다.");
        }else if(gender == 'F'){
            System.out.println(name + "님은 여학생입니다.");
        }*/
        String res = ""; //변수 미리 세팅시 반드시 초기화해놓는 습관을 들이자!
        if(gender == 'M'){
            res ="남학생";
        }else if(gender == 'F'){
            res ="여학생";
        }else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return; //메소드 강제종류
        }
        System.out.println(name + "님은" + res + "입니다.");
    }

    public void testIfExample3() {
        /*
            사용자에게 이름을 받아 해당이름이 "홍길동"과 일치할 경우 "반갑습니다"
            일치하지 않을 경우 "안녕히 가세요" 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        if(name == "홍길동"){
            System.out.print("반갑습니다.");
        }else {
            System.out.print("안녕히가세요.");
        }
        System.out.print("\n");
        boolean r1 = (name == "홍길동"? true:false); //컬바이레퍼런스 String은 선언시 고유한 주소값을 갖기때문
        boolean r2 = (name.equals("홍길동")? true:false); //컬바이벨류
        System.out.println(r1);
        System.out.println(r2);
    }

    /*
        ## 동등비교 ##
        1.) 기본자료형 -
            일치: ==
            불일치     - 불일치: !=
        2.) 참조 자료형-
            일치:    비교대상1.equals(비교대상2)
            불일치: !비교대상1.equals(비교대상2)


     */

    // 조건문 중첩
    public void testNestedIf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(양수) 입력: ");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("양수가 아닙니다.");
        }else {
            if(num % 3 == 0){
                System.out.println("3의배수입니다.");
            }else {
                System.out.println("3의배수가 아닙니다.");
            }
        }
    }

    public void testNestedIfExmaple1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학년 입력: ");
        int grade = sc.nextInt();

        System.out.print("점수 입력: ");
        //int score = sc.nextInt();

//        if(grade >= 1 && grade < 4){
//            if(score >= 60 && score <= 100){
//                System.out.println("합격");
//            }else {
//                System.out.println("불합격");
//            }
//        }else if(grade >= 4 && grade < 7) {
//            if(score >= 70 && score <= 100){
//                System.out.println("합격");
//            }else {
//                System.out.println("불합격");
//            }
//        }
        int passScore = sc.nextInt();

        String res = "";
        if(grade >= 1 && grade < 4){
            res = (passScore >= 60 ? "합격":"불합격");
            System.out.println(res);
        }else if(grade >= 4 && grade < 7) {
            res = (passScore >= 70 ? "합격":"불합격");
            System.out.println(res);
        }

    }

    public void testNestedIfExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호(-포함 14글자) 입력: ");
        String num = sc.nextLine();

        if(num.length() == 14){
            char gender = num.charAt(7);
            if(gender == '2') {
                System.out.println("여자");
            }else {
                System.out.println("남자");
            }

        }else {
            System.out.print("잘못입력하셨습니다.");
        }

    }

}
