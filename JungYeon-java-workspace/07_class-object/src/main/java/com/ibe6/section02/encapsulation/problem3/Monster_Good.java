package com.ibe6.section02.encapsulation.problem3;

public class Monster_Good {

    /*
        ## 문제점3 해결 ##
        외부로부터 필드에 직접 접근 자체가 불가하게끔 제한 두기
        => private 접근제어자로 설정

        ## 접근제어자 ##
        1. access modifier
        2. 접근제한자라고도 함
        3. 클래스, 필드, 생성자, 메소드와 같은 클래스의 구성요소마다
           접근할 수 있는 권한을 지정하는 키워드
        4. 종류
           1) public    : 모든 패키지에서 접근 허용
           2) protected : 동일 패키지에서 접근 허용 (단, 상속구조일 경우 다른 패키지여도 접근 허용)
           3) default   : 동일 패키지에서 접근 허용 (생략시 기본값)
           4) private   : 동일 클래스에서만 접근 허용
     */

    private String name;
    private int hp;

    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return  "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }

}
