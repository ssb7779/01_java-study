package com.seungjoo.section02.encapsulation.problem2;

public class Monster_Good {
    String kinds;
    int hp;

    public void setHp(int hp){
        if(hp<0){
            this.hp=0;

        }else{
            this.hp = hp;
        }
    }


    public void setName(String name){
        this.kinds = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " +this.hp + "입니다. ";
    }





















}
