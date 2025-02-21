package com.sh.section02.example.dto;

public class Rndtn extends Game{
    private int distance;
    private int count;

    public Rndtn(){}

    public Rndtn(String name, int hp, int lv, int exp, int distance, int count) {
        super(name, hp, lv, exp);
        this.distance = distance;
        this.count = count;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Rndtn{" +super.toString()+
                "distance=" + distance +
                ", count=" + count +
                '}';
    }

    @Override
    public void att() {
        if (count > 0) {
            System.out.println("+++++++++++++++++++"+distance + "까지 공격");
//    count--;
            System.out.println("+++++++++++++++++++남은활 " + --count);
            setExp(getExp() + 15);
        } else {
            System.out.println("+++++++++++++++++++화살없음");
        }
    }
    @Override
    public void def() {
        System.out.println("+++++++++++++++++++못막음");
        setHp(getHp()-20);
    }
}
