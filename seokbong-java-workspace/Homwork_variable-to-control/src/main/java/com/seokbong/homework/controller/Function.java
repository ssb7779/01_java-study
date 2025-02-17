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

        if(num < 0 ){
            System.out.println("양수가 아닙니다.");
        }else  for(int i = 1; i < num+1; i++){
            for (int  j = 1; j <= i; j++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }




    }

    public void sumRandom(){

        int n  = (int)(Math.random()*10+1);
        int sum =0;

        for(int  i = 0; i <= n; i++){
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합 : %d", n, sum);
    }

    public void exceptGugu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 : ");
        int num = sc.nextInt();
        int su = 0;

        for(int i = 1; i < 10; i++ ){
            su = num * i;
            System.out.println(num + " * " + i + " = " + su);
        }
    }

    public void diceGame(){
        Scanner sc = new Scanner(System.in);

        int num1 = (int)(Math.random() * 6 + 1);
        int num2 = (int)(Math.random() * 6 + 1);
        int result = num1 + num2;

        while(true){
            System.out.println("주사위 두 개의 합을 맞춰보세요(2~12입력) : ");
            int sum = sc.nextInt();
            sc.nextLine();

            if(result == sum){
                System.out.println("정답입니다.");
                System.out.println("주사위의 합 : " + sum);
                System.out.println("계속하시겠습니까?(y/n)");
                char ch = sc.nextLine().charAt(0);
                if(ch == 'n' || ch == 'N'){
                    System.out.println("종료합니다.");
                    break;
                }else if(ch == 'y' || ch == 'Y'){
                }

            }else {
                System.out.println("틀렸습니다.");
            }
        }
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);


        while(true){

            System.out.println("1. 간단계산기");
            System.out.println("2. 작은 수에서 큰 수까지 합계");
            System.out.println("3. 신상 정보 확인");
            System.out.println("4. 학생 정보 확인");
            System.out.println("5. 별과 숫자 출력");
            System.out.println("6. 난수까지의 합계");
            System.out.println("7. 구구단");
            System.out.println("8. 주사위 숫자 알아맞추기 게임");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 번호 : ");
            int menu = sc.nextInt();

            if(menu >=1 && menu <= 9){
                switch(menu){
                    case 1 :
                        calculator();
                        return;
                    case 2 :
                        totalCalculator();
                        return;
                    case 3 :
                        printProfile();
                        return;
                    case 4 :
                        printScore();
                        return;
                    case 5 :
                        printStarNumber();
                        return;
                    case 6 :
                        sumRandom();
                        return;
                    case 7 :
                        exceptGugu();
                        return;
                    case 8 :
                        diceGame();
                        return;
                    case 9 :
                        System.out.println("종료합니다.");
                        return;
                }
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }
        }


    }
}
