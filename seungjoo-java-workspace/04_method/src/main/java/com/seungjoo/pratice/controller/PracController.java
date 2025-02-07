package com.seungjoo.pratice.controller;

import java.util.Scanner;

public class PracController {

    public void practice1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별을 입력하세요(남/여: ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("키를 입력하세요(cm) :");
        double height = sc.nextDouble();

        System.out.print("키 " + height + "인 ");
        System.out.print(age + "살 ");
        System.out.print(gender + "자 ");
        System.out.println(name + "님 반갑습니다.");




    }
    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요:");
        String name = sc.nextLine();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름:");
        String name = sc.nextLine();
        System.out.println("학년(숫자만):");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("반(숫자만):");
        int ban = sc.nextInt();
        sc.nextLine();
        System.out.println("번호(숫자만)");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("성별(M/F):");
        char gender = sc.nextLine().charAt(0);
        String sex = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
        System.out.println("성적(소수점 아래 둘쨰 자리까지):");
        double grade = sc.nextDouble();


        System.out.printf("%d학년 %d반 %d번 %s의 성적은 %.2f이다.",age,ban,num,sex,grade);



    }
    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요(- 포함):");
        String num = sc.nextLine();
        char sex = num.charAt(8);
        String gender = (sex == '2' || sex == '4') ? "여자" : "남자";
        System.out.println(gender);
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1:");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("정수 2:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("비교값:");
        int num3 = sc.nextInt();
        boolean result = (num3 <= num1 || num3  > num2) ? true : false;
        System.out.println(result);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수1 :");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("정수2 :");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("정수3:");
        int num3 = sc.nextInt();
        boolean result = (num1 == num2 || num2 == num3)? true : false;
        System.out.println(result);
    }
    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수:");
        int num = sc.nextInt();
        String result = num>90 ? "축하합니다.":"분발하세요.";
        System.out.println(result);
    }









}
