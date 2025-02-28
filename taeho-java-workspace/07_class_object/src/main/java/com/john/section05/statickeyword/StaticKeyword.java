package com.john.section05.statickeyword;

/*
    ## 예약어
    - 구조
        - [접근제어자] [예약어] [type] {Name} = val
 */
public class StaticKeyword {
    /*
        ## 인스턴스 멤버(instance member)
        1. 인스턴스(객체)가 사용할 수 있는 해당 클래스의 멤버(필드, 메서드)
        2. 인스턴스(객체)를 통해서만 접근 가능(객체 생성을 해야 사용가능)
        3. 인스턴스 생성과 동시에 Heap 메모리 영역에 할당됨
        4. 접근 방법
            4.1. 인스턴스 생성
            4.2. 인스턴스.멤버 방식으로 접근
     */


    private int nonStaticCount; // 인스턴스 변수

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }
    
    /*
        ## 정적 멤버(static member)
        1. 인스턴스가 없어도 사용할 수 있는 클래스의 멤버(필드, 메서드)
        2. 인스턴스 생성없이 클래스를 통해 바로 접근 가능
        3. 프로그램 실행과 동시에 Static 메모리(Method area) 영역에 할당
        4. 접근 방법
            4.1. 클래스명.멤버
     */

    private static int staticCount; // 클래스 변수

    public static int getStaticCount() {
        return staticCount;
    }

    // 인스턴스 없이 사용하기 위해 static을 추가
    public static void setStaticCount(int staticCount) {
        /*
            this = 생성된 객체의 주소를 가지고 있는 상태
            App 실행 시 인스턴스 생성전에 이미 static 메모리에 메서드가 올라간 상태로
            인스턴스 주소값을 가지는 this사용불가
        */
//        this.staticCount = staticCount;
        StaticKeyword.staticCount = staticCount;
    }

    public String getInformation(){
        return "NonStaticCount: " + getNonStaticCount() + ", StaticCount: " + getStaticCount();
    }

}
