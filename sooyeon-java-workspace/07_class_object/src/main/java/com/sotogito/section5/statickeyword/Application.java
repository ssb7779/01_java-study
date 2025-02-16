package com.sotogito.section5.statickeyword;

public class Application {
    public static void main(String[] args) {
        StaticKeyword.setStaticCount(234235235);
        
        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonStaticCount(1);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonStaticCount(2);
        
        System.out.println(sk1.getInfo());
        System.out.println(sk2.getInfo());
        /**
         * non-static : 1
         * static : 234235235
         * non-static : 2
         * static : 234235235
         * 
         * 다른 객체지만 static값은 동일 출력
         */

        /**
         * 정적 메모리 절약
         * 객체는 새로 생성할떄마다 메모리에 새롭게 할당되지만,- Heap
         * 정적의 경우는 메모리할당을 절약할 수 있음 - statc
         * 단,
         * 너무 많이 사용할 경우 메모리 낭비가 생김
         * 
         * 객체지향적인 관점에서는 많이 사용하지 않음
         * 사용하는 대표적인 예 -> 상수, 싱글톤
         */
    }
}
