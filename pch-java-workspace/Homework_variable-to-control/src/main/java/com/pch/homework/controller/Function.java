package com.pch.homework.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Function {
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int n = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int m = sc.nextInt();
        System.out.print("연산자(+, -, x, /) :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(n + " " + operator + " " + m + " = " + n + m);
                break;
            case '-':
                System.out.println(n + " " + operator + " " + m + " " + (n - m));
                break;
            case 'x':
                System.out.println(n + " " + operator + " " + m + " = " + n * m);
                break;
            case '/':
                if (m == 0) {
                    System.out.println("0 으로 나눌 수 없습니다.");
                    System.out.println(n + " " + operator + " " + m + " = 0");
                } else {
                    System.out.println(n + " " + operator + " " + m + " = " + n / m);
                }
                break;
        }
    }

    public void totalCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int n = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int m = sc.nextInt();

        int small = Math.min(n, m);
        int big = Math.max(n, m);
        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }

        System.out.println(small+"부터 "+big+"까지 정수들의 합 : "+sum);
    }

    public void printProfile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름 : ");
        String name = br.readLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("성별 : ");
        String gender = br.readLine();
        System.out.print("성격 : ");
        String personality = br.readLine();

        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("성별 : "+gender);
        System.out.println("성격 : "+personality);
    }

    public void printScore() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름 : ");
        String name = br.readLine();
        System.out.print("학년 : ");
        int grade = Integer.parseInt(br.readLine());
        System.out.print("반 : ");
        int classroom = Integer.parseInt(br.readLine());
        System.out.print("번호 : ");
        int number = Integer.parseInt(br.readLine());
        System.out.print("성별(M/F) : ");
        char gender = br.readLine().charAt(0);
        System.out.print("성적 : ");
        double score = Double.parseDouble(br.readLine());

        String strGender = "";
        if(gender == 'M') strGender="남학생";
        else strGender = "여학생";

        char charScore = 'F';
        if(score>=90) charScore = 'A';
        else if(score>=80) charScore = 'B';
        else if(score>=70) charScore = 'C';
        else if(score>=60) charScore = 'D';
        else charScore = 'F';

        System.out.println(grade+"학년 "+classroom+"반 "+number+"번 "+ strGender+" "+name+"의 점수는 "+score+"점이고 "+charScore+"학점입니다.");
    }

    public void printStarNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("정수 입력");
        int n = Integer.parseInt(br.readLine());

        if(n<1) {
            System.out.println("양수가 아닙니다.");
            return;
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<i; j++){
                System.out.print("*");
            }
            System.out.println(i);
        }
    }

    public void sumRandom(){
        int n = (int)(Math.random()*100) + 1;
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum+=i;
        }
        System.out.println("1부터 "+n+"까지의 합 : "+sum);
    }

    public void exceptGugu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("정수 입력");
        int n = Integer.parseInt(br.readLine());
        if(n<1) return;
        for(int i = 1; i<=9; i++){
            if(i%n!=0) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
    }

    public void diceGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = ((int) (Math.random() * 10))%6 + 1;
            int m = ((int) (Math.random() * 10))%6 + 1;
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력) :");
            int score = Integer.parseInt(br.readLine());
            if(score == n+m) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다.");
            }
            System.out.println("주사위의 합 : "+(n+m));
            System.out.print("계속 하시겠습니까?(y/n) : ");
            char exit = br.readLine().charAt(0);
            if(exit == 'n') {
                break;
            }
        }
    }
}
