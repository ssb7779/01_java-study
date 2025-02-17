package com.pch.section05.singleton;

public class EagerSingleton {

    // 프로그램 실행 시 static 메모리에 바로 할당되는데 애초에 인스턴스도 생성시켜 할당
    private static EagerSingleton instance = new EagerSingleton();

    // 싱글톤 패턴은 외부에서 생성자 호출으로 생성하는 것을 제한해야함
    private EagerSingleton() {}

    // 인스턴스가 필요로 할 때 호출시킬 메소드 (통상적으로 getInstance라고 지음)
    public static EagerSingleton getInstance() {
        return instance;
    }


}
