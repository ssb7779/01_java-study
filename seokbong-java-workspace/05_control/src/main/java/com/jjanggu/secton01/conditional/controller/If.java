package com.jjanggu.secton01.conditional.controller;

import java.util.Scanner;

public class If {
    public void testBasicIf() {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수 : ");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        }
    /*
        ## 단일 if문 ##
        1. 특정 조건을 만족하는 경우에만 실행하는 코드 작성시 사용
        2. 특정 조건에 만족할 경우 실행할 코드는 중괄호 {}로 묶어 다른 코드와 구분함
           (단, 실행할 코드가 1줄일 경우 {} 생략 가능)
        3. 작성 형식
            if (조건식) {
               조건식이 참일 경우 실행구문
                조건식이 참일 경우 실행구문
            }
    */

    }

    public void testBasicElse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수 : ");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("통과");
        } else {
            System.out.println("미통과");
        }
    }

    public void testBasicElseIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수 : ");
        int score = sc.nextInt();

        // 80점 이상 => "합격"
        // 60점 이상 80점 미만인 경우 => "재평가"
        // 60점 미만 => "불합격"

        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }


    public void testIfExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이 : ");
        int age = sc.nextInt();
        /*
        if(age <= 13){
            System.out.println("어린이");
        }
        else if(age <= 19){
            System.out.println("청소년");
        }
        else{
            System.out.println("성인");
        }

         */

        String result; // 결과를 기록할 변수 세팅

        if (age <= 13) {
            result = "어린이";
        } else if (age <= 19) {
            result = "청소년";
        } else {
            result = "성인";
        }

        System.out.println(result);
    }


    public void testIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("성별(M/F) : ");
        char gender = sc.nextLine().toUpperCase().charAt(0);
        // 문자열.toUppercase() : 해당 문자열을 전부 대문자로 변경 후 반환

//        if(gender == 'M'){
//            System.out.println(name + "님은 남학생입니다.");
//        }else if(gender == 'F') {
//            System.out.println(name + "님은 여학생입니다.");
//        }
        String result = ""; // 변수 미리 세팅시 반드시 초기화해놓는 습관을 들이자!

        if (gender == 'M') {
            result = "남학생";
        } else if (gender == 'F') {
            result = "여학생";
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return; //메소드 강제 종료
        }

        System.out.println(name + "님은 " + result + "입니다.");

    }


    public void testIfExample3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();
        /*
        if(name == "홍길동"){
            System.out.println("반갑습니다.");
        }else{
            System.out.println("안녕히가세요.");
        }

         */

        /*
            ## 동등비교 ##
            1. 기본자료형 (boolean, char, byte, short, int, long, float, double)
               - 일치   : ==
               - 불일치 : !=
            2. 참조자료형
               - 일치   : 비교대상1.equals(비교대상2)
               - 불일치 : !비교대상1.equals(비교대상2)
         */

        if (name.equals("홍길동")) {
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요.");

        }

    }

    // ======== 조건문 중첩 ============

    public void testNestedIf() {
        /*
            사용자에게 정수를 입력받아
            해당 정수값이 양수가 아닐 경우 "양수가 아닙니다."
            양수일 때 3의 배수일 경우 "3의 배수입니다."
                          아닐 경우 "3의 배수가 아닙니다."출력
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("정수(양수) 입력 : ");
        int num = sc.nextInt();

        if(num <= 0) { // 양수가 아닐 경우
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
        }else {       // 양수일 경우
            if(num%3 == 0) {
                System.out.println("3의 배수 입니다.");
            }else {
                System.out.println("3의 배수가 아닙니다.");
            }
        }


    }

    public void testNestedIfExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("학년을 입력하세요 : ");
        int grade = sc.nextInt();

        System.out.println("점수를 입력하세요 : ");
        int num = sc.nextInt();

        /*

        if(grade >=1 && grade <=3) { //저학년일 경우
            if(num >=60) {
                System.out.println("합격");
            }else{
                System.out.println("불합격");
            }
        }else if(grade >=4 && grade <= 6) { //고학년일 경우
            if(num >= 70) {
                System.out.println("합격");
            }else {
                System.out.println("불합격");
            }
        }else {
            System.out.println("학년을 잘못입력하였습니다.");
        }

         */
        int passScore =0; // 학년별 합격기준점수를 기록할 변수
        if (grade >= 1 && grade <= 3) {
            passScore = 60;
        }else if (grade >=4 && grade <=6){
            passScore = 70;
        }

        if(num >= passScore){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }



    }


    public void testNestedIfExanmple2() {
        /*
            실습
            사용자에게 주민번호(-포함14자리) 입력받고
            잘 입력했을 경우 => 성별 판별 "남자"or"여자"출력
            잘못 입력했을 경우 => "잘못입력하셨습니다"

            [참고]
            문자열.length() : 문자열의 길이 반환

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("(-)를 포한한 주민등록번호 14자리를 입력해주세요");
        String num = sc.nextLine();
        char ch = num.charAt(7);

        if(num.length() == 14) {
            if(ch == '1' || ch == '3') {
                System.out.println("남자");
            }else if (ch == '2' || ch == '4') {
                System.out.println("여자");
            }else {
                System.out.println("성별을 잘못입력하셨습니다..");
            }
        }else{
            System.out.println("글자수를 잘못입력하셨습니다.");
        }

    }



}