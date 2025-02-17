package com.podoseee.homework.controller;

import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in); // 모든 곳에 적용되게 먼저 선언해두자
    //1.
    public void calculator(){
        System.out.print("첫 번째 정수 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int b = sc.nextInt();

        System.out.print("연산자(+, -, x, /) : ");
        char op = sc.next().charAt(0);
        int result = 0;

        if(op == '/' && b == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        }else {
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                        /*if(b==0){
                                System.out.print("0으로 나눌 수 없습니다.");
                        }*/ // if문 여기에 쓰지 말고 빼자.
                    break;
                default:
                    System.out.println("존재하지 않는 연산자입니다.");
                    return;
            }
        }

        System.out.printf("%d %c %d = %d", a, b, op, result);
    }

    //2.
        public void totalCalculator(){
                System.out.print("첫 번째 정수 : ");
                int a = sc.nextInt();
                System.out.print("두 번째 정수 : ");
                int b = sc.nextInt();

                int result = 0;

                // 처음 쓴 오류코드 : a+b가 됨
                /*if(a>b){
                    for(int i=0; i<=a; i++){ // i=0이 아니라 b라고 써야함
                        result = b + i;
                    }
                }else{
                    for(int i=0; i<=a; i++){
                        result = b + i;
                    }
                }
            System.out.println(result);*/
            
                //Math.min을 쓰자!
                int min = Math.min(a, b);
                int max = Math.max(a, b);
                
                for(int i=min; i<=max; i++){
                    result += i; 
                }

                System.out.printf("%d부터 %d까지의 정수들의 합 : %d", min, max, result);
        }

        //3.
            public void printProfile(){ // 변수를 다른 사람이 알아보기 쉽게 설정하는 연습하자
                System.out.print("이름 : ");
                String a = sc.nextLine();
                System.out.print("나이 : ");
                String b = sc.nextLine();
                System.out.print("성별 : ");
                String c = sc.nextLine();
                System.out.print("성격 : ");
                String d = sc.nextLine();

                System.out.println("이름 : " + a);
                System.out.println("나이 : " + b);
                System.out.println("성별 : " + c);
                System.out.println("성격 : " + d);
            }

        //4.
            public void printScore(){
                System.out.print("이름 : ");
                String a = sc.nextLine();

                System.out.print("학년 : ");
                int b = sc.nextInt();

                System.out.print("반 : ");
                int c = sc.nextInt();

                System.out.print("번 : ");
                int d = sc.nextInt();

                System.out.print("성별(M/F) : ");
                char e = sc.next().charAt(0);

                String gender = (e == 'M') ? "남" : "여";

                System.out.print("성적 : ");
                double f = sc.nextDouble();

                char g = 0;
                if (f >= 90){
                    g = 'A';
                } else if (f >= 80){
                    g = 'B';
                } else if (f >= 70){
                    g = 'C';
                } else if (f >= 60){
                    g = 'D';
                } else if (f < 60){
                    g = 'F';
                }
                System.out.printf("%d학년 %d반 %d번 %s학생 %s의 점수는 %.2f점이고 %c학점입니다.", b, c, d, gender, a, f, g);
            }

            //5.
            public void printStarNumber(){
                System.out.print("정수 : ");
                int a = sc.nextInt();

                if(a > 0){
                    for(int i=1; i<=a; i++) { //이중for문 쓰기
                        for(int j=1; j<i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(i);
                    }
                }else{
                    System.out.println("양수가 아닙니다.");
                }
            }

            //6.
            public void sumRandom(){ // random함수 쓰기
                int start = 1;
                int randomCount = (int)(Math.random()*100 + start);

                int sum = 0;
                for(int i=start; i<=randomCount; i++){
                    sum += i;
                }
                System.out.printf("%d부터 %d까지의 합 : %d", start, randomCount, sum);
            }

            //7.
            public void exceptGugu(){
                System.out.print("정수 : ");
                int dan = sc.nextInt();

                if(dan<=0){
                    return;
                }

                for(int i=0; i<=9; i++) {
                    if(i % dan != 0){
                        System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
                    }

                }
            }

            //8.
            public void diceGame(){
                while(true){
                    int diceNumber = 2; // 주사위 두 개
                    int diceTotal = 0; // 합 초기화

                    for (int i=0; i<diceNumber; i++){
                        diceTotal += (int)(Math.random()*6+1);
                    }


                    while(true){
                        System.out.print("주사위 두 개의 합을 맞춰보세요.(2~12입력) : ");
                        int sum= sc.nextInt();

                        if(sum == diceTotal){
                            System.out.println("정답입니다.");
                            break;
                        } else{
                            System.out.println("틀렸습니다.");
                        }
                        System.out.println("주사위의 합 : " + diceTotal);
                        System.out.print("계속 하시겠습니까?(y/n) : ");
                        sc.nextLine();
                        char continueChar = sc.nextLine().toUpperCase().charAt(0);

                        if(continueChar == 'N'){
                            return;
                        }
                    }
                }
            }
}
