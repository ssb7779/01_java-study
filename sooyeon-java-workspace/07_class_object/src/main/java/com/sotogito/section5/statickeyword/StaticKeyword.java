package com.sotogito.section5.statickeyword;
public class StaticKeyword {
    /**
     * 필드작성 : 접근제어자 [예약어] 자료형 변수명 [=값]
     */

    /**
     * ## 인스턴스 멤버 instance member
     * 1. 인스턴스(객체)가 사용할 수 있는 해당 클래스의 멤버(필드.메서드)
     * 2. 인스턴스를 통해서만 접근 가능 - 객체생성을 해야만 사용 가능
     * 3. 인스턴스 생성 동시에 Heap메모리에 할당
     * <p>
     * - 인스턴스 생성 -> [인스턴스.멤버] 방식으로 접근]
     */

    private int nonStaticCount;

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int count) {
        this.nonStaticCount = count;
    }


    /**
     * ## 정적 멤버
     * 1. 인스턴스가 없어도 사용할 수 있음
     * 2. 프로그램 실행과 동시에 static 메모리 영역에 할당
     *
     * - 클래스명.메서드();
     *
     */

    private static int staticCount;

    public static int getStaticCount(){
        return staticCount;
    }

    public static void setStaticCount(int count){
        StaticKeyword.staticCount = count;
        /**
         * this?
         * this 는 생성된 객체의 주소값을 가지고 있는데,
         * 인스턴스 필드의 경우 객체가 아니기 때문에 가지고있는 주소값이 없다.
         * -> 클래스.필드
         */
    }

    public String getInfo(){
        return String.format("non-static : %d\n" +
                "static : %d",nonStaticCount,staticCount);
    }
}



