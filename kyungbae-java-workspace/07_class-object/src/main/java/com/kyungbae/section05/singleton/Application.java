package com.kyungbae.section05.singleton;

public class Application {
    /*
        # singleton pattern
        1. 프로그램 실행 시 특정 class를 최초에 한번만 메모리에 할당하고
           그 할당된 레퍼런스에 인스턴스를 생성시켜 하나의 인스턴스만을 가지고 공유해서 사용하는 기법
        2. 인스턴스가 빈번하게 생성되면서 발생되는 메모리 낭비의 문제를 방지할 수 있음
        3. 장단점
            1) 장점
                - 메모리 효율성 향상
                - 인스턴스가 절대적으로 한개만 존재하는걸 보증할 수 있음
            2) 단점
                - singleton 인스턴스가 너무 많은 일을 하게 될 경우 단일책임원칙을 위반할 수 있음
                - singleton 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐
                    => 유지보스 및 테스트시 문제가 발생될 수 있음
        4. 적용 사례
            1) DB 연결 풀 관리
            2) 로깅 시스템
            3) 환경 설정 관리
        5. singleton 구현 방법 (최초 인스턴스 생성 시점에 따라)
            1) Eager Initialization (이른 초기화)  : 프로그램 실행 시 인스턴스를 생성시켜둠
            2) Lazy Initialization (게으른 초기화) : 인스턴스가 필요한 최초의 시점에 인스턴스를 생성시킴
     */
    public static void main(String[] args) {

        // singleton 이 구현되어 있지 않은 상태
        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println("non1 hashcode: " + non1.hashCode());
        System.out.println("non2 hashcode: " + non2.hashCode());

        System.out.println("=======================================");

//        EagerSingleton eager1 = new EagerSingleton();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1 hashcode: " + eager1.hashCode()); // 주소값 동일
        System.out.println("eager2 hashcode: " + eager2.hashCode()); // 주소값 동일

        System.out.println("=======================================");

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1 hashcode: " + lazy1.hashCode()); // 주소값 동일
        System.out.println("lazy2 hashcode: " + lazy2.hashCode()); // 주소값 동일

        /*
            Eager Singleton => class load 하는 속도가 느림 (그때 instance를 생성해두기 때문에)
                               대신 최초에 instance 요청시에는 이미 생성되어있는걸 바로 받기 때문에 빠름

            Lazy Singleton  => class load 하는 속도가 빠름 (instance 생성을 진행하지 않기 때문)
                               대신 최초에 instance 요청 시 생성되므로 바로 받을 수 없어 느림
         */


    }


} // class end
