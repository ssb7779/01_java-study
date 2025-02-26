package com.younggalee.section02.try_catch_handing;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        ## 예외 처리 ##
        1. try-catch문 (예외발생 즉시 처리)
        2. throws (예외회피)

        ## try~catch 문 ##
        발생되는 예외를 직접 처리하는 예외처리 방법
        - 예외가 발생될 여지가 있는 구문을 try 블럭에 작성
        - catch 블럭에는 예외발생시 처리할 구문을 작성 : 해당 내용대로 작동
         */


        // 상황1 : 10/사용자입력값  결과 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("0이 아닌 정수 : ");
        int num = sc.nextInt();

        try{
            System.out.println(10/num);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다. ");
        }

        /*
        try 블록에서 10 / 0 연산을 시도하면 ArithmeticException 예외가 발생합니다.
        이때 JVM은 자동으로 ArithmeticException 타입의 예외 객체를 생성하고,
        이 객체를 catch 구문의 e 변수에 전달합니다.
        catch (ArithmeticException e)**에서
        ArithmeticException 타입을 확인하고,
        e라는 참조 변수를 자동으로 생성하여 예외 객체를 가리키도록 합니다.
         */

        System.out.println("프로그램을 종료합니다.");
    }
}
