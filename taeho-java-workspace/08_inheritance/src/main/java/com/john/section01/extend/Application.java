package com.john.section01.extend;

/*
    ## 상속(inheritance)
    1. 상위(부모) <-> 하위(자식)간의 구조로 클래스를 구성하는 개념
    2. 상위 클래스가 가지고 있는 멤버를 하위클래스에서 새로 작성할 필요없이 사용 가능
    3. 상위 클래스를 확장시켜 자신의 멤버도 작성가능
    4. 클래스와 클래스 간에 있어서 다중상속은 불가능(상위 클래스를 여러개 둘 수 없음)
    5. 하위클래스 타입으로 객체 생성시, 상위 생성자가 항상 먼저 호출됨(상위 객체가 내부적으로 항상 먼저 생성됨)
    6. 상위클래스에 있는 메서드를 하위 클래스에서 재정의 가능(오버라이딩)
    7. 모든 클래스는 Object 클래스를 상속받고 있음(Object 클래스 => 최상위 클래스)
        => 모든 클래스는 Object클래스의 하위 클래스 == Object클래스의 멤버를 사용할 수 있음

    ## 상속의 장점
    1. 새로운 클래스 작성 시 기존에 작성된 클래스 재사용 가능
        1.1. 재사용 시 새롭게 작성하는 것보다 빠르게 작성 가능
        1.2. 공통적인 코드가 상위 클래스에 존재하므로 수정사항 발생 시 상위 클래스만 수정하면 전체적으로 적용(유지보수 용이)
    2. 클래스간 계층관계 형성으로 다형성의 토대가 됨

    ## 상속의 단점
    1. 상위 클래스의 기능 추가/변경 시 하위 클래스가 정상동작하는지 예측이 힘듬
        => 상속구조가 복잡해질수록 오히려 유지보수가 힘들어질 수 있음
    2. 하위 클래스에서 중요하게 사용한 기능일 경우, 상위 클래스의 변경이 힘들어짐
    3. 상위 클래스에서 의미있었던 기능이 하위 클래스에서 무의미 할 수 있음(불필요한 기능의 추가)

    => (하위)IS - (상위)A 관계로 구분되는 경우에만 사용권장


 */
public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("===================");
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

    /*
         IS - A relationship Check
         FireCar 'IS A' Car (O)                 Car 'IS A' FireCar(X)
         Child  ---->  Parent
    */
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

    /*
        RacingCar class 에는 soundHorn() 메서드가 불필요하지만
        상위클래스에 soundHorn()메서드가 정의되어 있어
        불필요한 기능이 추가됨
    */
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }


}
