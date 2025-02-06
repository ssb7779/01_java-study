package com.john.section01.method;

/*
    ## 메서드
    1. 클래스 내부에서 작성되는 독립적인 기능을 담당하는 함수
    2. [접근제어자] [반환타입] [Method name]([param1, param2, ...]){
            return return value;
        }
    3. 용어 정리
        3.1. 반환타입 : 반환값(메서드의 실행 결과값)의 자료형(없는 경우 void)
        3.2. 매개변수 : 메서드 호출시 메서드로 전달되는 데이터(인자, argument)를 저장하는 변수. == parameter

    4. 호출하고자 하는 메서드의 변수 선언부에 선언한대로 자료형 개수, 순서가 일치하게 전달해야됨.

    5. Overloading 과 Overriding
        5.1. Overloading
            - 동일한 클래스에 동일한 이름의 메서드를 2개이상 정의하는 것
            - 메서드명은 같되, 매개변수(타입, 개수, 순서)는 반드시 다르게 지정되어야함

    6. 반환값
        6.1. 반환값은 하나의 데이터만 반환할 수 있음
        6.2. 메서드 정의시작성
        6.3. 반환값 유무에 따라 (void(없는 경우), type)
 */
public class Calculator {

    public void info(){
        System.out.println("덧셈연산이 가능한 계산기");
    }

    public void info2(){
        System.out.println("뺄셈연산이 가능한 계산기");
    }

    public static void info3(){
        System.out.println("static void method");
    }

    public void printIntNumber(int num){
        System.out.println("전달 받은 정수값: " + num + "입니다");
    }

    public void printDoubleNumber(double num){
        System.out.println("전달 받은 실수값: " + num + "입니다");
    }

    public void printNumber(int num, double num2){
        System.out.println("정수값: " + num);
        System.out.println("실수값: " + num2);
    }

    public void information(){
        info();
        info2();
    }

    public void sum(int a, int b){
        System.out.println("sum a + b: " + a + b);
    }

//    public int sum(int a, int b){}

    public void sum(double a, int b){
        System.out.println("sum double a + int b: " + a + b);
    }

    public void sum(int a, int b, int c){
        System.out.println("sum int a + b + c: " + a + b + c);
    }

    public void sub(int a, int b){
        System.out.println("sub a - b: " + (a - b));
        return;
    }

    public int returnIntNumber(){
        return 5;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public int max(int a, int b){
        return a > b ? a : b;
    }

    public int min(int a, int b){
        return a < b ? a : b;
    }
}