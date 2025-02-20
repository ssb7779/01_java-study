package com.sh.section05.variable;

public class KinkdsOfVariable {
    /*
    인스턴스 변수
    1. 선언위치"class block
    2. 생성시기: 해당 클래스르 통해 객체생성시(인시턴스화)Heap메모리에 할당
    3. 소멸시기: 인스턴스가 소멸될때
    4. 사용범위: 클래스전역

     */
    private int globalNum;

    /*
    클래스 변수\class block
    1선언위치 프로그램 실행시 static메모리에 할당
    2.생성시기\static메모리에 할당

    3.소명시기. 종료시
    4.사용범위. 클래스 전역
     */
    private static int staticNum;
    public void test(int paramNum){
        int localNum =200;
        System.out.println(paramNum);
        System.out.println(localNum);

    }


}
