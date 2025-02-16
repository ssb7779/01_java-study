package com.kyungbae.section02.encapsulation.problem3;

public class Monster_Good {

    //문제점3 해결방안
    // 외부로부터 필드에 직접 접근을 제한두기
    /*
        접근 제어자 종류
        1) public    : 모든 패키지에서 접근 허용
        2) protected : 동일 패키지에서 접근 허용 (단,상속구조일 경우 다른 패키지여도 허용)
        3) default   : 동일 패키지에서 접근 허용 (생략시 기본값)
        4) private   : 동일 클래스에서만 접근 허용
     */

//    [default] string name <= 기존
    private String name; // 외부에서 접근 제한
    private int hp;      // 외부에서 접근 제한

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }



} // class end
