package com.younggalee.Section03.abstraction;

public class CarRacer {
    /*
    ## 속성 필드 ##
    카레이서 소유의 자동차
     */

    private Car car = new Car();

    /*
    ## 메소드 (수행할 내용)
    - 시동을 걸어라 startUp
      : 자동차의 시동을 켠다.
    - 엑셀을 밟아라 stepAccelator
      : 자동차를 앞으로 움직인다.
    - 브레이크를 밟아라
      : 자동차를 멈춰세운다.
    - 시동을 꺼라
      : 자동차의 시동을 끈다.
     */

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
