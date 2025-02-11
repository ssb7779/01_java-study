package com.seungjoo.section03.etc.controller;

import java.util.Scanner;

public class LoopPractice {

    public void star1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력:");
        int num = sc.nextInt();


        for(int i = 1; i<=num; i++) {
            int cnt = 0;
            while (cnt != i) {

                System.out.print("*");
                cnt++;
            }
            System.out.println();
        }
    }
    public void star2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력:");
        int num = sc.nextInt();

        for(int i = num; i<=1; i--) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star3() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        for(int j = 1; j<=3; j++) {
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                if (i == 1 || i == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }



    }
    public void star4() {
        for (int i = 1; i <= 9; i+= 2) {
            for(int j = 1; j<=(9-i)/2; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++) {


                System.out.print(k);
            }
            for(int a = 1; a<=(9-i)/2; a++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        for(int i = 7; i >= 1; i-=2) {
            for(int j = 1; j<=(9-i)/2; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++) {
                System.out.print(k);
            }
            for(int a = 1; a<=(9-i)/2; a++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
    public void star5() {

                int num = 5;
                for (int i = 0; i < num; i++) {

                    for (int j = 0; j < num; j++) {

                        if (i == 0 && j == 2 || i == 1 && (j == 1 || j == 3) || i == 2 && (j == 0 || j == 4) ||
                                i == 3 && (j == 1 || j == 3) || i == 4 && j == 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();


        }

    }
















}
