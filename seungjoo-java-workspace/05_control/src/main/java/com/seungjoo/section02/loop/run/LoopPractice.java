package com.seungjoo.section02.loop.run;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1이상의 숫자를 입력하세요:");
        int num = sc.nextInt();
        if(num >=1 ) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
        System.out.println();



    }
    public void practice2() {


        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1이상의 숫자를 입력하세요:");
            int num = sc.nextInt();

            if (num >= 1) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");

                }
                System.out.println();
                break;
            } else if (num <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                continue;
            }


        }
    }
    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1이상의 숫자를 입력하세요");
        int num = sc.nextInt();
        if (num >= 1) {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }












    }
    public void practice4() {


        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1이상의 숫자를 입력하세요:");
            int num = sc.nextInt();

            if (num >= 1) {
                for (int i = num; i >= 1; i--) {
                    System.out.print(i + " ");

                }
                System.out.println();
                break;
            } else if (num <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                continue;
            }
        }






    }
    public void practice5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            if(i < num)
                System.out.print(i+ " + ");
            else if(i == num){
                System.out.print(i);
            }
        }
        System.out.println(" = " + sum);

    }
    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자:");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("두 번째 숫자:");
        int num2 = sc.nextInt();
        int temp = 0;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 < 1 || num2 < 1) {
            System.out.println("1이상의 숫자만을 입력해주세요.");
        } else if (num1 >= 1 && num2 >= 1) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }

    }





    public void practice7() {

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 숫자:");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("두 번째 숫자:");
            int num2 = sc.nextInt();
            int temp = 0;

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num1 < 1 || num2 < 1) {
                System.out.println("1이상의 숫자만을 입력해주세요.");

            } else if (num1 >= 1 && num2 >= 1) {
                for (int i = num1; i <= num2; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
        }






    }
    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자:");
        int num = sc.nextInt();

        System.out.println("===== " + num + "단 =====");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = "+ num*i);
        }

    }
    public void practice9() {

            Scanner sc = new Scanner(System.in);
            System.out.println("숫자:");
            int num = sc.nextInt();
            if (num < 2 || num > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");

            } else {

                for (int j = num; j <= 9; j++) {
                    System.out.println("===== " + j + "단 =====");
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(j + " * " + i + " = " + j * i);
                    }
                }

            }






    }
    public void practice10() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자:");
            int num = sc.nextInt();
            if (num < 2 || num > 9) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");

            } else {

                for (int j = num; j <= 9; j++) {
                    System.out.println("===== " + j + "단 =====");
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(j + " * " + i + " = " + j * i);
                    }
                }
                break;
            }

        }


    }
    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 숫자:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("공차:");
        int d = sc.nextInt();
        for(int i = 1; i <10; i++){
            System.out.print(num + " ");
            num += d;
        }
    }
    public void practice12() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("연산자(+, -, *, /, %) :");
            String str = sc.nextLine();

            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("정수1:");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.println("정수2:");
            int num2 = sc.nextInt();
            if(num2 == 0){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            int sum = 0;
            switch (str) {
                case "+":
                    sum = num1 + num2;
                    System.out.println(num1 + " " + str + " " + num2 + " = " + sum);
                    break;
                case "-":
                    sum = num1 - num2;
                    System.out.println(num1 + " " + str + " " + num2 + " = " + sum);
                    break;
                case "*":
                    sum = num1 * num2;
                    System.out.println(num1 + " " + str + " " + num2 + " = " + sum);
                    break;
                case "/":
                    sum = num1 / num2;
                    System.out.println(num1 + " " + str + " " + num2 + " = " + sum);
                    break;
                default:
                    System.out.println("없는 연산자입니다. 다시 입력해주세요.");
                    break;
            }


        }
    }
    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열:");
        String str = sc.nextLine();
        System.out.println("찾고자 하는 문자:");
        String str1 = sc.nextLine();
        int total = 0;

        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == str1.charAt(0)){
                total++;
            }
        }
        System.out.println("포함된 갯수:" + total);



    }
    public void practice14() {
       int i = 1;
       int cnt = 0;
        int sum = 70;
        while(sum < 10000){
            System.out.printf("%d회 모금액: %5d", i,sum);
            i++;
            sum += 70;
            cnt++;
            System.out.println();

        }
        cnt++;
        System.out.printf("%d회 모금액: %5d원", i,sum);
        System.out.println();
        System.out.println("총 모금횟수: " + cnt +"회");
    }




}
