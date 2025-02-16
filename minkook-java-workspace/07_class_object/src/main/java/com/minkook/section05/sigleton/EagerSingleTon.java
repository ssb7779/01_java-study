package com.minkook.section05.sigleton;

public class EagerSingleTon {

    private static EagerSingleTon eager = new EagerSingleTon();
    // 싱글톤 패턴은 외부에서 직접 생성자 호출을 통해 생성하는걸 제한둬야 됨
    private EagerSingleTon(){

    }
    // 인스턴스가 필요로 할 때 호출 시킬 메소드 (통상적으로 getInstance 라고 지음)
    public static EagerSingleTon getInstance(){
        return eager;
    }
}
