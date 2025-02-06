package com.pch.practice.controller;

import java.util.Scanner;

public class PracController {
    public static void practice1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요(남/여): ");
        char sex = sc.nextLine().charAt(0);
        System.out.print("키를 입력하세요(cm): ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^",height,age,sex,name);
    }

    public static void practice2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        System.out.println("첫 번째 문자 : " + str.charAt(0));
        System.out.println("두 번째 문자 : " + str.charAt(1));
        System.out.println("세 번째 문자 : " + str.charAt(2));
    }

    public static void practice3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("학년(숫자만) : ");
        int grade = sc.nextInt();

        System.out.print("반(숫자만) : ");
        int group = sc.nextInt();

        System.out.print("번호(숫자만) : ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F) : ");
        char sex = sc.nextLine().charAt(0);
        if(sex=='F') sex = '여';
        else sex = '남';

        System.out.print("성적(소수점 아래 둘째 자리까지) : ");
        double score = sc.nextDouble();
        sc.nextLine();

        System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.",grade,group,number,name,sex,score);
    }

    public static void practice4(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호를 입력하세요(-포함) : ");
        String num = sc.nextLine();

        String sex = num.charAt(7)%2 == 0 ? "여자" : "남자";

        System.out.println(sex);
    }

    public static void practice5(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int a = sc.nextInt();
        System.out.print("정수2 : ");
        int b = sc.nextInt();
        System.out.print("비교값 : ");
        int compareNum = sc.nextInt();

        if(a<compareNum && compareNum<=b){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1 : ");
        int a = sc.nextInt();
        System.out.print("정수2 : ");
        int b = sc.nextInt();
        System.out.print("정수3 : ");
        int c = sc.nextInt();

        if(a==b && a==c) System.out.println("true");
        else System.out.println("false");
    }

    public static void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int a = sc.nextInt();

        if(a/10==9) System.out.println("축하합니다.");
        else System.out.println("분발하세요.");
    }
}