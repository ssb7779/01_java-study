package com.ibe6.section05.statickeyword;

public class Application {
    public static void main(String[] args) {
        // 프로그램 실행시 이미 StaticKeyword 크랠스 내의 staticCount 필드는 메모리
        StaticKeyword.setStaticCount(100);

        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonStaticCount(10);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonStaticCount(20);

        System.out.println(sk1.getInfo()); // 10,l00
        System.out.println(sk2.getInfo()); // 20l,100

        // 두 객체간에 staticCount 필드는 공유되고 있음

        /*
            ## static ##
            1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
            2. 인스턴스 생성시 마다 인스턴스 변수가 메모리에 할당 되는 걸 방지할 수 있음
               => 메모리를 절약할 수 있음
               => 값을 공유한다거나 유지해야돨 땨 유용하게 사용 가능
            3. 단, 무분별하게 사용할 경우 메모리 낭비의 문제가 발생될 수 있음
               => 명확한 목적이 존재할 경우에만 사용하자!
         */

    }
}
