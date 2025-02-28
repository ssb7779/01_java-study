package com.minkook.section05.statickeyword;

public class Application {
    public static void main(String[] args){
        StaticKeyword.setStaicCount(100);

        StaticKeyword k1 = new StaticKeyword();
        k1.setNonStaticCount(10);

        StaticKeyword k2 = new StaticKeyword();
        k2.setNonStaticCount(20);

        System.out.println(k1.getInformation());
        System.out.println(k2.getInformation());
        
        //두 객체간의 staticCount 필드는 공유되고 있음
        
        /*
            ## static ##
            1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
            2. 인스턴스 생서이 마다 인스턴스 변수가 메모리에 할당 되는걸 방지할 수 있음
                => 메모리를 절약할 수 잇음
                => 값을 공유한다거나 유지해야할때 유용하게 사용
            3. 단 무분별하게 사용할 경우 메모리낭비 심함
         */
    }
}
