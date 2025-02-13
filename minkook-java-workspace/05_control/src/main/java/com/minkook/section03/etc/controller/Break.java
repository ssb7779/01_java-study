package com.minkook.section03.etc.controller;

import java.util.Scanner;

public class Break {
    public void testBasicBreak(){
        /*
            매번 1~100사이의 랜덤수가 발생되면서 출력됨
            이때 발생된 랜덤값이 5의 배수라면 반복이 종료되도록
         */
        double a = Math.random() * 100 + 1;
        int num = (int)a;

        while(num >0){
            num++;
            System.out.println(num);

            if(num % 5 == 0){
                break;
            }
        }
    }

    public void testBreakExample1(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("문자열 입력(종료하고 싶다면 exit를 : ");
            String str = sc.nextLine();
            System.out.println("문자열: " + str);
            if(str.equals("exit")){
                System.out.println("종료");
                break;
            }
            System.out.println("문자열의 수는: " + str.length());

        }
    }

    public void testBreakExample2(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("정수(2에서부터9까지 정수 입력): ");
            int dan = sc.nextInt();
            if(dan >=2 && dan <=9){
                for(int i = 1; i<=9;  i++){
                    System.out.printf("%d x %d = %d\n",dan,i,(dan * i));
                }
                break;
            } else{
                System.out.println("잘못입력하셨습니다.");
            }

        }
    }
}
