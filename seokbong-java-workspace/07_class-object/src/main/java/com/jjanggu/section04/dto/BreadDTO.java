package com.jjanggu.section04.dto;

public class BreadDTO {

    // 빵명, 가격,
    private String breadName;
    private int breadPrice;

    public BreadDTO(){}

    public BreadDTO(String name, int price){
        this.breadName = name;
        this.breadPrice = price;
    }

    // public String getBName(){} // X
    // public String getBname(){} // X

    public String getBreadName(){
         return breadName;
    }
    public void setBreadName(String breadName){
        this.breadName = breadName;
    }

    public int getBreadPrice(){
        return breadPrice;
    }
    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }

    public String getInformation() {
        return "Bread[breadName=" + breadName + ", breadPrice=" + breadPrice;
    }
}
