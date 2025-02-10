package com.ibe6.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        /*
        사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
        단, 입력한 수는 1보다 크거나 같아야 합니다.
        만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요: ");
        int inputNum = sc.nextInt();

        if (1 <= inputNum) {
            int num = 1;
            while (num <= inputNum) {
                System.out.print(num++ + " ");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int inputNum = sc.nextInt();

            if (1 <= inputNum) {
                int num = 1;
                while (num <= inputNum) {
                    System.out.print(num++ + " ");
                }
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int inputNum = sc.nextInt();
            if (inputNum >= 1) {
                for (int i = 1; i <= inputNum; i++) {
                }
                System.out.println();
                for (int i = inputNum; i >= 1; i--) {
                    System.out.print(i + " ");
                }

                System.out.println();
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요: ");
            int inputNum = sc.nextInt();
            if (inputNum >= 1) {
                for (int i = 1; i <= inputNum; i++) {
                }
                System.out.println();
                for (int i = inputNum; i >= 1; i--) {
                    System.out.print(i + " ");
                }

                System.out.println();
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            if (i < num) {
                System.out.print(i + " + ");
            } else {
                System.out.println(num + " = " + sum);
            }
        }
    }

    public void practice7() {
        /*
        사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
        만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();
        for(int i=1; i< )


    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int dan = sc.nextInt();
        for (int su = 1; su <= 9; su++) {
            System.out.printf("%d x %d = %d\n", dan, su, dan * su);
        }

    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자(2~9): ");
            int dan = sc.nextInt();

            if (dan >= 2 && dan <= 9) {
                System.out.println("===== " + dan + "단 =====");
                for (int su = 1; su <= 9; su++) {
                    System.out.printf("%d x %d = %d\n", dan, su, dan * su);
                }
                break;
            } else {
                System.out.println("2~9사이의 숫자만 입력해주세요.");
            }
        }
    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자(2~9): ");
            int dan = sc.nextInt();

            if (dan >= 2 && dan <= 9) {
                System.out.println("===== " + dan + "단 =====");
                for (int su = 1; su <= 9; su++) {
                    System.out.printf("%d x %d = %d\n", dan, su, dan * su);
                }
                break;
            } else {
                System.out.println("2~9사이의 숫자만 입력해주세요.");
            }
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자: ");
        int startNum = sc.nextInt();
        System.out.print("공차: ");
        int blankNum = sc.nextInt();
        for(int i=1; i<10; i++){
            System.out.print(startNum + " ");
            startNum += blankNum;
        }
    }

    public void practice12(){

    }



}