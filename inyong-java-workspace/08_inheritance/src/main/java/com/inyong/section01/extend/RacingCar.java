package com.inyong.section01.extend;

public class RacingCar extends Car{
    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출");
    }

    @Override
    public void soundHorn(){
        System.out.println("레에싱카는 경적을 울리지 않습니다.");
    }

    @Override
    public void run(){
        System.out.println("질주");
    }
}
