package com.kyungbae.section02.loop.controller;

import java.util.Scanner;

public class For {
    /*
        # for 문
        1. 가독성이 좋음
        2. 반복할 값의 범위가 명확하거나, 반복횟수가 정해져 있을때 사용
        3. 세가지 구문 (초기식, 조건식, 상태변화)로 반복횟수를 지정 가능
        4. 작성형식
            for(초기식; 조건식; 상태변화) {
                반복적으로 실행할 구문
            }
            초기식 => 조건식(true) => 구문 => 상태변화 => 조건식 (ture) ... 반복 => 조건식 (false) 종료
        5. 용어 정리
            1) 초기식   : 반복문 실행 시 최초에 단 한번만 실행되는 구문
                          (반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
            2) 조건식   : 반복문이 수행될 조건을 작성하는 구문
                          (초기식에 선언된 별수를 가지고 조건식 작성)
            3) 상태변화 : 반복문을 제어하는 변수값을 변화시키는 구문
                          (초기식에 선언된 변수를 증감연산자와 함께 작성)
        6. 유의 사항
            초기식, 조건식, 상태변화 모두 생략가능 (무한 반복문)
            단, 각 항목들을 구분하기 위한 세미콜론(;)은 반드시 기술해야됨
            ex) for(;;) {}
     */

    public void testBasicFor () {
        // "안녕하세요" 5회 반복
        for(int i = 0; i <5 ; i++){ // i=1; i<=5; i++
            System.out.println("안녕하세요");
        }

        for(int i = 11; i <=15; i++){ // i 는 지역변수 => for문 종료 후 해제
            System.out.println("반갑습니다");
        }

        for(int i = 0; i < 5; i++){
            System.out.println("어서오세요");
        }

        // 반복횟수지정 tip
        // for (int i=0; i<반복횟수; i++)

    } // tBF end

    public void testForExample1(){
        /*
            1부터 5까지 1씩 증가되는 값 출력
            ex) 1 2 3 4 5
         */
        for(int i=1; i<=5; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=0; i<5; i++){
            String num = (i+1) +" ";
            System.out.print(num);
        }

    } // tFE1 end

    public void testForExample2() {
        /*
            위 내용을 역순으로 출력
            ex) 5 4 3 2 1
         */
        for(int i=1; i<=5; i++){
            System.out.print(6 - i + " ");
        }

        System.out.println();

        for (int i=5; i>=1; i--) {
            System.out.print(i + " ");
        }

    } // tFE2 end

    public void testForExample3() {
        /*
            1에서부터 10까지의 총 합계 구하기
         */
        int sum = 0;
        for (int i=1; i<=10; i++) {
            sum += i;
        }
        System.out.println("1에서부터 10까지의 총 합 : " + sum);
    } // tFE3 end

    public void testForExample4() {
        /*
            실습
            1에서부터 사용자가 입력한 수까지의 총 합계 구해서 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        if (num >=1) {
            System.out.printf("1에서부터 %d까지의 총 합 : " + sum, num);
        }else {
            System.out.println("잘못 입력하였습니다.");
        }

    } // tFE4 end

    public void testForExample5() {
        // 1에서부터 1~10 사이 랜덤값(난수)까지의 총 합계 구하기

        /*
            # java.lang.Math.random()
            1. 매번 새로운 난수를 반환해주는 메소드
            2. static 메소드로 Math 객체를 생성하지 않아도 호출 가능 Math.random()
            3. double형의 0.0 이상 1.0 미만의 실수 난수값 반환
                정수 형태의 랜덤값을 얻고자 한다면 해당 메소드의 결과와 산술연산을 통해 수정해서 사용
                Math.random() 호출시
                0.0 ~ 0.9999999... 사이의 랜덤값 발생
         */
//        int random = Math.random(); => double형 으로 출력되는 Math.random 함수라서 int로 사용시 오류
//                      0.0 <= random < 1.0

//        int random = Math.random() * 10;
//                      0.0 <= random < 10.0

//        int random = Math.random() * 10 + 1;
//                      1.0 <= random <= 10.999999999

        int random = (int)(Math.random() * 10 + 1);
//                      1 <= random <= 10

        System.out.println("랜덤값 : " + random);

        // 랜덤값범위지정 Tip
        // (int)(Math.random() * 발생시킬값의갯수 + 발생시킬랜덤값의시작수)
        // ex 11 ~ 20 (int)(Math.random() * 10 + 11)

        int sum = 0;
        for ( int i = 1 ; i <= random; i++) {
            sum += i;
        }
        System.out.printf("1에서부터 %d까지의 총 합계 : %d", random, sum);

    } // tFE5 end

    public void testForExample6() {
        // 임의의 문자열의 각 인덱스별 문자들 출력

        String str = "Hello";
        /*
            H => 출력 (str.charAt(0);
            e => 출력 (str.charAt(1);
            l => 출력 (str.charAt(2);
            l => 출력 (str.charAt(3);
            o => 출력 (str.charAt(4);

            0번 인덱스부터 4번 인덱스까지 1증가하면서 반복 수행
         */
        for (int i=0; i <5 ; i++) {
            System.out.println(str.charAt(i));
        }

    } // tFE6 end

    public void testForExample7 () {
        // 문자열의 길이를 모를때
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();

       // 마지막인덱스 == 문자열의 길이 - 1

        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열의 마지막 인덱스 : " + (str.length() - 1));

        for (int i=0; i < str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

    } // tFE7 end

    public void testForExample8() {
        /*
            2단 출력하기
         */
        /*
        for (int i = 1 ; i <= 9 ; i++) {
//            System.out.println("2 x " + i + " = " + ( 2 * i ));
            System.out.printf("2 x %d = %d\n", i, (2 * i));
        }

         */

        // 임의의 단
        Scanner sc = new Scanner(System.in);
        System.out.print("단 수 : ");
        int dan = sc.nextInt();

        for (int i = 1 ; i <= 9 ; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }

    } // tFE8 end

    public void testForExample9() {
        //랜덤 단
        int ranDan = (int)(Math.random() * 8 + 2);

        for (int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n", ranDan, i, (ranDan * i));
        }

    } // tFE9 end

    public void testNestedFor(){
        /*
            중첩 for문

            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
         */

        for (int j = 1; j <=3; j++) { // 행을 지정하는 for
            for (int i = 1; i <= 5; i++) { // 열을 지정하는 for
                System.out.print(i + " ");
            }
            System.out.println();
        }

    } // tBF end

    public void testNestedForExample1(){
        /*
            ****
            ****
            ****
            ****

         */
        /*
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print('*');
            }
            System.out.println();
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("행을 입력 : ");
        int vir = sc.nextInt();
        System.out.print("열을 입력 : ");
        int hori = sc.nextInt();

        for (int i = 1; i <= vir; i++){
            for (int j = 1; j <= hori; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    } // tBFE1 end
    public void testNestedForExample2(){
        /*
            1***
            *2**
            **3*
            ***4
         */
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <=4; j++){
                if (i == j){
                    System.out.print(i);
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }

    } // tNFE2 end

    public void testNestedForExample3(){
        // 2단 부터 9단까지 전체 출력

        for (int dan = 2; dan <=9; dan++ ) {
//        int dan = 2;
            System.out.printf("=== %d단 ===\n", dan);
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
            }
            System.out.println();
        }

    } // tNFE3 end

    public void testNestedForExample4(){

        for (int days = 1; days <=5; days++){
            System.out.printf("< %d일차 수업 >\n", days);
            for (int i = 1; i <=8; i++){
                System.out.printf("%d교시\n", i);
            }
            System.out.println();
        }

    } // tNFE4 end

    public void testInfinityLoop(){

        Scanner sc = new Scanner(System.in);

        // # 무한반복문
        while(true){ // while 무한반복
//        for(;;) { // for 무한반복
            System.out.println("\n======== menu ========");
            System.out.println("1. 1부터 5까지 출력"); // testForExample1()
            System.out.println("2. 1부터 특정수까지 총합"); // testForExample4()
            System.out.println("3. 특정문자열의 각 자리 출력"); // testForExample7()
            System.out.println("0. 프로그램 종료");

            System.out.print(">> 메뉴 선택 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    testForExample1();
                    break;
                case 2:
                    testForExample4();
                    break;
                case 3:
                    testForExample7();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요");
            }
        }

    } // tIL end

} // class end
