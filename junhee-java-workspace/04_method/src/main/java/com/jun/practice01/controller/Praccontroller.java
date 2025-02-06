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
        char fruit = sc. nextLine().charAt(0);






        System.out.println("첫 번째 문자: " + fruit);
        System.out.println("두 번째 문자: " + fruit);
        System.out.println("세 번째 문자: " + fruit);




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
        int Num = sc. nextInt();

        System.out.print("성별(M/F): ");
        char gender = sc. nextLine().charAt(0);
        System.out.print("성적(소수점 아래 둘째 자리까지: ");

    }

}
