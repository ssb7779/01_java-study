package com.podoseee.section01.extend;

/*
        ## extends ##
 */
public class FireCar extends Car {
    public FireCar(){
        // super(); // 부모생성자 호출 구문 (컴파일러가 작성해줌) 즉, 부모객체 생성되는 원리
        System.out.println("FireCar 클래스 기본생성자 호출됨");
    }
    
    /*
        경적소리를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되
        소방차에서 낼 수 있는 소리로 기능을 재정의 해보기
        => 오버라이딩
     */
    @Override // 오버라이딩한 메소드에 작성하는 어노테이션
    public void soundHorn(){
        // super. => 부모 멤버에 접근할 때 사용되는 키워드
        // 아무리 상속 구조여도 부모의 private 멤버는 접근 불가
        if(super.isRunningStatus()){ // 해결방법1. 부모 멤버를 protected로 변경하면 접근 가능
            // 해결방법2. 부모 클래스의 필드를 반환하는 public 메소드 정의해서 호출하기
            System.out.println("빠아아아아앙~~~~빠아아아아앙앙!!!!");
        }else{
            System.out.println("소방차가 주행 중 상태가 아닙니다.");
        }
    }

    // 자기 자신의 멤버도 추가가능
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }
}
