package com.seongho.section03.etc.controller;

import java.util.Scanner;

public class Break {

    /*
    switch(case) 문 종료시키듯 while for문도 가능
    주로 반복문 안에서 반복문이 종료될 조건과 함께 사용
    주의
        중첩 반복문이면 break가 속해있는 최근접의 반복문만 종료
     */
    public void testBB() {
        /*
        매번 1~100사이의 랜덤수 발생
        발생된 랜덤값이 5의 배수면 종료
         */
        while (true) {

            int ranNum = (int) (Math.random() * 100 + 1);
            System.out.println(ranNum);
            if (ranNum % 5 == 0) {
                break;
            }
        }
    }

    public void testBB2() {
        /*
        반복적으로 문자 입력받고
        해당 문자열과 문자열의 길이 출력
        exit일 경우 반복 종료
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("문자입력:");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println("입력:" + str + "길이:" + str.length());


        }
    }

    /*
    사용자에게 2~9사이의 정수를 입력받아 해당 단을 출력
    잘못입력시 다시 입력 받기
    제대로 입력시 출력 후 종료
     */
    public void testBB3() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("정수(2~9)입력");
            int dan = sc.nextInt();

            if (dan >= 2 && dan <= 9) {
                for (int su = 1; su < 10; su++) {
                    System.out.printf("%d x %d = %d", dan, su, dan * su);
                }
                break;
            } else {
                System.out.println("다시입력");
            }


        }
    }
}
