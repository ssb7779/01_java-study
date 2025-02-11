package com.inyong.section03.etc.controller;

import java.util.Scanner;

public class Break {
    /*
    스위치 문을 강제 종료 시킬수 있듯이 반복문(while, for)도 가능
     */


    public void testBasicBreak() {
        /*
        매번 1~100사이의 랜덤수가 발생 되면서 출력
         */

        while (true) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.println(random);

            if (random % 5 == 0) {
                System.out.println("5의 배수임으로 종료합니다.");
                return;
            }
        }

    }

    public void testBreakExample1() {
        /*
        반복적으로 사용자에게 문자열을 입력받고
        해당 문자열과 문자열의 길이를 출력한다.
        단, 사용자가 입력한 문자열이 "exit"일 경우 즉시 종료
         */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("문자열 입력해주세요, 종료를 원하면 exit을 입력하세요");
            String str = sc.next();
            System.out.printf("글자수는 %d 입니다.\n", str.length());

            if (str.equals("exit")) {
                System.out.println("종료합니다.");
                return;
            }
        }
    }

    public void testBreakExample2() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("정수 (2~9) 입력.");
            int num = sc.nextInt();

            if (num >= 2 && num <= 9) {

                for (int su = 1; su <= 9; su++) {
                    System.out.printf("%d x %d = %d \n", num, su, num * su);
                }
                break;
            } else {
                System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
            }
        }
    }


}
