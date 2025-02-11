package com.inyong.section02.loop.controller;

import java.util.Scanner;

public class For {
    /*
     for 문
     while문에 비해서 가독성이 좋음
     for(초기식; 조건식; 상태변화){
     반복적으로 실행 할 구문
     }

     용어정리
     1. 초기식 : 반복문 실행시 최초에 단 한번만 실행되는 구문
     2. 조건식 : 반복문이 수행될 조건을 작성하는 구문
     3. 상태변화 : 반복문을 제어하는 변수 값을 변화시키는 구문
     */

    public void testBasicFor() {

        for (int i = 0; ; i++) {
            System.out.print("안녕");
        }
    }

    public void testForExample1() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " ");
        }
    }

    public void testForExample2() {
        for (int i = 1; i < 6; i++) {
            System.out.print(6 - i + " ");
        }

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public void testForExample3() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample4() {
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(n + "까지의 총 합계" + sum);
    }

    public void testForExample5() {
        /*
        1에서부터 랜덤값(1~10 사이) 까지의 총 합계 구하기
        java.lang.Math.random()
        static 메소드로 Math 객체를 생성하지 않아도 Math.random() 호출로 바로 실행 가능
        double형 0.0 이상 1.0 미만의 실수 난수값 반환
        정수 형태의 랜덤값을 얻고자 한다면 해당 메소드의 결과와 산술연산을 통해 수정해서 사용
         */

//        double n = Math.random() * 10 + 1 ;
        int n = (int) (Math.random() * 10 + 1);
        // (int) (Math.random() * 발생시킬갯수 + 발생시킬랜덤값의 시작수)
        // ex) 11~20 : int Math.random() * 10 + 11
        System.out.println(n);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public void testForExample6() {
//        int random = (int)(Math.random() * 10);
        String str = "Hello";

        for (int i = 0; i < 5; i++) {
            System.out.println(str.charAt(i));
        }

    }

    public void testForExample7() {
        System.out.println("문자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        for (int i = 0; i < data.length(); i++) {
            System.out.println(data.charAt(i));
        }
    }

    public void testForExample8() {
        System.out.println("구구단 단수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();


        for (int i = 1; i < 10; i++) {
            System.out.println(data + "x" + i + "=" + data * i);
        }
    }

    public void testForExample9() {
//        System.out.println("구구단 단수를 입력하세요");
//        Scanner sc = new Scanner(System.in);
//        int data = sc.nextInt();

        int random = (int) (Math.random() * 8 + 2);
        for (int i = 1; i < 10; i++) {

            System.out.println(random + "x" + i + "=" + i * random);
        }
    }

    public void testNestedFor() {
        int random = (int) (Math.random() * 8 + 2);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void testNestedForExample1() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void testNestedForExample2() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    public void testNestedForExample4() {
        for (int i = 1; i < 10; i++) {
            System.out.printf("<%d일차 수업>\n", i);
            for (int j = 1; j < 10; j++) {

                System.out.printf("%d교시\n", j);
            }
            System.out.println();
        }
    }

    public void testInfinityLoop() {
        Scanner sc = new Scanner(System.in);

//        for(;;) // 무한 반복

        while (true) {
            System.out.println("=======Menu=======");
            System.out.println("1. 1부터 5까지"); // testForExample1
            System.out.println("2. 1부터 특정수까지의 총합계"); // testForExample4
            System.out.println("3. 특정문자열의 각 자리 문자"); // testForExample7
            System.out.println("0. 종료");
            System.out.println("메뉴 선택");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    testForExample1();
                    break;
                case 2:
                    testForExample4();
                    break;
                case 3:
                    testForExample3();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택 하셨습니다.");
            }
        }
    }
}
