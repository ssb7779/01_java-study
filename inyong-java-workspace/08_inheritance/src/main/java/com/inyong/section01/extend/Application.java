package com.inyong.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*
        ## 상속 ##

        부모(상위), 자식(하위) 간의 구조로 클래스를 구성하는 개념
        상위 클래스가 가지고 있는 멤버를 하위 클래스에서 새로 작성할 필요없이 마치 내것처럼 사용 가능
        부모(상위) 클래스를 확장(extend) 한다는 개념을 가짐
        -> 부모 것을 내것처럼 사용하는 것 뿐만 아니라 추가적으로 본인만의 맴버도 작성가능

        상속의 장점

        1. 새로운 클래스 작성시 기존에 작성된 클래스를 재사용 가능
            1) 재사용시 새롭게 작성하는것 보다 빠르게 작성 가능 (생산성 향상)
            2) 공통 코드가 부모 클래스에 존재하므로 수정사항 발생시 부모 클래스 수정만으로 전체적으로 적용 (유지보수성 증가)
        2. 클래스 간의 계층 관계가 형성되어 "다형성" 문법적인 토대가 됨

        단점
        1. 부모 클래스의 기능을 추가/변경시 자식클래스가 정상적으로 동작하는지 예측이 힘듬
        => 상속 구조가 복잡해질 수록 예측이 힘들어 유지보수에 악영향을 끼칠 수 있음

        2. 자식 클래스에서 중요하게 사용되고 있는 기능일 경우 부모 클래스의 변경이 쉽지 않음
        3. 부모 클래스에서 의미 있었던 기능이 자식 클래스에서 무의미 할 수 있음(불필요한 기능 추가)

        >> 상속은 IS - A 관계로 구분되는 경우에만 사용 가능  (has-a?)

         */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("=========================");

        /*
            FireCar is a Car (o) car is FieCar(x)

            자식 클래스 is a 부모클래스
            자식 클래스 extend 부모클래스
            자식클래스 -----|> 부모클래스
            손 클래스 ------|> 월드클래스
         */

        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        // Car 클래스에 있는 모든 메소드를 전부 사용 가능
        // 오버라이딩 (재정의) 후에는 자식 메소드가 실행

        fireCar.sprayWater();

        System.out.println("=========================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

    }
}
