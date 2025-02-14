package com.podoseee.section05.finalkeyword;

public class FinalKeyword {

    /*
        ## final ##
     */

    // 인스턴스 변수에 final 사용
    // 인스턴스 생성시 반드시 초값으로 초기화가 진행되도록 해야됨
    //private final int NON_STATIC_NUM; // 에러발생

    // 해결방법1. 선언과 동시에 초기화 진행
    private final int NUM = 1;
    // 해결방법2. 매개변수 생성자를 통해 초기화가 되도록 진행
    private final String NAME;
    public FinalKeyword(String name) {
        this.NAME = name;
    }
    // 매개변수생성자를 작성하였으므로 기본생성자는 안만들어짐

    public int getNum(){
        return NUM;
    }
    public String getName(){
        return NAME;
    }

    // 클래스 변수에 final 사용
    // 상수필드라고 함 (반드시 선언과 동시에 초기화)
    public static final String TEAM = "SSG";
}