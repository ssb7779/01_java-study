package com.seungjoo.homework.controller;

import java.util.Scanner;

public class Function {

    public void calculator() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("두 번째 정수:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자(+, -, x, /) :");
        char op = sc.nextLine().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {


                    System.out.println(num1 / num2);
                    break;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.out.println(num1 + " + 0 = 0");
                    break;
                }

        }
    }
        public void totalCalculator(){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 정수:");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("두 번째 정수:");
            int num2 = sc.nextInt();

            int temp  = 0;
            if(num1 > num2){
                temp = num2;
                num2 = num1;
                num1 = temp;


            }
            int sum = 0;
            for (int i = num1; i <= num2; i++) {
                sum += i;
        }
            System.out.println(num1 + "부터 " + num2 + "까지 정수들의 합:" + sum);




    }

    public void printProfile() {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름:");
        String str = sc.nextLine();
        System.out.println("나이:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("성별:");
        String str1 = sc.nextLine();
        System.out.println("성격:");
        String str2 = sc.nextLine();

        System.out.println("이름:" + str);
        System.out.println("나이:" + num1);
        System.out.println("성별:" + str1);
        System.out.println("성격:" + str2);






    } public void printScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름:");
        String str = sc.nextLine();
        System.out.println("학년:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("반:");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("번:");
        int num3= sc.nextInt();
        sc.nextLine();
        System.out.println("성별(M/F):");
        char ch = sc.nextLine().charAt(0);
        System.out.println("성적:");
        double score = sc.nextDouble();

        String st = "";
        if(ch == 'F'){
            st = "여학생";
        }else if(ch == 'M'){
            st = "남학생";
        }

        char grade = 'K';
        if(score>= 90){
            grade = 'A';
        }else if(score >= 80 && score < 90){
            grade = 'B';
        }else if(score >= 70 && score < 80){
            grade = 'C';
        }else if(score >= 60 && score < 70){
            grade = 'D';
        }else if(score < 60){
            grade = 'F';
        }


        System.out.println(num1+ "학년 " + num2 +"반 "+num3 + "번 " + st +" "+ str + "의 점수는 " + score + "점이고 " + grade + "학점입니다.") ;
    }
    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수:");
        int num1 = sc.nextInt();
        if(num1 <1){
            System.out.println("양수가 아닙니다.");
        }
        for(int j = 1; j <= num1; j++) {
            for (int i = 1; i <= j; i++) {
                if(i ==j) {
                    System.out.print(i);
                    System.out.println();
                }else{
                    System.out.print("*");
                }
            }
        }
    }
    public void sumRandom() {
        int num1 = (int)(Math.random()*100 + 1);
        int sum = 0;
        for(int i = 1; i <= num1; i++) {
            sum += i;

        }
        System.out.println("1부터 " +num1 + "까지의 합:" + sum);
    }


    public void exceptGugu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수:");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if (i % num1 == 0) {
                continue;
            } else {
                System.out.println(num1 + " * " + i + " = " + num1 * i);
            }
        }
    }

    public void diceGame() {

        int a = 3;
        int b = 2;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("주사위 두 개의 합을 맞춰보세요(2~12입력)");
            int num1 = sc.nextInt();
            sc.nextLine();
            if (a + b == num1) {
                System.out.println("정답입니다:");
                System.out.println("계속 하시겠습니까?(y/n):");
                String answer = sc.nextLine();
                if (answer.equals("n")) {
                    System.out.println("종료합니다.");
                    break;
                } else if (answer.equals("y")) {
                    continue;
                }
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
        public void displayMenu(){
            while(true) {
                System.out.println("1.간단 계산기");
                System.out.println("2.작은 수에서 큰 수까지 합계");
                System.out.println("3.신상 정보 확인");
                System.out.println("4.학생 정보 확인");
                System.out.println("5.별과 숫자 출력");
                System.out.println("6.난수까지의 합계");
                System.out.println("7.구구단");
                System.out.println("8. 주사위 숫자 알아맞추기 게임");
                System.out.println("9.프로그램 종료");
                Scanner sc = new Scanner(System.in);
                System.out.println("메뉴 번호:");
                String answer = sc.nextLine();
                int cnt = 0;
                switch (answer) {
                    case "1": calculator();
                    break;
                    case "2": totalCalculator();
                    break;
                    case "3": printProfile();
                    break;
                    case "4":  printScore();
                    break;
                    case "5": printStarNumber();
                    break;
                    case "6": sumRandom();
                        break;
                    case "7": exceptGugu();
                        break;
                    case "8": diceGame();
                        break;
                    case "9":
                        System.out.println("종료합니다.");
                        cnt = 1;
                        break;
                    default:
                        System.out.println("잘못입력하셨습니다. 다시 입력해주세요");

                }
                if(cnt ==1){
                    break;
                }
            }
        }



    }



















