package com.kyungbae.section05.variable;

public class KindsOfVariable {

    /*
        1. instance variable
            1) 선언위치 : class block
            2) 생성시기 : 해당 class를 통해 object생성 시(instance화) Heap 메모리에 할당 (JVM 자동초기화)
            3) 소멸시기 : instance 소멸 시 (GC가 삭제)
            4) 사용범위 : class 전역

     */
    private int globalNum;

    /*
        2. class variable
            1) 선언위치 : class block
            2) 생성시기 : program 실행 시 Static 메모리에 할당 (JVM 자동초기화)
            3) 소멸시기 : program 종료 시 소멸
            4) 사용범위 : class 전역
     */
    private static int staticNum;

    public void test(int paramNum){
        /*
            3. local variable (parameter variable 도 포함)
                1) 선언위치 : class 외 block (method, control-flow block 등)
                2) 생성시기 : 해당 block이 실행시 Stack 메모리에 할당 (수동 초기화(initialized))
                3) 소멸시기 : 해당 block이 종료시 소멸
                4) 사용범위 : 선언된 해당 block 內
         */
        int localNum = 1;

        System.out.println("paramNum : " + paramNum);
        System.out.println("localNum : " + localNum);
        System.out.println("instance : " + globalNum);
        System.out.println("classNum : " + staticNum);
    }

} // class end
