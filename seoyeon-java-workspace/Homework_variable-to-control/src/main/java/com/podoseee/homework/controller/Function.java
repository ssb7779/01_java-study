package com.podoseee.homework.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Function {
        public void calculator(){
                Scanner sc = new Scanner(System.in);

                System.out.print("첫 번째 정수 : ");
                int a = sc.nextInt();
                System.out.print("두 번째 정수 : ");
                int b = sc.nextInt();
                System.out.print("연산자(+, -, x, /) : ");
                char op = sc.next().charAt(0);
                int result = 0;

                switch(op){
                        case '+': result = a+b;
                                break;
                        case '-': result = a-b;
                                break;
                        case '*': result = a*b;
                                break;
                        case '/': result = a/b;
                        if(b==0){
                                System.out.print("0으로 나눌 수 없습니다.");
                        }
                                break;
                        default :
                                return;
                }

                System.out.printf("%d %c %d = %d", a, b, op, result);
        }

        public void totalCalculator(){
                Scanner sc = new Scanner(System.in);

                System.out.print("첫 번째 정수 : ");
                int a = sc.nextInt();
                System.out.print("두 번째 정수 : ");
                int b = sc.nextInt();

        }
}