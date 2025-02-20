package com.sh.section05.singleton;

public class Application {
    public static void main(String[] args) {
        /*
        ##singleton pattern
        1. 프로그램 실행시 특정 클래스를 최초에 한번만 메모리에 할당하고
        그 할당된 레퍼런스에 인스턴스를 생성시켜 하나의 인스턴스만을 가지고 공유해서 사용하는 기법
        2.인스턴스가 빈번하게 생성되면서 발생되는 메모리 낭비의 문제를 방지할 수 있음
        장점 :메모리 효율성 향상
             인스턴스가 절대적으로 한개만 존재하는걸 보증

        단점 :싱글톤 인스턴스가 너무 많은 일을 하게되면 단일책임원칙을 위반
              싱글톤 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐
              ㄴ유지보수와 테스트에 문제가 발생될 수 있음

        4.적용 사례
        DB연결 풀 관리
        로깅 시스템
        환경 설정 관리
        5.싱글톤 구현 방법 (최초 인스턴스가 생성되는 시점이 다름)
        이른 초기화(eAGER iNITIALIZATION : 프로그램 실행시 인스턴스를 아예 생성시켜줌
        게으른 초기화(Lazy Initialization: 인스턴스가 필요한 최초의 시점에 인스턴스 생성
         */

        Nonsingleton non1=new Nonsingleton();
        Nonsingleton non2 = new Nonsingleton();
        System.out.println(non1.hashCode());
        System.out.println(non2.hashCode());

        System.out.println("=================================================");

        EagerSingleton eager1= EagerSingleton.getInstance();

        EagerSingleton eager2= EagerSingleton.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());


        System.out.println("=================================================");

        LazySingleton lazy = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println(lazy.hashCode());
        System.out.println(lazy2.hashCode());

        /*
        이른 초기화 =>클래스로드하는 속도 느림 (그때 인스턴트 생성
        ㄴ대신 최초 인스턴스 요청시에는 생성되어 있는걸 바로 받기 때문에 빠름ㅁㅁㅁ
        게으른 초기화 =>클래스로드하는 속도는 빠름(인스턴스 생성을 진행 하지 않아서
        ㄴ대신 최초의 인스턴스 요청시 이때 생성이 진행돼 바로 받을 수 없어 느림

         */

    }
}
