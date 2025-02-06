package com.jjanggu.section01.method;

public class Calculator {

    /*
        ## 메소드 ##
        1. Method
        2. 클래스 내부에서 작성되는 독립적인 기능 담당하는 함수
        3. 작성형식
           접근제어자 반환타입 메소드명([매개변수, 매개변수, ...]) {    // []부분은 생략가능
                본문내용
                [return 반환값;]
           }
        4. 용어 정리
           1) 반환타입 : 반환값(메소드의 실행 결과값)의 자료형 (만일 반환값이 없을경우 void작성)
           2) 매개변수 : 메소드 호출시 메소드로 전달되는 데이터(인자, argument)를 저장하는 변수
                         parameter 라고도 함
     */

    // Caculator의 정보를 출력하는 기능
    public void info1() {
        System.out.println("덧셈연산이 가능한 계산기입니다.");
    }

    public void info2() {
        System.out.println("뺄셈연산이 가능한 계산기입니다.");
    }

    public void information() {
            /*
                ## 동일 클래스 내의 클래스 호출 방법"
                메소드();
             */
        info1();
        info2();
        // ================================================

        /*
             ## 매개변수 ##
             1. parameter
             2. 메소드로 전달되는 데이터(인자)를 저장하기 위한 변수
             3. 매개변수는 해당 메소드 내부에서만 사용 가능
         */


        // 특정 값을 전달받아 해당 값을 출력 가능
    }

    public void printIntNumber(int num) {
        System.out.println("전달받은 정수값은 " +num + "입니다.");
    }

    public void printDoubleNumber(double num) {
            System.out.println("전달받은 실수값은 " + num + "입니다.");
    }

    public void printNumber(int num1, double num2){
        System.out.println("정수값 : " + num1);
        System.out.println("실수값 : " + num2);
    }

    // ======================================================

    /*
        ## 오버로딩 ##
        1. overloading
        2. 동일한 클래스에 동일한 이름의 메소드를 2개 이상 정의하는 것
        3. 메소드명이 같은 대신에 반드시 매개변수(타입, 개수, 순서)가 다르게 지정되어야됨
     */

    // 두개의 숫자값을 전달받아 덧셈연산 후 결과 출력 기능

    public void sum(int a, int b) {
        System.out.println("덧셈 연산 결과 : " + (a + b));
    }

    public void sum(double a, double b) {
        System.out.println("덧셈 연산 결과 : " + (a + b));
    }

//    public void sum(int num1, int num2) {} // 매개변수명은 중요하지 않음!
    public void sum(int a, int b, int c) {}
    public void sum(int a, double b){}

    /*
    public int sum(int a, int b) {  // 반환타입도 중요하지 않음
        return 0; //
    }
     */

    /*
        실습.
        두개의 정수값을 전달받아 뺄셈 연산 결과를 출력해주는 minus 메소드 정의
     */
    public void minus(int a, int b) {
        System.out.println("뺄셈 연산 결과 : " + (a - b));
        //return; // 자바 컴파일러가 자동으로 return문 작성해줌
    }

    // ==========================================================

    /*
        ## 반환값 ##
        1. 메소드 실행 후 호출했던 곳으로 돌려줄 값을 의미
        2. 하나의 데이터만 반환 가능
           (여러개의 값을 반환하고자 할 경우 하나의 데이터로 담아서(배열, 객체, 컬렉션) 반환해야됨)

        ## 반환타입 ##
        1. 반환값의 타입을 의미
        2. 메소드 정의시 작성
        3. 반환값의 유무에 따른 반환 타입
           1) 반환값이 없는 경우 : void
           2) 반환값이 있는 경우 : 반환값의 자료형(type)
     */

    public int returnIntNumber() {
        return 5;
    }

    // 두 정수값을 전달받아 곱셈연산 결과 반환 기능
    public int multiply(int a, int b) {
        return a * b;
    } // 일단 void로 반환값을 두고 return 값을 토대로 수정

    // 두 숫자값을 전달받아 나눗셈 연산 결과 반환 기능
    public int divide(int a, int b) {
        return a / b;
    }
    public double divide(double a, double b) {
        return a / b;
    }

    /*
        실습.
        두 정수값을 전달받아 두 수 중 더 큰 값을 반환해주는 max 메소드 정의
        두 정수값을 전달받아 두 수 중 더 작은 값을 반환해주는 min 메소드 정의
     */
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    public int min(int a, int b) {
        return a < b ? a : b;
    }


}
