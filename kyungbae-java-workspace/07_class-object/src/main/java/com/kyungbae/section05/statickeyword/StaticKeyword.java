package com.kyungbae.section05.statickeyword;

public class StaticKeyword {

    /*
        필드작성 : 접근제어자 [예약어] 자료형 변수명 [=값];

        class variable = new constructor();
     */
    /*
        # instance member
        1. instance(object)가 사용할 수 있는 해당 class의 member(field, method)
        2. instance(object)를 통해서만 접근 가능 (즉, object생성을 해야만 사용 가능)
        3. instance 생성과 동시에 Heap 메로리 영역에 할당됨
        4. 접근 방법
            1) instance 생성
            2) instance.member 방식으로 접근
     */


    private int nonStaticCount; // instance variable
    public int getNonStaticCount(){ // instance method
        return  nonStaticCount;
    }
    public void setNonStaticCount(int nonStaticCount){
        this.nonStaticCount = nonStaticCount;
    }

    /*
        Static member
        1. instance가 없어도 사용할 수 있는 class의 member(field, method)
        2. instance 생성 없이 class를 통해 바로 접근 가능
        3. program 실행과 동시에 Static 메모리(Method Area) 영역에 할당
        4. 접근 방법
            1) class.member
     */

    private static int staticCount; // class variable (static variable)
    public static int getStaticCount() {
        return staticCount;
    }
    public static void setStaticCount(int staticCount){
        // this. 불가 => static method 또한 program 실행 시 이미 메모리에 올라가있음
        //            => instance 생성이 되어있지 않기 떄문에 instance 주소값을 가지는 this 사용불가
        StaticKeyword.staticCount = staticCount;
        // class 명으로 접근
    }

    public String getInformation(){
        return "nonStaticCount=" + nonStaticCount + ", staticCount=" + staticCount;
    }
} // class end
