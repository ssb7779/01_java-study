package com.younggalee.section01.conditional.controller;
import java.util.Scanner;

public class If {
    public void testBasicIf() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }

    public void testIfExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        if (age <= 13) {
            System.out.println("어린이");
        } else if (age <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
    }

    public void testIfExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.println("성별(M/F) 입력: ");
        char gender = sc.nextLine().toUpperCase().charAt(0);

        String result = ""; //변수 세팅시 반드시 초기화해놓는 습관을 들이자!

        if (gender == 'M') {
            result = "남성";
        } else if (gender == 'F') {
            result = "여성";
        } else {
            result = "다시입력하세요";
        }

        System.out.println(result);
    }
    public void testIfExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        // 동등비교연산자는 기본자료형 데이터끼리의 연산만 수행하는 것을 권장한다.
        /*
        참조 자료형은 이래의 비교연산을 수행하자
        - 일치 : 비교대상1.equals(비교대상2)
        - 불일치 :

         */
        if (name.equals("홍길동")){
            System.out.println("반갑습니다.");
        }else{
            System.out.println("안녕히가세요.");
        }
    }
    public void testIfExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("양수가 아닙니다");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수입니다");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
    public void testNestedIfExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if (grade >= 1 && grade <= 3) {
            System.out.println(score >= 60 ? "합격" : "불합격");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println(score >= 70 ? "합격" : "불합격");
        } else {
            System.out.println("학년 기입을 확인하세요");
        }
    }

    public void testNestedIfExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 : ");
        String personalNum = sc.nextLine();

        if (personalNum.length() == 14) {
            char gender = personalNum.charAt(7);
            if (gender == '2' || gender == '4') {
                System.out.println("여자");
            } else if (gender == '1' || gender == '3') {
                System.out.println("남자");
            }else{
                System.out.println("입력을 다시 확인해보세요");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}






