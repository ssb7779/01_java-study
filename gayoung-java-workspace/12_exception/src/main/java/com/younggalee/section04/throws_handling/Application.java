package com.younggalee.section04.throws_handling;

import com.younggalee.section05.throw_exception.ThrowTest;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ThrowTest tt = new ThrowTest();
//        tt.exceptionCase();// 작성한 곳에서 throws로 넘겼기 때문에 여기서 처리하라고 뜸
        // 마지막까지 throws로 회피하면 JVM이 회피함.

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            tt.checkAge(age);
            System.out.print("등급 입력 : ");
            char grade = sc.next().charAt(0);
            tt.checkAge(age);
        } catch (Exception e){
            e.printStackTrace(); // 내가 만든 예외클래스 확인가능
            System.out.println("예외발생 : " + e.getClass().getName());
        }



    }
}
