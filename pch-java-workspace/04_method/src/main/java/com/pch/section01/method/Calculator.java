package com.pch.section01.method;

public class Calculator {
    /**
     * ## 오버로딩 ##
     * - 동일한 클래스에 동일한 이름의 메서드를 2개 이상 정의하는 것
     * - 메서드명이 같은 대신 반드시 매개변수가 다르게(타입, 개수, 순서) 지정되어야 함
     */

    int a;
    int b;

    public Calculator(){}

    Calculator(int a, int b) {}

    public void info1(int a, int b) {
        System.out.println("덧셈 계산기");
        System.out.println(a+b);
    }

    public void info2(int a, int b){
        System.out.println("뺄셈 계산기");
        System.out.println(a-b);
    }

    public void info3(int a, int b){
        System.out.println("곱셈 계산기");
        System.out.println(a*b);
    }

    public void info4(int a, int b){
        System.out.println("나눗셈 계산기");
        System.out.println(a/b);
    }

    public void info5(int a, int b){
        System.out.println("나머지 계산기");
        System.out.println(a%b);
    }

    public void sum(int a, int b){
        System.out.println("덧셈 연산"+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("더블덧셈 연산"+(a+b));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int returnIntNumber(){
        return 5;
    }
}
