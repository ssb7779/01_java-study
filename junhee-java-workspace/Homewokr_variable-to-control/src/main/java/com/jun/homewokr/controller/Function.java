package com.jun.homewokr.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
    public void calculator(){

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수: ");
        int num2 = sc.nextInt();

        System.out.print("연산자(+, -, x, /): ");
        char or=sc.next().charAt(0);

        int result=0;

        switch(or){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'X':
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("0으로 나눌 수 없습니다");
                    result = 0;
                }else{
                    result = num1 / num2;


                }
                break;


        }
        System.out.println(num1 + " " + or + " " + num2 + " = " + result);

    }

    public void totalCalculator(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = sc.nextInt();

        int st,end;

        if(num1 < num2){
            st=num1;
            end=num2;
        }else{
            st=num2;
            end=num1;
        }
       int sum = 0;
        for(int i=st; i<=end; i++){
            sum +=i;
        }

        System.out.println(st + "부터 " + end + "까지 " + "정수들의 합: " + sum);
    }

    public void printProfile(){

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별: ");
        String gender = sc.nextLine();
        System.out.print("성격: ");
        String person= sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("성격: " + person);




    }
    public void printScore(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("학년: ");
        int grade = sc.nextInt();
        System.out.print("반: ");
        int classNum = sc.nextInt();
        System.out.print("번: ");
        int num = sc.nextInt();
        System.out.print("성별(M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("성적: ");
        double score = sc.nextDouble();


        String scoreStr = "";
        if(score >= 90){
            scoreStr = "A";
        }else if(score >= 80 && score < 90){
            scoreStr = "B";
        }else if(score >= 70 && score < 80){
            scoreStr = "C";
        }else if (score >= 60 && score < 70){
            scoreStr = "D";
        }else {
            scoreStr = "F";
        }

        String genderStr = "";
        if(gender == 'M'){
            genderStr = "남학생";
        }else if(gender == 'F'){
            genderStr = "여학생";
        }
        System.out.println(grade + "학년 " + classNum + "번 " + num + "번 " + genderStr + " "
        + name + "의 " + "점수는 " + score + "점이고 " + scoreStr + "학점 입니다");

    }
    public void printStarNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int num = sc.nextInt();


        if(num > 0){
            for(int i=1; i <= num; i++) {
                if (i == 1) {
                    System.out.println(i);
                } else {

                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("양수가 아닙니다.");
        }
    }

    public void sumRandom(){

        Random ran = new Random();

        int num = (int)(Math.random()*100)+1;

        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println(1 + "부터 " + num + "까지의 합: " + sum);
    }
    public void exceptGugu(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int num = sc.nextInt();

        if(num > 0){
            for(int i=1; i<=9; i++){
                if(i%num != 0){
                    System.out.println(num + " * " + i + " = " + (num*i));
                }
            }
        }

    }

    public void diceGame(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력): ");
            int num = sc.nextInt();

            int ran = (int) (Math.random() * 11) + 2;

            if (num == ran) {
                System.out.println("정답합니다.");
                System.out.println("주사위의 합: " + ran);

            } else {
                System.out.println("틀렸습니다.");
            }
            System.out.print("계속 하시겠습니까?(y/n): ");
            char ch = sc.next().charAt(0);


            if (ch == 'n') {
                System.out.println("종료합니다");
                break;
            }


        }

    }

}

