package com.podoseee.section04.dto;

public class BreadDTO {

    // 빵명, 빵가격
    private String breadName;
    private int price;

    public BreadDTO(){}
    public BreadDTO(String breadName, int price){
        this.breadName = breadName;
        this.price = price;
    }

    public String getBreadName(){return breadName;}
    public void setBreadName(String breadName){this.breadName = breadName;}

    public int getPrice(){return price;}
    public void setPrice(int price){this.price = price;}

    public String getInformation(){return "Bread[breadname= " + breadName + ", price= " + price +"]";}
}
