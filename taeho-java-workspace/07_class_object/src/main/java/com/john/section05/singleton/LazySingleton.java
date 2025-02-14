package com.john.section05.singleton;

public class LazySingleton {

    // 프로그램 실행시 static메모리에 참조변수만 할당 (인스턴스는 생성해두지 않음, null 상태)
    private static LazySingleton lazySingleton;

    private LazySingleton() {}
    
    // 인스턴스가 필요할 때 호출될 메서드
    // 인스턴스가 생성되지 않은 최초의 상태라면 인스턴스를 생성해서 반환
    // 이미 생성된 상태라면 기존에 생성된 인스턴스를 반환
    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
