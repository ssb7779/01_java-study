package com.john.section05.singleton;

public class EagerSingleton {
    // 프로그램 실행시, static 메모리에 바로 할당되는데 인스턴스도 생성해서 할당
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    // 외부에서 직접 생성자 호출을 통해 생성하는걸 제한둬야 함
    private EagerSingleton() {}

    // 인스턴스가 필요로 할 때 호출시킬 메서드(통상적으로 geInstance()로 명명)
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
