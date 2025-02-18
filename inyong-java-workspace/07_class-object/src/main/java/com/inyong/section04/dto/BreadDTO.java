package com.inyong.section04.dto;

public class BreadDTO {
    private String name;
    private String price;

    BreadDTO(String name, String price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInformation(){
        return "bread" + name + price;
    }
}
