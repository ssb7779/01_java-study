package com.minkook.section02.loop.controller;

import java.util.Random;
import java.util.Scanner;


public class For {
    public void testBasicFor(){
//        System.out.println("==구구단출력==");
//        for(int i = 1; i <= 9; i++){
//
//            for(int j = i; j<=9; j++) {
//                System.out.printf("%d *",i);
//                System.out.printf("%d는 = %d\n",j,(i*j));
//
//            }
//
//
//        }
        //안녕하세요 5회반복
        for(int i = 0; i<5; i++){
            System.out.println("안녕하세요");
        }
        //[해석] 초기식값에서부터 해당조건이 true일때까지 1씩 증가하는동안 반복
    }

    public void testBasicFor2(){
//        System.out.println("==구구단출력==");
//        for(int i = 1; i <= 9; i++){
//            System.out.print("\n");
//            for(int j = 1; j<=i; j++) {
//                System.out.printf("%d " + "* " + "%d = %d" ,i,j,(i*j));
//                System.out.print(" ");
//
//            }
//        }

        System.out.println("==별찍기1==");
        for(int i = 1; i <= 9; i++){
            System.out.print("\n");
            for(int j = 1; j<=i; j++) {
                System.out.printf("*");
                System.out.print(" ");
            }
        }
    }

    public void testBasicFor3(){
//        System.out.println("==구구단출력==");
//        for(int i = 9; i >= 1; i--){
//            System.out.print("\n");
//            for(int j = 1; j<=i; j++) {
//                System.out.printf("%d " + "* " + "%d = %d" ,i,j,(i*j));
//                System.out.print(" ");
//
//            }
//        }

        System.out.println("==별찍기2==");
        for(int i = 9; i >= 1; i--){
            System.out.print(" ");
            System.out.print("\n");
            for(int j= i; j>0; j--) {
                System.out.print("  ");
                System.out.print("*");
            }
        }
    }

    public void testForExmaple1(){
//        //1부터 5까지
//        for(int i = 1; i<=5; i++){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//        System.out.println();

        for(int i = 0; i<5; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();
    }

    public void testForExmaple2(){
//        //1부터 5까지
//        for(int i = 1; i<=5; i++){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//        System.out.println();

        for(int i = 5; i>=1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void testForExmaple3(){
//        //1부터 5까지
//        for(int i = 1; i<=5; i++){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//        System.out.println();
        int sum = 0;
        for(int i = 1; i<=10; i++) {
            sum += i;

        }
        System.out.print("1부터10까지 누적값:"+sum);
    }

    public void testForExmaple4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하세요: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i++) {
            sum += i;
        }
        System.out.print("1부터 사용자가 입력한 수까지의 총합: ");
        System.out.println(sum);
    }

    public void testForExmaple5(){


        /*
            ## java.lang.Math.random()
            1.매번 새로운 난수(random) 반환해주는 메소드
            2.static메소드로 Math객체 생성되지 않아도 바로 호출가능
        */


        double a = Math.random()*10;
        int num = (int)a + 1;
        int sum = 0;
        for(int i= 1; i<= num; i++){

            sum += i;
        }
        System.out.printf("1에서부터 %d까지의 수의 합은 %d",num,sum);
        //랜덤값 지정범위
        // (int)(Math.random() * +발생시킬 랜덤값의 시작수)
    }

    public void testForExmaple6(){
        String str = "Hello"; //5글자

        for(int i = 0; i<5; i++){
            System.out.println(str.charAt(i));
        }


    }

    public void testForExmaple7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        String str = sc.nextLine();
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.print("총글자수는:" + str.length());
        System.out.print("\n");
        System.out.println("마지막인덱스의 숫자는:" +(str.length()-1));

    }

    public void testForExmaple8(){
//        System.out.println("구구단 출력");
//        for(int i = 1; i<=2; i++){
//
//            for(int j = 1; j <= 9; j++) {
//                System.out.print(i);
//                System.out.print("*");
//                System.out.print(j + "=");
//                System.out.printf("%d",i*j);
//                System.out.print("\n");
//            }
//        }
        System.out.println("구구단(2단) 출력");
        int dan = 2;
        for(int su = 1; su<=9; su++){

            System.out.printf("%d x %d = %d\n",dan,su,(dan*su));
        }

    }

    public void testForExmaple9(){

        System.out.println("2부터 9사이의 랜덤 단 출력하기");
        double dNum = Math.random() * 8 + 2;

        int dan = (int)dNum;
        for(int su = 1; su<=9; su++){
            System.out.printf("%d x %d = %d\n",dan,su,(dan*su));
        }

    }

    public void testForExmaple10(){

       /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
        */
         for(int i = 0; i<5; i++){ //행을 지정
             System.out.println();
             for(int j = 0; j<5; j++){ //열을 지정
                 System.out.print(j+1 + " ");
             }
         }
    }

    public void nestedForExmaple1(){

       /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
        */
        for(int i = 0; i<4; i++){ //행을 지정
            System.out.println();
            for(int j = 0; j<4; j++){ //열을 지정
                System.out.print("*");
            }
        }
    }

    public void nestedForExmaple2(){

        for(int i = 0; i<4; i++){ //행을 지정
            System.out.println();
            for(int j = 1; j<=j; j++){ //열을 지정
                if(i==j){
                    System.out.print(j+1);
                } else{
                    System.out.print('*');
                }
            }
        }
    }

    public void nestedForExmaple3(){
        //구구단(2단부터 9단까지)
        for(int i = 2; i <=9; i++){ //행을 지정
            System.out.println();
            for(int j = 1; j <=9; j++){ //열을 지정
                System.out.printf("%d x %d = %d\n",i,j,(i*j));
            }
        }
    }

    public void nestedForExmaple4(){
        for(int i = 1; i <= 5; i++){ //행을 지정
            System.out.println("<" + i + "일차 수업>");
            for(int j = 1; j<=8; j++){
                System.out.println(j +"교시");
            }
        }
    }

    public void testInfinityLoop(){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==========Menu==========");
            System.out.println("1. 1부터 5까지"); //testForExample1()
            System.out.println("2. 1부터 특정수까지의 총합계"); //testForExample4()
            System.out.println("3. 특정문자열의 각 자리 문자"); //testForExample7()
            System.out.print(">> 메뉴 선택(0번 누르면 프로그램 종료):");

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    testForExmaple1();
                    break;
                case 2:
                    testForExmaple4();
                    break;
                case 3:
                    testForExmaple7();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
            }


        }
    }
}
