package com.podoseee.practice.controller;

import java.util.Scanner;
//import java.lang.*;

public class LoopPractice {

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            a = sc.nextInt();

            if (a >= 1) {
                break;
            } else {
                System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        if (a >= 1) {
            for (int i = a; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("잘못 입력하셨습니다.");
        }
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int a = sc.nextInt();
            for (int i = a; i >= 1; i--) {
                System.out.print(i + " ");
            }
            if (a >= 1) {
                break;
            } else {
                System.out.print("잘못 입력하셨습니다.");
            }
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력하세요 : ");
        int a = sc.nextInt();
        int sum = 0;
        int i;
        for (i = 1; i <= a; i++) {
            System.out.print(i);
            sum += i;
            // 마지막에 + 출력되지 않게 하기 위해, 범위 다르게 설정하여, i랑 따로 출력
            if (i < a) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);

        // 선생님코드
        /*
            for(int i=1; i<=num; i++) { // i값이 1에서부터 사용자가 입력한 수까지 1씩 증가하는 동안 반복

            // 매번 sum 변수에 누적해서 더해줌 (총 합계구하는 구문)
            sum += i;

            // 뿐만아니라 매번 출력도 해줄꺼임 .. 근데 문제에서 요구한 대로 출력하고자 한다면
            if(i < num) { // 출력하고자 하는 i 값이 num보다 작을 때 까지는 해당 숫자 뒤에 '+' 붙여가면서 출력
                System.out.print(i + " + ");
            }else { 	  // 그게 아닐 경우(즉, 출력하고자 하는 i값이 num이 될 경우) 그땐 마지막으로 '=' 붙여서 출력
                System.out.print(i + " = ");
            }
        }
         */
    }

    public void practice6() {
        /*처음 쓴 오류코드
        문제점1. scanner 객체 두 번 생성 X
        문제점2. for루프 :i=0에서 시작해서 동작 X
        문제점3. if 블록 안에서 for 루프 돌리지만, a나 b가 1보다 작으면 아무 동작 X


        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("첫 번째 숫자 : " + a);

        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("두 번째 숫자 : " + b);

        if(a>0 && b>0){
            for(int i=0; ((i<=a && i>=b)|| (i>=a && i<= b)); i++){
                System.out.print(i + " ");
            }
        }else {
            System.out.print("1이상의 숫자만을 입력해주세요.");
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.print("1이상의 숫자만을 입력해주세요.");
            return;
        }

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        /* 선생님 코드
            // 1) 두 수를 가지고 최소값, 최대값을 알아내야됨!!

            int min = Math.min(num1, num2); // Math 클래스에 min 메소드 호출시 비교할 두개의 정수값 전달하면 둘 중에 작은 숫자를 돌려줌
            int max = Math.max(num1, num2); // Math 클래스에 max 메소드 호출시 비교할 두개의 정수값 전달하면 둘 중에 큰 숫자를 돌려줌

            // 2) 최소값에서부터 최대값까지 매번 1씩증가하는 값을 출력
            for(int i=min; i<=max; i++) {
                System.out.print(i + " ");
            }


            }else { // 잘못 입력했을 경우 => "1이상의 숫자를 입력해주세요." 출력
                System.out.println("1이상의 숫자를 입력해주세요.");
            }
         */
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        while (true) {
            System.out.print("첫 번째 숫자 : ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자 : ");
            b = sc.nextInt();

            if (a <= 0 || b <= 0) {
                System.out.print("1이상의 숫자만을 입력해주세요.");
                continue; // 잘못된 입력이면 반복문 처음으로 돌아감 (수정)
            }
            int start = Math.min(a, b);
            int end = Math.max(a, b);

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            break;
        }

    }

    public void practice8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");

        int a = sc.nextInt();
        System.out.printf("===== %d단 ===== \n", a);
        for(int i = 1; i <=9; i++){
            System.out.print(a + " * " + i + " = " + a*i + "\n");
        }
    }


    public void practice9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");

        int a = sc.nextInt();
        if(a >= 2 && a<= 9){
            for (int j = a; j <= 9; j++) {
                System.out.printf("===== %d단 ===== \n", a++);
                for (int i = 1; i <= 9; i++) {
                    System.out.print((a - 1) + " * " + i + " = " + a * i + "\n");
                }
                System.out.println();
            }
        }else {
            System.out.print("2~9 사이의 숫자만 입력해주세요.");
        }
    }


    public void practice10(){
        Scanner sc = new Scanner(System.in);
        int a;

        while (true){
            System.out.print("숫자(2~9) 입력 : ");
            a = sc.nextInt();

            if(a >= 2 && a <= 9){
                break;
            } else {
                System.out.print("2~9 사이의 숫자만 입력해주세요.");
            }
        }
        for (int j = a; j <= 9; j++) {
            System.out.printf("===== %d단 ===== \n", a);
            for (int i = 1; i <= 9; i++) {
                System.out.print(a + " * " + i + " = " + a * i + "\n");
            }
            System.out.println();
            a++;
        }
    }

    public void practice11(){
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 숫자 : ");
        int start = sc.nextInt();

        System.out.print("공차 : ");
        int num = sc.nextInt();

        // start값에서부터 매번 num씩 증가되는 값을 출력 (10번만!!)
        /*
        for(int i=0; i<10; i++){
            System.out.print(start + " ");
            start += num;
        }
         */
        int count = 0;
        while(true){
            System.out.print(start + " ");
            start += num;
            count++;
            if(count == 10){
                break;
            }
        }
    }

    public void practice12(){

        Scanner sc = new Scanner(System.in);

        /*
            무한반복 {
                1. 연산자 입력받기
                        >> 사용자가 입력한 연산자가 "exit"일 경우 => 프로그램 종료
                2. 정수 두 개 입력받기
                        >> 연산자가 / 거나 % 일때 두번째 정수값이 0일 경우 => "0으로 나눌수없다~~" 반복문 다시 시작
                3. 연산기호에 따라 해당 연산 결과 출력
                        >> 연산기호를 잘못 입력했을 경우 => "없는 연산자다~~" 반복문 다시 시작
            }
         */

        while(true){
            // 1. 연산자 입력받기
            System.out.print("연산자(+,-,*,/,%,exit) : ");
            String op = sc.nextLine();

            // >> exit 처리
            if(op.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 2. 정수 두 개 입력받기
            System.out.print("정수1 : ");
            int num1 = sc.nextInt();
            System.out.print("정수2 : ");
            int num2 = sc.nextInt();

            sc.nextLine(); //  버퍼 비우기

            // >> 나눗셈 처리
            if((op.equals("/") || op.equals("%")) && num2 == 0){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
                continue;
            }

            // 3. 연산기호에 따라 해당 연산 결과 출력
            int result = 0; // 연산 결과를 기록할 변수
            switch(op){
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
                case "%": result = num1 % num2; break;
                default:
                    System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
                    continue;
            }
            System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
        }
    }

    public void practice13(){
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("찾고자하는 문자 : ");
        char chr = sc.next().charAt(0);

        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (chr == str.charAt(i)) {
                count++;
            }

        }
        System.out.println("포함된 갯수 : " + count);
    }

    public void practice14(){
        System.out.println("-----------");
        for(int i=1; i<=143; i++){
            System.out.print(i + "회 모금액 : " + 70*i +"원\n");
        }
        System.out.println("총 모금횟수 : 143회");

        /* 선생님 코드
        // 목표금액 (상수로 선언)
            final int GOAL = 10_000;  // 자바에서 큰 수 제시시 가독성을 위해 _를 사용할 수 있음 (표현만 하는것 뿐 실제로는 숫자만 보관됨)

            int money = 70;	// 1회 모금액
            int total = 0;	// 총 모금액
            int count = 0;  // 모금회차

            System.out.println(" ---------------------");
            while(total < GOAL) {
                total += money;
                System.out.printf("%3d회 모금액 : %5d원\n", ++count, total);
            }

            System.out.println("\n총 모금횟수 : " + count + "회");
            System.out.println(" ---------------------");
         */
    }


    // 추가문제 ----------------------------------------------------------------------------
    public void star1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){ // i=1~사용자입력값
            for(int j=1; j<=i; j++){ // j=1~i
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void star2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        // 1 2 3 4
        // 4 3 2 1

        for(int i=1; i<=num; i++){ // i=1~사용자입력값
            for(int j=0; j<=num-i; j++){ // j=0~num-i
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void star3() {

        /*
         **********
         *        *
         *        *
         *        *
         **********
         */

        for(int i=1; i<=5; i++) {

            for(int j=1; j<=10; j++) {
                if(i==1 || i==5) {
                    System.out.print("*");
                }else {
                    if(j==1 || j==10) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();

        }

    }

    // 난이도 상
    public void star4() {
		/*
		     1
		    123
		   12345
		  1234567
		 123456789
		  1234567
		   12345
		    123
		     1
	     */

        for(int i=-4; i<=4; i++) {	// i는 -4~4까지 1씩 증가 (-4,-3,-2,-1,0,1,2,3,4)

            int k = i < 0 ? -i : i;	// i의 절대값을 k변수에 담는 구문 (4,3,2,1,0,1,2,3,4)

            // 앞에 공백을 먼저 출력시키는 for문
            for(int j=0; j<k; j++) { // k횟수만큼 공백이 먼저 출력됨
                System.out.print(" ");
            }

            // 그 후에 숫자를 출력시키는 for문
            for(int j=1; j<=9-2*k; j++) { // 1에서부터 9-2*k까지 1씩 증가되는 구문이 출력
                System.out.print(j);
            }

            /*
             * * 추가설명
             * k=4일 경우 j=1까지 출력 (1)
             * k=3일 경우 j=3까지 출력 (123)
             * k=2일 경우 j=5까지 출력 (12345)
             * k=1일 경우 j=7까지 출력 (1234567)
             * k=0일 경우 j=9까지 출력 (123456789)
             *
             * 따라서 j는 9-2*k 까지로 제시되어야함
             */

            System.out.println(); // 한줄 다 출력되면 그 다음줄로 넘기는 개행출력

        }

    }

    // 난이도 상
    public void star5() {
        /*
         *
         * *
         *   *
         * *
         *
         */

        for(int i=-2; i<=2; i++) {		// i는 -2에서부터 2까지 1씩 증가 (-2,-1,0,1,2)

            int k = i < 0 ? -i : i;	 	// i의 절댓값을 k변수에 대입해둠 (2,1,0,1,2)

            for(int j=0; j<k; j++) {	// k횟수만큼 공백을 먼저 출력
                System.out.print(" ");
            }

            for(int j=1; j<=5-2*k; j++) { // 5-2*k만큼 "*" 또는 "공백"이 출력되어야됨

                if(j==1 || j==5-2*k) {		// 이때 첫번째열 또는 마지막열에만 * 출력하고
                    System.out.print("*");
                }else {						// 그게 아닐경우 공백을 출력하도록
                    System.out.print(" ");
                }

            }

            /*
             * k=2일때 j=1~1   => *
             * k=1일때 j=1~3   => * *
             * k=0일때 j=1~5   => *   *
             */

            System.out.println();

        }
    }
}

