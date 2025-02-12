package com.kyungbae.homework.controoler;

import java.util.Scanner;

public class Function {

    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("연산자(+,-,x,/) : ");
        char op = sc.nextLine().charAt(0);

        if (op == '/' && num2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.printf("%d %c %d = 0", num1, op, num2);
            return;
        }
        int result = 0;
        switch(op){
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case 'x','X' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
        }
        System.out.printf("%d %c %d = %d", num1, op, num2, result);

    } // calc end

    public void totalCalculator(){

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        int min = (Math.min(num1,num2));
        int max = (Math.max(num1,num2));
        int sum = 0;
        for (int i = min; i <= max; i++){
            sum += i;
        }
        System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);

    } // tcal end

    public void printProfile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별 : ");
        String gender = sc.nextLine();

        System.out.print("성격 : ");
        String mbti = sc.nextLine();

        System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n성격 : %s", name, age, gender, mbti);

    } // profile end

    public void printScore(){

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.print("반 : ");
        int clRoom = sc.nextInt();

        System.out.print("번 : ");
        int clNum = sc.nextInt();
        sc.nextLine();

        System.out.print("성별(M/F) : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("성적 : ");
        double score = sc.nextDouble();

        char sex = ' ';
        switch (gender){
            case 'm', 'M' :
                sex = '남';
                break;
            case 'f', 'F' :
                sex = '여';
                break;
        }


        char fScore = ' '; // 학점 넣기
        if(score >= 90){
            fScore = 'A';
        } else if (score >= 80) {
            fScore = 'B';
        } else if (score >= 70) {
            fScore = 'C';
        } else if (score >= 60) {
            fScore = 'D';
        } else {
            fScore = 'F';
        }
        System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f점이고 %c학점 입니다."
                , grade, clRoom, clNum, sex, name, score, fScore);

    } //pScore end

    public void printStarNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        // 양수가 아닐떄 오류 출력
        if(num <= 0){
            System.out.println("양수가 아닙니다.");
        }else {

//        i == j 가 될때 i 출력
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i == j) {
                        System.out.print(i);
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();

            }
        }

    } // pStarNumber end


} // class end
