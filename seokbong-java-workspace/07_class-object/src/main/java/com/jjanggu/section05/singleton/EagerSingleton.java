package com.jjanggu.section05.singleton;

public class EagerSingleton {

    // 프로그램 실행시 static 메모리에 바로 할당되는데 애초에 인스턴스도 생성해서 할당
    private static EagerSingleton eager = new EagerSingleton();

    // 싱글톤 패턴은 외부에서 직접 생성자 호출을 통해 생성하는걸 제한둬야됨
    private  EagerSingleton(){}

    // 인스턴스가 필요로 할 때 호출 시킬 메소드 (통상적으로 getInstance 라고 지음)
    public static EagerSingleton getInstance() {
        return eager;
    }
}
