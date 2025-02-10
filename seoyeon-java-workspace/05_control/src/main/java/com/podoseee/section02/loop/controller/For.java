package com.podoseee.section02.loop.controller;

import java.util.Scanner;

public class For {
    /*
        ## for문 ##
        1.
     */

    public void testBasicFor(){
        // "안녕하세요" 5회 반복
        for(int i=0; i<5; i++){ // i=0(t)->1(t)->2(t)->3(t)->4(t)->5(f)
            System.out.println("안녕하세요");
        }
        
        // [해석 Tip] 초기식값에서부터 해당조건이 true일때까지 1씩 증가하는 동안 반복
        
        for(int j=11; j<16; j++){ // 11에서부터 15까지 1씩 증가하는 동안 반복 (11,12,13,14,15)
            System.out.println("반갑습니다");
        }
        
        for(int i=0; i<5; i++){ // 0에서부터 4까지 1씩 증가되는 동안(0,1,2,3,4)
            System.out.println("어서오세요");
        }

        // [반복횟수지정Tip]
        // for(int i=0; i<반복횟수;i++)
    }

    public void testForExample1(){
        /*
            1부터 5까지 1씩 증가되는 값 출력
            ex) 1 2 3 4 5
         */
        for(int i=1; i<=5; i++){
            System.out.print(i+ " ");
        }

        System.out.println();

        // 1 2 3 4 5
        for(int i=0; i<5; i++){ // i=0,1,2,3,4
            System.out.print(i+1 + " ");
        }
    }

    public void testForExample2(){
        /*
            위의 내용을 역순으로 출력
            ex) 5 4 3 2 1
         */
        for(int i=1; i<=5; i++){ // i=1,2,3,4,5
            System.out.print(6 - i + " "); // i=5,4,3,2,1
        }

        System.out.println();

        // 5에서부터 1까지 1씩 감소되는 동안 반복

        for(int i=5; i>=1; i--){ // i<=1 안 됨
            System.out.print(i + " ");
        }
    }
    
    public void testForExample3(){
        /*
            1에서부터 10까지의 총 합계 구하기

            방법1.
            int sum = 1+2+3+4+5+...+9+10;

            방법2.
            int sum = 0;
            sum += 1;
            sum += 2;
            sum += 3;
            ...
            sum += 10;

            >> 규칙확인
               sum 변수에 특정값(1에서부터 10까지 1씩 증가되는 값)이 누적해서 더해지는 과정 반복
         */
        int sum = 0;
        for(int i=1; i<11; i++){ // i가 1에서부터 10까지 1씩 증가되는 반복(1,2,3,4,...,10)
            sum += i;
        }
        System.out.print("1에서부터 10까지의 총 합계 : " + sum);
    }

    public void testForExample4(){
        /*
            실습.
            1에서부터 사용자가 입력한 수까지의 총 합계 구해서 출력

            출력예시 : 1에서부터 xx까지의 총 합계 : xxx
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("1 이상의 정수 입력: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1; i<num+1; i++){ // 1,2,3,...,num
            sum += i;
        }
        System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
    }

    public void testForExample5(){
        // 1에서부터 랜덤값(1~10사이)까지의 총 합계 구하기

        /*
            ## java.lang.Math.random() ##

         */

        //int ranNum = Math.random(); // type 불일치
        //              0.0<= <1.0

        //int ranNum = Math.random() * 10; // type 불일치
        //              0.0<= <10.0     => 0.0 ~ 9.99999999...

        //int ranNum = Math.random() * 10 + 1; // type 불일치
        //              0.0<= <11.0     => 1.0 ~ 10.9999999...

        int ranNum = (int)(Math.random() * 10 + 1);
        //                1<= <11     => 1 ~ 10

        System.out.println("랜덤값 : " + ranNum);

        // [랜덤값버뮈지정Tip]
        // (int)(Math.random() * 발생시킬갯수 + 발생시킬랜덤값의시작수)
        // ex) 11~20 : (int)(Math.random() * 10 + 11)

        int sum = 0;
        for(int i=1; i<=ranNum; i++){
            sum += i;
        }
        System.out.printf("1에서부터 %d까지의 총 합계 : %d", ranNum, sum);
    }

    public void testForExample6(){
        // 임의의 문자열의 각 인덱스별 문자들 출력

        String str = "Hello";

        /*
            H => 출력 (str.charAt(0))
            e => 출력 (str.charAt(1))
            l => 출력 (str.charAt(2))
            l => 출력 (str.charAt(3))
            o => 출력 (str.charAt(4))

            0번인덱스부터 4번인덱스(마지막인덱스)까지 매번1씩 증가하면 반복 수행
            마지막인덱스 : 문자열의길이(글자수)
         */
        for(int i=0; i<5; i++){
            System.out.println(str.charAt(i));
        }
    }

    public void testForExample7(){
        // 사용자가 입력한 문자열의 모든 인덱스별 문자 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*
            apple 길이 : 5글자
            01234

            kiwi 길이 : 4글자
            0123

            strawberry 길이 : 10글자
            0123456789

            마지막인덱스 == 문자열의 길이-1
            추출하고자 하는 인덱스 범위 0~(문자열의길이-1)
         */
        System.out.println("문자열의 길이(글자수) : " + str.length());
        System.out.println("문자열의 마지막 인덱스 수 : " + (str.length() - 1));

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public void testForExample8(){
        /*
            2단 출력하기
            2 X 1 =
            2 X 2 =
            2 X 3 =
            ...
            2 X 9 =
         */

        /* 
        //내가쓴오류코드
        System.out.println("===2단 출력하기===");
        for(int i=1; i<10; i++){
            int multiply=0;
            multiply = 2 * i;
        }
        System.out.println("2 X %d = %d", i, multiply);
         */
        int dan = 2;
        for(int su=1; su<10; su++){
            System.out.printf("%d X %d = %d\n", dan, su, dan*su);
        }
    }

    public void testForExample9(){
        /*
            실습.
            2부터 9사이의 랜덤 단 출력하기
         */

        int dan = (int)(Math.random() * 8 + 2);
        for(int su=1; su<=9; su++){
            System.out.printf("%d X %d = %d\n", dan, su, dan*su);
        }
    }

    public void testNestedFor(){
        /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
         */
        for(int j=1; j<=3; j++) { // 행을 지정하는 for (1~3)
            for (int i = 1; i <= 5; i++) { // 열을 지정하는 for (1~5)
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void testNestedForExample1(){
        /*
            ****
            ****
            ****
            ****
            
            System.out.print("*") 출력문 활용
         */
        
        // 행은 1~4까지 반복  => 바깥쪽 for문
        // 매 행마다 옅은 1~4까지 반복    => 안쪽 for문
        
        for(int j=1; j<=4; j++) {
            for (int i=1; i<=4; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void testNestedForExample2(){
        /*
            실습.

            1***        => i=1 && j=1
            *2**        => i=2 && j=2
            **3*        => i=3 && j=3
            ***4        => i=4 && j=4
         */

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(i==j) {
                    System.out.print(i);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        // 2단부터 9단까지 전체 출력
        System.out.print("==구구단==\n\n");
        for (int dan=2; dan<=9; dan++) { // dan=2~9
            System.out.printf("===%d단===\n", dan);
            for (int su=1; su<=9; su++) { // su=1~9
                System.out.printf("%d X %d = %d\n", dan, su, dan * su);
            }
            System.out.println();
        }
    }

    public void testNestedForExample4(){
        /*
            <1일차 수업>
            1교시
            2교시
            ...
            8교시
            
            <2일차 수업>
            1교시
            2교시
            ...
            8교시
            
            ...
            
            <5일차 수업>
            1교시
            2교시
            ...
            8교시
            
            위와 같이 출력
         */
        for(int i=1; i<=5; i++){
            System.out.printf("<%d일차 수업>\n", i);
            for(int j=1; j<=8; j++){
                System.out.printf("%d교시\n", j);
            }
            System.out.println();
        }
    }

    public void testInfinityLoop() {

        Scanner sc = new Scanner(System.in);

        //for (;;){
        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. 1부터 5까지 출력"); // testForExample1()
            System.out.println("2. 1부터 특정수까지의 총합계"); // testForExample4()
            System.out.println("3. 특정문자열의 각자리 문자"); // testForExample7()
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
                        System.out.println("메뉴를 잘못 선택하셨습니다. 다시 출력해주세요");
                }
            }
        }
}
