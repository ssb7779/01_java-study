package com.john.homework.controller;

import java.util.Scanner;

public class Function {
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자(+,-,x,/): ");
        char operator = sc.nextLine().charAt(0);

        if (operator == '+') {
            System.out.printf("%s + %s = %s", a, b, a + b);
        } else if (operator == '-') {
            System.out.printf("%s - %s = %s", a, b, a - b);
        } else if (operator == 'x' || operator == 'X') {
            System.out.printf("%s * %s = %s", a, b, a * b);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                System.out.printf("%s / %s = %s", a, b, 0);
            } else {
                System.out.printf("%s / %s = %s", a, b, a / b);
            }
        }
    }

    public void totalCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.printf("%d부터 %d까지 정수들의 합: %d", min, max, sum);
    }

    public void printProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("나이: ");
        int age = sc.nextInt();
        // 개행 처리
        sc.nextLine();
        System.out.print("성별: ");
        String gender = sc.nextLine();
        System.out.print("성격: ");
        String personality = sc.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + gender);
        System.out.println("성격 : " + personality);
    }

    public void printScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("학년: ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.print("반: ");
        int classTeam = sc.nextInt();

        System.out.print("번: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);

        char gen = ' ';
        if (gender == 'M') {
            gen = '남';
        } else if (gender == 'F') {
            gen = '여';
        }

        System.out.print("성적: ");
        double score = sc.nextDouble();

        char rank;
        if (score >= 90) {
            rank = 'A';
        } else if (score >= 80) {
            rank = 'B';
        } else if (score >= 70) {
            rank = 'C';
        } else if (score >= 60) {
            rank = 'D';
        } else {
            rank = 'F';
        }

        System.out.printf("%d학년 %d반 %d번 %s학생 %s의 점수는 %.2f점이고 %s학점입니다",
                grade, classTeam, number, gen, name, score, rank);
    }

    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("양수가 아닙니다");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j == i) {
                        System.out.print(i);
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

    public void sumRandom(){
        int n = (int) (Math.random() * 100 + 1);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("%d부터 %d까지의 합: %d", 1, n, sum);
    }

    public void exceptGugu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        int n = sc.nextInt();

        if(n < 1){
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % n == 0) {
                continue;
            }
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }

    public void diceGame(){
        Scanner sc = new Scanner(System.in);
        int diceNum = (int)(Math.random() * 6 + 2);
        while(true){
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력): ");
            int n = sc.nextInt();
            sc.nextLine();
            if(n == diceNum){
                System.out.println("정답입니다.");
                System.out.print("계속하시겠습니까?(y/n): ");
                char answer = sc.nextLine().charAt(0);
                if(answer == 'y'){
                    // 주사위 눈 초기화
                    diceNum = (int)(Math.random() * 6 + 2);
                } else if(answer == 'n'){
                    System.out.println("종료합니다.");
                    break;
                } else {
                    System.out.println("비정상적인 값으로 강제종료합니다.");
                    break;
                }
            }else{
                System.out.println("틀렸습니다");
            }
        }
    }
}
