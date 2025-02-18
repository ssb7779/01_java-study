package com.seungjoo.section01.extend;

public class FireCar extends Car{

    public FireCar(){
        super();
        System.out.println("FireCar 클래스 기본 생성자 호출됨");

    }
    /*
        경적소리를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되 소방차에서
        낼 수 있는 소리로 기능을 재정의 해보기
     */
    @Override //오버라이딩한 메소드에 작성하는 어노테이션, 생략 가능
    public void soundHorn(){
        if(super.isRunningStatus()){ // 해결 방법1.부모 맴버를 protected로 변경하면 접근 가능
                                    //해결방법2. 부모 클래스의 필드를 반환하는 public 메소드 정의해서 호출하기
                                        //이 때 super. 생략 가능
        }else{
            System.out.println("소방차가 주행중 상태가 아닙니다.");
        }
    }

    //자기 자신의 멤버도 추가가능
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }



}
