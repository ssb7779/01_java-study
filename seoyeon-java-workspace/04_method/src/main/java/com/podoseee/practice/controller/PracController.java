package com.podoseee.practice.controller;

import java.util.Scanner;

public class PracController {
    public void practice1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("성별을 입력하세요(남/여) : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.print("키를 입력하세요(cm) : ");
        double height = sc.nextDouble();

        System.out.println("키 " + height + "인 " + age + "살 " + gender + " " + name + "님 반갑습니다^^");

    }

    public void practice2(){
            Scanner sc = new Scanner(System.in);

            System.out.print("문자열을 입력하세요 : ");

            /* 처음 잘못 쓴 코드 : 문자열을 세 번 받음
            System.out.println("첫 번째 문자 : " + sc.nextLine().charAt(0));
            System.out.println("두 번째 문자 : " + sc.nextLine().charAt(1));
            System.out.println("세 번째 문자 : " + sc.nextLine().charAt(2));
            */

            String input = sc.nextLine();
            System.out.println("첫 번째 문자 : " + input.charAt(0));
            System.out.println("두 번째 문자 : " + input.charAt(1));
            System.out.println("세 번째 문자 : " + input.charAt(2));
    }

    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("학년(숫자만) : ");
        int grade = sc.nextInt();

        System.out.print("반(숫자만) : ");
        int classNum = sc.nextInt();

        System.out.print("번호(숫자만) : ");
        int number = sc.nextInt();

        sc.nextLine(); // 처음에 이 줄 안 썼더니 오류 났음

        System.out.print("성별(남/여) : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("성적(소수점 아래 둘째 자리까지) : ");
        double score = sc.nextDouble();

        System.out.println(grade + "학년 " + classNum + "반 " + number + "번 " + name + " " + gender + "학생의 성적은 " + score + "이다.");
    }

    public void practice4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요(- 포함) : ");
        /* //처음 오류코드
        char gender = (sc.nextLine().charAt(7) == (1 || 3)) ? "남자" : "여자";
        System.out.println(gender);
        */
        char gender = sc.nextLine().charAt(7);

        String result = (gender == '1' || gender == '3') ? "남자" : "여자";
        System.out.println(result);
    }

    public void practice5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int num1 = sc.nextInt();

        System.out.print("정수2 : ");
        int num2 = sc.nextInt();

        System.out.print("비교값 : ");
        int num3 = sc.nextInt();

        System.out.println(((num3 <= num1) || (num3 > num2)) ? true : false);
    }

    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int num1 = sc.nextInt();

        System.out.print("정수2 : ");
        int num2 = sc.nextInt();

        System.out.print("정수3 : ");
        int num3 = sc.nextInt();

        System.out.println((num1 == num2 && num2 == num3) ? true : false);
    }

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        System.out.println((score >= 90) ? "축하합니다" : "분발하세요.");
    }
}





