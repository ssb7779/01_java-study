package com.inyong.section05.singleton;

// 무조건 만들고 시작
public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton(){

    }

    // 인스턴스가 필요 할때 호출 시킬 메소드 (통상적으로 getInstance 라고 지음)

    public static EagerSingleton getInstance(){
     return eager;
    }
}
