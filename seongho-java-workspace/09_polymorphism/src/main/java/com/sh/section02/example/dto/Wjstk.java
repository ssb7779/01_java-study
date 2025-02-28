package com.sh.section02.example.dto;

public class Wjstk extends Game{

    private String weapon;
    private String[] items;

    public Wjstk(){}

    public Wjstk(String name, int hp, int lv, int exp, String weapon, String[] items) {
        super(name, hp, lv, exp);
        this.weapon = weapon;
        this.items = items;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public void att() {
        System.out.println("+++++++++++++++++++"+weapon +"과(와)같은 무기로 공격");
        setExp(super.getExp()+10);
    }

    @Override
    public void def() {
        System.out.println("+++++++++++++++++++방패로 방어");
        setHp(super.getHp()-2);
    }
}
