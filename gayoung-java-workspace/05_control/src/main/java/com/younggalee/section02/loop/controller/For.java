package com.younggalee.section02.loop.controller;

import java.util.Scanner;

public class For {
    /*
    # for문
    1. while문에 비해서 가독성이 좋음
    2. 반복해서 사용할 값의 범위가 명확하거나, 반복횟수가 정해져있을 때 사용을 권장함.
    3. 세가지 구문(초기식, 조건식, 상태변화)로 반복횟수를 지정할 수 있음.
    * 용어정리
    ㄴ초기식 : for문에서 첫번째로 실행되는 식 > 조건검사 > 실행문 > 상태변화구문 > 조건식 > 실행문 > 상태변화
     ㄴ반복문 실행시 최초 단한번만 실행되는 구문
        (주로 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
    ㄴ조건식 : 반복문이 수행될 조건을 작성하는 구문
        (주로 초기식에 선언된 변수를 가지고 조건식 작성)
    ㄴ상태변화 : 반복문을 제어하는 변수값을 변화시키는 구문
        (주로 초기식에 선언된 변수를 증감연산자와 함께 작성)
    * 유의사항
    : 초기식, 조건식, 상태변화 모두 생략가능 (than, 무한 반복문)
    단, ';' 각 항목들을 구분하기 위한 ;은 반드시 기술해야됨.
    ex ) for(;;){}
    */

    public void testBasicFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
        //Tip : 초기식값에서부터 해당조건이 true일때까지 1씩 증가하는 동안 반복
        for (int j = 11; j <= 15; j++) {
            System.out.println("반갑습니다.");
        }
    }

    //for (int i=0: i<반복횟수; i++) ***

    public void testForExample1() {
        /*
        1부터 5까지 1씩 증가되는 값 출력
         */
        // i변수는 for문에 대한 지역변수이기때문에 for문 다수 사용할때 계속 초기변수이름을 i라고 해도 상관없다.
        // 2중포문 아닌 이상 끝나면 바로 사라지니까..

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
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
        int sum = 0;
        System.out.println("정수 하나 입력하세요~");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        for (int i = 1; i <= userInput; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void testForExample5() {
        /*
        # java.lang.Math.random()
        1. 매번 새로운 난수를 반환해주는 메소드
        2. static메소드로 Math 객체 생성없이 Math.random() 호출로 바로 사용가능함
        3. double 형의 0.0 이상 1.0 미만의 실수 랜던값 반환
           정수 형태의 값을 얻고자 한다면 해당 메소드 결과와 산술연산을 통해 수정후 사용

         */

        double ranNum = Math.random(); // 타입불일치
        System.out.println(ranNum);

        int ranNum2 = (int) (Math.random() * 10 + 1); // 타입불일치
        System.out.println(ranNum2);

        int ranNum3 = (int) (Math.random() * 12 + 1); // 타입불일치
        System.out.println(ranNum3);

        //[랜덤값 범위지정 팁]
        // (int)(Math.random() * 발생시킬갯수 + 발생시킬랜덤값의 시작수)
//        ex) 11~20 : (int)(Math.random() * 10 + 11)

        int sum = 0;
        for (int i = 1; i <= ranNum2; i++) {
            sum += 1;
        }
        System.out.printf("1에서부터 %d까지의 총 합계: %d", ranNum, sum);
    }

    public void testForExample6(){
        String str = "HELLO";
        // String에서 마지막 인덱스 : 문자열의 길이(글자수) - 1
        for (int i=0; i<5; i++){
            System.out.println(str.charAt(i));
        }
    }
    public void testForExample7(){
        // 사용자가 입력한 문자열의 모든 인덱스별 문자 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String input = sc.nextLine();
        
        for(int i=0; i<input.length(); i++){
            System.out.println(input.charAt(i));
        }
    }
    public void testForExample8() {
        for(int i=1; i<=9; i++){
            System.out.printf("2 X %d = %d\n", i, 2*i);
        }

    }
    public void testForExample9(){
        int num = (int)(Math.random() * 8 + 2);

        for (int i=1; i<=9; i++){
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }
    }
    public void testNestedFor(){
        for (int j=0; j<3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void testNestedForExample1(){
        for (int j=0; j<4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
    public void testNestedForExample2(){
        for (int i=0 ; i<4; i++){
            for (int j=0; j<4; j++) {
                if (i == j) {
                    System.out.print(i+1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void testNestedForExample3(){
        for (int i=2 ; i<=9; i++) {
            System.out.printf("=== %d단 ===\n", i);

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
    public void testNestedForExample4(){
        for (int day=1; day<=5; day++){
            System.out.printf("< %d일차 수업 >\n", day);
            for(int time=1; time<=8; time++){
                System.out.printf("%d교시\n",time);
            }
            System.out.println();
        }
    }
    public void testInfinityLoop(){
        boolean infinity = true;
        while(infinity) {
            System.out.println("==== Menu ====");
            System.out.println("1. 1~5까지 출력");
            System.out.println("2. 1부터 특정 수까지의 출력");
            System.out.println("3. 특정문자열의 각자리 문자");
            System.out.println("4. 종료");

            System.out.print("메뉴선택 : ");
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            switch (menu) {
                case 1: testForExample1();break;
                case 2: testForExample4();break;
                case 3: testForExample7();break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    infinity = false; break;
                default: System.out.println("메뉴를 잘못선택하셨습니다.");
            }
        }


    }
}

















