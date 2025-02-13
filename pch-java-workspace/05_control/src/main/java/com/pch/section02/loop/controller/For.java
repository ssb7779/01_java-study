package com.pch.section02.loop.controller;

import java.util.Scanner;

public class For {

    public void testBasicFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void testForExample1() {
        /*
            1부터 5까지 1씩 증가되는 값 출력
         */
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }
    }

    public void testForExample2() {
        /*
            역순 출력
         */
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public void testForExample3() {
        int sum = 0;
        for (int i = 0; i < 11; i++) sum += i;
        System.out.println(sum);
    }

    public void testForExample4() {
        /*
            1 ~ 사용자 입력 양수까지의 합계 계산하기
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample5() {
        int rand = (int) (Math.random() * 10 + 1);
        System.out.println(rand);
    }

    public void testForExample6() {
        System.out.println("구구단을 외자~");
        System.out.println("몇단까지??");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N + "단까지~~~");

        for (int i = 1; i < N; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < N; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void testNestedForExample2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) System.out.print(i + 1);
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        System.out.println("구구단");
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void testNestedForExample4() {
        for (int i = 1; i < 9; i++) {
            System.out.println("< " + i + "일차 수업 >");
            for (int j = 1; j < 9; j++) {
                System.out.println(j + "교시");
            }
            System.out.println();
        }
    }

    public void testInfinityLoop() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========Menu=========");
        System.out.println("1. 1부터 5까지 출력");
        System.out.println("2. 1부터 특정 수까지의 총 합계");
        System.out.println("3. 특정문자열의 각 자리 문자");
        System.out.println("0. 종료");
        System.out.print(">> 메뉴 선택 : ");
        int menu = -1;

        while (menu != 0) {
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    testForExample1();
                    break;
                case 2:
                    testForExample2();
                    break;
                case 3:
                    testForExample3();
                    break;
                default:
                    System.out.println("잘못된 메뉴 입력");
            }
        }

    }

}