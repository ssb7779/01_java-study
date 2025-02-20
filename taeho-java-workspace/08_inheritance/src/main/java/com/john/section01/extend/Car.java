package com.john.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        System.out.println("Default Constructor of Car Class Called");
    }

    public void run() {
        runningStatus = true;
        System.out.println("Car Running (running Status) : " + runningStatus);
    }

    public void soundHorn () {
        if (runningStatus) {
            System.out.println("Car honk");
        } else {
            System.out.println("Car not running");
        }
    }

    public void stop() {
        runningStatus = false;
        System.out.println("Car Stopped");
    }

    public boolean isRunningStatus(){
        return runningStatus;
    }
}
