package com.podoseee.homework.controller;

import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in);
    //1.
    public void calculator(){
        System.out.print("첫 번째 정수 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int b = sc.nextInt();

        System.out.print("연산자(+, -, x, /) : ");
        char op = sc.next().charAt(0);
        int result = 0;

        if(op == '/' && b == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        }else {
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                        /*if(b==0){
                                System.out.print("0으로 나눌 수 없습니다.");
                        }*/ // if문 여기에 쓰지 말고 빼자.
                    break;
                default:
                    System.out.println("존재하지 않는 연산자입니다.");
                    return;
            }
        }

        System.out.printf("%d %c %d = %d", a, b, op, result);
    }

    //2.
        /*public void totalCalculator(){
                Scanner sc = new Scanner(System.in);

                System.out.print("첫 번째 정수 : ");
                int a = sc.nextInt();
                System.out.print("두 번째 정수 : ");
                int b = sc.nextInt();

        }*/
}
