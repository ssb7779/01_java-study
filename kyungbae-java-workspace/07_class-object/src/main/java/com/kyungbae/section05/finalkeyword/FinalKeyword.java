package com.kyungbae.section05.finalkeyword;

public class FinalKeyword {

    /*
        # final
        1. 종단의 의미를 가지는 예약어
        2. final 작성위치에 따라 의미는 약간씩 다름
        3. 작성 위치별 의미
            1) local variable : 초기화 이후에 값 변경 불가를 의미
            2) parameter variable : 호출시 전달된 값 변경 불가를 의미
            3) instance variable : instance 생성시 초기화 된 값 변경 불가를 의미
            4) class variable : program 시작 이후 값 변경 불가를 의미
            5) method : method 재정의(overriding) 불가를 의미
            6) class : 상속(inheritence) 불가를 의미
        4. 표기법으로 상수(constant)이므로 대문자로 작성
     */

    // instance variable
    // instantiate 시에 반드시 initialized를 실행해야 한다.
//    private final int NON_STATIC_NUM; // 에러발생

    // 해결방법1. 선언과 동시에 initialized 진행
    private final int NUM = 1;
    // 해결방법2. parameter constructor를 통해 initialized 진행
    public final String NAME;
    public FinalKeyword(String name) {
        this.NAME = name;
    }
    // => final은 변경이 불가하므로 default constructor 는 생성하면 오류가 발생한다.

    public int getNUM() {
        return NUM;
    }

    public String getNAME() {
        return NAME;
    }

    // class variable
    // static 이기 때문에 program 구동 시 생성되므로 선언과 동시에 initialize를 진행해야 한다.
    // constant field (상수필드) 라고 함
    public static final String TEAM = "Hanwha"; // static final 특성상 공유할 값이고 변경이 불가하므로 private이 아니라 public으로 만든다




} // class end
