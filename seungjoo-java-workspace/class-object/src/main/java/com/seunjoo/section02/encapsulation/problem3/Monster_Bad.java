package com.seunjoo.section02.encapsulation.problem3;

public class Monster_Bad {

    private String name;
    private int hp;

    public void setHp(int hp){
        if(hp<0){
            this.hp=0;

        }else{
            this.hp = hp;
        }
    }



}
