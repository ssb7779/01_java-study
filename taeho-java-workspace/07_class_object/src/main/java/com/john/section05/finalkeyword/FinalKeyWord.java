package com.john.section05.finalkeyword;

/*
    ## Final
        1.종단 예약어
        2.작성 위치에 따라 의미가 약간씩 다름(기본적으로 변경불가)
        3.작성 위치별 의미
            3.1. 지역변수: 초기화 이후 값 변경 불가
            3.2. 매개변수: 호출시 전달된 값 변경 불가
            3.3. 인스턴스변수: 인스턴스 생성시 초기화된 값 변경 불가
            3.4. 클래스변수: 프로그램 시작 이후 값 변경 불가
            3.5. 메서드: 메서드 재정의(오버라이딩) 불가
            3.6. 클래스: 상속 불가

 */
public class FinalKeyWord {
    
    // 인스턴스 생성시 반드시 초기값으로 초기화가 되도록 해야함
    // private final int NON_STATIC_NUM;
    
    // 선언과 동시에 초기화
//    private final int NON_STATIC_NUM = 0;/
    private final int NUM = 1;

    // 매개변수 생성자를 통해 초기화
    private final String NAME;
    public FinalKeyWord(String name){
        this.NAME = name;
    }

    // 매개변수 생성자를 작성 => 기본생성자는 만들어지지않음

    public int getNum(){
        return NUM;
    }
    public String getName(){
        return NAME;
    }

    // 클래스 변수에 final 사용
    private static final String TEAM = "SSG";
    // static과 final 을 동시에 사용하는 경우, public으로 사용함(상수)
    // => 프로그램 전역에서 사용할 목적
    public static final String TEAM2 = "SSG2";
    
}
