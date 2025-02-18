package com.podoseee.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
            ## 상속 ##
         */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();


        System.out.println("===============================================================");

        /*
            FireCar is a Car    (o)     Car is a FireCar    (x)
            RacingCar is a Car  (o)     Car is a RacingCar  (x)
            
            자식클래스 is a 부모클래스
            자식클래스 extend 부모클래스
            자식클래스 -----|> 부모클래스
         */

        FireCar fireCar =  new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        // Car 클래스에 있는 모든 메소드를 전부 사용 가능
        // 오버라이딩(재정의)후에는 자식메소드가 실행됨

        //car.sprayWater(); // 에러발생

        fireCar.sprayWater();

        System.out.println("===============================================================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
        
        /*
            레이싱카는 경적 소리를 내는 것이 적합하지 않음
            하지만 Car를 상속받았기 때문에 어쩔 수 없이 경적소리가 울려짐
            => 상속으로 인해 불필요한 기능이 추가됨 (단점)
         */

        /*
            ## 상속 특징 ##
         */
    }
}
