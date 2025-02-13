package com.sotogito.section02.loop.controller;

import java.util.Scanner;

public class For {
    /**
     * 1. 가독성 좋음
     * 2. 반복의 조건이 명확, 횟수가 지정되어 있을떄 지향
     * <p>
     * - 초기식 : 최초 실행 구문
     * - 조건식 : 반복무이 수행될 조건을 작성
     * - 상태변화 : 반복문을 제어하는 변수 값을 변화(보통 증감연산자)
     * <p>
     * 초기,조건,상태변화 생략 가능 -무한 반복문 for(;;)
     * 각 항목들을 ; 로 구분
     * <p>
     * for(int i = 0; i<반복횟수; i++)
     */

    public void testBasicFor() {
        //1에서 5보다 작을때까지 1씩 증가하면서 반복
        for (int i = 1; i <= 5; i++) {
            System.out.println("안녕하세요");
        }

        for (int i = 11; i < 15; i++) {
            System.out.println("반가");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("어서오세요");
        }
    }

    public void testForExample1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "");
        }

        System.out.println();

        for (int i = 0; i > 5; i++) {
            System.out.print(i + 1 + " ");
        }
    }

    public void testForExample2() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(6 - i);
        }

        for (int i = 5; i > 0; i--) {

        }
    }

    public void testForExample3() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("총합 : " + sum);
    }

    public void testForExample4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 : ");
        int inputNum = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= inputNum; i++) {
            sum += i;
        }

        System.out.println("1~" + inputNum + "까지 더한 값 : " + sum);
    }

    public void testForExample5() {
        /**
         *  java.lang.Math.random()
         * 1. 매번 난수를 생성
         * 2. static 메서드 - Math.random();
         * 3. double 형의 랜덤값
         *
         *
         * (int)(Math.random() *랜덤 범위+시작수)
         */
//        double random = Math.random();

//        int rannum = Math.random();
//        int ranNum = Math.random()*10;

//        int ranNum = Math.random() * 10+1;

        int ranNum = (int) (Math.random() * 10 + 1); // 1~10


        int sum = 0;
        for (int i = 1; i <= ranNum; i++) {
            sum += i;
        }
    }

    public void testForExample6() {
        String str = "Hello";

        for (int i = 0; i < 5; i++) {
            System.out.println(str.charAt(i));
        }
    }

    public void testForExample7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 ㅣ ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public void testForExample8() {
        int dan = 2;

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, (dan * i));
        }
    }

    public void testForExample9() {
        int dan = (int) (Math.random() * 8 + 2);

        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, (dan * i));
        }
    }

    public void testNestedFor() {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void testNestedForExample1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(i + 1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedFOrExample3() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %d \n", i, j, (i * j));
            }
        }
    }

    public void testNestedForExample4() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("<%d일차 수업>\n", i);
            for (int j = 1; j <= 8; j++) {
                System.out.printf("%d교시\n", j);
            }
            System.out.println();
        }
    }

    public void testInfinityLoop() {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n===MENU===");
            System.out.println("1. 1~5까지 출력");
            System.out.println("2. 1부터 특정수까지 합계");
            System.out.println("3. 특정 문자열의 각자리 문자");
            System.out.println("0. .프로그램 종료");
            int num = sc.nextInt();

            switch (num) {
                case 0:
                    System.out.println("종료합니다.");
                    return; //todo break보다 상위 종료문
                case 1:
                    testForExample1();
                    break;
                case 2:
                    testForExample4();
                    break;
                case 3:
                    testForExample7();
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택. 다시 입력");
            }
        }

    }


    public void testNestedForExample_1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample_2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                if (j == i) {
                    for (int k = j; k < 5; k++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample_3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

            }
            System.out.println();
        }
    }


}
