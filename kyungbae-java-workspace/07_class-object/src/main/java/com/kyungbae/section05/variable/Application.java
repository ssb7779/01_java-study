package com.kyungbae.section05.variable;

public class Application {

    public static void main(String[] args) {

        // 1) program 실행 시 => Static 메모리에 "Class variable(staticNum) 생성" (JVM 자동초기화) = 0;

        // 2) instance 생성 시 => Heap 메모리에 "instance variable(globalNum) 생성" (JVM 자동초기화) = 0;
        KindsOfVariable kov = new KindsOfVariable();

        //3) method 실행 시 => Static 메모리에 "local variable(paramNum, localNum) 생성" (수동 초기화 진행) paramNum = 10; localNum =1;
        kov.test(10);

        //4) method 종료 시 => stack 메모리에 "local variable(paramNum, localNum) 소멸"

        //5) GC에 의해 instance 소멸시 => Heap 메모리에 "instance variable(globalNum) 소멸"
        kov = null;

        // 6) 프로그램 종료시 => Static 메모리에 "Class variable(staticNum) 소멸"
    }

} // class end
