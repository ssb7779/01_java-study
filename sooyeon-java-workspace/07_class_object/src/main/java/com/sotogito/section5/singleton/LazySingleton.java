package com.sotogito.section5.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton; //초기화해두지않음

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){ //처음 호출이 될 때 인스턴스를 생성함
            System.out.println("인스턴스 생성");
            lazySingleton = new LazySingleton();
        }
        System.out.println("생성된 인스턴스 전달");
        return lazySingleton; //호출이 된 이후에는 동일한 인스턴스만 반환함.
    }

}
