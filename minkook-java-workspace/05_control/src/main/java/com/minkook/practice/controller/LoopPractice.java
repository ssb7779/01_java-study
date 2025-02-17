package com.minkook.practice.controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopPractice {
    public void practice1(){
        System.out.print("1이상의 숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 1){
            System.out.println("잘못입력했습니다.");
        }
        for(int i = 1; i<=num; i++){
            System.out.print(i + " ");


        }
    }

    public void practice2(){
        System.out.print("1이상의 숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num < 1){
                System.out.print("잘못입력했습니다. 다시입력해주세요");
            } else {
                for(int i = 1; i<=num; i++){
                    System.out.print(i + " ");

                }
                break;
            }

        }

    }

    public void practice3(){
        System.out.print("1이상의 숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 1){
            System.out.println("잘못입력했습니다.");
        }
        for(int i = num; i>=1; i--){
            System.out.print(i + " ");

        }


    }

    public void practice4(){

        while(true){
            System.out.print("1이상의 숫자를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num < 1) {
                System.out.println("잘못입력했습니다. 다시입력해주세요");
            } else{
                for(int i = num; i>=1; i--){
                    System.out.print(i + " ");

                }
                break;
            }


        }
    }

    public void practice5() {
        System.out.print("정수를 하나 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i =0; i<num; i++){
            sum += (i+1);
            System.out.printf("%d"  ,i+1);
            if(i == num-1){
                System.out.print("=");
            }else {
                System.out.print("+");
            }
        }
        System.out.printf("%d",sum);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자: ");
        int num2 = sc.nextInt();

        if(num1 == 0 || num2 ==0){
            System.out.println("1이상의 숫자만을 입력해주세요.");
        }

        int minNum = (num1 < num2 ? num1:num2);
        int maxNum = (num1 > num2 ? num1:num2);

        for(int i = minNum; i<=maxNum; i++){
            System.out.print(i + " ");
        }

    }

    public void practice7() {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 숫자: ");
            int num1 = sc.nextInt();

            System.out.print("두번째 숫자: ");
            int num2 = sc.nextInt();

            if(num1 == 0 || num2 ==0){
                System.out.println("1이상의 숫자만을 입력해주세요.");
            } else{
                int minNum = (num1 < num2 ? num1:num2);
                int maxNum = (num1 > num2 ? num1:num2);

                for(int i = minNum; i<=maxNum; i++){
                    System.out.print(i + " ");
                }
                break;
            }


        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int num = sc.nextInt();
        System.out.println("====="+num+"단=====");
        int dan = num;
        for(int su = 1; su<=9; su++){
            System.out.printf("%d x %d = %d\n",dan,su,(dan*su));
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자: ");
        int num = sc.nextInt();
        if(num >= 10 || num < 1) {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
        }
        for(int i = num; i < 10; i++) {
            System.out.println("====="+num+"단=====");
            for(int j = 1; j<=9; j++){
                System.out.printf("%d x %d = %d\n",num,j,(num*j));
            }
            num++;
        }

    }

    public void practice10() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자: ");
            int num = sc.nextInt();
            if(num >= 10 || num < 1) {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
            } else{
                for (int i = num; i < 10; i++) {
                    System.out.println("=====" + num + "단=====");
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d x %d = %d\n", num, j, (num * j));
                    }

                    num++;

                }
                break;
            }
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작숫자: ");

        int num = sc.nextInt();

        System.out.print("공차: ");
        int gong = sc.nextInt();
        int cnt = 0;
        for(int i = num; i<=1000; i+=gong){
            System.out.print(i + " ");
            cnt+=1;
            if(cnt == 10){
               break;
            }
        }
    }

    public void practice12() {


        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("연산자(+, -, *, /, %): ");
            String op = sc.nextLine();

            if(op.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }


            System.out.print("정수1: ");
            int n1 = sc.nextInt();

            System.out.print("정수2: ");
            int n2 = sc.nextInt();
            int res = 0;

            if(op.charAt(0) == '/' && n2 == 0){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            }

            switch (op.charAt(0)){
                case '+':
                    res = n1 + n2;
                    break;
                case '-':
                    res = n1 - n2;
                    break;
                case '*':
                    res = n1 * n2;
                    break;
                case '/':
                    res = n1 / n2;
                    break;
                case '%':
                    res = n1 % n2;
                    break;

                default:
                    System.out.println("없는 연산자입니다. 다시 입력해주세요.");
            }
            System.out.println(n1 + " " + op + " " + n2 + " = " + res);
        }
    }

    public void practice13() {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열: ");
        String word = sc.nextLine();

        System.out.print("찾고자하는 문자:");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("포함된 갯수 : " + count);

    }

    public void practice14() {
        int i = 0;
        int donate = 0;
        while(donate <= 10000){
            i++;
            donate += 70;
            System.out.print(i + "회 모금액: " +donate);
            System.out.println();
        }
        System.out.println("총 모금횟수: " + i);

    }

    public void star1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        for(int i = num; i >= 1; i--) {
            System.out.println();
            for(int j = i; j <= num; j++){
                System.out.print("*");
            }
        }
    }

    public void star2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println();
            for(int j = num; j >= i; j--){
                System.out.print("*");
            }
        }
    }

    public void star3() {
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 10; j++){
                if(i == 0 || j == 0){
                    System.out.print("*");
                }else if(i == 4 || j == 0){
                    System.out.print("*");
                }else if(j == 9){
                    System.out.print("        *");
                }
            }
        }
    }

    public void star4() {
        //위쪽 삼각형
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();

        }
        //아래쪽 삼각형
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }

    public void star5() {
        //위쪽 삼각형
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        //아래쪽 삼각형
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
