package com.podoseee.practice.controller;

import java.util.Scanner;

public class LoopPractice {

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            a = sc.nextInt();

            if (a >= 1) {
                break;
            } else {
                System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        if (a >= 1) {
            for (int i = a; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("잘못 입력하셨습니다.");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int a = sc.nextInt();
            for (int i = a; i >= 1; i--) {
                System.out.print(i + " ");
            }
            if (a >= 1) {
                break;
            } else {
                System.out.print("잘못 입력하셨습니다.");
            }
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력하세요 : ");
        int a = sc.nextInt();
        int sum = 0;
        int i;
        for (i = 1; i <= a; i++) {
            System.out.print(i);
            sum += i;
            // 마지막에 + 출력되지 않게 하기 위해, 범위 다르게 설정하여, i랑 따로 출력
            if (i < a) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }

    public void practice6() {
        /*처음 쓴 오류코드
        문제점1. scanner 객체 두 번 생성 X
        문제점2. for루프 :i=0에서 시작해서 동작 X
        문제점3. if 블록 안에서 for 루프 돌리지만, a나 b가 1보다 작으면 아무 동작 X


        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("첫 번째 숫자 : " + a);

        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("두 번째 숫자 : " + b);

        if(a>0 && b>0){
            for(int i=0; ((i<=a && i>=b)|| (i>=a && i<= b)); i++){
                System.out.print(i + " ");
            }
        }else {
            System.out.print("1이상의 숫자만을 입력해주세요.");
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.print("1이상의 숫자만을 입력해주세요.");
            return;
        }

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            b = sc.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.print("1이상의 숫자만을 입력해주세요.");
                continue; // 잘못된 입력이면 반복문 처음으로 돌아감 (수정)
            }
            int start = Math.min(a, b);
            int end = Math.max(a, b);

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            break;
        }
    }

    public void practice8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");

        int a = sc.nextInt();
        System.out.printf("===== %d단 ===== \n", a);
        for(int i = 1; i <=9; i++){
            System.out.print(a + " * " + i + " = " + a*i + "\n");
        }
    }


    public void practice9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");

        int a = sc.nextInt();
        if(a >= 2 && a<= 9){
            for (int j = a; j <= 9; j++) {
                System.out.printf("===== %d단 ===== \n", a++);
                for (int i = 1; i <= 9; i++) {
                    System.out.print((a - 1) + " * " + i + " = " + a * i + "\n");
                }
                System.out.println();
            }
        }else {
            System.out.print("2~9 사이의 숫자만 입력해주세요.");
        }
    }


    public void practice10(){
        Scanner sc = new Scanner(System.in);
        int a;

        while (true){
            System.out.print("숫자(2~9) 입력 : ");
            a = sc.nextInt();

            if(a >= 2 && a <= 9){
                break;
            } else {
                System.out.print("2~9 사이의 숫자만 입력해주세요.");
            }
        }
        for (int j = a; j <= 9; j++) {
            System.out.printf("===== %d단 ===== \n", a);
            for (int i = 1; i <= 9; i++) {
                System.out.print(a + " * " + i + " = " + a * i + "\n");
            }
            System.out.println();
            a++;
        }
    }

    public void practice11(){

    }

    public void practice12(){

    }

    public void practice13(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("찾고자하는 문자 : ");
        char chr = sc.next().charAt(0);

        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (chr == str.charAt(i)) {
                count++;
            }

        }
        System.out.println("포함된 갯수 : " + count);
    }

    public void practice14(){
        System.out.println("-----------");
        for(int i=1; i<=143; i++){
            System.out.print(i + "회 모금액 : " + 70*i +"원\n");
        }
        System.out.println("총 모금횟수 : 143회");
    }
}

