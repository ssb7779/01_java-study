package com.john.section02.encapsulation.problem3;

public class Monster_Bad {

    String name;
    int hp;

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
