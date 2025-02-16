package com.john.section05.variable;

public class KindsOfVariable {
    /*
        인스턴스 변수
        1. 선언위치: class block 최상단에 위치
        2. 생성시기: 해당 클래스를 통해 객체 생성시(인스턴스화) Heap 메모리에 할당(JVM에서 자동 초기화)
        3. 소멸시기: 인스턴스 소멸시 (G.C)
        4. 사용시기: 클래스 전역
     */
    private static int staticNum;


    /*
        클래스 변수
        1. 선언위치: class block
        2. 생성시기: 프로그램 실행시 Static 메모리에 할당 (JVM에서 자동 초기화)
        3. 소멸시기: 프로그램 소멸시
        4. 사용범위: 클래스 전역
    */
    private int globalNum;

    public void test(int paramNum) {
        /*
            지역 변수(매개 변수도 해당)
            1. 선언위치: class 외 block(method, control-flow block등)
            2. 생성시기: 속해있는 블럭이 실행될 때
            3. 소멸시기: 속해있는 블럭이 종료될 때
            4. 사용범위: 속해있는 블럭
        */

        int localNum = 200;

        System.out.println("매개변수: " + paramNum);
        System.out.println("지역변수: " + localNum);
        System.out.println("인스턴스변수: " + globalNum);
        System.out.println("클래스변수: " + staticNum);
    }

}
