package com.podoseee.section05.variable;

public class KindsOfVariable {

    /*
        1. 인스턴스 변수
     */
    private int globalNum;
    
    /*
        2. 클래스 변수
     */
    private static int staticNum;

    public void test(int paramNum){

        /*
            3. 지역 변수
         */
        int localNum = 200; // 지역변수는 초기화를 해야 호출 가능

        System.out.println("매개변수: " + paramNum);
        System.out.println("지역변수: " + localNum);
        System.out.println("인스턴스변수: " + globalNum);
        System.out.println("클래스변수: " + staticNum);
    }

}
