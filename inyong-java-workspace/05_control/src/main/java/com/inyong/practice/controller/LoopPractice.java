package com.inyong.practice.controller;

import java.util.Scanner;

public class LoopPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {

        System.out.println("1이상의 숫자를 입력하세요");
        int num = sc.nextInt();

        if (num < 1) System.out.println("잘못입력하였습니다.");

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }

    }

    public void practice2() {
        while (true) {
            System.out.println("1이상의 숫자를 입력하세요");
            int num = sc.nextInt();


            if (num < 1) System.out.println("잘못입력하였습니다.");

            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        }

    }

    public void practice3() {
        System.out.println("1이상의 숫자를 입력하세요");
        int num = sc.nextInt();

        if (num < 1) System.out.println("잘못입력하였습니다.");

        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public void practice4() {

        while (true) {
            System.out.println("1이상의 숫자를 입력하세요");
            int num = sc.nextInt();

            if (num < 1) System.out.println("잘못입력하였습니다.");

            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public void practice5() {
        System.out.println("1이상의 숫자를 입력하세요");
        int num = sc.nextInt();
        if (num < 1) System.out.println("잘못입력하였습니다.");
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println(result);

    }

    public void practice6() {
        while (true) {
            System.out.println("시작하는 1이상의 숫자를 입력하세요");
            int num1 = sc.nextInt();
            if (num1 < 1) {
                System.out.println("잘못입력하였습니다.");
                break;
            }

            System.out.println("끝나는 1이상의 숫자를 입력하세요");
            int num2 = sc.nextInt();
            if (num2 < 1) {
                System.out.println("잘못입력하였습니다.");
                break;
            }

            int max = Math.max(num2, num1);
            int min = Math.min(num2, num1);

            int result = 0;
            for (int i = min; i <= max; i++) {
                result += i;
            }
            System.out.println(result);
            break;
        }

    }

    public void practice7() {
        while (true) {
            System.out.println("시작하는 1이상의 숫자를 입력하세요");
            int num1 = sc.nextInt();
            if (num1 < 1) {
                System.out.println("잘못입력하였습니다. 다시 입력하세요");
                continue;
            }

            System.out.println("끝나는 1이상의 숫자를 입력하세요");
            int num2 = sc.nextInt();
            if (num2 < 1) {
                System.out.println("잘못입력하였습니다. 다시 입력하세요");
                continue;
            }

            int max = Math.max(num2, num1);
            int min = Math.min(num2, num1);

            int result = 0;
            for (int i = min; i <= max; i++) {
                result += i;
            }
            System.out.println(result);
            break;
        }
    }

    public void practice8() {
        System.out.println("구구단 단수를 입력하세요");
        int num = sc.nextInt();

        System.out.printf("=======%d단=========\n", num);
        for (int i = 1; i < 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }

    public void practice9() {
        System.out.println("구구단 단수를 입력하세요");
        int num = sc.nextInt();
        if (num < 2 || num > 9) {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
            return;
        }
        while (num < 10) {
            System.out.printf("=======%d단=========\n", num);
            for (int i = 1; i < 10; i++) {
                System.out.println(num + "x" + i + "=" + num * i);
            }
            ++num;
        }
    }

    public void practice10() {
        int num = 0;
        while (true) {
            System.out.println("구구단 단수를 입력하세요");
            int input = sc.nextInt();

            if (input < 2 || input > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
                continue;
            }
            num = input;
            break;
        }

        while (true) {
            System.out.printf("=======%d단=========\n", num);

            for (int i = 1; i < 10; i++) {
                System.out.println(num + "x" + i + "=" + num * i);
            }

            ++num;
            if (num == 10) {
                break;
            }
        }
    }

    public void practice11() {
        System.out.println("시작숫자");
        int start = sc.nextInt();
        System.out.println("공차");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.print(start + (num * i) + " ");
        }

    }

    public void practice12() {


        while (true) {
            System.out.println("연산자 입력 + - * / %");
            String symbol = sc.next();

            if (symbol.equals("exit")) {
                break;
            }

            System.out.println("숫자1 입력");
            int num1 = sc.nextInt();

            System.out.println("숫자2 입력");
            int num2 = sc.nextInt();

            switch (symbol) {
                case "+":
                    System.out.println(num1 + num2);
                case "-":
                    System.out.println(num1 - num2);
                case "*":
                    System.out.println(num1 * num2);
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    } else {
                        System.out.println(num1 / num2);
                    }
                case "%":
                    System.out.println(num1 % num2);
                default:
                    System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
            }

        }
    }

    public void practice13() {
        System.out.println("문자열 입력");
        String str = sc.next();

        System.out.println("찾고자 하는 문자열 입력");
        String find = sc.next();

        int result = 0;

        for(int i = 0; i < str.length(); i++){
            //if(find.equals(String.valueOf(str.charAt(i))))
            if(find.charAt(0) == str.charAt(i)){
                result++;
            }
        }
        System.out.println(result);

    }

    public void practice14() {
        int count = 1;
        while (true){
            System.out.println("-------------------");
            System.out.printf("%d회 모금액: %d원", count, count * 70);

            if(count * 70 > 10000){
                System.out.printf("총 모금횟수: %d회", count);
                break;
            }
            ++count;
        }

    }


}
