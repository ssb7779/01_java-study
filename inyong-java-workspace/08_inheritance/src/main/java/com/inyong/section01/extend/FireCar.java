package com.inyong.section01.extend;

public class FireCar extends Car {

    /*
    1. 상속 관계 표현에 사용되는 키워드
    2. 자식클래스 정의시 "자식 클래스 extends 부모 클래스"
    3. 부모 클래스를 확장하는 개념
    => 부모 클래스에 정의되어있는 맴버(필드, 메소드)를 자신의 것처럼 사용 가능
        + 자신만의 멤버도 작성 가능

    상속 특징
    1. 클래스와 클래스 간에 있어서 다중 상속 불가 (부모클래스 여러개 X)
    2. 자식 클래스 타입으로 객체 생성시 부모 생성자 먼저 호출
    즉, 부모 객체가 내부적으로 먼저 생성
    3. 부모 클래스에 있는 메소드를 자식 클래스에서 재정의 할 수 있음 (오버라이딩)
    4. 모든 클래스들은 Object 클래스를 상속 받고 있음 (Object 클래스는 최상위 클래스)
    => 즉, 모든 클래스들은 Object의 하위 클래스
    => 즉, 모든 클래스들은 Object의 멤버를 사용할 수 있다.
    => + 오버라이딩을 통해 재정의도 가능






     */

    public FireCar() {
        // super(); // 부모생성자 호출 구문 (컴파일러가 작성해줌) 즉 부모객체 생성되는 원리
        System.out.println("FireCar 기본생성자 호출");
    }

    @Override // 오버라이딩한 메소드에 작성하는 어노테이션
    public void soundHorn(){
        // super. => 부모 멤버에 접근할 때 사용되는 키워드
        // 아무리 상속 구조여도 private 멤버는 접근 불가
//      if (super.runningStatus) { }// 해결방법 1 protected 선언하여 사용하가능
        if (/*super.*/isRunningStatus()) { // 해결방법 2 부모 클래스의 필드를 반환하는 public 메소드
            System.out.println("빵빵아 옥지얌!");
        } else {
            System.out.println("소방차가 주행중이지 않습니다.");
        }
        /*
         부모와 동일하게 존재시 재정의 하여, 자식 먼저 실행 (오버라이딩)
         */
    }

    public void sprayWater() {
        System.out.println("꼬부기 물대포~!");
    }



}
