package com.sotogito.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        super(); //자동으로 이미 잇음.
        System.out.println("소방차 기본생성자 호출");
    }

    /**
     * 부모 메서드 오버라이딩(재정의)
     */
    @Override
    public void soundHorn(){
        if(super.isRunningStatus()){
            System.out.println("소빵차");
        }else {
            System.out.println("소방차가 주행중이 아닙니다.");
        }
    }

    //소방차에서만 사용 가능한 메서드 추가
    public void sprayWater(){
        System.out.println("불 발견, 물 뿌립니다.");
    }


}
