package com.sotogito.section4.dto;

public class BreadDTO {

    private String name;
    private int price;


    public BreadDTO() {
    }

    public BreadDTO(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return String.format("이름 : %s, 가격 : %d", name, price);
    }
}
