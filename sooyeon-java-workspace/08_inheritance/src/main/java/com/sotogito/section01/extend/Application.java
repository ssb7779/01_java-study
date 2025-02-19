package com.sotogito.section01.extend;

public class Application {
    /**
     * ## 상속
     * 1. 부모 자식간의 구조로 클래스를 구성
     * 2. 상위클래스의 기능을 하위 클래스가 사용할 수 있다.
     * 3. 자식은 부모의 기능이외 확장하여 사용 가능 -> 자식이 사용할 수 있는 기능이 더 포괄적임
     * <p>
     * ## 상속의 장점
     * 1. 부모 코드의 기능이 필요할 때 그냥 자식을 생성하면 됨 - 재사용성 높아짐
     * 2. 공통 기능을 수정해야할 때 부모 코드에 있는 코드만 수정하면 됨 - 유지보수성 증가
     * 3. 계층관계가 형성 - 다향성
     * <p>
     * <p>
     * ## 자식의 장점
     * 1. 부모클래스의 필드, 메서드를 사용 가능 - 단, private사용 불가
     * 2. 자신의 것으로도 사용 가능
     * 3. 내 단독 기능도 사용 가능
     * <p>
     * <p>
     * ## 단점
     * 1. 부모클래스의 추가/변경가 자식 클래스에 영향을 줌 - 유지보수 힘듦
     * 2. 자식의 기능 중요도가 부모에게 의존됨
     * 3. 부모에서 의미있었던 기능이 자식에게 무의미함
     * <p>
     * >> IS-A 관계의 경우에만 사용 가능
     * * 소방차 is a 자동차 - O   /   자동차 is a 소방차  - X
     * * 레이싱카 is a 자동차 - O   /   자동차 is a 레이싱카  - X <br>
     * 자식 IS A 부모
     * 자식 --|> 부모
     */

    /**
     * 상속 특징
     * 1. 다중상속 불가 - 부모는 1개
     * 2. 객체 생성시 부모 -> 자식 생성자
     * 3. 부모 클래스 오버라이드 재정의
     * 4. 모든 클래스는 Object 클래스를 상속받고있음 - 상속의 개념으로 활용 가능(equal,toString...)
     * @param args
     */

    public static void main(String[] args) {
        Car car = new Car();
//        car.soundHorn();
//        car.run();
//        car.soundHorn();
//        car.stop();
//        car.soundHorn();


        System.out.println("==========================================");
//        FireCar fireCar = new FireCar();
//        fireCar.run();
//        fireCar.soundHorn();
//        fireCar.sprayWater();


        System.out.println("==========================================");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        //racingCar.run();
    }
}
