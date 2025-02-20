package com.john.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("Default Constructor of RacingCarClass Called");
    }
    
    /*
        RacingCar 클래스의 경우, 결국 상위클래스의 모든 기능을 재정의한 것으로
        굳이 상속받을 이유가 없음
     */

    // 하위 클래스에서 상위클래스로부터 받은불필요한 기능을 재정의
    @Override
    public void soundHorn() {
        System.out.println("RacingCar Not honk");
    }

    @Override
    public void run() {
        System.out.println("ChildClass method Called EuroBeat!");
    }

    @Override
    public void stop() {
        System.out.println("ChildClass method Called 86Drift");
    }
}
