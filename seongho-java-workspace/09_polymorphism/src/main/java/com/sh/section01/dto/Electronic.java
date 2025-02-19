package com.sh.section01.dto;

public class Electronic {
    private String brand;
    private String name;;
    private int pri;

    public Electronic(){}

    public Electronic(String brand, String name, int pri) {
        this.brand = brand;
        this.name = name;
        this.pri = pri;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", pri=" + pri +
                '}';
    }
}
