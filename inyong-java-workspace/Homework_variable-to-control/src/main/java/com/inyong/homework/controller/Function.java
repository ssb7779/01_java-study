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
}
