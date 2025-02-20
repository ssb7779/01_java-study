package com.john.section01.extend;

/*
    Inheritance Car Class

    ## extends
    1. 상속 관계 표현에 사용되는 키워드
    2. 하위 클래스 정의시 "ChildClass extends ParentClass"
    3. 상위 클래스에 정의되어 있는 멤버(필드, 메서드) 사용가능(private 제외)
        => 확장해서 자신만의 멤버도 작성가능
 */
public class FireCar extends Car {
    public FireCar() {
        // 상위 생성자 호출 구문(컴파일러가 작성)
//        super();
        System.out.println("Default Constructor of FireCar Class Called");
    }

    /*
        상위 클래스의 soundHorn()이라는 메서드를 똑같은 형태로 하위클래스에서 재정의
        @Override 오버라이딩한 메서드에 작성하는 어노테이션
     */
    @Override
    public void soundHorn() {
        // super => 부모 멤버에 접근할 때 사용하는 키워드, private는 접근불가
        // 상위 클래스의 필드를 반환하는 public method를 정의해서 호출
//        if(super.isRunningStatus()) // super 생략가능 => 하위 클래스에 없는경우, 상위 클래스에 정의된 멤버를 찾아서 호출
        if(isRunningStatus()){
            System.out.println("AutoCall of ParentClass Method 뿌와아아아아아아앙");
        } else{
            System.out.println("FireCar is not Driving");
        }
    }

    public void sprayWater(){
        System.out.println("Spray Water Method Call");
    }
}
