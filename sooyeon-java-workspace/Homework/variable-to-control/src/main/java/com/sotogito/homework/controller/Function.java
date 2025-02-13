package com.sotogito.homework.controller;

import java.util.Scanner;


public class Function {
    Scanner sc = new Scanner(System.in);

    //1
    public void calculator() {
        /**
         * 연산자 종류 : + - *(X,x) /
         * <p>
         * 예외
         * 1. 나누기 + 두번째 정수가 0
         * 예외메시지를 출력하고 결과는 0을 출력한다.
         */

        System.out.println("첫 번째 정수 : ");
        int firstNum = sc.nextInt();

        System.out.println("두 번째 정수 : ");
        int secondNum = sc.nextInt();
        sc.nextLine();

        System.out.println("연산자(+, -, x, /) : ");
        String operatorStr = sc.nextLine();
        if (operatorStr.equals("X")) { //TODO 이걸빼? 한번에? 아니면 선별?
            operatorStr = operatorStr.toLowerCase();
        }
        char operator = operatorStr.charAt(0);


        int result = 0;
        if (operator == '/' && secondNum == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else { //연산자/, 두번쨰 숫자 0일때도 결과를 출력해야해서 else문 사용
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case 'x':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    result = firstNum / secondNum;
                    break;
                default:
                    System.out.println("존재하지 않는 연산자입니다.");
                    return;
            }
        }
        System.out.printf("%d %c %d = %d", firstNum, operator, secondNum, result);
    }


    //2
    public void totalCalculator() {
        System.out.println("첫 번째 정수 : ");
        int firstNum = sc.nextInt();

        System.out.println("두 번째 정수 : ");
        int secondNum = sc.nextInt();

        int min = Math.min(firstNum, secondNum);
        int max = Math.max(firstNum, secondNum);

        int sumResult = 0;
        for (int i = min; i <= max; i++) {
            sumResult += i;
        }
        System.out.printf("%d부터 %d까지의 정수들의 합 : %d", min, max, sumResult);
    }


    //3
    public void printProfile() {
        String namePrintout = "이름 :";
        String agePrintout = "나이 :";
        String genderPrintout = "성별 :";
        String characterPrintout = "성격 :";

        System.out.println(namePrintout);
        String name = sc.nextLine();

        System.out.println(agePrintout);
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println(genderPrintout);
        String gender = sc.nextLine();

        System.out.println(characterPrintout);
        String character = sc.nextLine();

        System.out.println(namePrintout + " " + name);
        System.out.println(agePrintout + " " + age);
        System.out.println(genderPrintout + " " + gender);
        System.out.println(characterPrintout + " " + character);
    }


    //4
    public void printScore() {
        String printout = "%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f점이고 %c학점입니다.";

        System.out.println("이름 : ");
        String name = sc.nextLine();
        sc.nextLine();

        System.out.println("학년 : ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.println("반 : ");
        int group = sc.nextInt();

        System.out.println("번 : ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("성별 : ");
        char gender = sc.nextLine().charAt(0);

        System.out.println("성적 : ");
        double record = sc.nextDouble();
        char unit = 'F';


        if (gender == 'F') {
            gender = '여';
        } else if (gender == 'M') {
            gender = '남';
        }

        if (record >= 90) {
            unit = 'A';
        } else if (record >= 80) {
            unit = 'B';
        } else if (record >= 70) {
            unit = 'C';
        } else if (record >= 60) {
            unit = 'D';
        }

        System.out.printf(printout,
                grade, group, number, gender, name, record, unit);
    }


    //5
    public void printStarNumber() {
        System.out.println("정수 : ");
        int layer = sc.nextInt();

        if (layer < 0) {
            System.out.println("양수가 아닙니다.");
            return;
        }

        String printout = "";
        for (int i = 0; i < layer; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
                    printout += i + 1;
                    printout += "\n";
                    break;
                }
                printout += "*";
            }
        }
        System.out.println(printout);
    }


    //6
    public void sumRandom() {
        int startValue = 1;
        int randomCount = (int) (Math.random() * 100 + startValue);

        int sum = 0;
        for (int i = startValue; i <= randomCount; i++) {
            sum += i;
        }
        System.out.printf("%d부터 %d까지의 합 : %d", startValue, randomCount, sum);
    }


    //7
    public void exceptGugu() {
        System.out.println("정수  : ");
        int dan = sc.nextInt();

        if (dan <= 0) {
            System.out.println("양수");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % dan != 0) {
                System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
            }
        }
    }

    //8
    public void diceGame() {
        /**
         * 종료조건
         * 1. 결과 출력 후 N,n
         *
         * 재입력조건
         * 1. 맞출떄까지
         *
         * 랜덤 재생성 조건
         * 1. 맞췄을 때
         */
        while (true) {
            int diceNumber = 2;
            int diceTotal = 0;

            for (int i = 0; i < diceNumber; i++) {
                diceTotal += (int) (Math.random() * 6 + 1);
            }
            System.out.println(diceTotal);

            while (true) {
                System.out.println("주사위 두 개의 합을 맞춰보세요(2~12입력) :");
                int inputSum = sc.nextInt();

                if (inputSum == diceTotal) {
                    System.out.println("정답입니다.");
                    break;
                }
                System.out.println("틀렸습니다.");
            }

            System.out.println("계속 하시겠습니까?(y/n) :");
            sc.nextLine();
            char continueWhether = sc.nextLine().toUpperCase().charAt(0);

            if (continueWhether == 'N') {
                break;
            }
        }
    }

}


