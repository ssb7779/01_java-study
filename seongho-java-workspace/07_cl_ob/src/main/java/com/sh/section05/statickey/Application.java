package com.sh.section05.statickey;

public class Application {
    public static void main(String[] args) {
        //프로그램 실행시 StaticKeyword 클래스 내의 staticCount 필드는 메모리에 할다오디어있음
        StaticKeyword.setStaticCount(100);

        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonStaticCount(10);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonStaticCount(20);

        System.out.println(sk1.getInfm());
        System.out.println(sk2.getInfm());
    }
}
