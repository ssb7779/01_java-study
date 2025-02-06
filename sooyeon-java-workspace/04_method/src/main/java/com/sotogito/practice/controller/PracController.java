package com.sotogito.practice.controller;

import java.util.Scanner;

public class PracController {
    Scanner sc = new Scanner(System.in);


    public void practice1() {
        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("성별을 입력하세요(남/여) : ");
        char gender = sc.next().charAt(0);

        System.out.println("키를 입력하세요(cm) : ");
        double height = sc.nextDouble();

        System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
    }


    public void practice2() {
        System.out.println("문자열을 입력하세요 : ");
        String word = sc.nextLine();

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
    }


    public void practice3() {
        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("학년(숫자만) :  ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.println("반(숫자만) : ");
        int group = sc.nextInt();

        System.out.println("번호(숫자만) : ");
        int number = sc.nextInt();

        System.out.println("성별(M/F) : ");
        char gender = sc.next().charAt(0);
        gender = gender == 'M' || gender == 'F' ? gender == 'M' ? '남' : '여' : gender == 'm' ? '남' : '여';

        System.out.println("성적(소수점 아래 둘째 자리까지)   ");
        double record = sc.nextDouble();

        System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.",
                grade, group, number, name, gender, record);

    }


    public void practice4() {
        System.out.println("사용자에게 주민등록번호를 입력받아 성별을 출력하시오.");
        char genderValue = sc.next().charAt(7);

        System.out.printf(genderValue == '2' ? "여자" : "남자");
    }


    public void practice5() {
        System.out.println("정수1 :  ");
        int num1 = sc.nextInt();

        System.out.println("정수2 : ");
        int num2 = sc.nextInt();

        System.out.println("비교값 : ");
        int comparisonNumber = sc.nextInt();

        boolean result = comparisonNumber <= num1 || comparisonNumber > num2;

        System.out.println(result);
    }


    public void practice6() {
        System.out.println("정수1 :  ");
        int num1 = sc.nextInt();

        System.out.println("정수2 : ");
        int num2 = sc.nextInt();

        System.out.println("정수3 : ");
        int num3 = sc.nextInt();

        boolean result = num1 == num2 && num2 == num3;

        System.out.println(result);
    }


    public void practice7() {
        System.out.println("점수 : ");
        int score = sc.nextInt();

        System.out.println(score / 10 == 9 ? "축하합니다." : "분발하세요");
    }

}
