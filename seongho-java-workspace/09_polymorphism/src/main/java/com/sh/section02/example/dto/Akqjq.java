package com.sh.section02.example.dto;

public class  Akqjq extends Game {
    private int mp;
    public Akqjq(){}

    public Akqjq(String name, int hp, int lv, int exp, int mp) {
        super(name, hp, lv, exp);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
        if (this.mp <=0){
            System.out.println("마력 소진 방어시 충천");
            this.mp = 0;
        }
    }

    @Override
    public String toString() {
        return "Akqjq{" +
                "mp=" + mp +super.toString()+
                '}';
    }

    @Override
    public void att() {
        System.out.println("+++++++++++++++++++마법 공격");
        setExp(getExp()+10);
        setMp(getMp()-10);
    }

    @Override
    public void def() {
        System.out.println("+++++++++++++++++++방어한다.");
        setHp(getHp()-5);
        setMp(getMp()+5);
    }
}
