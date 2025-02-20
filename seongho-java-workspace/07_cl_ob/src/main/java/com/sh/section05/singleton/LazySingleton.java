package com.sh.section05.singleton;

public class LazySingleton {
    //프로그램 실행시 static메모리에 참조변수만 할당(인스턴트 생성 X ,null상태
    private static LazySingleton lazy;
    private LazySingleton(){}

    //인스턴스가 필요로 할 때 호출 될 메소드
    //인스턴스가 생성되지 않은 상태(최초)라면 인스턴스 생성 반환
    //이미 생성된 상태라면 기존에 생성된 인스턴스 반환
    public static LazySingleton getInstance(){
        if (lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
