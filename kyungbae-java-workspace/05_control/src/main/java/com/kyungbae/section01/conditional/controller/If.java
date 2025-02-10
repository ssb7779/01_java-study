package com.kyungbae.section01.conditional.controller;

import java.util.Scanner;

public class If {

    /*
        # 단일 if 문
        1. 특정 조건
        2. {} 로 구분 <= 1줄이면 생락 가능
        [형식]
        if(조건식){
            true 실행
            false 실행
        }
     */

    public void testBasicIf() {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "점수 : "
        );
        int score = sc.nextInt();

        if (score >= 60) { // 60점 이상일 경우에만
            System.out.println(
                    "통과"
            );
        } else {
            System.out.println(
                    "탈락"
            );
        }

    } // tBI end

    public void testBasicElseIf() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }

    } // tBEI end

    public void testIfExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        /*
        if(age <= 13) {
            System.out.println("어린이");
        } else if (age <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }

         */
        String result; // 결과를 기록할 변수 세팅

        if(age <= 13) {
            result = "어린이"; // <= 변수자체로 세팅하면 해당 연산이 끝난 후 초기화
        } else if (age <= 19) {
            result = "청소년";
        } else {
            result = "성인";
        }
        System.out.println(result);

    } // tIE1 end

    public void testIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("성별(M/F) : ");
        char gender = sc.nextLine().toUpperCase().charAt(0);
//                                   ㄴ모든 문자열(String)를 대문자로

        String korGender = ""; // 변수 미리 세팅 시 초기화 해놓는 습관
        /*
            # 변수 별 초기화 문자
            String = null
            int = 0
            double = 0.0

         */
        if (gender == 'M') {
            korGender = "남";
        } else if (gender == 'F') {
            korGender = "여";
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return; // 메소드 강제 종료
        }
        System.out.printf("%s님은 %s학생 입니다.", name, korGender);

    } //tIE2 end

    public void testIfExample3() {
        /*
        이름받아 이름 홍길동 "반갑습니다"
            아니면 "안녕히 가세요"
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        /*
        if (name == "홍길동") {
            System.out.println("반갑습니다");
        }else {
            System.out.println("안녕히가세요");
        }
         */
//        참조자료형에서 비교시
//        일치    : 비교대상1.equals(비교대상2)
//        불일치  : !비교대상1.equals(비교대상2)
        if (name.equals("홍길동")) {
            System.out.println("반갑습니다");
        } else {
            System.out.println("안녕히가세요");
        }

    } // tIE3 end

//    # 조건문 중첩 ----------------------------------------

    public void testNestedIf(){
        /*
            정수를 받아 양수가 아니면 "양수가 아닙니다."
            3의 배수일 경우 "3의 배수입니다"
                아닐 경우 "3의 배수가 아닙니다"
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수(양수) 입력: ");
        int num = sc.nextInt();

        if (num <= 0) { // 양수가 아닐 경우
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
        } else {  // 양수일 경우
            if ((num % 3) == 0) { // "3의 배수일 경우"
                System.out.println("3의 배수입니다.");
            } else {
                System.out.println("3의 배수가 아닙니다.");
            }
        }


    } // tNI end

    public void testNestedIfExample1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("학년을 입력 : ");
        int grade = sc.nextInt();

        System.out.print("점수를 입력 : ");
        int score = sc.nextInt();

        /*
        if (grade >= 1 && grade <= 3 ){
            System.out.println(
                    score >= 60 ? "합격" : "불합격"
            );
        } else if (grade >= 4 && grade <= 6) {
            System.out.println(
                    score >= 70 ? "합격" : "불합격"
            );
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 확인해주세요.");
        }

         */
        /*
        if (grade >= 1 && grade <= 3 ){ // 저학년일 경우
           if (score >= 60){
               System.out.println("합격");
           }else {
               System.out.println("불합격");
           }
        } else if (grade >= 4 && grade <= 6) { // 고학년일 경우
            if (score >= 70){
                System.out.println("합격");
            }else {
                System.out.println("불합격");
            }
        } else {
            System.out.println("잘 못 입력하셨습니다. 다시 확인해주세요.");
        }
         */

        int pScore = 0; // 통과점수
        if (grade >= 1 && grade <= 3) {
            pScore = 60;
        }else if (grade >=4 && grade <=6) {
            pScore = 70;
        }

        if(score >= pScore){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }


    } // tBIE1 end

    public void testNestedIfExample2() {
        /*
            사용자에게 주민번호 입력받기 (-포함 14글자)
            잘 입력했을 경우 => 성별을 판별해서 "남자" 또는 "여자" 출력
            잘못 입력했을경우 => "잘못입력하셨습니다"

            [참고]
            문자열.length() : 문자열의 길이 반환
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요 : ");
        String num = sc.nextLine();

        if (num.length() == 14) { // 주민등록번호 길이가 14 일 경우

            char num2 = num.charAt(7);
            if (num2 == '1' || num2 == '3') {
                System.out.println("남자");
            } else if (num2 == '2' || num2 == '4') {
                System.out.println("여자");
            } else {
                System.out.println("번호를 확인해주세요.");
            }
        } else {
            System.out.println("글자수를 잘못 입력하셨습니다.");
        }

    } // tNIE2 end


} // class end
