package com.jjanggu.secton02.loop.run;

import java.util.Scanner;

public class For {

    /*
        ## for문 ##
        1. while문에 비해서 가독성이 좋음
        2. 박복해서 사용할 값의 범위가 명확하거나, 반복횟수가 정해져 있을 대 사용을 권장함
        3. 3가지 구문(초기식, 조건식,상태변화)으로 반복횟수를 지정할 수 있음
        4. 작성 형식
            for(초기식; 조건식; 상태변화) {
                반복적으로 실행할 구문
            }
        5. 용어 정리
           1 ) 초기식 : 반복문 실행시 최초에 단 한 번만 실행되는 구문
                        (주로 반복문 안에서 사용될 변수 선언 및 초기화 하는 구문)
           2 ) 조건식 : 반복문이 수행될 조건을 작성하는 구문
                        (주로 초기식에 선언돤 변수를 가지고 조건식 작성)
           3) 상태변화 : 반복문을 제어하는 변수 값을 변화시키는 구문
                        (주로 초기식에 선언된 변수를 증감연산자와 함께 작성)
        6. 유의 사항
           초지식 , 조건식, 상태변화 모두 생략가능 (무한 반복문)
           단, 각 항목들을 구분하기 위한 ;은 반드시 기술해야됨
           ex) for(;;) {}
     */

    public void testBasicFor() {
        //"안녕하세요" 5회 반복
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }

        for (int i = 11; i <= 15; i++) {//11에서 15까지 1씩 증가하는 동안 반복(11,12,13,14,15)
            System.out.println("반갑습니다");
        }

        for(int i = 0; i<5; i++){
            System.out.println("어서오세요");
        }

        //[반복횟수지정Tip]
        //for(int i = 0; i<반복횟수, i++)
    }

    public void testForExample1(){
        /*
            1부터 5까지 1씩 증가되는 값 출력
            ex) 1 2 3 4 5
         */
        for(int i = 1 ; i <= 5 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.print((i + 1) + " ");
        }
    }

    public void testForExample2() {
        /*
            위의 내용을 역순으로 출력
            ex) 5 4 3 2 1
         */
        for(int i = 1; i <= 5; i++){
            System.out.print(6-i + " ");
        }
        System.out.println();

        for(int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
    }

    public void testForExample3() {
        /*
            1에서부터 10까지의 총 합계 구하기

            방법 1.
            int sum = 1+2+3+4+5...+9+10;

            방법 2.
            int sum = 0;
            sum += 1;
            sum += 2;
            sum += 3;
            ...
            sum += 10;
         */
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1에서부터 10까지의 총 합계" + sum);

    }

    public void testForExample4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1이상의 정수 입력 : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 1; i<=num; i++ ){
            sum += i;
        }
        System.out.println(" 1에서부터" + num + "까지의 총 합계 : " +sum);
    }

    public void testForExample5() {
        // 1에서 부터 랜덤1~10사이값까지의 총 합계 구하기

        /*
            ## java.lang.math.random() ##
            1. 매번 새로운 난수(랜덤값)를 반환해주는 메소드
            2. static 메소드로 math 객체를 생성하지 않아도 math.random() 호출로 바로 실핼가능
            3. double형의 0.0 이상  1.0 미만의 실수 난수값 반환
               정수 형태의 랜덤값을 얻고자 한다면 해당 메소드의 결과와 산술연산을 통해 수정해서 사용

               Math.random() 호출시
               0.0 ~ 0.9999999... 사이의 랜덤값 발생
         */

        // int ranNum = Math.random(); // type 불일치
        //              0.0 <=  <1.0

        // int ranNum = Math.random() * 10; // type 불일치
        //              0.0 <=  <10.0   => 0.0 ~ 9.9999999.....

        // int ranNum = Math.random() * 10 + 1; //type 불일치
        //              1.0 <=  <11.0   => 1.0 ~ 10.999999....

        int ranNum = (int)(Math.random() * 10 + 1);
        //              1<= <11     => 1~10

        System.out.println("랜덤값 : " + ranNum);


        // [랜덤값범위지정Tip]
        // (int)(Math.random() * 발생시킬갯수 + 발생시킬랜덤값의 시작수)
        // ex) 11~20 : (int)(Math.random() * 10 + 11)

        int sum = 0;
        for(int i = 1; i <= ranNum; i++){
            sum += i;
        }
        System.out.printf("1에서부터 %d까지의 총 합계 : %d", ranNum, sum);

    }

    public void testForExample6(){
        //임의의 문자열의 각 인덱스별 문자들 출력

        String str = "Hello";

        /*
            H => str.charAt(0)
            e => str.charAt(1)
            l => str.charAt(2)
            l => str.charAt(3)
            o => str.charAt(4)
         */

        for(int i = 0; i < 5; i++){
            System.out.println(str.charAt(i));
        }

    }

    public void testForExample7(){
        // 사용자가 입력한 문자열의 모든 인덱스별 문자 출력
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        /*
            apple 길이 : 5글자
            01234

            kiwi 길이 : 4글자
            0123

            strawberry : 10글자
            0123456789

            마지막인덱스 == 문자열의 길이 -1
            추출하고자 하는 인덱스 범위  0~문자열의 길이-1
         */
//        System.out.println("문자열의 길이(글자수) : " + str.length());
//        System.out.println("문자열의 길이(글자수) : " + (str.length()-1));
        int length = str.length();
        for(int i = 0; i < length; i++){
            System.out.println(str.charAt(i));
        }


    }

    public void testForExample8(){
        /*
            2단 출력하기
            2 * 1 =
            2 * 2 =
            ...
            2 * 9 =
         */
        int dan = 2;
        for(int i = 1; i <10; i++){
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i) );
        }
    }


    public void testForExample9() {
        /*
            실습.
            2부터 9사이의 랜덤 단 출력하기
         */

        int dan =(int)(Math.random()*10);

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n",dan,i,dan*i);
        }
    }

    public void testNestedFor(){
        /*
            1 2 3 4 5
            1 2 3 4 5
            1 2 3 4 5
         */

        for (int j = 1; j <= 3; j++){ //행을 지정
            for(int i = 1; i < 6; i++) { // 열을 지정
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public void testNestedForExample(){
        /*
            ****
            ****
            ****
            ****
         */

        for(int i = 1; i <= 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println(); // 안쪽 for문 진행 후 열 바꿈
        }
    }

    public void testNestedForExample2(){
        /*
         1***
         *2**
         **3*
         ***4
         */
        // charAt(i) i번째 숫자 i charAt(i) = i+1

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    public void testNestedForExample3() {
        // 2단부터 9단까지 출력

        for(int dan =2; dan <= 9; dan++) {
            System.out.println("=== " + dan + "단 ===");
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
            }
            System.out.println();
        }

    }

    public void testNestedForExample4() {

        for(int day = 1; day <= 5; day++){
            System.out.println("< " + day + "일차 수업 >");
            for(int hour = 1; hour <= 8; hour++){
                System.out.println(hour + "교시");
            }
            System.out.println();
        }

    }

    public void testInfinityLoop() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Menu ======");
            System.out.println("1. 1부터 5까지 출력"); // testForExample1()
            System.out.println("2. 1부터 특정수까지이 총합계"); // testForExample4()
            System.out.println("3. 특정문자열의 각 자리 문자"); // testForExample7()
            System.out.println("0. 프로그램 종료");
            System.out.println(">> 메뉴 선택 : ");
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
                    System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
        }
    }




}
