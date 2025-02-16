package com.kyungbae.section05.singleton;

public class LazySingleton {

    // 프로그램 실행 시 static 메모리에 reference variable 만 할당 (null인 상태)
    private static LazySingleton lazy;

    private LazySingleton(){}

    // instance가 필요로 할 때 호출 될 method
    // instance가 생성되지 않은 상태일 경우 (최초)라면 instance를 생성해서 반환
    // 이미 생성되어있는 상태라면 기존에 생성되어있는 instance 반환
    public static LazySingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }

} // class end
