package com.younggalee.section01.method;

import java.sql.SQLOutput;

public class Calculator {

    /*
        ## 메소드 ##
        1. Method
        2. 클래스 내부에서 작성되는 독립적인 기능 담당하는 함수
        3. 작성형식
           접근제어자 반환타입 메소드명([매개변수, ...]){
        // 생략 가능한 부분은 [ ]로 표현할 예정

        4. 용어정리
        1. 반환타입 : 반환값의 자료형 (없으면 void)
        2. 매개변수(parameter) : 메소드 호출시 메소드로 전달되는 데이터(argument, 인자)를 저장하는 변수
     */

    //Calculator의 정보를 출력하는 기능
    public void info1() {
        System.out.println("덧셈연산이 가능한 계산기입니다.");
    }

    public void info2() {
        System.out.println("뺄셈연산이 가능한 계산기입니다.");
    }

    public void information() {
        /*
            ## 동일 클래스 내의 메소드 호출방법 ##
         */
        info1();
        info2();
    }

    //============================
    /*
        ## 매개변수 (parameter) ##
        메소드로 전달되는 데이터(인자)를 저장하기 위한 변수
        매개변수는 해당 메소드 내부에서만 이용가능
        실행 끝나면 메모리에서 사라짐
     */
    // 특정값을 전달받아 해당 값을 출력하는 메소드
    public void printIntNumber(int num) {
        System.out.println(num);
    }

    public void printDoubleNumber(double num) {
        System.out.println(num);
    }

    public void printNumber(int num1, double num2) {
        System.out.println(num1 + "" + num2);
    }
    /*
    ## 오버로딩(Overloading) ##
    1. 동일한 클래스에 동일한 이름의 메소드를 2개 이상 정의하는 것
    2. 메소드명은 같지만 반드시 매개변수가 *다르게(타입,개수,순서 등)* 지정되어야함.
    */

    // 두개의 정수값을 전달받아 덧셈연산 후 결과출력 기능
    public void sum(int a, int b) {
        System.out.println("정수덧셈 : " + (a + b));

    }

    public void sum(int a, int b, int c) {
        System.out.println("세가지 수 덧셈 : " + (a + b + c));

    }

    public void sum(double a, double b) {
        System.out.println("실수덧셈 : " + (a + b));
    }

    public void sum(int a, double b) {
        System.out.println("ex덧셈1 : " + (a + b));

    }

    public void sum(double a, int b) {
        System.out.println("ex덧셈2 : " + (a + b));
    }

    //호출이 기준. 호출시 식별불가. 반환타입 중요하지 않음.
    //public int sum(int a, int b) {
    //    System.out.println("정수덧셈 : " + (a + b));
    //    return 5;
    //}


    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    /*
        ## 반환값 ##
        하나의 데이터만 반환 가능
        (여러개 값을 반환할때는 배열, 객체, 컬렉션등에 담아서 하나의 데이터로 반환해야함)
     */
    public int returnIntNumber() {
        return 5;
    }
//코드를 작성하는 과정에서 실시간으로 컴파일러가 돌아가고 있음.
//JDK에 있는 컴파일러가 작성한 자바코드를 컴퓨터(바이트) 언어로 변환하여 .class를 만들고
// run했을 때, 이 .class가 실행됨. (2: 15 : 00)

    // 두 정수값을 전달받아 곱셈연산 결과 반환 기능
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return num1 / (double)num2;
    }

    public int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }


}
