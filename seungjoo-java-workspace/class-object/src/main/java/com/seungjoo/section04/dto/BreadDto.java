package com.seungjoo.section04.dto;

public class BreadDto {
    private String name;
    private int price;

    public BreadDto(){}
    public BreadDto(String name, int price) {
        this.name = name;
        this.price = price;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
