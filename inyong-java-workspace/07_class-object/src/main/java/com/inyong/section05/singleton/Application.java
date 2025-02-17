package com.inyong.section05.singleton;

public class Application {
    /*
    싱글톤 패턴 (Singleton Pattern)

    싱글톤 패턴은 클래스의 인스턴스를 하나만 생성하고,
    그 인스턴스를 전역적으로 공유하도록 설계하는 디자인 패턴이야.
    보통 설정 관리, 로깅, DB 연결 관리 같은 곳에서 사용돼.

    1. 프로그램 실행시 특정 클래스를 최초에 한번만 메모리에 할당
    인스턴스를 생성시켜 하나의 인스턴스만 가지고 공유해서 사용
    2. 인스턴스가 빈번하게 생성되면서 발생되는 메모리 낭비의 문제를 방지
    3. 장단점
        1) 장점
            - 메모리 효율성 향상
            = 인스턴스가 절대적으로 한개만 존재하는걸 보증 가능
        2) 단점
            - 싱클톤 인스턴스가 너무 많은 일을 하게될 경우 단일책임원칙을 위반할 수 있음
            = 싱글톤 인스턴스를 사용하는 곳이 많아지면 겨합도가 높아짐
            => 유지보스와 테스트에 문제가 발생할 수 있음

   4. 적용 사례
    1) DB 연결 플 관리
    2) 로깅시스템
    3) 환경 설정 관리
   5. 싱글톤 구현 방법 (최초 인스턴스가 생성되는 시점이 다름)
    1) 이른 초기화
    프로그램 실행시
    2) 게으른 초기화
    최초에
     */
    public static void main(String[] args) {


        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println(non1.hashCode());
        System.out.println(non2.hashCode());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // EagerSingleton egaer1 = new EagerSingleton();
        // 기본생성자 막아놓음 private 라서

        /*
        이른 초기화 => 클래스 로드하는 속도가 느림 (그 때 인스턴스를 생성해두기 때문에)
        대신 최초에 인스턴스 요청시에는 이미. ㅐㅇ성되어있는걸 바로 받기 때문에 빠름

        게으른 초기화 => 클래스로드하는 속도는 빠름 (인스턴스 생성을 진행하기 때문)
        대신 최초에 인스턴스 요청시 이때 생성이 되므로 바로 받을 수 없다
         */
    }
}
