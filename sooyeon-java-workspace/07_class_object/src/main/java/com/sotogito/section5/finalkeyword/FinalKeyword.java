package com.sotogito.section5.finalkeyword;

import javax.swing.plaf.PanelUI;

public class FinalKeyword {
    /**
     * final
     * 1. 종단의 의미를 가지는 예약어
     * 2. final 쓰임 따라 의미가 달라짐
     * - 지역변수 : 초기화 이후 값 변경 부가
     * - 매개변수 : 호출시 전달된 값 변경 불가
     * - 인스턴스변수 : 인스턴스 생성시 초기화된 값 변경 불가
     * - 클래스변수 : 프로그램 이후 값 변경 불가
     * <p>
     * - 메서드 : 메서드 재정의(오버라이딩) 불가
     * - 클래스 : 상속 불가를 의미
     */

    //인스턴스 변수에 final 사용
    public final int NON_STATIC_NUM = 0; //선언 동시에 초기화

    private final String NAME;

    //    public FinalKeyword() { //매개변수가 없는 생성자는 사용 불가
//    }
    public FinalKeyword(String NAME) { //생성자 초기화
        this.NAME = NAME;
    }


    public int getNum() {
        return NON_STATIC_NUM;
    }

    public String getName() {
        return NAME;
    }


    //클래스 변수에 final사용 - 상수필드
    public static final String TEAM = "SSG"; //반드시 선언과 동시에 초기화 + 보통 public



}
