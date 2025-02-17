package com.younggalee.section05.variable;

public class KindsOfVariable {
    private int globalNum;  // 인스턴스변수

    // 이름은 접근방식에따라
    /*
    인스턴스 변수
    1) 선언위치 : class block
    2) 생서시기 : 해당 클래스를 통해 객체생성시(인스턴스화) Heap메모리에 할당 (JVM 자동초기화)
    3) 소멸시기 : 인스턴스 소멸시
    4) 사용범위 : 클래스 전역
     */

    private static int staticNum;
    /*
    클래스변수
    1) 선언위치 : class block
    2) 생성시기 : 프로그램 실행시 Static 메모리에 할당 (Jvm 자동초기화)
    3) 소멸시기 : 프로그램 종료시
    4)사용범위 : 클래스 전역 (my + ?)  ***************
     */

    public void test(int paramNum){ //매개변수이자 지역변수
        int localNum; //지역변수
        /*
        지역변수 (매개변수도 해당됨)
        1) 선언위치 : class 외 block (method for if 등)
        2) 생성시기 : 해당 블럭이 호출되어 시작될때 Stack 메모리에 할당됨 (stack은 jvm의 영역이 아님. 수동초기화)
        3) 소멸시기 : 해당 블럭 종료시
        4) 사용범위 : 선언 블럭 내에서만
         */
        localNum = 200;

        System.out.println(paramNum);
        System.out.println(localNum);
        System.out.println(globalNum);
        System.out.println(staticNum);
    }

}
