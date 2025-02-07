package com.john.practice.controller;

import java.util.Scanner;

public class PracController {
    public void practice1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine(); //버퍼 flush
        System.out.print("성별을 입력하세요(남/여): ");
        char gender = sc.nextLine().charAt(0);
        System.out.print("키를 입력하세요(cm): ");
        double height = sc.nextDouble();

        System.out.printf("키 %.1fcm인 %d살 %s %s님 반갑습니다", height, age, gender, name);
    }

    public void practice2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        System.out.println("첫번째 문자: " + s.charAt(0));
        System.out.println("두번째 문자: " + s.charAt(1));
        System.out.println("세번째 문자: " + s.charAt(2));
    }
    public void practice3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("학년(숫자만): ");
        int grade = sc.nextInt();
        sc.nextLine(); //버퍼 flush
        System.out.print("반(숫자만): ");
        int classTeam = sc.nextInt();
        System.out.print("번호(숫자만): ");
        int number = sc.nextInt();
        sc.nextLine(); //버퍼 flush
        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);
        gender = (gender == 'M') ? '남' : '여';
        System.out.print("성적(소수점 아래 둘째 자리까지: ");
        double score = sc.nextDouble();

        System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다."
                        , grade, classTeam, number, name, gender, score);
    }
    public void practice4(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호를 입력하세요(-포함): ");
        String s = sc.nextLine();
        char gender = s.charAt(7);
        System.out.print(gender == '1' ? "남자" : "여자");
    }
    public void practice5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        System.out.print("비교값: ");
        int checkNum = sc.nextInt();
        System.out.println(checkNum < num1 || checkNum > num2);
    }
    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();
        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        System.out.print("정수3: ");
        int num3 = sc.nextInt();
        System.out.println((num1 == num2 && num1 == num3));
    }
    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수: ");
        int score = sc.nextInt();
        System.out.println((score >= 90 && score <= 99) ? "축하합니다." : "분발하세요.");
    }

}
