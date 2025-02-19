package com.sotogito.section5.variable;

public class KindsOfVariable {
    private int globalNum; //객체 생성~끝
    /**
     * 1. 인스턴스 변수
     * - 선언위치 : class block
     * - 생성시기 : 해당 클래스를 통해 객체생성시 Heap메모리 할당 (JVM 자동초기화)
     * - 소멸시기 : 인스턴스가 소멸될 때 - garbage collector가 처리
     * - 사용범위 : 클래스 전역
     */


    private static int staticNum; //프로그램 시작! 끝

    /**
     * 2. 클래스 변수
     * - 선언위치 : class block
     * - 생성시기 : 프로그램 실행시 static메모리 할당(JVM 자동초기화)
     * - 소멸시기 : 프로그램이 종료시 삭제
     * - 사용범위 : 클래스 전역
     */

    public void test(int paraNum) {
        /**
         * 지역변수
         * - 선언 위치 : 메서드 안
         * - 생성시기 : 해당 메서드 block실행 시 static메모리에할당 - 직접 초기화
         * - 소멸시기 : block이 끝날 때
         * - 사용범위 : 선언된 해당 block
         */
        int localNum; //메서드 실행~끝

        System.out.println(paraNum); //넘겨준 값
//        System.out.println(localNum); //직접 초기화 안 해줬기 때문에 오류
        System.out.println(globalNum); //0으로 자동초기화
        System.out.println(staticNum); //0으로 자동초기화
    }
}

