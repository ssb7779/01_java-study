package com.inyong.section01.conditional.controller;

import java.util.Scanner;

public class If {

    public void testBasicIf() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        } else if
        (score < 80 && score >= 60) {
            System.out.println("재평가");
        }
    }

    public void TestIfExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        if (age <= 13) {
            System.out.println("어린이");
        } else if (age <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }

    }

    public void TestIfExample2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("성별 : ");
        char gender = sc.nextLine().toUpperCase().charAt(0);

//        if(gender == 'M'){
//            System.out.println(name + " 님은 남학생 입니다.");
//        }
//        else if(gender == 'F'){
//            System.out.println(name + " 님은 여학생 입니다.");
//        }
        String result = "크레파스"; // 변수 미리 세팅하는 습관

        if (gender == 'M') {
            result = "남학생";
        } else if (gender == 'F') {
            result = "여학생";
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return;
        }

        System.out.println(name + "님은" + result + "입니다.");
    }

    public void TestIfExample3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름: ");
        String name = sc.nextLine();
        /*
        기본자료형 (boolean, char, byte, short, int..)
        - 일치 ==
        - 불일치 !=
        참조자료형 (String, 기본자료형을 제외한 모든 타입)
        - 일치 : 비교대상1. equals(비교대상2)
         */

        if (name.equals("홍길동")) {
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요.");
        }
    }

    public void testNestedIf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수(양수) 입력.");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
        } else {
            if (num % 3 == 0) {
                System.out.println("3의 배수 입니다.");
            } else {
                System.out.println("3의 배수가 아닙니다.");
            }
        }
    }

    public void testNestedIfExample1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("학년");
        int grade = sc.nextInt();

        System.out.println("점수");
        int score = sc.nextInt();

        if (grade <= 6 && grade >= 4) {
            if (score >= 70) {
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        } else {
            if (score >= 60) {
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        }
    }

    public void testNestedIfExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호");

        String personNumber = sc.nextLine();

        if (personNumber.length() == 14) {
            char genderNumber = personNumber.charAt(7);

            if (genderNumber == '1'|| genderNumber == '3') {
                System.out.println("남자");
            }
            if (genderNumber == '2'|| genderNumber == '4') {
                System.out.println("여자");
            }
        } else {
            System.out.println("잘못입력하셨습니다.");
        }


    }
}
