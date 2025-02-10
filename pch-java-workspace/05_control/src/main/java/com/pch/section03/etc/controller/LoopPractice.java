package com.pch.section03.etc.controller;

import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 숫자 입력 : ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("잘못된 입력");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 숫자 입력 : ");

        while (true) {
            int n = sc.nextInt();

            if (n < 1) {
                System.out.println("잘못된 입력. 재입력 요망");
            } else {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }

    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 숫자 입력 : ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("잘못된 입력");
        } else {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 숫자 입력 : ");

        while (true) {
            int n = sc.nextInt();
            if (n < 1) {
                System.out.println("잘못된 입력. 재입력 요망");
                System.out.print("1 이상의 숫자 입력 : ");
                continue;
            }

            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
            break;
        }

    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.print("= " + (n * (n + 1) / 2));

    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int n = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int m = sc.nextInt();

        int a = Math.min(n, m);
        int b = Math.max(n, m);

        if (a < 1) {
            System.out.println("1이상의 숫자만을 입력해주세요.");
        } else {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("첫 번째 숫자 : ");
            int n = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            int m = sc.nextInt();

            int a = Math.min(n, m);
            int b = Math.max(n, m);
            if (a < 1) {
                System.out.println("1이상의 숫자만을 입력해주세요.");
            } else {
                for (int i = a; i <= b; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
        while (true);
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int n = sc.nextInt();
        System.out.println("========== " + n + "단 ==========");
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int n = sc.nextInt();
        if (n < 2 || n > 9) {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
            return;
        }
        for (int i = n; i <= 9; i++) {
            System.out.println("========== " + i + "단 ==========");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("숫자 : ");
            int n = sc.nextInt();
            if (n < 2 || n > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
                continue;
            }
            for (int i = n; i <= 9; i++) {
                System.out.println("========== " + i + "단 ==========");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
            break;

        } while (true);
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 :");
        int n = sc.nextInt();
        System.out.print("공차 : ");
        int m = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n += m;
        }
    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("연산자(+, -, *, /, %) : ");
            String s = sc.nextLine();
            if (s.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("정수1 : ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print("정수2 : ");
            int m = sc.nextInt();
            sc.nextLine();


            char c = s.charAt(0);
            switch (c) {
                case '+':
                    System.out.println(n + " + " + m + " = " + (n + m));
                    break;
                case '-':
                    System.out.println(n + " - " + m + " = " + (n - m));
                    break;
                case '*':
                    System.out.println(n + " * " + m + " = " + (n * m));
                    break;
                case '/':
                    if(m==0) {
                        System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                        continue;
                    }
                    System.out.println(n + " / " + m + " = " + (n / m));
                    break;
                default:
                    System.out.println("잘못된 연산자입니다. 다시 입력하세요.");
            }
        } while (true);

    }

    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String s = sc.nextLine();
        System.out.print("찾고자하는 문자 : ");
        char c = sc.next().charAt(0);

        int sum = 0;
        for(int i = 0; i<s.length(); i++) {
            if(c==s.charAt(i)) sum++;
        }

        System.out.println("포함된 갯수 : "+sum);
    }

    public void practice14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");

        int sum = 0;
        int cnt = 0;

        while(sum<10000) {
            sum+=70;
            System.out.println(++cnt+"회 모금액 :\t"+sum+"원");
        }
        System.out.println("\n총 모금횟수 : "+cnt);

        System.out.println("--------------------");
    }

    public void star1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("직사각형 높이 입력 : ");
        int height = sc.nextInt();
        int width = height*2;

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(i==0 || i==height-1||j==0||j==width-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void star4(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("다이아몬드 가로 최대길이 입력(9 이하 홀수만 가능) : ");
//        int N = sc.nextInt();
//
//        for(int i = 1; i<=N/2; i++){
//            for(int j = 0; j<=N/2 - i; j++) System.out.print(" ");
//            for(int j = N/2-i; j<N/2+i-1; j++) System.out.print(j-(N/2-i)+1);
//            System.out.println();
//        }
//        for(int i = 1; i<=N; i++) System.out.print(i);
//        System.out.println();
//        for(int i = 0; i<=N; i++){
//            for(int j = N/2+1; j<i; j++) System.out.print(" ");
//            for(int j = N/2-i; j<N/2+i-1; j++) System.out.print(j+(N/2-i)+1);
//            System.out.println();
//        }
    }

    public void star5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("다이아몬드 가로 최대길이 입력 : ");
        int N = sc.nextInt();
    }
}
