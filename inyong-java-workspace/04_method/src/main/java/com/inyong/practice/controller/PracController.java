package com.inyong.practice.controller;
import java.util.Scanner;

public class PracController {
    Scanner sc = new Scanner(System.in);


    public void practice1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String input = sc.nextLine();

        System.out.print("나이 입력 : ");
        String input2 = sc.nextLine();

        System.out.print("키 입력: ");
        double height = sc.nextDouble();


        System.out.println("입력하신 인사말 : " + input);
        System.out.println("입력하신 나이 : " + input2);
        System.out.println("키 입력 : " + height);
    }

    public void practice2(){
        String fruit = "apple";
        char result = fruit.charAt(0);
        System.out.println(result);
    }
    public void practice3(){
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        System.out.print("학년 : ");
        int age = sc.nextInt();

        System.out.print("반 입력: ");
        int ban = sc.nextInt();

        System.out.print("번호 입력: ");
        int number = sc.nextInt();

        System.out.println("성별 m/f 입력: ");
        char gender = sc.next().charAt(0);

        System.out.print("성적: ");
        double grade = sc.nextDouble();

        System.out.println(name + age + ban+ number+ gender+ grade);
    }
    public void practice4(){
        System.out.println("주민번호를 입력하시오: ");
        char gender = sc.next().charAt(7);

        System.out.println(gender == 2 ? "여자" : "남자");
    }
    public void practice5(){
        System.out.println("정수 1: ");
        int num1 = sc.nextInt();
        System.out.println("정수 2: ");
        int num2 = sc.nextInt();
        System.out.println("비교 값: ");
        int num3 = sc.nextInt();

        System.out.println(num1 >= num3 || num1 > num2 ? true : false);
    }
    public void practice6(){
        System.out.println("정수 1: ");
        int num1 = sc.nextInt();
        System.out.println("정수 2: ");
        int num2 = sc.nextInt();
        System.out.println("비교 값: ");
        int num3 = sc.nextInt();

        System.out.println(num1 == num3 && num1 == num2 ? true : false);
    }
    public void practice7(){
        System.out.println("점수: ");
        int num1 = sc.nextInt();


        System.out.println(num1 >= 90 ? "축하합니다." : "잘하자~");
    }


}
