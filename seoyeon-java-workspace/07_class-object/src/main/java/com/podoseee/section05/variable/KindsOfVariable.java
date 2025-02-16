package com.podoseee.section05.variable;

public class KindsOfVariable {

    /*
         1. 인스턴스 변수
           1) 선언위치 : class block
           2) 생성시기 : 해당 클래스를 통해 객체생성시(인스턴스화) Heap 메모리에 할당 (JVM 자동초기화)
           3) 소멸시기 : 인스턴스 소멸시
           4) 사용범위 : 클래스 전역
     */
    private int globalNum;
    
    /*
        2. 클래스 변수
           1) 선언위치 : class block
           2) 생성시기 : 프로그램 실행시 Static 메모리에 할당 (JVM 자동초기화)
           3) 소멸시기 : 프로그램 종료시
           4) 사용범위 : 클래스 전역
     */
    private static int staticNum;

    public void test(int paramNum){

        /*
            3. 지역 변수 (매개변수도 해당됨)
               1) 선언위치 : class 외 block (method, control-flow block 등)
               2) 생성시기 : 해당 block이 실행시 Stack 메모리에 할당 (수동 초기화)
               3) 소멸시기 : 해당 block 종료시
               4) 사용범위 : 선언된 해당 block
         */
        int localNum = 200; // 지역변수는 초기화를 해야 호출 가능

        System.out.println("매개변수: " + paramNum);
        System.out.println("지역변수: " + localNum);
        System.out.println("인스턴스변수: " + globalNum);
        System.out.println("클래스변수: " + staticNum);
    }

}
