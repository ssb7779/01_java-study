package com.sotogito.section5.singleton;

public class EagerSingleton {

    //프로그램실행시 static메모리에 바로 할당
   private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
