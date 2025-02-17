package com.kyungbae.section05.singleton;

public class EagerSingleton {

    // 같은 class 내 private 호출 가능
    // 프로그램 실행 시 static 메모리에 바로 할당되는데 애초에 인스턴스도 생성해서 할당
    private static EagerSingleton eager = new EagerSingleton();

    // singleton pattern은 외부에서 직접 constructor 호출을 통해 생성하는걸 제한둬야함
    private EagerSingleton(){}

    // instance가 필요로 할 떄 호출 시킬 method (통상적으로 getInstance 라고 지음)
    public static EagerSingleton getInstance() {
        return eager;
    }

} // class end
