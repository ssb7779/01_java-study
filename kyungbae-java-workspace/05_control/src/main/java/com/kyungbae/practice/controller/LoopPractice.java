package com.kyungbae.practice.controller;

import java.util.Scanner;

public class LoopPractice {

    public void practice1(){

        Scanner sc = new Scanner(System.in);

        // 1번 문제
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if ( num >= 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }

    } // p1 end

    public void practice2(){
        Scanner sc = new Scanner(System.in);

        // 2번 문제
        while(true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }

    } // p2 end

    public void practice3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print(num - i + " ");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }

    } // p3 end

    public void practice4(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {
                for (int i = 0; i < num; i++) {
                    System.out.print(num - i + " ");
                }
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }

    } // p4 end

    public void practice5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
            if (i < num) {
                System.out.print(i + " + ");
            }else{
                System.out.print(i);
            }
        }
        System.out.print(" = " + sum);

    } // p5 end

    public void practice6(){

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 숫자 :");
        int num1 = sc.nextInt();
        System.out.print("두 번쨰 숫자 :");
        int num2 = sc.nextInt();

        if (num1 > 0  && num2 > 0) {
            int low = (num1 < num2 ? num1 : num2);
            int high = (num1 > num2 ? num1 : num2);
            for (int i = low; i <= high; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1이상의 숫자만을 입력하세요.");
        }

    } // p6 end

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("첫 번쨰 숫자 :");
            int num1 = sc.nextInt();
            System.out.print("두 번쨰 숫자 :");
            int num2 = sc.nextInt();

            if (num1 > 0 && num2 > 0) {
                int low = (num1 < num2 ? num1 : num2);
                int high = (num1 > num2 ? num1 : num2);
                for (int i = low; i <= high; i++) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.println("1이상의 숫자만을 입력하세요.");
            }
        }

    } // p7 end

    public void practice8(){
        Scanner sc= new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = sc.nextInt();

        System.out.printf("===== %d단 =====\n", num);
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

    } // p8 end

    public void practice9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = sc.nextInt();


        if (num >= 2 && num <= 9) {
            for (int i = num; i <= 9; i++) {
                System.out.printf("===== %d단 =====\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        } else {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
        }

    } // p9 end

    public void practice10(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            if (num >= 2 && num <= 9) {
                for (int i = num; i <= 9; i++) {
                    System.out.printf("===== %d단 =====\n", i);
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d * %d = %d\n", i, j, i * j);
                    }
                }
                break;
            } else {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
            }
        }

    } // p10 end

    public void practice11(){



    } // p11 end

} // class end
