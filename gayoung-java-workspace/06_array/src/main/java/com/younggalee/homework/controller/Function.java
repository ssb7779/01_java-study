package com.younggalee.homework.controller;
import com.younggalee.homework.controller.Function;

import java.util.Scanner;

// 기능 구현용 클래스
public class Function {
    public void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자(+, -, x, /) : ");
        char operator = sc.next().charAt(0);
        int error = 0;
        int result = 0;

        switch(operator){
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case 'x': result = num1 * num2; break;
            case '/':
                if (num2 == 0){
                    System.out.println("\n0으로 나눌 수 없습니다.");
                    break;
                }
                result = num1 / num2;
                break;
            default:
                error = 1;
                System.out.print("\n잘못된 입력입니다. 연산자를 확인하세요.");
        }
        if(error == 0) {
            System.out.printf("\n%d %s %d = %d", num1, operator, num2, result);
        } else {
            System.out.println(" ㅠㅠ");
        }
    }

    public void totalCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.printf("\n%d부터 %d까지 정수들의 합 : %d", num1, num2, sum);
    }

    public void printProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별 : ");
        String gender = sc.nextLine();
        System.out.print("성격 : ");
        String personality = sc.nextLine();

        System.out.printf("\n이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %s\n", gender);
        System.out.printf("성격 : %s", personality);
    }

    public void printScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("학년 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("반 : ");
        int classNum = sc.nextInt();
        sc.nextLine();
        System.out.print("번호 : ");
        int personalNum = sc.nextInt();
        sc.nextLine();
        System.out.print("성별(M/F) : ");
        char gender = sc.next().charAt(0);
        System.out.print("성적 : ");
        double score = sc.nextDouble();
        char grade = '\u0000';
        int error = 0;

        if (gender == 'f' || gender == 'F'){
            gender = '여';
        } else if(gender == 'm' || gender == 'M'){
            gender = '남';
        } else {
            error = 1;
            System.out.print("\n잘못된 입력입니다. 성별을 확인하세요.");
        }

        if (score > 100){
            error = 1;
            System.out.print("\n잘못된 입력입니다. 점수를 확인하세요.");
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80){
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else if (score >= 0){
            grade = 'F';
        } else {
            error = 1;
            System.out.print("\n잘못된 입력입니다. 점수를 확인하세요.");
        }

        if(error == 0) {
            System.out.printf("\n%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f점이고 %c학점입니다.", age, classNum, personalNum, gender, name, score, grade);
        } else {
            System.out.println(" ㅠㅠ");
        }

    }

    public void printStarNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        if (num >= 0){
            for (int i=0; i<num; i++){
                for(int j=0; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println(i+1);
            }
        } else {
            System.out.println("\n양수가 아닙니다.");
        }
    }
    public void sumRandom() {
        int randomNum = (int)(Math.random() * 100 + 1);
        int sum = 0;

        for (int i=1; i<=randomNum; i++){
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합 : %d", randomNum, sum);
    }

    public void exceptGugu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();
        System.out.println();

        if (num >= 0){
            for (int i=1; i<=9; i++){
                if (i%num != 0){
                    System.out.printf("%d x %d = %d\n", num, i, num*i);
                }
            }
        } else {
            System.out.println("\n음수를 입력하셨습니다.");
        }
    }

    public void diceGame() {
        boolean go = true;

        while (go) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum = dice1 + dice2;

            Scanner sc = new Scanner(System.in);
            System.out.print("주사위 두 개의 합을 맞춰보세요(2~12입력) : ");
            int num = sc.nextInt();

            if (sum == num) {
                System.out.println("정답입니다.");
                System.out.println("주사위의 합 : " + num);
                System.out.print("계속 하시겠습니까? (y/n) : ");
                char goStop = sc.next().charAt(0);

                if (goStop == 'n' || goStop == 'N') {
                    go = false;
                    System.out.println("종료합니다.");
                }
            } else {
                System.out.println("틀렸습니다.");
            }


        }

    }
}
