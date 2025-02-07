package com.minkook.practice.controller;

import com.minkook.section03.scanner.KeyboardInput;

import java.util.Scanner;

public class PracController {

    public void practice1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력하세요: ");
        char sex = sc.nextLine().charAt(0);

        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.println("키 " + height + "인 " + age + "살 " + sex + " " +name + "님 반갑습니다^^");


    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String word = sc.nextLine();

        char firstword = word.charAt(0);
        char secondword = word.charAt(1);
        char thirdword = word.charAt(2);

        System.out.printf("첫번째 문자:%c\n",firstword);
        System.out.printf("두번째 문자:%c\n",secondword);
        System.out.printf("세번째 문자:%c",thirdword);

    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("학년: ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.print("반: ");
        int cla = sc.nextInt();
        sc.nextLine();

        System.out.print("번호: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("성별: ");
        char sex = sc.nextLine().charAt(0);
        String strSex = (sex == 'M' ? "남학생":"여학생");

        System.out.print("성적: ");
        double score = sc.nextDouble();
        sc.nextLine();

        System.out.printf("%d학년 ",grade);
        System.out.printf("%d반 ",cla);
        System.out.printf("%d번 ",num);
        System.out.printf("%s ",name);
        System.out.printf("%s의 ",strSex);
        System.out.print("성적은 ");
        System.out.printf("%.2f",score);
        System.out.print("이다");



    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(-포함)");

        String num = sc.nextLine();
        char cNum = num.charAt(7);
        String gender = (cNum == 2 ? "여자":" 남자");
        System.out.println(gender);



    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();

        System.out.print("정수2: ");
        int num2 = sc.nextInt();

        System.out.print("비교값: ");
        int campNum = sc.nextInt();

        boolean res = (campNum <= num1 || campNum > num2 ? true:false);

        System.out.println(res);

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();

        System.out.print("정수2: ");
        int num2 = sc.nextInt();

        System.out.print("정수3 ");
        int num3 = sc.nextInt();

        boolean res = ((num1 == num2) && (num2 == num3) && (num1 == num3) ? true:false);

        System.out.println(res);

    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();

        String res = ((int)score >= 90 ? "축하합니다.":"분발하세요.");
        System.out.println(res);


    }

}
