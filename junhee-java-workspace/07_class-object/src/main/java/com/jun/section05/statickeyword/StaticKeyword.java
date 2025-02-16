package com.jun.section05.statickeyword;

public class StaticKeyword {

    /*
        필드작성 : 접근제어자 [예약어] 자료형 변수명 [= 값];
     */
    /*
        ## 인스턴스 멤버 ##
        1. instance member
        2. 인스턴스(객체)가 사용할 수 있는 해당 클래스의 멤버(필드,메소드)
        3. 인스턴스(객체)를 통해서만 접근 가능 (즉, 객체생성을 해야만 사용가능)
        4. 인스턴스 생성과 동시에 Heap 메모리 영역에 할당됨
        5. 접근 방법
           1) 인스턴스 생성
           2) 인스턴스.멤버 방식으로 접근
     */

    private int nonStaticCount; //인스턴스 변수
    public int getNonStaticCount(){return nonStaticCount;} // 인스턴스메소드
    public void setNonStaticCount(int nonStaticCount){this.nonStaticCount = nonStaticCount;}

    /*
        ## 정적 멤버 ##
        1. static member
        2. 인스턴스가 없어도 사용할 수 있는 클래스의 멤버(필드, 메소드)
        3. 인스턴스 생성 없이 클래스를 통해 바로 접근 가능
        4. 프로그램 실행과 동시에 static 메모리(Mathod Area) 영역에 할당
        5. 접근 방법
           1) 클래스명,멤버
     */


    private static int staticCount; // or 클래스 변수
    public static int getStaticCount(){ return staticCount;}
    public static void setStaticCount(int staticCount){
//        this.setStaticCount() = staticCount;//this는 생성된 객체의 주소값을 가지고 있음
        StaticKeyword.staticCount = staticCount;
        //this.불가 => static 메소드 또한 프로그램 실행시 이미 메모리에 올라가있음
        //          => 인스턴스생성이 되어있지 않기 떄문에 인스턴스의 주소값을 가지는 this 사용불가
    }

    public String getInformation(){
        return "nonStaticCount=" + nonStaticCount + ", staticCount=" + staticCount;
    }

}
