package com.sotogito.section5.singleton;

public class Application {
    /**
     * ## 싱글톤패턴
     * 1. 프로그램 실행시 특정 클래스를 최초에 한번만 메모리에 할당 - 인스턴스 하나만 재사용함
     * 2. 인스턴스의 메모리 낭비 문제 해결
     *
     * - 메모리 효율성 향상
     * - 인스턴스가 한개만 존재하는 걸 보증 - 같은 데이터
     *
     * - 너무 많은 책임으로 단일책임원칙에 위배됨
     * - 싱글톤 인스턴스를 사용하는 곳이 많아지면 결합도가 높아짐 => 유지보수&테스트 문제
     * - 어려움
     *
     * 1. DB 연결 풀 관리
     * 2. 로깅 시스템
     * 3. 환경 설정 관리
     *
     *
     * 1. 이른 초기화 Eager Initialization
     *      프로그램 실행시 인스턴스를 아예 생성시켜둠
     *      사용이 확신한 경우 사용
     * 2. 게으른 초기화 Lazy Initialization
     *      인스턴스가 필요한 최초의 시점에 생성
     */

    public static void main(String[] args) {
        NonSingleton non1 = new NonSingleton();
        NonSingleton non2 = new NonSingleton();

        System.out.println("non1"+non1.hashCode());
        System.out.println("non2"+non2.hashCode());

        System.out.println("====-==-=-=-===2=-=1-2=-1=2-3=1-2=3-=1-2=3-1=2-3=1-23");

        /*
        //이른초기화
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1==eagerSingleton2);//true 동일한 인스턴스
        
         */

        //게으른 초기화
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());
        System.out.println(lazySingleton2.hashCode());

        /**
         * 이른 초기화
         * 1. 클래스 로드 속도 느림
         * 2. 그 뒤는 이미 생성된 인스턴스르 받기 때문에 빠름
         * 
         * 게으른 초기화
         * 1. 클래스 로드 빠름
         * 2. 최초 요청시 속도가 느림
         */
    }
}
