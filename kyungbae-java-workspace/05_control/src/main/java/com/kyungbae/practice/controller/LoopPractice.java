package com.kyungbae.practice.controller;

import java.util.Scanner;

public class LoopPractice {

    public void practice1(){

        Scanner sc = new Scanner(System.in);

        // 1번 문제
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if ( num >= 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }

    } // p1 end

    public void practice2(){
        Scanner sc = new Scanner(System.in);

        // 2번 문제
        while(true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    System.out.print(i + " ");
                }
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
        }

    } // p2 end

    public void practice3(){
        Scanner sc = new Scanner(System.in);

        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print(num - i + " ");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }

    } // p3 end

    public void practice4(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num = sc.nextInt();

            if (num > 0) {
                for (int i = 0; i < num; i++) {
                    System.out.print(num - i + " ");
                }
                break;
            }
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }

    } // p4 end

    public void practice5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
            if (i < num) {
                System.out.print(i + " + ");
            }else{
                System.out.print(i);
            }
        }
        System.out.print(" = " + sum);

    } // p5 end

    public void practice6(){

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 숫자 :");
        int num1 = sc.nextInt();
        System.out.print("두 번쨰 숫자 :");
        int num2 = sc.nextInt();

        if (num1 > 0  && num2 > 0) {
            int low = (num1 < num2 ? num1 : num2);
            int high = (num1 > num2 ? num1 : num2);
            for (int i = low; i <= high; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1이상의 숫자만을 입력하세요.");
        }

    } // p6 end

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("첫 번쨰 숫자 :");
            int num1 = sc.nextInt();
            System.out.print("두 번쨰 숫자 :");
            int num2 = sc.nextInt();

            if (num1 > 0 && num2 > 0) {
                int low = (num1 < num2 ? num1 : num2);
                int high = (num1 > num2 ? num1 : num2);
                for (int i = low; i <= high; i++) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                System.out.println("1이상의 숫자만을 입력하세요.");
            }
        }

    } // p7 end

    public void practice8(){
        Scanner sc= new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = sc.nextInt();

        System.out.printf("===== %d단 =====\n", num);
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

    } // p8 end

    public void practice9(){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = sc.nextInt();


        if (num >= 2 && num <= 9) {
            for (int i = num; i <= 9; i++) {
                System.out.printf("===== %d단 =====\n", i);
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d * %d = %d\n", i, j, i * j);
                }
            }
        } else {
            System.out.println("2~9 사이의 숫자만 입력해주세요.");
        }

    } // p9 end

    public void practice10(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자 : ");
            int num = sc.nextInt();

            if (num >= 2 && num <= 9) {
                for (int i = num; i <= 9; i++) {
                    System.out.printf("===== %d단 =====\n", i);
                    for (int j = 1; j <= 9; j++) {
                        System.out.printf("%d * %d = %d\n", i, j, i * j);
                    }
                }
                break;
            } else {
                System.out.println("2~9 사이의 숫자만 입력해주세요.");
            }
        }

    } // p10 end

    public void practice11(){
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("공차 : ");
        int num2 = sc.nextInt();

        System.out.print(num1 + " ");
        for(int i = 1; i <= 9 ; i++ ) {
            num1 += num2;
            System.out.print(num1 + " ");
        }

    } // p11 end

    public void practice11_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("공차 : ");
        int num2 = sc.nextInt();

        System.out.print(num1 + " ");
        int i = 1;
        while (i <= 9) {
            System.out.print((num1 += num2) + " ");
            i++;
        }

    } // p11_1 end

    public void practice12(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("연산자(+,-,*,/,%) : ");
            String cha = sc.nextLine();

            if (cha.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
//                return;
                break;
            } else {
                char op = cha.charAt(0);
                System.out.print("정수1 : ");
                int num1 = sc.nextInt();
                System.out.print("정수2 : ");
                int num2 = sc.nextInt();

//                sc.nextLine(); // 개행문자 제거 <= 루프 후 문자열에 추가되는 문제
                /*
                    // 나눗셈 처리
                if((op == '/' || op == '%') && num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
                    continue;
                }
                 */

                int result = 0;
                int loop = 0;
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '%': // 이것도 나눗셈 연산
                        if (num2 != 0) {
                            result = num1 % num2;
                            break;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                            loop += 1;
                            break;
                        }
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            break;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                            loop += 1;
                            break;
                        }
                    default:
                        System.out.println("없는 연산자입니다. 다시 입력해주세요");
                        loop += 1;
                }
                if(loop != 1) {
                    System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
//                    break;
                }

            }
            sc.nextLine();

        }


    } // p12 end

    public void practice13(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("찾고자하는 문자 : ");
        char le = sc.nextLine().charAt(0);

        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            char alp = str.charAt(i);
            if (alp != le){
                continue;
            }
            sum += 1;
        }
        System.out.println("포함된 갯수 : " + sum);

    } // p13 end

    public void practice14(){

        int mo = 70;
        int max = 10000;
        int sum = 0;
        for (int i = 1; i < max; i++){
            sum = mo * i;
            if ( sum < max) {
                System.out.printf("%d회 모금액: %d원\n", i, sum);
            }else {
                System.out.printf("%d회 모금액: %d원\n", i, sum);
                break;
            }
        }
    } // p14 end

    public void star1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int j = 1; j <= num; j++) {

            for (int i = 0; i < j; i++) {

                System.out.print("*");

            }
            System.out.println();
        }

    } // s1 end

    public void star2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for (int i = num; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    } // s2 end

    public void star3(){

        for (int i = 1; i <= 5 ; i++){
            for (int j = 1; j <= 10 ; j++){
                if ( i == 1 || i == 5) {
                    System.out.print('*');
                }else if( j != 1 && j != 10) {
                    System.out.print(" ");
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

    } // s3 end

    public void star4(){

        for (int i = 1; i <= 9; i += 2){
            int k = 1;
            for ( int j = 9; j > i ; j -= 2){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++ ){
                System.out.print(k++);
            }
            System.out.println();
        }
        for (int i = 7; i >= 1 ; i -=2){
            int k = 1;
            for ( int j = 8; j > i; j -= 2){
                System.out.print(" ");
            }
            for ( int j = 0; j < i; j++){
                System.out.print(k++);
            }
            System.out.println();
        }

    } // p4 end

    public void star5(){

        for (int i = 1; i <= 7; i += 2){
            for ( int j = 7; j > i ; j -= 2){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++ ){
                if(j == 1) { // 맨끝이면?
                    System.out.print("*");
                } else if( j == i) { // 미러 별?
                    System.out.print("*");
                } else { // 중간빈칸?
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i -= 2){
            for ( int j = 7; j > i ; j -= 2){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++ ){
                if(j == 1) { // 맨끝이면?
                    System.out.print("*");
                } else if( j == i) { // 미러 별?
                    System.out.print("*");
                } else { // 중간빈칸?
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    } // p5 end

} // class end
