package com.inyong.section05.variable;

public class Application {
    public static void main(String[] args) {
        KindsOfVariable kv = new KindsOfVariable();


        // 1) 프로그램 실행시 => static 메모리에 staticNum 할당 (jvm 자동 초기화)
        // 2) 인스턴스 생성시 => Heap 메모리에 globalNum 할당 (jVM 자동 초기화
        // 3) 메소드 실행시 => stack 메모리에 "paramNum localNum 할당" (수동초기화)

        kv.test1(10);

        // 4. 메소드 종료시 => statck 메모리에 paramNum, localNum 소멸
        kv = null; //5. GC에 의해 인스턴스 소멸 heap 메모리에 globalNum 소멸

        // 6. 프로그램 종료시 static 메모리에 "staticNum 소멸"


    }
}
