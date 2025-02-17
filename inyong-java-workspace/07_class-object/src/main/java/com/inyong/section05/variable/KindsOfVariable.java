package com.inyong.section05.variable;

public class KindsOfVariable {
    private int globalNum;
    /*
    1. 인스턴스 변수
        1) 선언 위치 : class block
        2) 생성 시기 : 해당 클래스를 통해 객체생성시(인스턴스화) Heap 메모리에 할당 (JVM 자동 초기화)
        3) 소멸시기 : 인스턴스 소멸시
        4) 인스턴스 사용 범위 : 클래스 전역
     */


    private static int staticNum; // static -> 클래스 변수
    /*
    2. 클래스 변수
        1) 선언위치 : class block
        2) 생성시기 : 프로그램 실행시 Static 메모리에 할당 (JVM 자동 초기화)
        3) 소멸시기 : 프로그램 종료시
        4) 사용범위 : 클래스 전역
     */


    public void test1(int paramNum) {
        /*
        3. 지역 변수
        1) 선언 위치 : 클래스 외에 block (메소드, 제어문(control-flow block)
        2) 생성시기 : 해당 block 이 실행시 stack 메모리에 할당(수동 초기화)
        3) 소멸시기 : 해당 block 종료시
        4) 사용 범위 : 선언된 해당 block
        */
        int localNum = 200;

        System.out.println(paramNum);
        System.out.println(localNum);

    }

}
