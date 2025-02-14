package com.seokbong.homework.controller;

import java.util.Scanner;
import java.util.SortedMap;

public class Function {
    public void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("연산자(+, -, x, /) : ");
        char cal = sc.nextLine().charAt(0);

        int result = 0;

        if(num2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.printf("%d %s 0 = 0",num1,cal);
        }else {
            switch(cal){
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case 'x' :
                    result = num1 * num2;
                    break;
                case 'X' :
                    result = num1 * num2;
                    break;
                case '/' :
                    result = num1 / num2;
                    break;
            }
            System.out.printf("%d %s %d = %d", num1, cal, num2, result);

        }
    }

    public void totalCalculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        for(int i =num1; i <= num2; i++){
            sum += i;
        }System.out.println(num1 + "부터 " + num2 + "까지 정수들의 합 : "+ sum);
    }

    public void printProfile() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("나이 : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("성별 : ");
        String gen = sc.nextLine();
        System.out.println("성격 : ");
        String character = sc.nextLine();

        System.out.printf("이름 : %s\n나이: %d\n성별 : %s\n성격 : %s",name, age, gen, character);
    }

    public void printScore() {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("학년 : ");
        int grade = sc.nextInt();
        System.out.println("반 : ");
        int group = sc.nextInt();
        System.out.println("번 : ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.println("성별(M/F) : ");
        char gen = sc.nextLine().charAt(0);
        System.out.println("성적 : ");
        double score = sc.nextDouble();

        sc.nextLine();
        String result = "";
        if(score >= 90){
            result = "A";
        }else if(score >= 80){
            result = "B";
        }else if (score >=70) {
            result = "C";
        }else if (score >= 60) {
            result = "D";
        }else {
            result = "F";
        }

        String str = "";
        if(gen == 'F' || gen == 'f'){
            str = "여";
        }else if(gen == 'M' || gen =='m'){
            str = "남";
        }System.out.printf("%d학년 %d반 %d번 %s학생 %s의" +
                           " 점수는 %.2f점이고 %s학점입니다."
                           ,grade, group, num, str, name, score, result);
    }

    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 : ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){

        }


    }
}
