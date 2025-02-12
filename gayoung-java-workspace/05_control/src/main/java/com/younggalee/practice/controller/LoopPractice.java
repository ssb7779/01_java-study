package com.younggalee.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println();
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {

            for (int i = num; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {

                for (int i = num; i > 0; i--) {
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
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        System.out.print("1");
        int sum = 1;

        for (int i = 2; i <= num; i++) {
            System.out.print(" + " + i);
            sum += i;
        }
        System.out.println(" = " + sum);
    }

    public void practice6() {

        /*
        int max = 0;
        int min = 0;

        max = Math.max(num1,num2);
        min = Math.max(num1,num2); //Math 클래스에 min메소드 호출 시 int형 *두 개* 전달하면 둘중 작은 수(int)를 돌려줌
        //이도 마찬가지로 static이기 때문에 별도의 선언없이 사용가능

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("1이상의 숫자만을 입력해주세요.");
        } else if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");
            }
        } else if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i + " ");
            }
        } else {
            System.out.println("사이값이 없습니다.");
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("첫 번째 숫자 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            int num2 = sc.nextInt();

            if (num1 <= 0 || num2 <= 0) {
                System.out.println("1이상의 숫자만을 입력해주세요.\n");
            } else if (num1 > num2) {
                for (int i = num2; i <= num1; i++) {
                    System.out.print(i + " ");
                }
                break;
            } else if (num1 < num2) {
                for (int i = num1; i <= num2; i++) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.println("사이값이 없습니다.");
                break;
            }
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = sc.nextInt();

        System.out.printf("===== %d단 =====\n", num);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int startNum = sc.nextInt();

        if (startNum < 2 || startNum > 9) {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
        } else {
            for (int i = startNum; i <= 9; i++) {
                System.out.printf("===== %d단 =====\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        }
    }

    public void practice10() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("숫자 : ");
            int startNum = sc.nextInt();
            if (startNum < 2 || startNum > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.\n");
            } else { // if에 더 주류의 조건, 실행문 담기
                for (int i = startNum; i <= 9; i++) {
                    System.out.printf("===== %d단 =====\n", i);
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d * %d = %d\n", i, j, i * j);
                    }
                }
                break;
            }
        }
    }
    public void practice11(){
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        int start = sc.nextInt();
        System.out.print("공차 : ");
        int num = sc.nextInt();

        for (int i=0; i<10; i++){
            System.out.print(start + num*i);
            System.out.print(" ");
            //System.out.print(start + " ");
            //start += num;
        }
    }

    public void practice12() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("연산자(+, -, *, /, %) : ");
            String operator = sc.nextLine();

            if (operator.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("정수1 : ");
            int num1 = sc.nextInt();
            System.out.print("정수2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();

            if((operator.equals("/") || operator.equals("%")) && num2 == 0){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            int result = 0;
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                case "%": result = num1 * num2; break;
                default:
                    System.out.println("없는 연산자입니다. 다시 입력해주세요.");
            }
            System.out.printf("%d %s %d = %d\n\n", num1, operator, num2, result);
        }
    }

    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String input = sc.nextLine();
        System.out.print("찾고자하는 문자 : ");
        char ch = sc.next().charAt(0);
        int count = 0;

        for(int i=0; i<input.length();i++){
            if(input.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("포함된 갯수 : "  + count);

    }

    public void practice14() {
        int Amount = 0;
        int count = 0;

        System.out.println("----------------------");

        while(Amount <= 10000){
            Amount += 70;
            count++;
            System.out.printf("%3d회 모금액 : %5d원\n", count, Amount);
        }
        System.out.println();
        System.out.printf("총 모금횟수 : %d회\n", count);
        System.out.println("----------------------");
    }


}

















