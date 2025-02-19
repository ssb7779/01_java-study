package com.seungjoo.section05.statickeyword;

public class Application {
    //프로그램 실행시 이미 StaticKeyword 클래스 내의 staticCount 필드는 메모리에 올라가있음.
    public static void main(String[] args) {


        StaticKeyword.setStaticCount(100);

        StaticKeyword sk1 = new StaticKeyword();
        sk1.setNonstaticCount(10);

        StaticKeyword sk2 = new StaticKeyword();
        sk2.setNonstaticCount(10);

        System.out.println(sk1.getInformation()); //10, 100
        System.out.println(sk2.getInformation()); //20, 100  //두 객체간에 staticCount 필드는 공유되고 있음


    }
}