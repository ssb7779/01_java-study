package com.john.section03.etc.controller;

import java.util.Scanner;

/*
    ## break 문 
    1. 조건문, 반복문 등을 강제로 종료시킬때 사용
    2. 중첩 반복문일 경우, break가 속한 최내각 반복문만 종료됨
 */
public class BreakClass {
    public void testBasicBreak() {
        while (true) {
            int n = (int) (Math.random() * 100 + 1);
            System.out.println(n);

            if (n % 5 == 0) {
                break;
            }
        }
    }

    public void testBreakExample1() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a String: ");
            String s = sc.nextLine();
            if (s.equals("exit")) {
                break;
            }
            System.out.println("문자열: " + s);
            System.out.println("문자열의 길이: " + s.length());
        }
    }

    public void testBreakExample2() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Enter a Number(2 ~ 9): ");
            n = sc.nextInt();
            if (n >= 2 && n <= 9) {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(n + " * " + i + " = " + n * i);
                }
            }else{
                System.out.println("Wrong number. please try again");
                break;
            }
        }
    }
}
