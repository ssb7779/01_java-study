package com.minkook.section01.extend;

/*
    ## extends ##
    1. 상속 관계 표현에 사용되는 키워드
    2. 자식클래스 정의시 "자식클래스 extends 부모클래스"
    3. 부모클래스를 확장하는 개념
        => 부모 클래스에 정의되어 있는 멤버(필드,메소드)를 자신의 것처럼 사용 가능
          + 자신만의 멤버도 작성 가능
    4. 단 아무리 상속관계여도 부모의 private 멤버는 접근 불가
 */
public class FireCar extends  Car {
    public FireCar(){
        System.out.println("F 기본생성자 호출됨");
    }
    
    /*
        경적소리를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되
        소방차에서 낼수 있는 소리로 기능을 재정의 해보기
        => 오버라이딩
     */
    @Override
    public void soundHorn(){
        //해결방법1. 부모멤버를 protected로 변경하면 접근 가능
        //해결방법2. 부모 클래스의 필드를 반환하는 public 메소드 정의해서 호출하기
        if(super.runningStatus){
            System.out.println("빠아아아아아앙~");
        }else {
            System.out.println("주행중인 상태가 아니므로 경적을 울릴 수 없습니다.");
        }

    }

    public void sprayWater(){
        runningStatus = false;
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다..");
    }

}
