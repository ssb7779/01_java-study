package com.podoseee.section03.etc.controller;

import java.util.Scanner;

public class Break {
    /*
        ## break문 ##
        1. break문으로 switch문을 종료시킬수 있듯이
           while문이나 for문 같은 반복문에서도 반복문을 강제로 종료시킬 수 있음
        2. 주로 반복문 안에서 반복문이 종료될 조건과 함께 사용
        3. 유의사항
           중첩 반복문일 경우 break문이 속해있는 최근접의 반복문만 종료됨

     */

    public void testBasicBreak(){
        /*
            매번 1~100사이의 랜덤수가 발생되면서 출력됨
            이때 발생된 랜덤값이 5의 배수일 경우 반복이 종료되도록 하시오.
         */

        while(true){
            int random = (int)(Math.random() * 100 + 1);
            System.out.println(random);

            if(random % 5 == 0){
                break;
            }
        }
    }

    public void testBreakExample1(){
        /*
            반복적으로 사용자에게 문자열을 입력받고
            해당 문자열과 문자열의 길이를 출력한다.
            단, 사용자가 입력한 문자열이 "exit"일 경우 그 즉시 반복이 종료되도록 하시오.
         */

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("문자열 입력(종료하고 싶다면 exit을 입력) : ");
            String str = sc.nextLine();

            if(str.equals("exit")){
                break;
            }
            System.out.println(str + "의 글자수는 " + str.length() + "입니다");

        }
    }

    public void testBreakExample2() {
        /*
            사용자에게 2~9사이의 정수를 입력받아 해당 단을 출력하는 프로그램 만들기.
            이때 잘못된 값을 입력했을 경우 다시 입력받도록,
            제대로 입력했을 경우 해당 단 출력하고 프로그램 종료
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("정수(2~9) 입력 : ");
            int dan = sc.nextInt();

            if (dan >= 2 && dan <= 9) { // 정상입력
                for (int su = 1; su <= 9; su++) {
                    System.out.printf("%d X %d = %d\n", dan, su, dan * su);
                }
                break;
            } else { // 잘못입력
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
