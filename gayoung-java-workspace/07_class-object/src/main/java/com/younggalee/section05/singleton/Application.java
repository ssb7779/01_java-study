package com.younggalee.section05.singleton;

public class Application {
    /*
        ## singleton 패턴 ##
        1. 프로그램 실행시 특정 클래스를 최초의 한번만 메모리에 할당하고, 할당된 reference에 instance를 생성시키고 하나의 인스턴스만을 가지고 공유해서 사용하는 기법
        2. 인스턴스가 빈번하게 생성되면서 발행되는 메모리 낭비문제를 방지할 수 있다.
        3. 장단점
        -장점
          1) 메모리효율성향상
          2) 인스턴스가 절대적으로 한개만 존재하는걸 보증할 수 있음.
        -단점
          1) 싱글톤 인스턴스가 너무 많은 일을 하면 단일책임원칙에 위배된다.
          2) 싱글톤 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐
            >> 유지보수와 테스트에 문제가 발생될 수 있음.
        4. 적용사례
        - DB연결, 풀관리
        - 로깅 시스템
        - 환경 설정 관리
        5. 싱글톤 구현 방법 (최초 인스턴스가 생성되는 시점이 다름)
          1 ) 이른 초기화 (eager Initialization)
          : 인스턴스 생성이 빠르며, 프로그램 실행시 인스턴스를 아예 생성시켜둠
          2 ) 게으른 초기화 (Lazy Initialization)
          : 인스턴스가 필요한 최초의 시점에 인스턴스 생성시킴

     */
    public static void main(String[] args){
        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println(non1.hashCode());
        System.out.println(non2.hashCode());

        // >> new 를 통한 객체생성을 막는다.
        // [singleton ]
        EagerSingleton eager1 = EagerSingleton.getInstance(); // new를 통해 인스턴스를 생성하는 것이 아니라 최초에 static으로 생성된 객체를 계속 참조한다.
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode()); // 둘이 동일
        // 같은 값을 다른 변수로 참조하고 있음.. 이게 왜필요한거지.. 같은 변수 계속 쓰면 안되는건가 어떤 상황에서 쓰이는지...

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());


        /*
        이른 초기화 >> 클래스 로드하는 속도가 느림 (그때 인스턴스를 생성해두기 때문에)
                       대신 최초에 인스턴스 요청시에는 이미 생성되어있는걸 바로 받기 때문에 빠름
        게으른 초기화 >> 클래스로드하는 속도는 빠름 (인스턴스 생성을 진행하지 않기 때문)
                       대신 최조에 인스턴스 요청시 이때 생성이 되므로 바로 받을 수 없어 느림
         */
    }
}
