package com.sotogito.section01.extend;

import javax.swing.plaf.PanelUI;

public class Car {
    private boolean runningStatus;

    public Car() {
        System.out.println("기본 생성자 호출");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){
        if(runningStatus){
            System.out.println("빵");
        }else {
            System.out.println("경적을 울릴 수 없습니다.");
        }
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public boolean isRunningStatus(){
        return runningStatus;
    }

}
