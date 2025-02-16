package com.podoseee.section05.finalkeyword;

public class FinalKeyword {

    /*
         ## final ##
        1. 종단의 의미를 가지는 예약어
        2. final 작성위치에 따라 의미는 약간씩 다름
        3. 작성 위치별 의미
           1) 지역변수 : 초기화 이후에 값 변경 불가를 의미
           2) 매개변수 : 호출시 전달된 값 변경 불가를 의미
           3) 인스턴스변수 : 인스턴스 생성시 초기화된 값 변경 불가를 의미
           4) 클래스변수 : 프로그램 시작 이후 값 변경 불가를 의미
           5) 메소드 : 메소드 재정의(오버라이딩) 불가를 의미
           6) 클래스 : 상속 불가를 의미
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