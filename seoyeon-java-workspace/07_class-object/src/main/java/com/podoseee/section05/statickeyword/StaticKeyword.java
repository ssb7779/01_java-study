package com.podoseee.section05.statickeyword;

public class StaticKeyword {

    /*
         필드작성 : 접근제어자 [예약어] 자료형 변수명 [= 값];
     */

    /*
        ## 인스턴스 멤버 ##

     */
    private int nonStaticCount; // 인스턴스변수
    public int getNonStaticCount() { return nonStaticCount;} // 인스턴스메소드
    public void setNonStaticCount(int nonStaticCount) { this.nonStaticCount = nonStaticCount;}

    /*
        ## 정적 멤버 ##
        1.
     */
    private static int staticCount; // 클래스 변수
    public static int getStaticCount() { return staticCount; }
    public static void setStaticCount(int staticCount) {
        //this.staticCount = staticCount;
        StaticKeyword.staticCount = staticCount;
        // this. 불가 => static 메소드 또한 프로그램 실행시 이미 메모리에 올라가있음
        //            => 인스턴스생성이 되어있지 않기 때문에 인스턴스의 주소값을 가지는 this 사용불가
    }

    public String getInformation(){
        return "nonStaticCount=" + nonStaticCount + ", staticCount=" + staticCount;
    }

}
