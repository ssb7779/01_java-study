package com.kyungbae.section01.extend;

public class Application {

    public static void main(String[] args) {

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("===========================================================");

        FireCar fireCar = new FireCar();

        fireCar.soundHorn(); // override
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        // Car 클래스에 있는 모든 메소드를 전부 사용 가능
        // 오버라이딩 (재정의) 후에는 자식메소드가 실행됨

        fireCar.sprayWater();

        System.out.println("===========================================================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
        /*
            레이싱카는 경적 소리를 내는게 적합하지 않음
            Car를 상속받으면서 어쩔 수 없이 경적 소리를 냄
            => 상속으로 인해 불필요한 기능이 추가됨 (단점)
         */



    }

}
