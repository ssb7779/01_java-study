package com.ibe6.section05.singleton;

public class Application {
    public static void main(String[] args) {
        /*
            ## singleton pattern ##
            1. 프로그램 실행시 특정 클래스를 최초에 한번만 메모리에 할당하고
            그 할당된 레퍼런스에 인스턴스를 생성시켜 하나의 인스턴스만을 가지고 공유해서 사용하는 기법
            2. 인스턴스가 빈번하게 생성되면서 발생되는 메모리 낭비의 문제를 방지할 수 있음
            3. 장단점
               1) 장점
                  - 메모리 효율성 향상
                  - 인스턴스가 절대적으로 한개만 존재하는걸 보증할 수 있음
               2) 단점
                  - 싱글톤 인스턴스가 너무 많은 일을 하게될 경우 단일책임원칙을 위반할 수 있음
                  - 싱글톤 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐
                    => 유지보수와 테스트에 문제가 발생될 수 있음
            4. 적용 사례
               1) DB 연결 풀 관리
               2) 로깅 시스템
               3) 환경 설정 관리
            5. 싱글톤 구현 방법 (최초 인스턴스가 생성되는 시점이 다름)
               1) 이른 초기화 (Eager Initialization)  : 프로그램 실행시 인스턴스를 아예 생성시켜둠
               2) 게으른 초기화 (Lazy Initialization) : 인스턴스가 필요한 최초의 시점에 인스턴스 생성시킴
         */

        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println("non1 hashcode: " + non1.hashCode());
        System.out.println("non2 hashcode: " + non2.hashCode());

        System.out.println("===================================");

//        EagerSingleton eager1 = new EagerSingleton(); <== private로 만들어놔서 new 사용 불가
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());

        System.out.println("===================================");

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());

        /*
            이른 초기화 => 클래스로드하는 속도가 느림 (그때 인스턴스를 생성해두기 때문에)
                           대신 최초에 인스턴스 요청시에는 이미 생성되어있는걸 바로 받기 때문에 빠름

            게으른 초기화 => 클래스로드하는 속도는 빠름 (인스턴트 생성을 진행하지 않기 때문)
                             대신 최초에 인스턴스 요청시 이때 생성이 되므로 바로 받을 수 없어 느림
         */


    }
}
