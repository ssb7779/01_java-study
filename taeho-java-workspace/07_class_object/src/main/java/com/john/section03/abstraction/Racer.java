package com.john.section03.abstraction;

public class Racer {
    private Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccel() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
