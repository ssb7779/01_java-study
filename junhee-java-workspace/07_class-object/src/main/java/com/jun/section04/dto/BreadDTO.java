package com.jun.section04.dto;

public class BreadDTO {

    // 빵명, 빵가격

    private String name;
    private int price;

    public BreadDTO(){}

    public BreadDTO(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){return name;}

    public int getPrice(){return price;}

    public void setName(String name){this.name = name;}

    public void setPrice(int price){this.price = price;}

    public  String getInformation(){
        return "Bread[name=" + name + ", price=" + price + "]";
    }
}
