package com.inyong.homework.controller;

import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in);

    public void calculator() {
        System.out.println("첫 번째 정수를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요");
        int num2 = sc.nextInt();
        System.out.println("연산자를 입력하세요");
        String operator = sc.nextLine();

        int sum = 0;

        switch (operator) {
            case "+":
                sum = num1 + num2;
            case "-":
                sum = num1 - num2;
            case "x":
                sum = num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    System.out.printf("%d / %d = 0", num1, num2);
                }
                sum = num1 / num2;

            default:
                System.out.println("연산자를 잘못 입력하셨습니다.");
        }

        System.out.println(sum);
    }

    public void totalCalculator() {
        System.out.println("첫 번째 정수를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요");
        int num2 = sc.nextInt();

        int max = 0;
        int min = 0;

        if (num1 < num2) {
            max = num2;
            min = num1;
        } else {
            max = num1;
            min = num2;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);
    }

    public void printProfile() {
        System.out.println("이름 : ");
        String name = sc.next();

        System.out.println("나이 : ");
        int age = sc.nextInt();

        System.out.println("성별 : ");
        String gender = sc.next();

        System.out.println("성격 : ");
        String personality = sc.next();

        System.out.printf("이름 : %s", name);
        System.out.printf("나이 : %d", age);
        System.out.printf("성별 : %s", gender);
        System.out.printf("성격 : %s", personality);

    }

    public void printScore() {
        System.out.println("이름 : ");
        String name = sc.next();

        System.out.println("학년 : ");
        int grade = sc.nextInt();

        System.out.println("반 : ");
        int classNumber = sc.nextInt();

        System.out.println("번 : ");
        int number = sc.nextInt();

        System.out.println("성별(M/F) : ");
        String gender = sc.next();
        String student = "";
        if (gender.charAt(0) == 'M' || gender.charAt(0) == 'm') {
            student = "남학생";
        } else if (gender.charAt(0) == 'F' || gender.charAt(0) == 'f') {
            student = "여학생";
        } else {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        System.out.println("성적 : ");
        double score = sc.nextDouble();
        char credit = 'F';

        if (score > 90) {
            credit = 'A';
        } else if (score > 80) {
            credit = 'B';
        } else if (score > 70) {
            credit = 'C';
        } else if (score > 60) {
            credit = 'D';
        }

        System.out.printf("%d학년 %d반 %d번 %s %s 점수는 %.2f점이고 %s학점입니다.", grade, classNumber, number, student, name, score, credit);
    }


    public void printStarNumber() {
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("양수가 아닙니다.");
            return;
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(i + 1);
        }
    }

    public void sumRandom() {

        int random = (int) (Math.random() * 100 + 1);
        int sum = 0;

        for (int i = 1; i <= random; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public void exceptGugu() {
        System.out.println("정수를 입력하세요");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("양수가 아닙니다.");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (i % num != 0) {
                System.out.printf("%d * %d = %d", num, i, num * i);
                System.out.println();
            }
        }
    }

    public void diceGame() {

        while (true) {
            int random1 = (int) (Math.random() * 6 + 1);
            int random2 = (int) (Math.random() * 6 + 1);
            int sumRandom = random1 + random2;

            while (true) {

                System.out.println("주사위 두 개의 합을 맞춰보세요(2~12입력) :");
                int num = sc.nextInt();

                if (num == sumRandom) {
                    System.out.println("정답입니다.");
                    break;
                } else {
                    System.out.println("틀렸습니다.");
                }
            }

            while (true) {
                System.out.println("계속 하시겠습니까? y/n");
                String answer = sc.next();

                if (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
                    break;
                } else if ((answer.charAt(0) == 'n' || answer.charAt(0) == 'N')) {
                    return;
                } else {
                    System.out.println("다시 입력해주세요");
                    continue;
                }
            }

        }
    }

    public void displayMenu() {
        System.out.println("1. 간단 계산기");
        System.out.println("2. 작은 수에서 큰 수까지 합계");
        System.out.println("3. 신상 정보 확인");
        System.out.println("4. 학생 정보 확인");
        System.out.println("5. 별과 숫자 출력");
        System.out.println("6. 난수까지의 합계");
        System.out.println("7. 구구단");
        System.out.println("8. 주사위 숫자 알아맞추기 게임");
        System.out.println("9. 프로그램 종료");
        int num = 0;

        while (true) {
            System.out.println("메뉴 번호 : ");
            num = sc.nextInt();
            if (num > 10 && num < 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
            break;
        }

        switch (num){
            case 1 : calculator();
            case 2 : totalCalculator();
            case 3 : printProfile();
            case 4 : printScore();
            case 5 : printStarNumber();
            case 6 : sumRandom();
            case 7 : exceptGugu();
            case 8 : diceGame();
            case 9 :
                System.out.println("종료합니다.");
                return;
        }
    }
}
