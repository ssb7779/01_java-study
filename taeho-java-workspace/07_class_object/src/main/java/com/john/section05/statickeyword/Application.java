package com.john.section05.statickeyword;

/*
    ## static
    1. 프로그램 구동시 곧바로 static 메모리 영역에 할당되도록 하는 예약어
    2. 인스턴스 생성시마다 인스턴스 변수가 메모리에 할당 되는 걸 방지할 수 있음
        => 메모리 절약
        => 값을 공유하거나 유지해야할 때 사용가능
    3. 무분별하게 사용하는 경우 메모리 낭비의 문제 발생
        => 명확한 목적이 존재하는 경우에만 사용권장

 */
public class Application {
    public static void main(String[] args) {
        // 이미 메모리에 올라가 있는 상태로 접근 가능
        StaticKeyword.setStaticCount(100);

        // 생성을 선언했다고 해서 새롭게 할당되지않음
        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.setNonStaticCount(10);
        System.out.println(staticKeyword.getInformation());

        StaticKeyword staticKeyword2 = new StaticKeyword();
        staticKeyword2.setNonStaticCount(20);
        System.out.println(staticKeyword2.getInformation());

    }
}
