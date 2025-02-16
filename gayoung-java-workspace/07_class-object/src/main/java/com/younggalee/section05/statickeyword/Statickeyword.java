package com.younggalee.section05.statickeyword;

public class Statickeyword {

    /*
    필드작성 : 접근제어자 [예약어] 자료형 변수명 [= 값];

     */

    //자바에서는 생성된 변수를 인스턴스라고 부르는데
    // new 생성자() 과정을 인스턴스화 한다고 말한다.

    /*
    인스턴스 멤버
    1. 생성된 객체(인스턴스)가 사용할 수 있는 해당 클래스의 멤버(필드, 메소드)
    2. 인스턴스를 통해서만 접근 가능하다. (즉, 객체생성을 해야만 사용가능)
    3. 인스턴스 생성과 동시에 heap메모리 영역에 할당됨
    5. 접근방법
      1) 인스턴스(객체) 생성
      2) 인스턴스.멤버 방식으로 접근
     */
    private int nonStaticCount;   //인스턴스 변수
    public int getNonStaticCount() { return nonStaticCount; } // 인스턴스 메소드
    public void setNonstaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }


    /*
    정석 멤버
    1. 인스턴스 없어도 사용할 수 있는 클래스의 멤버(필드, 메소드)
    2. 인스턴스 생성없이 클래스를 통해 바로 접근 가능ㄴ
    3. 프로그램 실행과 동시에 Static 메모리(Method Area)영역에 할당
    4. 접근 방법
      1) 클래스명.멤버
     */
    private static int staticCount; // 클래스변수
    public static int getStaticCount(){ return staticCount; }
    public static void setStaticCount(int staticCount) {
        //this.staticCount = staticCount; // this는 생성된 객체의 주소값을 가지고 있음 *****************
        // 인스턴스 없으니까 this 사용못함.
        Statickeyword.staticCount = staticCount;
        // this. 불가 => static 메소드 또한 프로그램 실행시 이미 메모리에 올라가 있음
//                      => 인스턴스 생성이 되어있지 않기 때문에 인스턴스 주소값을 가지는 this 사용불가
    }

    public String getInformation(){
        return "nonStaticCount = " + nonStaticCount + ", staticCount= " + staticCount;
    }
}











