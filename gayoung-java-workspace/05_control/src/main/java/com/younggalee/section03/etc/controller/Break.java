package com.younggalee.section03.etc.controller;
import java.util.Scanner;

public class Break {
    /* break문
        1. break 문으로 switch 문을 종료시킬 수 있듯이
           while이나 for문 같은 반복문을 강제로 종료시킬 수 있다.
        2. 주로 반복문 안에서 반복문이 종료될 조건과 함께 사용
        3. 유의사항
           ㄴ 중첩 반복문일 경우, break문이 속해있는 최근접의 반복문만 종료됨.

         */
    public void testBasicBreak(){
        /*
        매번 1~100사이의 랜덤수가 발생되면서 출력됨.
        이때 발생된 랜덤값이 5의 배수일 경우 반복이 종료되도록 하시오
         */


        while(true){
            int num = (int)(Math.random() * 100 + 1);
            if (num % 5 == 0){
                break;
            }
            System.out.println(num);
        }
    }

    public void testBreakExample1(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("문자열을 입력하세요 (종료하고 싶다면 exit 입력)");
            String userMessage = sc.nextLine();

            if (userMessage.equals("exit")) {
                break;
            }

            System.out.printf("%s의 글자수는 %d입니다.", userMessage, userMessage.length());
        }
    }

    public void testBreakExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 2~9 입력: ");
        int dan = sc.nextInt();

        while (true) {
            if (dan >= 2 && dan <= 9) {
                for (int su = 1; su <= 9; su++) {
                    System.out.printf("%d X %d = %d\n", dan, su, dan * su);
                }
                break;
            } else {
                System.out.println("잘못입력함. 다시 ㄱㄱ");
            }
        }
    }
}
