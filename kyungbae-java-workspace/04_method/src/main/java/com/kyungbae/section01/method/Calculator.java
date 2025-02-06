package com.kyungbae.section01.method;

public class Calculator { // class start

    /*
        # 메소드
        1. Method
        2. 클래스 내부에서 작성되는 독립적인 기능 담당하는 함수
        3. 작성형식
            접근제어자 반환타입 메소드명([매개변수, 매개변수, ....]) {
                본문내용
                [return 반환값]; => 반환값은 반환타입과 같은 자료형으로 작성
            }
                *[] 생락가능
         4. 용어 정리
            1) 반환타입 : 반환값 (메소드의 실행 결과값)의 자료형 ( 만일 반환값이 없을경우 void 작성)
            2) 매개변수(parameter) : 메소드 호출 시 메소드로 전달되는 데이터(argument, 인자)를 저장하는 변수
     */

//    Calculator의 정보를 출력하는 기능
    public void info1() { // info1 start
//  접근제어자 반환타입 메소드명 / 매개변수와 return이 없는 메소드

        System.out.println("덧셈연산이 가능한 계산기 입니다.");

    } // info1 end

    public void info2() { // info2 start

        System.out.println("뺄셈연산이 가능한 계산기 입니다.");

    } // info2 end

    public void information() { // information start

        /*
            # 동일 클래스 내의 메소드 호출
            메소드명();
         */
        info1();
        info2();

    } // information end

//    -----------------------------------------------

    /*
        # 매개변수
        1. parameter
        2. 메소드로 전달되는 데이터 (argument, 인자)를 저장하기 위한 변수
        3. 매개변수는 해당 메소드 내부에서만 사용 가능
     */

//    특정 값을 전달받아 해당 값을 출력
    public void printIntNumber(int num) { // pIN start

        System.out.println("전달받은 정수값은 " + num + "입니다");

    } // pIN end

    public void printDoubleNumber(double num) { // pDN start

        System.out.println("전달받은 실수값은 " + num + "입니다");

    } // pDN end

    public void printNumber(int num1, double num2) { // pN start

        System.out.println("정수값 " + num1);
        System.out.println("실수값 " + num2);

    } // pN end

//    -----------------------------------------------

    /*
        # 오버로딩
        1. Overloading
        2. 동일한 클래스에 동일한 이름의 메소드를 2개 이상 정의하는 것
        3. 메소드명이 같은 대신 매개변수(타입, 갯수, 순서)가 다르게 지정되어야 한다
     */

//    두개의 값을 전달받아 덧셈연산 후 결과 출력
    public void sum(int a, int b) { // sum int start

        System.out.println(
                "덧셈 연산 결과: " + (a + b)
        );

    } // sum int end

    public void sum(double a, double b) { // sum double start

        System.out.println(
                "덧셈 연산 결과: " + (a + b)
        );

    } // sum double end

//    public void sum(int num1, int num2) {} // 자료형이 같으면 매개변수명이 달라도 오류
    public void sum(int a, int b, int c) {}
    public void sum(int a, double b) {}

    /*
    public int sum(int a, int b) { // 반환타입이 달라도 오류

        return 0;

    }
     */

//    두개의 정수값을 전달받아 뺼셈 연산 결과를 출력해주는 minus 메소드 정의

    public void minus(int a, int b) { // minus start

        System.out.println(
                "뺼셈 연산 결과: " + (a - b)
        );

//        return; <= 생략되어 있는 것 // 자바 컴파일러가 자동으로 return 작성
        /*
            .java (Java Code) ==컴파일==> .class (Java Byte Code) ==실행==>
                              ㄴ컴파일러
         */

    } // minus end

//    ----------------------------------------------------------------

    /*
        # 반환값
        1. 메소드 실행 후 호출했던 곳으로 돌려줄 값을 의미
        2. 하나의 데이터만 반환 가능
            (여러개의 값을 반환하고자 할 경우 하나의 데이터로 담아서(배열, 객체, 컬렉션) 반환해야됨)

        # 반환타입
        1. 반환값의 타입을 의미
        2. 메소드 정의시 작성
        3. 반환값의 유무에 따른 반환 타입
            1) 반환겂이 없는 경우 : void
            2) 반환값이 있는 경우 : 반환값의 자료형(type)
     */

    public int returnIntNumber() {

        return 5;

    } // rIN end

//    두 정수값을 전달받아 곱셈 연산 결과 반환
    public int multiply(int a, int b) {

        return a * b;

    } // multiply end

//    두 숫자값을 전달받아 나눗셈 연산 결과 반환
    public int divide(int a, int b) {

        return a / b;

    } // divide int end
    public double divide(double a, double b) {

        return a / b;

    } // divide double end

    /*
        # 실습
        1. 두 정수값을 전달받아 두 수 중 더 큰 값을 반환해주는 max 메소드 정의
        2. 두 정수값을 전달받아 두 수 중 더 작은 값을 반환해주는 min 메소드 정의
     */
    public int max(int a, int b) {

        return ( a > b ? a : b );

    } // max end
    public int min(int a, int b) {

        return ( a < b ? a : b );

    } // min end


} // class end
