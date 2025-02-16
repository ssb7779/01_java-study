package com.minkook.section05.variable;

public class Application {
    public static void main(String[] args){
        //1) 프로그램 실행시 -> static 메모리에 staticNU< 할당

        //2) 인스턴스 생성시 -> 힙 메모리에 globalNum 할당
        KindsOfValues values = new KindsOfValues();

        //3) 메소드 실행시 -> stack에 paramNum,localNum할당(수동초기화)
        values.test(10);

        //4) 메소드 종료시 -> Stack메모리에 param local 소멸
    }
}
