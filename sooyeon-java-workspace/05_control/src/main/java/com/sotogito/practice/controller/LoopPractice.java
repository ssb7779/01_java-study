package com.sotogito.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    Scanner sc = new Scanner(System.in);

    public void p1() {
        System.out.println("1이상의 숫자를 입력하세요 : ");
        int input = sc.nextInt();

        if (input < 1) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
    }

    public void p2() {
        while (true) {
            System.out.println("1이상의 숫자를 입력하세요 : ");
            int input = sc.nextInt();

            if (input < 1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            for (int i = 1; i <= input; i++) {
                System.out.print(i + " ");
            }
            break;
        }
    }

    public void p3() {
        System.out.println("1이상의 숫자를 입력하세요 : ");
        int input = sc.nextInt();

        if (input < 1) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        for (int i = input; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public void p4() {
        while (true) {
            System.out.println("1이상의 숫자를 입력하세요 : ");
            int input = sc.nextInt();
            if (input >= 1) {
                for (int i = input; i > 0; i--) {
                    System.out.print(i + " ");
                }
                break;
            }
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void p5() {
        System.out.println("정수를 하나 입력하세요 : ");
        int input = sc.nextInt();

        int sum = 0;
        String printout = "";
        for (int i = 1; i <= input; i++) {
            sum += i;
            printout += i;

            if (i != input) {
                printout += " + ";
            }
        }
        System.out.println(printout + " = " + sum);
    }

    public void p6() {
        System.out.println("첫 번째 숫자 :  ");
        int firstNum = sc.nextInt();

        System.out.println("두 번째 숫자 :  ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            int temporaryNum = secondNum;
            secondNum = firstNum;
            firstNum = temporaryNum;
        }

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.print(i + " ");
        }
    }

    public void p7() {
        while (true) {
            System.out.println("첫 번째 숫자 :  ");
            int firstNum = sc.nextInt();

            System.out.println("두 번째 숫자 :  ");
            int secondNum = sc.nextInt();

            if (firstNum < 1 || secondNum < 1) {
                continue;
            }

            if (firstNum > secondNum) {
                int temporaryNum = secondNum;
                secondNum = firstNum;
                firstNum = temporaryNum;
            }

            for (int i = firstNum; i <= secondNum; i++) {
                System.out.print(i + " ");
            }
            break;
        }
    }

    public void p8() {
        int dan = sc.nextInt();

        System.out.printf("=====%d단====", dan);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", dan, i, (dan * i));
        }
    }

    public void p9() {
        int dan = sc.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
            return;
        }

        for (int i = dan; i <= 9; i++) {
            System.out.printf("=====%d단====", i);

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d", i, j, (i * j));
            }
        }
    }

    public void p10() {
        while (true) {
            int dan = sc.nextInt();

            if (dan < 2 || dan > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
                continue;
            }

            for (int i = dan; i <= 9; i++) {
                System.out.printf("=====%d단====", i);

                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d", i, j, (i * j));
                }
            }
            break;
        }
    }

    public void p11() {
        System.out.println("시작 숫자 :");
        int startNum = sc.nextInt();

        System.out.println("공차 :");
        int commonDifference = sc.nextInt();

//        for(int i = 0; i<10; i++){
//            System.out.print(startNum +" ");
//            startNum +=commonDifference;
//        }

        int count = 10;
        for (int i = startNum; ; i += commonDifference) {
            System.out.print(i + " ");
            count--;
            if (count <= 0) {
                break;
            }
        }
    }

    public void p12() {
        /**
         * - 종료조건
         * 1. "exit"입력
         *
         * - 재입력 조건
         * 1. 연산자가 나누기이고, 두번쨰 정수가 0 => "0으로 나눌 수 없습니다. 다시 입력해주세요."
         * 2. 존재하지 않는 연산자
         * */
        while (true) {
            System.out.println("연산자(+, -, *, /, %) : ");
            String operator = sc.nextLine();

            if (operator.equals("exit")) { //상위 종료조건
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("정수1 : ");
            int num1 = sc.nextInt();
            //sc.nextLine(); //FIXME 없어도 됨. 마지막 nextInt에만

            System.out.println("정수2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();

            //FIXME && 가 ||보다 우선순위가 높아서 묶어줘야함
            if ((operator.equals("/") || operator.equals("%")) && num2 == 0) { //재입력1 //fixme ArithmeticException 예외 잡아줌 //FIXME %도 나누기의 결과이기 때문에 추가해야됨
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            int total = 0;
            switch (operator) {
                case "+":
                    total = num1 + num2;
                    break;
                case "-":
                    total = num1 - num2;
                    break;
                case "*":
                    total = num1 * num2;
                    break;
                case "/":
                    total = num1 / num2;
                    break;
                case "%":
                    total = num1 % num2;
                    break;
                default:
                    System.out.println("없는 연산자입니다. 다시 입력해주세요."); //재입력2
                    continue;
            }

            System.out.printf("%d %s %d = %d\n", num1, operator, num2, total);
        }
    }

    public void p13() {
        System.out.println("문자열 : ");
        String inputWord = sc.nextLine();

        System.out.println("찾고자하는 문자 : ");
        char findWord = sc.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < inputWord.length(); i++) {
            char indexChr = inputWord.charAt(i);
            if (findWord == indexChr) {
                count++;
            }
        }
        System.out.printf("포함된 갯수 : %d", count);
    }

    public void p14() {
        int fundraisingUnit = 70;
        int targetAmount = 10_000;

        System.out.println("-------------------- ");

        int totalAmount = 0;
        int count = 0;
//        for (int i = fundraisingUnit; i <= targetAmount; i+= fundraisingUnit){ //문제 : 조건이 안맞으면 그 후 계산 안함
//            count++;
//            System.out.printf("%d회 모금액 : %d원\n",count,i);

        while (totalAmount < targetAmount) { //작은 상태로 들어감 - 9940
            totalAmount += fundraisingUnit; //계산은 큰 상태에서 끝남 - 10010
            count++;
            System.out.printf("%d회 모금액 : %6d원\n", count, totalAmount);
        }

        System.out.printf("총 모금횟수 : %d", count);
        System.out.println("-------------------- ");
    }
}
