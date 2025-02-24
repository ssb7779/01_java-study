package com.sh.section05.finalkeyword;

public class Finalkeyword {
    /*
##final
1.종단의 의미 가짐
2.final 작성위치에 따라 의미는 약간씩 다름
3.작성 위치별 의미
    지역변수: 초기화 이후 값 변경 불가
    매개변수: 호출시 전달된 값 변경 불가
    인스턴스변수: 인스턴스 생성시 초기화된 값 변경 불가
    클래스변수: 프로그램 시작 이후 값 변경 불가
    메소드: 메소드 재정의(오버라이딩)불가
    클래스:상속 불가

 */
    //인스턴스 변수에 final
    //인스턴스 생성시 반드시 초기값으로 초기화가 징행되도록
    //private final int NON_STATIC_NUM;//에러
    //해결 : 선언과 동시에 초기화
    private final int NUM=1;
    private final String NAME;
    public Finalkeyword(String name){
        this.NAME=name;
    }
    public int getNUM(){
        return NUM;
    }
    public  String getNAME(){
        return NAME;
    }

    public static final String TEAM ="asdf";



}
