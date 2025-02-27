package com.jun.practice01.controller;

import java.util.Scanner;

public class Praccontroller {
    public void practice1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc. nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc. nextInt();
        sc. nextLine();

        System.out.print("성별을 입력하세요(남자/여자): ");
        String gender = sc. nextLine();

        System.out.print("키를 입력하세요: ");
        double height = sc. nextDouble();

        System.out.println("키 " + height + "인 " + age + "살 "
                     + gender + " " +  name + "님" + " 반갑습니다" );


    }

    public void practice2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        char ch1 =str. charAt(0);
        char ch2 =str. charAt(1);
        char ch3 =str. charAt(2);






        System.out.println("첫 번째 문자: " + ch1);
        System.out.println("두 번째 문자: " + ch2);
        System.out.println("세 번째 문자: " + ch2);




    }

    public void practice3(){

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc. nextLine();

        System.out.print("학년(숫자만): ");
        int grade = sc. nextInt();

        System.out.print("반(숫자만): ");
        int classNum = sc. nextInt();

        System.out.print("번호(숫자만): ");
        int num = sc. nextInt();
        sc. nextLine();

        System.out.print("성별(M/F): ");
        char gender = sc. nextLine().charAt(0);

        System.out.print("성적(소수점 아래 둘째 자리까지: ");
        double score = sc. nextDouble();

        String student = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";


        System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, classNum, num, name, student, score);


    }

    public void practice4(){
        Scanner sc = new Scanner(System.in);

		/* 방법1.
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine(); // "800915-2453612"
									//  0123456789...    => 인덱스

		char gender = str.charAt(7);// '1' 또는 '2' 또는 '3' 또는 '4'

		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		System.out.println(result);
		*/

        // 방법2.
        System.out.print("주민번호를 입력하세요(-포함) : ");
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
        int input = sc.nextInt();

        System.out.println(input <= num1 || input > num2);
    }

    public void practice6(){

        Scanner sc = new Scanner(System.in);

        System.out.print("입력1 : ");
        int num1 = sc.nextInt();

        System.out.print("입력2 : ");
        int num2 = sc.nextInt();

        System.out.print("입력3 : ");
        int num3 = sc.nextInt();

        boolean isTrue = (num1 == num2) && (num2 == num3);
        System.out.println(isTrue);
    }

    public void practice7(){

        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        // 1. 점수가 90점 이상, 100 미만인지 비교
        //String result = score >= 90 && score < 100 ? "축하합니다." : "분발하세요.";

        // 2. 점수값을 10으로 나누었을때 몫이 9인지 비교 ==> 이것도 90점대에 해당됨!!
        String result = score / 10 == 9 ? "축하합니다." : "분발하세요.";

        System.out.println(result);
    }
}
