package com.john.section02.encapsulation.problem3;

/*
    ## 문제점3 해결
    외부로부터 필드에 직접 접근하지 못하게 접근제어자를 추가
    
    1. 접근 제어자(= 접근 제한자, access modifier)
        1.1. 클래스 필드, 생성자, 메서드와 같은 클래스의 구성요소마다 접근할 수 있는 권한을 설정
        1.2. 종류
            1.2.1. public               : 모든 패키지 및 클래스에서 접근 가능
            1.2.2. protected            : 동일 패키지내에 있는 다른 클래스 및 상속 구조로 되어있는 타 패키지에서 접근 가능
            1.2.3. default(생략가능)      : 동일 패키지에서 접근 가능
            1.2.4. private              : 동일 클래스에서만 접근 가능
 */
public class Monster_Good {

    private String name;
    private int hp;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다";
    }
}
