package com.kyungbae.section02.encapsulation.problem2;

public class Monster_Good {

    String name;
    int hp;

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 문제점 2 해결방안
    // 직접 접근을 하지 않아 내부에서만 이름 수정가능
    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }

}
