package com.john.section02.encapsulation.problem2;

public class Monster_Bad {

    String name;
    int hp;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

}
