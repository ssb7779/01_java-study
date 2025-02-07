package com.john.section01.conditional.run;

import com.john.section01.conditional.controller.IfClass;
import com.john.section01.conditional.controller.SwitchClass;

import java.util.Scanner;

/*
    ## 제어문
    1. 프로그램의 흐름을 바꾸고자 할 때 제시하는 구문
    2. 종류
        2.1. 조건문 => 선택적으로 구문 실행 가능
            - 특정 조건에 따라 각기 다른 구문이 실행될 수 있도록 제어할 수 있는 구문
            - 조건식의 결과는 반드시 논리값이여야됨
            - if / else if / else
        2.2. 반복문 => 반복적으로 구문 실행 가능
        2.3. 기타
 */
public class Application {
    static void IfTester(){
        IfClass condition = new IfClass();

        System.out.print("Enter condition: ");
        System.out.println("""
                1)testBasicIf
                2)testBasicElse
                3)testBasicElseIf
                4)testIfExample
                5)testIfExample2
                6)testIfExample3
                7)testNestedIfExample""");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1){
            condition.testBasicIf();
        } else if (n == 2){
            condition.testBasicElse();
        } else if (n == 3){
            condition.testBasicElseIf();
        } else if (n == 4){
            condition.testIfExample();
        } else if (n == 5){
            condition.testIfExample2();
        } else if (n == 6){
            condition.testIfExample3();
        } else if (n == 7){
            condition.testNestedIfExample();
        } else if (n == 8){
            condition.testNestedIfExample2();
        } else{
            System.out.println("Invalid input please try again");
        }
    }

    static void SwitchTester(){
        SwitchClass condition = new SwitchClass();

        System.out.print("Enter condition: ");
        System.out.println("1)testBasicSwitch\n" +
                "2)testSwitchExample1\n" +
                "3)testSwitchExample2\n" +
                "4)testSwitchExample3\n" +
                "5)testIfExample2\n" +
                "6)testIfExample3\n" +
                "7)testNestedIfExample");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        switch (n) {
            case 1:
                condition.testBasicSwitch();
                break;
            case 2:
                condition.testSwitchExample1();
                break;
            case 3:
                condition.testSwitchExample2();
                break;
            case 4:
                condition.testSwitchExample3();
                break;
            default:
                System.out.println("Invalid input. please try again");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tester: ");
        System.out.println("1)If   2)Switch");
        int tester = sc.nextInt();

        if (tester == 1){
            IfTester();
        } else if (tester == 2){
            SwitchTester();
        } else{
            System.out.println("Invalid input please try again");
        }
    }
}
