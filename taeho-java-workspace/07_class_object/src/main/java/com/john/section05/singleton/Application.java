package com.john.section05.singleton;

/*
    ## 싱글톤(singleton)
        1. 프로그램 실행 시 특정 클래스를 최초 한번만 메모리에 할당 후
        그 할당된 레퍼런스에 인스턴스를 생성시켜 하나의 인스턴스만을 가지고 공유해서 사용
        2. 인스턴스가 빈번하게 생성되면서 발생되는 메모리 낭비의 문제 방지
        3. 장단점
            3.1. 장점
                - 메모리 효율성 향상
                - 인스턴스가 절대적으로 한개만 존재하는 걸 보장
                => DB연결 관리, 로깅시스템, 환경설정
            3.2. 단점
                - 싱글톤 인스턴스가 많은 작업을 담당해 단일책임원칙 위반
                - 사용하는 곳이 많아지면 결합도가 높아짐
                => 유지보스 및 테스트에 문제 발생
         4. 싱글톤 구현 방법
            4.1. 이른 초기화(Eager Initialization): 프로그램 실행시 인스턴스를 생성시켜둠
            4.2. 게으른 초기화(Lazy Initialization): 인스턴스가 필요한 최초의 시점에 생성
         5. 외부에서 직접 생성자 호출을 통해 생성하는걸 제한둬야 함
         
         - 이른 초기화
            => 클래스를 로드하는 속도가 느림(생성을 호출하는 시점에 하기 때문)
            => 이후 최초 인스턴스를 요청시에는 이미 생성되어있는 것을 바로 받기 때문에 빠름
         - 게으른 초기화
            => 클래스를 로드하는 속도는 빠름(인스턴스 생성을 진행하지 않기 때문)
            => 최초 인스턴스를 요청시 이때 생성이 되므로 바로 받을 수 없어 느림
 */
public class Application {
    public static void main(String[] args) {
        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println("non1 hashCode: " + non1.hashCode());
        System.out.println("non2 hashCode: " + non2.hashCode());

        System.out.println("========================");

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println("eagerSingleton hashCode: " + eagerSingleton.hashCode());
        System.out.println("eagerSingleton2 hashCode: " + eagerSingleton2.hashCode());

        System.out.println("========================");

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("lazySingleton hashCode: " + lazySingleton.hashCode());

    }
}
