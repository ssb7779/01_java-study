package com.inyong.section01.method;

public class Calculator {
    /*
    메소드 (Method)
    클래스 내부에서 작성되는 독립적인 기능 담당하는 함수

    작성 형식
    접근제어자(public) 반환타입(int) 메소드명(add) ()(인자) {}(범위)

    반환 타입 : 반환값, 자료형, void(없으면)
    매개 변수 : 인자, argument, parameter -> 내부에서만 사용 가능


    ## 오버로딩 overloading

    동일한 클래스에 동일한 이름의 메소드를 2개이상 정의하는것
    메소드명이 같은 대신에 반드시 매개변수(타입, 개수, 순서)가 다르게 지정되어야함

     */

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public void printIntNumber(int num){
        System.out.println("전달받은 정수값은" + num+ "입나다.");
    }

    public void printDoubleNumber(double num){
        System.out.println("전달받은 실수값은" + num + "입니다.");
    }

    /*
       ## 반환값 ##

    1. 메소드 실행 후 호출했던 곳으로 돌려줄 값을 의미
    2. 하나의 데이터만 반환 가능
    (여러개의 값을 반환하고자 할 경우 하나의 데이터로 담아서(배열,객체,컬렉션) 반환해야함)

    ## 반환타입

    1. 반환값의 타입을 의미
    2. 메소드 정의시 작성
    3. 반환값의 유무에 따른 반환 타입
        1) void
        2) 반환값의 자료형 (type)

     */

    public int returnIntNumber(){
        return 5 ;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    // 두 정수값을 전달 받아 두 수중 더 큰값 max, min

    public int max(int a, int b){
        return a >= b ? a : b;
    }

    public int min(int a, int b){
        return a <= b ? a : b;
    }
}
