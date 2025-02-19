package com.inyong.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");

    }

    public void soundHorn() {
        if (runningStatus) {
            System.out.println("소금빵!! 피자빵!!");
        }else {
            System.out.println("주행중인 상태가 아닐 경우 경적을 울릴 수 없습니다.");
        }
    }

    //

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public boolean isRunningStatus(){
        return runningStatus;
    }


}
