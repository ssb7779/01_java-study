package com.pch.section05.singleton;

public class LazySingleton {

    // 프로그램 실행 시 static 메모리에 참조변수만 할당 (인스턴스는 생성해두지 않음, null인 상태)
    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    // 인스턴스가 필요로 할 때 호출 될 method
    // 인스턴스가 생성되지 않은 상태(최초) 라면 인스턴스를 생성해서 반환
    // 이미 생성되어 있는 상태라면
    public static LazySingleton getInstance() {
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
