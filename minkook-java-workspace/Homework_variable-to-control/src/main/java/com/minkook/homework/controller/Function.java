package com.minkook.homework.controller;

import java.util.Scanner;

public class Function {
    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.print("연산자(+, -, x, /) : ");
        char op = sc.nextLine().charAt(0);
        int res = 0;

        switch (op){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                res = num1 / num2;
                break;

        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + res);

    }

    public void totalCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        int minNum = Math.min(num1,num2);
        int maxNum = Math.max(num1,num2);
        int sum = 0;

        for(int i = minNum; i <= maxNum; i++){
            sum += i;

        }
        System.out.println(minNum + "부터 " + maxNum + "까지 " + "정수들의 합: " + sum );



    }

    public void printProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별: ");
        String gender = sc.nextLine();

        System.out.print("성격: ");
        String personality = sc.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("성격: " + personality);


    }
    public void printScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("학년: ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.print("반: ");
        int cla = sc.nextInt();
        sc.nextLine();

        System.out.print("번: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("성별: ");
        char gender = sc.nextLine().toUpperCase().charAt(0);




        System.out.print("성적: ");
        double score = sc.nextDouble();
        sc.nextLine();
        int dScore = (int)score;
        char g;

        if(dScore >= 90 && dScore <=100){
            g = 'A';
        }else if(dScore >= 80 && dScore <=89) {
            g = 'B';
        }else if(dScore >= 70 && dScore <=79) {
            g = 'C';
        }else if(dScore >= 60 && dScore <=69) {
            g = 'D';
        }else{
            g = 'F';
        }


        System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c학점입니다",grade,cla,num, (gender == 'm' ? "남학생": "여학생"),name,score,g);
        System.out.println();


    }

    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("양수가 아닙니다.");
        }

        for(int i = 0; i < num; i++){
            System.out.println();
            for(int j = 0; j <= i; j++){
                if (i==j){
                    System.out.print(j+1);
                } else{
                    System.out.print("*");
                }

            }

        }
    }

    public void sumRandom() {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100 + 1);
        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += (i+1);

        }
        System.out.println(1 + "부터" + " " + num + "까지의 합: " + sum);
    }

    public void exceptGugu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();
        int dan = num;

        for(int i = 1; i <= 9; i++){
            if(i % dan != 0){
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }

        }

    }

    public void diceGame() {

        while(true){
            int dice1 = (int)(Math.random() * 6 + 1);
            System.out.println(dice1);
            int dice2 = (int)(Math.random() * 6 + 1);
            System.out.println(dice2);
            int sum = dice1 + dice2;
            Scanner sc = new Scanner(System.in);
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력): ");
            int res = sc.nextInt();
            sc.nextLine();

            if(res == sum){
                System.out.println("정답합니다.");
                System.out.print("계속 하시겠습니까?(y/n):");
                char c = sc.nextLine().toLowerCase().charAt(0);
                if(c == 'n'){
                    break;
                }

            }else{
                System.out.println("틀렸습니다.");
            }

        }

    }

}
