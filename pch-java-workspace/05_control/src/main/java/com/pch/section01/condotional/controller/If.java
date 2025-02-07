package com.pch.section01.condotional.controller;

import java.util.Scanner;

public class If {

    public void testBaseicElse(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if(score >= 60){
            System.out.println("통과");
        }else{
            System.out.println("탈락");
        }
    }

    public void testBaseicElse2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if(score >= 80){
            System.out.println("합격");
        }else if(score >= 60){
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }

    public void testIfExample1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        String sort = age>19 ? "성인" : age>13 ? "청소년" : "어린이";
        System.out.println(sort);
    }

    public void testIfExample2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.println("성별(M/F) : ");
        char gender = sc.nextLine().charAt(0);

        if(gender == 'M' || gender == 'm'){
            System.out.println(name + " 님은 남학생입니다.");
        } else if(gender == 'F' || gender == 'f'){
            System.out.println(name + " 님은 여학생입니다.");
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
        }
    }

    public void testIfExample3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        if(name.equals("홍길동")){
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요.");
        }

    }

    public void testNestedIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수(양수) 입력 : ");
        int num = sc.nextInt();

        if(num<1) System.out.println("양수가 아닙니다");
        else if(num%3!=0) System.out.println("3의 배수가 아닙니다");
        else System.out.println("정확한 값을 입력하셨습니다.");
    }

    public void testNestedIfExample1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("점수 : ");
        int score = sc.nextInt();

        if(grade>0 && grade<4){
            if(score>=60) System.out.println("합격");
            else System.out.println("불합격");
        } else if(grade>3 && grade<7){
            if(score>=70) System.out.println("합격");
            else System.out.println("불합격");
        } else {
            System.out.println("잘못된 학년 값 입력");
        }
    }

    public void testNestedIfExample2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호 입력 : ");
        String id = sc.nextLine();

        if(id.length() == 14) {
            char genderNum = id.charAt(7);
            if(genderNum=='1' || genderNum=='3'){
                System.out.println("남자");
            } else if(genderNum=='2' || genderNum=='4'){
                System.out.println("여자");
            } else {
                System.out.println("성별 잘못 입력");
            }
        } else {
            System.out.println("잘못된 입력");
        }
    }

}