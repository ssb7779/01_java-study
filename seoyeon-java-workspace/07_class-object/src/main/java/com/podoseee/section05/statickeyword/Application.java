package com.podoseee.section05.statickeyword;

public class Application {

    public static void main(String[] args) {

        // 프로그램 실행시 이미 StaticKeyword 클래스 내의 staticCount 필드는 메모리에 할당되어있음
        StaticKeyword.setStaticCount(100);

        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonStaticCount(10);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonStaticCount(20);

        System.out.println(sk1.getInformation()); // 10, 100
        System.out.println(sk2.getInformation()); // 20, 100
        
        // 두 객체간에 staticCount 필드는 공유되고 있음

        /*
            ## static ##
            1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
            2.
         */


    }
}
