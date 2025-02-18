package com.seungjoo.section01.extend;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();




        System.out.println("======================");

        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();


        System.out.println("=========================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

        /*
            레이싱 카는 경적 소리를 내는게 적합하지 않음
            하지만 Car를 상속받앗기 떄문에 어쩔 수 없이 경적 소리가 남
            -> 상속으로 인해 불필요한 기능이 추가됨(단점)
         */































    }

}
