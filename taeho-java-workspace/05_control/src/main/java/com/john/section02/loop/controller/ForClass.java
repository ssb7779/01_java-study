package com.john.section02.loop.controller;

/*
    ## For 문
    1. while에 비해 가독성 좋음
    2. 반복할 값의 범위가 명확하거나 횟수가 정해져 있을 때 사용 권장
    3. for( 초기식; 조건식; 변화값;{
        반복실행구문
    }
        3.1 초기식: 반복문 실행 시 최초 한번만 실행되는 구문
        3.2 조건식: 반복문이 실행될 조건이 담기는 구문
        3.3 변화값: 반복문을 제어하는 값을 변화시키는 구문
        3.4 무한 반복으로 사용하는 경우( for ( ; ; ) )
 */

import java.util.Random;
import java.util.Scanner;

public class ForClass {
    public void testBasicFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
    }

    public void testForExample() {
        for (int i = 1; i <= 5; i++) {
            if (i <= 4) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ");
        }
    }

    public void testForExample2() {
        for (int i = 1; i <= 5; i++) {
            System.out.print((6 - i) + " ");
        }

        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public void testForExample3() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 덧셈을 구하고 싶은 숫자: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합계: %d", n, sum);
    }

    public void testForExample5() {
        int n = (int) (Math.random() * 10) + 1;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 총 합계: %d", n, sum);
    }

    public void testForExample6() {
        String s = "Hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

    public void testForExample7() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("입력한 문자열의 길이: " + s.length());
        System.out.println("입력한 문자열의 마지막 인덱스: " + (s.length() - 1));

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

    public void testForExample8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("구하려는 구구단수: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }

    }

    // 2~9단 출력
    public void testForExample9() {
        // 2 ~ 9 이므로 * 8 + 2, Math.random = 0 ~ 1.0
        int n = (int) (Math.random() * 8) + 2;

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

    public void testNestedFor() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void testNestedForExample1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        for (int i = 2; i <= 9; i++) {
            System.out.println("=== " + i + "단 ===");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, j * i);
            }
            System.out.println();
        }
    }

    public void testNestedForExample4() {
        for (int i = 1; i <= 8; i++) {
            System.out.printf("< %d일차 수업 > \n", i);
            for (int j = 1; j <= 8; j++) {
                System.out.println(j + "교시");
            }
            System.out.println();
        }
    }

    public void testInfiniteLoop() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n======== Menu ========");
        System.out.println("1. 1부터 5까지 출력"); // testForExample1()
        System.out.println("2. 1부터 입력값 까지의 합"); // testForExample4()
        System.out.println("3. 특정 문자열의 각 문자 확인"); // testForExample7()
        System.out.println("0. 프로그램 종료"); // testForExample7()
        System.out.print(">> 메뉴 선틱: ");

        int n = sc.nextInt();

        switch (n){
            case 1: testForExample(); break;
            case 2: testForExample4(); break;
            case 3: testForExample7(); break;
            case 0:
                System.out.println("프로그램을 종료합니다");
                return;
            default:
                System.out.println("메뉴를 잘못 선택하셨습니다. 재선택하세요");
                testInfiniteLoop();
        }
    }
}
