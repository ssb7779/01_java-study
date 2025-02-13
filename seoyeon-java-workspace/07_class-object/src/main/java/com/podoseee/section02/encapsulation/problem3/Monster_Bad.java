package com.podoseee.section02.encapsulation.problem3;

public class Monster_Bad {
    String name;
    int hp;

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
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }
}
