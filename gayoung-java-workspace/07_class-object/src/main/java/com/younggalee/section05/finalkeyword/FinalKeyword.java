package com.younggalee.section05.finalkeyword;

public class FinalKeyword {
    /*
    final (변경불가!!)
    1. 종단의 의미를 가지는 예약어
    2. final 작성위치에 따라 의미는 약간씩 다름
    3. 작성위치별 의미
      1) 지역변수 : 초기화 이후에 값 변경 불가를 의미
      2) 매개변수 : 호출시 전달된 값 변경 불가를 의미
      3) 인스턴스 변수: 인스턴스 생성시 초기화된 값 변경 불가를 의미
      4) 클래스변수 : 프로그램 시작 이후 값 변경 불가를 의미
      5) 메소드 : 메소드 재정의(오버라이딩) 불가를 의미
      6) 클래스 : 상속 불가를 의미
     */

    // 인스턴스 변수에 final 사용
    // ! 인스턴스 생성시 반드시 초기값으로 초기화가 진행되도록 해야됨
    // 이라믄 안됨! private final int NON_STATIC_NUM;

    private final int NUM = 1; // 해결 1 : 선언과 동시에 초기화 진행!

    private final String NAME; // 해결 2 매개변수 생성자를 통해 초기화가 되도록 진행

    public FinalKeyword(String name) {
        this.NAME = name;
    } // 매개변수 생성자를 작성하였으므로 기본 생성자는 안만들어짐

    public int getNUM() {
        return NUM;
    }

    public String getNAME() {
        return NAME;
    }


    // 클래스 변수에 final 사용  >> 상수 필드라고 함.
    public static final String TEAM = "SSG";
    //static : 공유할 목적
    //final : 변경불가
    //따라서 private해줄 필요없어 보통 public으로 둠
}
