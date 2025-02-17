package com.jun.section05.variable;

public class Application {
    public static void main(String[] args) {

        // 1) 프로그램 실행시 => Static 메모리에 "staticNum 할당"(JVM 자동초기화)

        // 2) 인스턴스 생성시 => Heap 메모리에 "globalNum 할당" (JVM 자동초기화)
        KindsOfVariable kv = new KindsOfVariable();

        // 3) 메소드 실행시 => Stack 메모리에 "paramNum, localNum 할당" (수동 초기화)
        kv.test(10);

        // 4) 메소드 종료시 => Stack 메모리에 "paramNum, localNum 소멸"

        // 5) GC에 의해 인스턴스 소멸시 => Heap 메모리에 "globalNum 소멸"
        kv= null;

        // 6) 프로그램 종료시 => Static 메모리에 "staticNum 소멸"

    }
}
