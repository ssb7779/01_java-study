package com.seungjoo.section02.loop.run.controller;

import java.util.Scanner;

public class For {
    /*
      ##for문
        while문에 비해서 가독성이 좋음
        반복해서 사용할 값의 범위가 명확하거나, 반복횟수가 정해져있을 때 사용을 권장함
        세가지 구문으로 반복횟수를 지정 가능
        작성형식{
        for(초기식; 조건식; 상태변화)

        5.용어 정리
        1)초기식 : 반복문 실행사 최초에 단 한번만 실행되는 구문(주로 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)


        2) 조건식: 반복문이 수행될 조건을 작성하는 구문(주로 초기식에 선언된 변수를 가지고 조건식 작성)
        3) 상태 변화 : 반복문을 제어하는 변수 값을 변화시키는 구문(주로 초기식에 선언된 변수를 증감연산자와 함께 작성)


        6) 유의 사항
            초기식, 조건식, 상태변화 모두 생략 가능(무한 반복문)
            단, 각 항목들을 구분하기 위한 ;은 반드시 기술해야됨

             */

    public void testBasicFor() {
        // "안녕하세요" 5회 반복
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }
        for (int i = 11; i <= 15; i++) {
            System.out.println("반갑습니다.");
        }
    }

    public void testForExample1() {
        for (int i = 1; i < 5; i++) {

            System.out.println(i + " ");
        }
        System.out.println(); //아무 값이 없으면 줄바꿈만 해줌

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " ");
        }
    }

    public void testForExample2() {
        for (int i = 1; i < 5; i++) {
            System.out.println(6 - i + " ");
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            System.out.println(i + " ");

        }
    }

    public void testForExample3() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
    }

    public void testForExample4() {
        /*
        실습 1에서부터 사용자가 입력한 수까지의 총 합계 구해서 출력
         */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1에서부터" + num + "까지의 총 합계 : " + sum);
    }

    public void testForExample5() {
        //1에서부터 랜덤값(1~10)까지의 총 합계 구하기

        /*
        ##java.lang.Math.random()
        1. 매번 새로운 난수(랜덤값)을 반환해주는 메소드
        2. static 메소드로,Math 객체를 생성하지 않아도 Math.random() 호출로 바로 실행 가능
        3. double형의 0.0 이상 1.0 미만의 실수 난수값 반환
           정수 형태의 랜덤값을 얻고하자 한다면 해당 메소드의 결과와 산술연산을 통해 수정해서 사용

            Math.random() 호출 시
            0.0~0.999999 사이의 랜덤값 발생

            int ranNum = Math.random // 타입 불일치
            // 0.0 < 1.0
            */
//            int ranNum = Math.random() * 10;
        int ranNum = (int) (Math.random() * 10 + 1);
        System.out.println("랜덤값: " + ranNum);


        // 랜덤값 범위 지정 tip
        // (int)(Math.random() * 발생시킬 랜덤값의 시작수 + 발생시킬랜덤값의 시작수)

        int sum = 0;
        for (int i = 1; i <= ranNum; i++) {
            sum += i;

        }
        System.out.printf("1에서부터 %d까지의 총 합계: %d", ranNum, sum);

    }

    public void testForExample6() {

        String str = "Hello";

        for (int i = 1; i <= 4; i++) {
            System.out.println(str.charAt(i));

        }
    }

    public void testForExample7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력: ");
        String str = sc.nextLine();
        System.out.println("문자열의 길이(글자수):" +  str.length());
        System.out.println("문자열의 마지막인덱스 수: " + (str.length()-1));

        for(int i =0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
    public void testForExample8() {
        int dan = 2;
        for(int su = 1; su <=9; su++){
            System.out.printf("%d x %d = %d\n", dan, su, dan*su);

        }
    }

    public void testForExample9(){
        /*
            실습.
            2부터 9사이의 랜덤 단 출력하기
         */
        int dan = (int)(Math.random()* 8 + 2); //더해지는 수가 랜덤값의 시작수
        for(int su = 1; su <= 9; su++){
            System.out.printf("%d x % d = %d\n", dan, su, dan*su);

        }



    }
    public void testNestedFor(){
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5


         */

        for(int j = 1; j <=3; j++){
            for(int i = 1; i <= 5; i++){
                System.out.println(i+" ");
            }
            System.out.println();
        }


    }
    public void testNestedForExample1(){
        /*
            *****

         */
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void testNestedForExample2(){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j<=4; j++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void testNestedForExample3(){

        for(int dan = 2; dan <= 9; dan++){
            for(int su = 1; su <= 9; su++){
                System.out.printf("%d x % d = %d\n", dan, su, dan*su);

        }
        }
    }

    public void testNestedForExample4(){
        for(int i = 1; i<= 5;i++){
            System.out.println("<"+ i + "일차 수업>");
            for(int j =1; j<=8; j++){
                System.out.println(j+"교시");
            }
            System.out.println();
        }
    }
    public void testInfinityLoop(){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("======menu=======");
        System.out.println("1부터 5까지 출력");
        System.out.println("2.1부터 특정수까지의 총합계");
        System.out.println("3.특정문자열의 각 자리 문자");
        System.out.println(">> 메뉴 선택:");
        int menu = sc.nextInt();

        switch(menu) {
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
                System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요");
        }
        }
    }




























































































}













