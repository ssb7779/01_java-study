package com.seongho.section02.loop.controller;

import java.util.Scanner;

public class For {
    public void testFEx() {
        /*
        1부터 10까지 총 합계
        방법 1 int sum =
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testFEx2() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int num2 = 0;
        for (int i = 1; i <= num; i++) {
            num2 += i;
        }
        System.out.println(num2);
    }

    public void testFEx3() {
        /*
        //1에서부터 랜덤값 (1~10까지의 총 합계 구하기
        ## Java.lang.Math.random() ##
        1.매번 새로운 난수를  반환
        2. 바로 가능 static 메소드로 Math 객체를 생성하지 않아도 가능
        3. double로 0.0이상 1.0미만 실수 반환 정수 원하면 수정해서 사용해야 됨
         */
        //int ranNum = Math.random() *10 ;
        //                    0.0 ~9.9999
        //int ranNum = Math.random() *10 +1 ;
        //                    1.0 ~10.99999
        int ranNum = (int) (Math.random() * 10 + 1);
        System.out.println(ranNum);

        //랜덤값범위지정
        //(int)(Math.random()* 발생시킬갯수 + 발생시킬 랜덤값의 시작수
        // 11~20  - (int)(Math.random()* 10 + 11
        int sum = 0;
        for (int i = 1; i <= ranNum; i++) {
            sum += i;
        }
        System.out.printf("1dptj %d까지 합계 %d", ranNum, sum);
    }

    public void testFEx4() {
        String str = "Hello";
        /*
        H str.charAt(0)
        e
        l
        l
        o

         */

        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i));
        }

    }

    public void testFEx5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }
        //문자열의 마지막 인덱스수 str length() -1
    }

    public void testFex6() {
        /*
        구구단
        2단 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("단:");
        int num = sc.nextInt();

        int num1 = 10;
        for (int i = 1; i < num1; i++) {

            System.out.printf("%d * %d =%d\n", num, num1, num * num1);

        }
    }

    //2부터 9사이 랜덤 단
    public void testFEx7() {
        int ranNum = (int) (Math.random() * 8 + 2);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d =%d\n", ranNum, i, ranNum * i);

        }
    }

    public void testNF() {
        for (int j = 0; j < 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

    public void testNFEx() {
        /*
         ****
         ****
         ****
         ****
         */
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void testNFEx2(){
        /*
         1***
         *2**
         **3*
         ***4
         */
        for (int i = 1; i<5; i++){
            for (int j = 1; j <5; j++) {
            if (j ==i ){
                System.out.print(i);
            }else {
                System.out.print("*");
            }
            }
        }
    }
    public void testNFEx3(){
        for (int dan= 2; dan <10 ;dan++){
            for (int i = 1; i<10; i++){
                System.out.printf("%d x %d = %d\n", dan,i,dan*i);

            }
            System.out.println();
        }
    }
    public void testNFEx4(){
        for (int i = 1 ; i <6; i++){
            System.out.println(i+"일차 수업");
            for (int j=1;j<10; j++){
                System.out.println(j+"교시");
            }
            System.out.println();
        }
    }
    public void testInL(){
        Scanner sc = new Scanner(System.in);
        //for(;;)
        while (true) {
            System.out.println("1.메뉴");//testFEx
            System.out.println("2.1부터 5까지");//testFEx4
            System.out.println("3.3특정문자열의 각 자리 문자");//testFEx7
            System.out.println("0. 종료");
            System.out.println("메뉴선택");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    testFEx();
                    break;
                case 2:
                    testFEx4();
                    break;
                case 3:
                    testFEx7();
                    break;
                case 0: return;
                default:
                    System.out.println("메뉴 잘못 선택");
            }
        }

    }
}
