package com.inyong.section02.encapsulation.problem3.abstraction;

public class CarRacer {
    private Car car = new Car();

    public void startUp(){
        car.startUp();
    }

    public void stepAccelerator(){
        car.go();
    }

    public void fullAccelerator(){
        car.묻고_더블로가();
    }

    /*
    브레이크를 밟아라 메소드
     */

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }

}
