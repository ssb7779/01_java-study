package com.sh.section07.dto;

public class Phonedto {
    private String br;
    private String name;
    private String seri;
    private int pri;

    public Phonedto(){}

    public Phonedto(String br, String name, String seri, int pri) {
        this.br = br;
        this.name = name;
        this.seri = seri;
        this.pri = pri;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Phonedto{" +
                "br='" + br + '\'' +
                ", name='" + name + '\'' +
                ", seri='" + seri + '\'' +
                ", pri=" + pri +
                '}';
    }
}
