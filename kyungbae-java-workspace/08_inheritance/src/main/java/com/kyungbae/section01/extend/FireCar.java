package com.kyungbae.section01.extend;

public class FireCar extends Car {



    public FireCar(){
        // super(); // 부모생성자 호출 구문 (컴파일러가 자동 생성해줌)
        // 부모객체 생성되는 원리
        System.out.println("FireCar 클래스 기본생성자 호출됨");
    }

    /*
        경적소리를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되
        소방차에서 낼 수 있는 소리로 기능을 재정의 해보기
        => Override
     */

    @Override // 오버라이딩한 메소드에 작성하는 어노테이션
    public void soundHorn() {
//        if (super.runningStatus) { // 해결방법1. 부모 멤버를 protected로 변경하면 접근 가능 (캡슐화 원칙상 위배됨)
        if (/*super.*/isRunningStatus()) { // 해결방법2. 부모 클래스의 필드를 반환하는 public 메소드 정의해서 호출하기
            System.out.println("위용~ 위용~");
        } else {
            System.out.println("소방차가 주행중 상태가 아닙니다.");
        }
    }

    // 물 뿌리는 기능 추가
    public void sprayWater() {
        System.out.println("물을 뿌립니다.");
    }

}
