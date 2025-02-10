package com.sotogito.section03.etc.controller;

import java.util.Scanner;

public class Break {
    /**
     * ## break문
     * 1. switch, while, for문 종료 가능
     * 2. 종료될 조건을 갖는다.
     * 3. 하위의 반복문부터 종료
     * 4.
     */

    public void testBasicBreak() {
        /**
         * 1~100사이 랜덤수가 발생되며 출력
         * 만약 5의 배수일 경우 종료
         */

        while (true) {
            int randomNum = (int) (Math.random() * 100 + 1);
            System.out.println(randomNum);
            if (randomNum % 5 == 0) {
                break;
            }
        }
    }

    public void testBreakExample1() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("문자열 입력(종료-exit) : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            System.out.println(input.length());
        }
    }

    public void testBreakExample() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1~9사이의 정수 : ");
            int input = sc.nextInt();

            if (input >= 1 && input <= 9) {
                for (int i = 1; i <= 9; i++) {
                    System.out.printf("%d x %d = %d\n", input, i, (input * i));
                }
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
