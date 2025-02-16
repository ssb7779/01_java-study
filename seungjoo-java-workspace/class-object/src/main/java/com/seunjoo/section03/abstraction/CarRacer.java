package com.seunjoo.section03.abstraction;

import java.util.Scanner;

public class CarRacer {
    /*
    속성 필드
    카레이서 소유의 자동차
     */

    Car car = new Car(); //카레이서가 소유하고 있는 자동차





    private void startUp(){  //시동을 걸어라
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }
    /*
    브레이크를 밟아라
     */

    public void stopBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }











}
