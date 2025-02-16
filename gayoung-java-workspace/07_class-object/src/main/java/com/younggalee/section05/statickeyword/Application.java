package com.younggalee.section05.statickeyword;

public class Application {
    public static void main(String[] arg){

        //프로그램 실행시 이미 StaticKeyword 클래스 내의 staticCount필드는 메모리상에 올라강
        Statickeyword.setStaticCount(100); // ************

        Statickeyword sk1 = new Statickeyword();
        sk1.setNonstaticCount(10);

        Statickeyword sk2 = new Statickeyword();
        sk2.setNonstaticCount(20);

        System.out.println(sk1.getInformation());
        System.out.println(sk2.getInformation());

        // 두 객체간에 staticCount 필드는 공유되고 있음.

        /*
        ## static
        1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
        2. 인스턴스 생성시 마다 인스턴스 변수가 메모리에 할당되는걸 방지할 수 있음
          => 메모리를 절약할 수 있음
          => 값을 공유한다거나 우지해야될 때 유용하게 사용가능
        3. 단, 무분별하게 사용할 경우 메모리 낭비의 문제가 발생될 수 있음
          => 명확한 목적이 존재할 경우에만 사용하자.
         */

    }
}
