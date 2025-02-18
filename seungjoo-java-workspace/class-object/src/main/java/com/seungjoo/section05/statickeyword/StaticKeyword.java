package com.seungjoo.section05.statickeyword;

public class StaticKeyword {
    private int count;

    private int nonStaticCount; //인스턴스 변수
    public int getNonstaticCount(){return nonStaticCount;} //인스턴스 메서드
    public void setNonstaticCount(int nonStaticCount) {this.nonStaticCount = nonStaticCount;}

    private static int staticCount;
    public static int getStaticCount(){return staticCount;}
    public static void setStaticCount(int staticCount) {
        StaticKeyword.staticCount = staticCount;  //this는 생성된 객체의 주소값을 나타냄, 근데 static은 인스턴스가 없는 상태에서 사용하므로 this를 사용할 수 없음.

    }
    public String getInformation(){
        return "nonStaticCount=" + nonStaticCount + ", staticCount=" + staticCount;
    }


}
