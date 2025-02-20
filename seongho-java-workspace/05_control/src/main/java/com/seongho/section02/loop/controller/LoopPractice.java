package com.seongho.section02.loop.controller;

import java.util.Scanner;

public class LoopPractice {
    public void pr1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1이상 숫자 입력:");
        int num = sc.nextInt();
        if (num >= 1) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");

            }

        } else {
            System.out.println("잘못입력");
        }

    }

    public void pr2() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1이상 숫자 입력:");
            int num = sc.nextInt();
            if (num >= 1) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");

                }
                break;

            } else {
                System.out.println("잘못입력");

            }
            continue;


        }

    }

    public void pr3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상 숫자 입력:");
        int num = sc.nextInt();

        if (num >= 1) {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }

        } else {
            System.out.println("잘못입력");
        }
    }

    public void pr4() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("1이상 숫자 입력:");
            int num = sc.nextInt();

            if (num >= 1) {
                for (int i = num; i >= 1; i--) {
                    System.out.print(i + " ");
                }
                break;

            } else {
                System.out.println("잘못입력");
            }
            continue;
        }

    }

    public void pr5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나 입력:");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;

            System.out.print(i + " + ");
            if (i == num) {
                System.out.print(" = " + sum);
            }
        }

    }

    public void pr6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자:");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자:");
        int num2 = sc.nextInt();
        if (num1 >= 1 && num2 >= 1) {
            if (num1 > num2) {
                for (int i = num2; i <= num1; i++) {
                    System.out.print(i + " ");

                }
            } else {
                for (int i = num1; i <= num2; i++) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("1이상 숫자 입력해주세요");

        }
    }

    public void pr7() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자:");
            int num1 = sc.nextInt();

            System.out.print("두번째 숫자:");
            int num2 = sc.nextInt();
            if (num1 >= 1 && num2 >= 1) {
                if (num1 > num2) {
                    for (int i = num2; i <= num1; i++) {
                        System.out.print(i + " ");


                    }break;
                } else {
                    for (int i = num1; i <= num2; i++) {
                        System.out.print(i + " ");
                    }break;
                }
            } else {
                System.out.println("1이상 숫자 입력해주세요");

            }
        }
    }
    public void pr8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자:");
        int num = sc.nextInt();

        System.out.println("====="+ num +"=======");
        for (int i = 1; i<10 ; i++){
            System.out.println(num +"x"+ i+"=" +i*num);
        }
    }
    public void pr9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자:");
        int num=sc.nextInt();
        if (num >=2 && num<=9){
            for (int j = num; j<10;j++) {
                for (int i = 1; i < 10; i++) {
                    System.out.println(num + "x" + i + "=" + i * num);
                }
            }
        }
    }
}