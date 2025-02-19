package com.younggalee.section01.extend;

/*
    ## extends ##
    1. 상속관계 표현에 사용되는 키워드
    2. 자식클래스 정의시 "자식클래스 extends 부모클래스"
    3. 부모클래스를 확장하는 개념
      => 부모 클래스에 정의되어있는 멤버(필드, 메소드)를 자신의 것처럼 사용가능
        + 자신만의 멤버도 작성가능
    4. 단, 아무리 상속 관계여도 부모의 private 멤버는 접근 불가
 */

public class FireCar extends Car{
    public FireCar() {
        super(); //부모생성자 호출구문 (근데 있으나 없으나 작동 동일함. 작성안해도 컴파일러가 기본으로 작성해줌)
        // 즉, 부모객체 생성되는 원리

        /*
        cf) this와 super는 클래스 내에서 객체를 참조하는 키워드
        this : 현재 클래스의 인스턴스(객체) 자체를 참조
        super : 부모 클래스를 참조

         */
        System.out.println("FireCar 클래스 기본 생성자 호출됨");
    }


        /*
        경적소리를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되
        소방차에서 낼 수 있는 소리로 기능을 재정의 해보기
        재정의 >>>>> "오버라이딩"********************
         */
        //오버라이딩한 메소드에 작성하는 어노테이션
        //@ : 어노테이션

    @Override
    public void soundHorn(){
        if (super.isRunningStatus()){ //자식클래스에서 부모클래스의 멤버에 접근하기 위해 사용되는 키워드 : super
            // 상속구조에서도 private 멤버는 접근이 불가함.
            // 방법1. 부모 멤버를 protected 로 변경하면 접근 가능함. // private boolean runningStatus >> protected
            // 방법2. 해당 필드값을 반환하는 getter 함수를 만든다. (Car 클래스에) // super.runningStatus >> super.isRunningStatus()
            System.out.println("삐용삐용삐용~~~~~");
        }else{
            System.out.println("소방차가 주행중이지 않습니다. ");
        }
        //외부에서 호출시 자식것이 있으면 자식 메소드 수행. 없으면 부모 메소드 수행
    }

    //자기 자신의 멤버도 추가가능
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }

}
