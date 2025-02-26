package com.podoseee.section01.exception;

import java.util.Scanner;

public class Application1 {
    /*
           ## 오류(Error) ##

           ## 예외(Exception) ##

        */
    public static void main(String[] args) {

        // 예외상황1. 10/사용자입력값 결과 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("0이 아닌 정수 : ");
        int num = sc.nextInt();

        System.out.println("나눗셈 결과 : " + 10 / num); // ArithmeticException 발생 가능

        System.out.println("프로그램을 종료합니다.");

    }
}
