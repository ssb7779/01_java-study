package com.sh.section02.example.dto;

public class Dkatkf extends Game{
    public Dkatkf(){}

    public Dkatkf(String name, int hp, int lv, int exp) {
        super(name, hp, lv, exp);
    }

    @Override
    public String toString() {
        return "Dkatkf{"+ super.toString() +"}";
    }

    @Override
    public void att() {
        System.out.println("+++++++++++++++++++주먹질");
        setExp(getExp()+5);
    }

    @Override
    public void def() {
        System.out.println("+++++++++++++++++++피함");
    }
}
