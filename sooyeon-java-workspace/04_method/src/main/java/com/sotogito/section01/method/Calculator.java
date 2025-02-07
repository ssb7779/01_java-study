package com.sotogito.section01.method;

public class Calculator {
    /**
     * ## 메서드
     * 1. 클래스 내부에서 작성되는 독립적인 기능을 담당하는 함수
     * 2. 작성 형식 : 접근제어자 반환타입 메서드명(매개변수s){소스코드 + return 반환값}
     * 4. 용어 정리
     * - 반환타입 : 반환값의 자료형
     * - 매개변수(parameter) : 메서드 호출시 메서드로 전달되는 데이터를 저장하는 변수
     */

    /**
     * ## 매개변수
     * 1. 메서드로 전달되는 데이터를 저장하기 위한 변수
     * 2. 매개변수는 해당 메서드 내부에서만 사용 가능
     */

    //계산기 정보 출력
    public void info1() {
        System.out.println("덧셈연산이 가능한 계산기");
    }

    public void info2() {
        System.out.println("뺄셈연산이 가능한 계산기");
    }

    public void information() {
        info1();
        info2();
    }

    // 특정 값을 전달 받아 해당 값을 출력
    public void printIntNumber(int number) {
        System.out.println("전달받은 정수값은" + number + "입니다.");
    }

    public void printDoubleNumber(double number) {
        System.out.println("전달받은 실수값은" + number + "입니다.");
    }

    public void printNumber(int num1, double num2) {
        System.out.println("정수" + num1);
        System.out.println("실수" + num2);
    }


    /**
     * 오버로딩 Overloading
     * - 동일 클래스, 이름의 메서드를 2개 이상 정의하는 것
     * - 메서드명이 같은 대신에 반드시 매개변수를 다르게(타입,개수,순서)
     */

    //두개의 정수값을 전달 받아서 덧셈연산 후 결과 출력
    public void sum(int a, int b) {
        System.out.println("덧셈 연산 결과 :" + (a + b));
    }

    public void sum(double a, double b) {
        System.out.println("덧셈 연산 결과 :" + (a + b));
    }

    public void sum(int a, int b, int c) {
        System.out.println("덧셈 연산 결과 :" + (a + b + c));
    }

//    public int sum(int a, int b){
//        return a + b;
//    }

    public void minus(int a, int b) {
        System.out.println(a - b);
    }

    /**
     * ## 반환값
     * - 메서드 실행 후 호출했던 곳으로 결과 반환
     * - 하나의 데이터만 반환(여러개는 하나의 데이터로 묶어서 반환)
     * <p>
     * ## 반환타입
     * - 메서드에 반환값의 타입 정의
     * - 반환값의 유무에 따른 반환 타입
     * x : void
     * o : 자료형
     */

    public int returnIntNumber() {
        return 5;
    }

    //매개변수 + 곱셈 반환
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
    }


    /*
    실습
    두 정수를 받는다. + max 메서드를 정읳나다.
    두 정수를 받는다. + min 메서드를 정의한다.
     */

    public int calculateMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    public int calculateMinNumber(int a, int b) {
        return a < b ? a : b;
    }

}
