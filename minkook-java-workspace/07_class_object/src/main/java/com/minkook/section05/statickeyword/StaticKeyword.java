package com.minkook.section05.statickeyword;

public class StaticKeyword {
    /*
         ## 인스턴스 멤버 ##
         1. instance member
         2. 인스턴스(객체)가 사용할 수 있는 해당 클래스의 멤버(필드,메소드)
         3. 인스턴스(객체)를 통해서만 접근 가능(즉, 객체생성을 해야만 사용가능)
         4. 인스턴스 생성과 동시에 Heap 메모리 영역에 할당됨
         5. 접근방법
            1) 인스턴스 생성
            2) 인스턴스.멤버 방식으로 접근
     */
    private int nonStaticCount;
    private static int staicCount;
    public  static int getStaicCount(){
        return staicCount;
    }
    public static void setStaicCount(int staicCount){
        StaticKeyword.staicCount = staicCount;
        //this. 불가 -> static 메소드 또한 프로그램 실행시 이미 메모리에 올라가 있음
        // => 인스턴스생성이 되어있지 않기 때문에 인스턴스의 주소값을 가지는 this 사용불가
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }

    public String getInformation(){
        return "nonStaticCount = " + nonStaticCount + " StaticCount = " + staicCount;
    }
}
