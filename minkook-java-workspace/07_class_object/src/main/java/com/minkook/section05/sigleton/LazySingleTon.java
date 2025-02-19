package com.minkook.section05.sigleton;

public class LazySingleTon {
    private static LazySingleTon lazy; //프로그램 실행시 static메모리에 참조변수만 할당(인스턴스만 생성해두지 않음. null인 상태)

    private LazySingleTon(){

    }
    
    //인스턴스가 필요로 할 때 호출 될 메소드
    //인스턴스가 생성되지 않은 상태(최초)라면 인스턴스를 생성해서 반환
    //이미 생성되어 있는 상태라면 기존에 생성되어있는 인스턴스 반환
    public static LazySingleTon getInstance() {
        if (lazy == null) {
            lazy = new LazySingleTon();
        }
        return lazy;
    }

}
