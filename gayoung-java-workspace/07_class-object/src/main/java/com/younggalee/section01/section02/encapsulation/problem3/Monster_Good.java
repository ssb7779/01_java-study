package com.younggalee.section01.section02.encapsulation.problem3;


// 이걸 캡슐화라고 한다.
// 데이터를 직접접근 X > public 메소드를 활용하여
public class Monster_Good {

    /*
    ## 문제점3 해결 ##
    외부로부터 필드에 직접 접근 자체가 불가하게끔 제한 두기
    => private 접근젱저자로 설정

    ## 접근제어자 ##
    1. access modifier
    2. 접근제한자라고도 함
    3. 클래스, 필드, 생성자, 메소드와 같은 클래스의 구성요소마다 접근할 수 있는 권한을 지정하는 키워드
    4. 종류 :
    public      : 모든 패키지에서 접근 허용
    protected   : 동일 패키지에서 접근 허용 (단, 상속구조일 경우 다른 패키지여도 접근 허용)
    default     : 동일 패키지에서 접근 허용 (생략 시, 기본값)
    private     : 동일 클래스에서만 접근 허용
     */

    //외부 접근 불가능 해당 클래스에서만 사용가능
    private String name;
    private int hp;

    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }

    /*
    ## 캡슐화 (데이터보호)##
    1. 필드의 직접 접근 제한(private) 메서드를 통해서만 접근하도록 => 정보은닉
    2. 간접적으로 필드를 수정 및 조회 할 수 있는 메소드를 클래스 내부에 작성하는 기법
    3. 즉, 필드(속성)와 메소드(기능)를 묶어서 관리하는 기법
    4. 클래스 작성시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙
    */

}
