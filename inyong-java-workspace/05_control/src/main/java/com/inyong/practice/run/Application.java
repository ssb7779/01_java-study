package com.inyong.practice.run;

import com.inyong.practice.controller.ConditionPractice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ConditionPractice cp = new ConditionPractice();

        System.out.println("문제 번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                cp.practice1();
                break;
            case 2:
                cp.practice2();
                break;
            case 3:
                cp.practice3();
                break;
            case 4:
                cp.practice4();
                break;
            case 5:
                cp.practice5();
                break;
            case 6:
                cp.practice6();
                break;
            case 7:
                cp.practice7();
                break;
            case 8:
                cp.practice8();
                break;
            case 9:
                cp.practice9();
                break;
            default:
                System.out.println("잘못입력했습니다.");
        }
    }
}
