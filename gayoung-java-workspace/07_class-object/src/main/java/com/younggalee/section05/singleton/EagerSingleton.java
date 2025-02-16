package com.younggalee.section05.singleton;


//static으로 무조건 만들고 시작
public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton(); // ***************
    // ㄴ 프로그램 실행시 static 메모리에 바로 할당되는데 애초에 인스턴스도 생성해서 할당
    // ㄴ 반환해주는 메소드 필요 : getter

    //외부에서 직접 생성자 호출을 통해 생성하는 것을 제한둬야함. (private)
    private EagerSingleton() { // main에서 생성 못함 막힘
    }

    //인스턴스가 필요로할 때, 호출시킬 메소드 (생성되어있는 인스턴스 외부로 반환용)
    // (통상적으로 getInstance라고 지음)**********
    public static EagerSingleton getInstance(){
        return eager;
    }


}
