package com.inyong.section05.statickeyword;

public class Application {
    public static void main(String[] args) {
    // 프로그램 실행시 이미 StaticKeyword 클래스 내의 staticCount 필드는 메모리에
    StaticKeyword.setStaticCount(100);

    StaticKeyword sk1 = new StaticKeyword();
    sk1.setNonStaticCount(10);

    StaticKeyword sk2 = new StaticKeyword();
    sk2.setNonStaticCount(20);

        System.out.println(sk1.getInformation());
        System.out.println(sk2.getInformation());
    }
    // 두 객체간에 staticCount 필드는 공유되고 있음

    /*
    ## static
    1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
    2. 인스턴스 생성시 마다. ㅣㄴ스턴스 변수가 메모리에 할당 되는걸 방지
     => 메모리 절약
     => 값을 공유 또는 유지할때 사용
     3. 단, 무분별하게 사용할 경우 메모리 낭비의 문제가 발생될 . 있음
     => 명확한 목적이 존재할 경우에만 사용!
     */
}
