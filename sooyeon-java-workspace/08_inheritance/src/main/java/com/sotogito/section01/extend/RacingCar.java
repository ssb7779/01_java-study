package com.sotogito.section01.extend;

public class RacingCar extends FireCar{

    /**
     * 레이싱카는 경적이 불필요하지만 상속으로 인해 기능을 가져야만함
     */
    public RacingCar() {
        System.out.println("레이싱카 기본생성자 호출");
    }

    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }

    @Override
    public void run(){
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void stop(){
        System.out.println("멈춰");
    }
}
