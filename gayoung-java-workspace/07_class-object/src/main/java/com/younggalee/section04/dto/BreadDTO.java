package com.younggalee.section04.dto;

public class BreadDTO {
    private String breadName;
    private int price;

    public BreadDTO(){}

    public BreadDTO(String breadName,int price){
        this.breadName = breadName;
        this.price = price;
    }

    public String getBreadName() {
        return breadName;
    }

    public int getPrice() {
        return price;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
        return "Bread [ 빵이름 : " + breadName + " / 가격 : " + price + " ]";
    }
}
