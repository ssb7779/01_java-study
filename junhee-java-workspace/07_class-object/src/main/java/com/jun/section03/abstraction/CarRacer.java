package com.jun.section03.abstraction;

public class CarRacer {

    /*
        ## 속성 필드 ##
        카레이서 소유의 자동차
     */
    private Car car = new Car();

    /*
        ## 시동을 걸어라 메소드 ##
        자동차의 시동을 켠다
     */
    public void startUp(){
        car.startUp();
    }

    /*
        ## 엑셀을 밟아라 ##
     */

    public void stepAccelator(){
        car.go();
    }

    /*
        ## 브레이크를 밟아라 ##
     */
    public void stepbreak(){
        car.stop();
    }

    /*
        ## 시동을 꺼라 ##
     */
    public void turnOff(){
        car.turnOff();
    }
}
