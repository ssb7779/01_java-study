package com.younggalee.pracatice.controller;
import java.util.Scanner;

public class PracController {
    public void practice1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^ ", height, age, gender, name);

    }

    public void practice2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");

        String word = sc.next();

        char first = word.charAt(0);
        char second = word.charAt(1);
        char third = word.charAt(2);

        System.out.println("첫 번째 문자 : " + first);
        System.out.println("두 번째 문자 : " + second);
        System.out.println("세 번째 문자 : " + third);

    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("반 : ");
        int classNum = sc.nextInt();

        System.out.print("번호 : ");
        int index = sc.nextInt();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        System.out.println("성적 : ");
        double score = sc.nextDouble();

        System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classNum, index, name, gender, score);

    }
    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요. : ");
        String personalID = sc.nextLine();
        char gender = personalID.charAt(7);
        String result = gender == 2 ? "여자" : "남자";

        System.out.println(result);

    }
    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("비교값 : ");
        int compare = sc.nextInt();
        sc.nextLine();
        boolean result = (compare <= num1 || compare > num2) ? true : false;

        System.out.println(result);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수1 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("정수2 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("정수3 : ");
        int num3 = sc.nextInt();
        sc.nextLine();

        boolean result = (num1 == num2 && num2 == num3 && num3 == num1) ? true : false;
        System.out.println(result);
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int score = sc.nextInt();

        String result = (score >= 90 && score < 100) ? "축하합니다." : "분발하세요.";

        System.out.println(result);
    }

}
