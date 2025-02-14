package com.kyungbae.section05.statickeyword;

public class Application {

    public static void main(String[] args) {
        StaticKeyword.setStaticCount(100);
        System.out.println(StaticKeyword.getStaticCount());

        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonStaticCount(10);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonStaticCount(20);

        System.out.println(sk1.getInformation());
        System.out.println(sk2.getInformation());

        // 두 object 간에 staticCount field 는 공유되고 있음
        /*
            # static
            1. program 구동시 곧바로 ststic 메모리 영역에 할당되도록 하는 예약어
            2. instance 생성시 마다 instance variable이 메모리에 할당 되는 걸 방지할 수 있음
                => 메모리를 절약할 수 있음
                => 값을 공유하거나 유지해야될 때 유용하게 사용 가능
            3. 단, 무분별한 사용 시 메모리 낭비의 문제가 발생될 수 있음
                => 명확한 목적이 존재할 경우에만 사용
         */
    }

} // class end
