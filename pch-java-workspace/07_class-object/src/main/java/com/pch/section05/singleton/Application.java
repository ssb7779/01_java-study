package com.pch.section05.singleton;

public class Application {
    /**
     * Singleton pattern 이란?
     * 1.   프로그램 실행시 특정 클래스를 최초에 한버남ㄴ 메모리 할당후
     *      그 할당된 레퍼런스에 인스턴스를 생성해 하나의 인스턴스만 가지고 공유해 사용하는 기법
     *
     *      Math 라이브러리와 같은 친구들이 싱글톤?
     *
     * 2.   인스턴스가 빈번하게 생성되면서 발생하는 메모리 낭비 문제 방지 가능
     *
     * 장점 :  메모리 효율성 향상
     *         인스턴스가 절대적으로 한개만 존재함을 보증함
     *
     * 단점 :  싱글통 인스턴스가 너무 많은 일을 하게되면 단일책임원칙 위배함
     *         싱글톤 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐
     *         ㄴ 유지보수, 테스트 시 문제 발생 원인이 됨
     *
     *
     *  적용 사례
     *  - DB 연결 풀 관리
     *  - 로깅 시스템
     *  - 환경 설정 관리
     *
     *  싱글톤 구현 방법 (최초 인스턴스가 생성되는 시점이 다름)
     *  - 이른 초기화 (Eager Initialization) :
     *          프로그램 실행시 인스턴스를 아예 생성시켜둠
     *          클래스 로드하는 속도가 느림 (로드 시 인스턴스 생성도 같이 작업)
     *          대신 최초 인스턴스 요청 시 이미 생성되어 있는걸 받기에 빠름
     *
     *  - 게으른 초기화 (Lazy Initialization) :
     *          인스턴스가 필요한 최초의 시점에 인스턴스를 생성시킴
     *          클래스 로드 속도가 빠름 (로드 시점엔 인스턴스 생성하지 않기에)
     *          대신 최초 인스턴스 요청 시 생성이 되므로 느림
     */

    public static void main(String[] args) {
        NonSingleton ns1 = new NonSingleton();
        NonSingleton ns2 = new NonSingleton();

        System.out.println("NonSingleton1 hashCode: " + ns1.hashCode());
        System.out.println("NonSingleton2 hashCode: " + ns2.hashCode());

        System.out.println("\n============================\n");

//        EagerSingleton es1 = new EagerSingleton(); // 불가능
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        // 주소값 같음. 한번 생성된 객체를 동일하게 사용하기 때문
        System.out.println("eager1 hashCode: " + es1.hashCode());
        System.out.println("eager2 hashCode: " + es2.hashCode());

        System.out.println("\n============================\n");

        LazySingleton lz1 = LazySingleton.getInstance();
        LazySingleton lz2 = LazySingleton.getInstance();

        System.out.println("LazySingleton1 hashCode: " + lz1.hashCode());
        System.out.println("LazySingleton2 hashCode: " + lz2.hashCode());
    }
}