package com.sotogito.section5.variable;

public class Application {
    public static void main(String[] args) {
        //1. staticNum 프로그램 실행 시
        KindsOfVariable k = new KindsOfVariable(); //2. globalNum 인스턴스 생성 시
        k.test(1); // 3. paraNum, localNum 메서드 실행시
        //4. paraNum, localNum 메서드 종료시 소멸

        k = null;//5. globalNum 인스턴스 소멸시 소멸
        //6. staticNum 프로그램 종료시 소멸
    }
}
