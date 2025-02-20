package com.sh.section02.example.dto;

public abstract class Game {
private String name;
private int hp;
private int lv;
private int exp;

public Game(){}

    public Game(String name, int hp, int lv, int exp) {
        this.name = name;
        this.hp = hp;
        this.lv = lv;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp<=0){
            this.lv--;
            this.hp=100;
            System.out.println("+++++++++++++++++++사망");
        }
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
        if (this.exp>=100){
            this.lv++;
            this.exp-=100;
            System.out.println("+++++++++++++++++++레벨업");
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", lv=" + lv +
                ", exp=" + exp +
                '}';
    }
    public abstract void att();
    public abstract void def();
}
