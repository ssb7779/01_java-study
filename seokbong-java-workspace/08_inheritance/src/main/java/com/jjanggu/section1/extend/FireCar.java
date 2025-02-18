package com.jjanggu.section1.extend;

/*
    ## extends ##
    1. 상속 관계 표현에 사용되는 키워드
    2. 자식클래스 정의시 "자식클래스 extend 부모클래스"
    3. 부모클래스를 확장하는 개념
       => 부모 클래스에 정의되어있는 멤버(필드, 메소드)를 자신의 것처럼 사용 가능
          + 자신만의 멤버도 작성 가능
    4. 단, 아무리 상속 관계여도 부모의 private 멤버는 접근 불가
 */
public class FireCar extends Car {

    public FireCar(){
        // super(); // 부모생성자 호출 구문 (컴파일러ㅓ가 작성해줌)즉, 부모객체
        System.out.println("FireCar 클래스 기본생성자 호출됨");
    }
    /*
        경적소릴를 내는 용도의 메소드 선언부는 부모 메소드와 똑같은 형태로 두되
        소방차에서 낼 수 있는 소리로 기능을 재정의 해보기
        => 오버라이딩
     */
    @Override // 오버라이딩한 메소드에 작성하는 어노테이션
    public void soundHorn(){
        // supper. => 부모 멤버에 접근할 때 사용되는 키워드
        // 아무리 상속 구조여도 부모의 private 멤버는 접근 불가
//        if(super.runningStatus){ // 해결방법1. 부모 멤버를 protected로 변경하면 접근 가능
        if(/*super.*/isRunningStatus()){ // 해결방법2. 부모 클래스의 필드를 반환하는 public 메소드 정의해서 호출하기
            System.out.println("빠아아아ㅏ아앙~~빵아아ㅏ앙ㅇ!");
        }else{
            System.out.println("소방차가 주행중 상태가 아닙니다.");
        }
    }

    // 자기 자신의 멤버도 추가가능
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }


}
