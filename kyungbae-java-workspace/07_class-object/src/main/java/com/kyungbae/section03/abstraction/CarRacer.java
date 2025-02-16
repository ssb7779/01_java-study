package com.kyungbae.section03.abstraction;

public class CarRacer {

    /*
        속성 field
        카레이서 소유의 자동차
     */

    private Car car = new Car();

    /*
        # 시동을 걸어라 method
        자동차의 시동을 켠다
     */
    public void startUp() {
        car.startUp();
    } // startUp end

    /*
        # 엑셀을 밟아라 method
        자동차를 앞으로 움직인다
     */
    public void stepAccelator() {
        car.go();
    } // stepAccel end

    /*
        # 브레이크를 밟아라 method
        자동차를 멈춰 세운다
     */
    public void stepBreak() {
        car.stop();
    } // stepBreak end

    /*
        # 시동을 꺼라 method
        자동차의 시동을 끈다
     */
    public void turnOff() {
        car.turnOff();
    } // turnOff end

} // class end
