package com.sh.section04.dto;

public class Bdto {
    //빵 , 빵가격
    private String Bread;
    private int Pri;


    public Bdto(){}
    public Bdto(String Bread, int Pri){
        this.Bread = Bread;
        this.Pri = Pri;
    }

    public int getPri() {
        return Pri;
    }

    public void setPri(int Pri) {
        this.Pri = Pri;
    }

    public String getBread() {
        return Bread;
    }

    public void setBread(String Bread) {
        this.Bread = Bread;
    }


    public String toString() {
        return "Bdto{" +
                "bread='" + Bread + '\'' +
                ", pri=" + Pri +
                '}';
    }
}
