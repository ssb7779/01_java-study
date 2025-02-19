package com.younggalee.section05.variable;

public class Application {
    public static void main(String[] args){

        // 1. 프로그램 실행시 => 객체생성도 전에 Static 메모리에 staticNum 할당 (jvm 자동초기화)

        // 2. 인스턴스 생성시 => Heap 메모리에 "globalNum" 할당 (jvm자동초기화)
        KindsOfVariable kv = new KindsOfVariable();


        // 3.  메소드 실행시 => stack 메모리에 "paramNum, localNum 할당" (수동초기화)
        kv.test(10);

        // 4. 메소드 종료시 => stack메모리에 paramNum, localNum 소멸

        kv = null; // 5. GC에 의해 인스턴스 소멸 > heap메모리에 globalNum 소멸


        // 6. 프로그램 종료시 => Static 메모리에 "staticNum 소멸"
    }


}
