package com.ibe6.practice.controller;

import java.util.Scanner;

public class PracController {

    public void practice1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("성별(남/여): ");
        char gender = sc.nextLine().charAt(0);
        String result = gender == '남' ? "남자" : "여자";

        System.out.print("키: ");
        double height = sc.nextDouble();

        System.out.println("키 " + height + "인 " + age + "살 " + result + " " + name + "님 반갑습니다^^");
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");

        String fruit = sc.nextLine();

        char fruit0 = fruit.charAt(0);
        char fruit1 = fruit.charAt(1);
        char fruit2 = fruit.charAt(2);
        System.out.println("첫 번째 문자: " + fruit0);
        System.out.println("두 번째 문자: " + fruit1);
        System.out.println("세 번째 문자: " + fruit2);




//        char fruit1 = sc.nextLine();

//
//
//        System.out.println("두 번째 문자: " + fruit1);


    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("학년(숫자만): ");
        int grade = sc.nextInt();

        System.out.print("반(숫자만): ");
        int classNum = sc.nextInt();

        System.out.print("번호(숫자만): ");
        int Num = sc.nextInt();

        sc.nextLine();

        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);
        String result = gender == 'M' || gender == 'm' ? "남학생" : "여학생";


        System.out.print("성적(소수점 아래 둘째 자리까지): ");
        double score = sc.nextDouble();

        System.out.println(grade + "학년 " + classNum + "반 " + Num + "번 " + name + " " + result + "의 성적은 " + score + "이다." );

    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호를 입력하세요(-포함): ");
        char num = sc.nextLine().charAt(8);
        String result = num == '1' || num == '3' ? "남자" : "여자";

        System.out.println(result);

    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        System.out.print("비교값: ");
        int num3 = sc.nextInt();

        String result = (num1 > num3) || (num2 < num3) ? "true" : "false";

        System.out.println(result);

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        System.out.print("정수3: ");
        int num3 = sc.nextInt();

        String result = (num1 == num2) && (num2 == num3) ? "true" : "false";

        System.out.println(result);

    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        String result = score >= 90 ? "축하합니다" : "분발하세요";

        System.out.println(result);
    }
}
