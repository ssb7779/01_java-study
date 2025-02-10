package com.jun.section02.loop.controller;

import java.util.Scanner;

public class For {

    /*
        ## for문 ##
        1. while문에 비해서 가독성이 좋음
        2. 반복해서 사용할 값의 범위가 명확하거나, 반복횟수가 정해져있을 때 사용을 권장함
        3. 세 가지 구문(초기식, 조건식, 상태변화)으로 반복횟수를 지정할 수 있음
        4. 작성 형식 ────────────────────────┐
           │ for(초기식; 조건식; 상태변화) { │
           │	반복적으로 실행할 구문		 │
           │ }				     		   	 │
           └─────────────────────────────────┘
        5. 용어 정리
           1) 초기식    : 반복문 실행시 최초에 단 한번만 실행되는 구문
                          (주로 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
           2) 조건식    : 반복문이 수행될 조건을 작성하는 구문
                          (주로 초기식에 선언된 변수를 가지고 조건식 작성)
           3) 상태변화  : 반복문을 제어하는 변수 값을 변화시키는 구문
                          (주로 초기식에 선언된 변수를 증감연산자와 함께 작성)
        6. 유의 사항
           초기식, 조건식, 상태변화 모두 생략가능 (무한 반복문)
           단, 각 항목들을 구분하기 위한 ;은 반드시 기술해야됨
           ex) for(;;) {}
     */

    public void testBasicFor(){
        // "안녕하세요" 5회 반복
        for(int i=1; i<=5; i++){ // i=1,2,3,4,5 (1에서부터 5가될때까지 반복)
            System.out.println("안녕하세요");
        }

        // [해석 Tip] 초기식값에서부터 해당조건이 true일때까지 1씩증가하는 동안 반복
        for(int i=11; i<=15; i++){ // 11에서부터 15까지 1씩 증가하는 동안 반복 (11,12,13,14,15)
            System.out.println("반갑습니다");
        }

        for(int i=0; i<5; i++){ // 0에서부터 4까지 1씩 증가되는 동안(0,1,2,3,4)
            System.out.println("어서오세요");
        }

        // [반복횟수지정Tip]
        // for(int i=0; i<반복횟수; i++)
    }

    public void testForExample1(){
        /*
            1부터 5까지 1씩 증가되는 값 출력
            ex) 1 2 3 4 5
         */
        for(int i=1; i<=5; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // 1 2 3 4 5
        for(int i=0; i<5; i++){ // i=0,1,2,3,4
            System.out.print(i + 1 + " ");
        }

    }

    public void testForExample2(){
        /*
            위의 내용을 역순으로 출력
            ex) 5 4 3 2 1
         */
        //        6
        for(int i=1; i<=5; i++){ // - i=1,2,3,4,5
            //     5,4,3,2,1
            System.out.print(6 - i + " ");
        }

        System.out.println();

        // 5에서부터 1까지 1씩 감소되는 동안 반복 (5,4,3,2,1)
        for(int i=5; i>=1; i--){
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
        for(int i=1; i<=10; i++){ // i가 1에서부터 10까지 1씩 증가되는 반복(1,2,3,4...., 10)
            sum += i;
        }

        System.out.println("1에서부터 10까지의 총 합계: " + sum);

    }

    public void testForExample4(){
        /*
            실습.
            1에서부터 사용자가 입력한 수까지의 총 합계 구해서 출력

            출력예시 : 1에서부터 xx까지의 총 합계: xxx
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("1이상의 정수 입력: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=num; i++){ // i=1,2,3,...,num
            sum += i;
        }

        System.out.println("1에서부터 " + num + "까지의 총 합계: " + sum);

    }

    public void testForExample5(){
        // 1에서부터 랜덤값(1~10사이)까지의 총 합계 구하기

        /*
            ## java.lang.Math.random() ##
            1. 매번 새로운 난수(랜덤값)를 반환해주는 메소드
            2. static 메소드로 Math 객체를 생성하지 않아도 Math.random() 호출로 바로 실행가능
            3. double형의 0.0 이상 1.0 미만의 실수 난수값 반환
               정수 형태의 랜덤값을 얻고자 한다면 해당 메소드의 결과와 산술연산을 통해 수정해서 사용

               Math.random() 호출시
               0.0 ~ 0.999999999... 사이의 랜덤값 발생
         */

        // int ranNum = Math.random();  // type 불일치
        //               0.0<= <1.0

        // int ranNum = Math.random() * 10; // type 불일치
        //               0.0<= <10.0   => 0.0 ~ 9.999999999...

        // int ranNum = Math.random() * 10 + 1; // type 불일치
        //               1.0<= <11.0   => 1.0 ~ 10.99999999...

        int ranNum = (int)(Math.random() * 10 + 1);
        //               1<= <11       => 1 ~ 10

        System.out.println("랜덤값: " + ranNum);

        // [랜덤값범위지정Tip]
        // (int)(Math.random() * 발생시킬갯수 + 발생시킬랜덤값의시작수)
        // ex) 11~20 : (int)(Math.random() * 10 + 11)

        int sum = 0;
        for(int i=1; i<=ranNum; i++){
            sum += i;
        }

        System.out.printf("1에서부터 %d까지의 총 합계: %d", ranNum, sum);

    }

    public void testForExample6(){
        // 임의의 문자열의 각 인덱스별 문자들 출력

        String str = "Hello";

        /*
            H => 출력(str.charAt(0))
            e => 출력(str.charAt(1))
            l => 출력(str.charAt(2))
            l => 출력(str.charAt(3))
            o => 출력(str.charAt(4))

            0번인덱스부터 4번인덱스(마지막인덱스)까지 매번1씩 증가하면 반복 수행
            마지막인덱스 : 문자열의길이(글자수) - 1
         */

        //for(int i=0; i<=4; i++){
        for(int i=0; i<5; i++){
            System.out.println(str.charAt(i));
        }

    }

    public void testForExample7(){
        // 사용자가 입력한 문자열의 모든 인덱스별 문자 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
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
        System.out.println("문자열의 길이(글자수): " + str.length());
        System.out.println("문자열의 마지막인덱스수: " + (str.length() - 1));

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }

    public void testForExample8(){
        /*
            2단 출력하기
            2 x 1 =
            2 x 2 =
            2 x 3 =
            ...
            2 x 9 =
         */

        int dan = 2;
        for(int su=1; su<=9; su++){ // su=1~9
            System.out.printf("%d x %d = %d\n", dan, su, dan*su);
        }

    }

    public void testForExample9(){
        /*
            실습.
            2부터 9사이의 랜덤 단 출력하기
         */
        int dan = (int)(Math.random() * 8 + 2);
        for(int su=1; su<=9; su++){
            System.out.printf("%d x %d = %d\n", dan, su, dan * su);
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
        // 매 행마다 열은 1~4까지 반복 => 안쪽 for문

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void testNestedForExample2(){
        /*
            실습.

            1***    => i=1 && j=1
            *2**    => i=2 && j=2
            **3*    => i=3 && j=3
            ***4    => i=4 && j=4
         */

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                if(i == j) {
                    System.out.print(j);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void testNestedForExample3(){
        // 2단부터 9단까지 전체 출력

        /*
        int dan = 2;
        for(int su=1; su<=9; su++){ // su=1~9
            System.out.printf("%d x %d = %d\n", dan, su, dan*su);
        }

        dan = 3;
        for(int su=1; su<=9; su++){ // su=1~9
            System.out.printf("%d x %d = %d\n", dan, su, dan*su);
        }

        dan = 4;
        for(int su=1; su<=9; su++){ // su=1~9
            System.out.printf("%d x %d = %d\n", dan, su, dan*su);
        }

        ...
        */

        for(int dan=2; dan<=9; dan++) { // dan=2~9

            System.out.println("=== " + dan + "단 ===");

            for (int su = 1; su <= 9; su++) { // su=1~9
                System.out.printf("%d x %d = %d\n", dan, su, dan * su);
            }

            System.out.println();

        }

    }

    public void testNestedForExample4(){
        /*
            실습.

            < 1일차 수업 >
            1교시
            2교시
            ...
            8교시

            < 2일차 수업 >
            1교시
            2교시
            ...
            8교시

            ...

            < 5일차 수업 >
            1교시
            2교시
            ...
            8교시

            위와 같이 출력
         */

        for(int day=1; day<=5; day++){
            System.out.println("< " + day + "일차 수업 >");
            for(int hour=1; hour<=8; hour++){
                System.out.println(hour + "교시");
            }
            System.out.println();
        }

    }

    public void testInfinityLoop(){

        Scanner sc = new Scanner(System.in);

        //for(;;){
        while(true) {
            System.out.println("\n========= Menu =======");
            System.out.println("1. 1부터 5까지 출력"); // testForExample1()
            System.out.println("2. 1부터 특정수까지의 총합계"); // testForExample4()
            System.out.println("3. 특정문자열의 각 자리 문자"); // testForExample7()
            System.out.println("0. 프로그램 종료");
            System.out.print(">> 메뉴 선택: ");
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
                    System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
            }
        }



    }














}