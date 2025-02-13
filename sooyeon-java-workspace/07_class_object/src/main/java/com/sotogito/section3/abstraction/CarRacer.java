package com.sotogito.section3.abstraction;

public class CarRacer {
    /**
     * ## 속성 필드
     * 카레이서 소유의 자동차
     *
     */
    private Car car = new Car();

    public void startUp(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }



}
