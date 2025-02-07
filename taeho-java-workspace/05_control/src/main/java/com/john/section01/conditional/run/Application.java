package com.john.section01.conditional.run;

import com.john.section01.conditional.controller.IfClass;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IfClass condition = new IfClass();

        System.out.print("Enter condition: ");
        System.out.println("1)testBasicIf" +
                "   2)testBasicElse" +
                "   3)testBasicElseIf" +
                "   4)testIfExample" +
                "   5)testIfExample2" +
                "   6)testIfExample3" +
                "   7)testNestedIfExample");
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
}
