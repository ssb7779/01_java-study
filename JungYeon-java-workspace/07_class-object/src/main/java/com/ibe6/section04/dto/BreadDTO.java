package com.ibe6.section04.dto;

import org.w3c.dom.ls.LSOutput;

public class BreadDTO {
    //빵명, 빵가격
    private String name;
    private int price;

    public BreadDTO(){}
    public BreadDTO(String name, int price){
    this.name = name;
    this.price = price;
    }

    //public String getBName() X
    //public String getBname() X
    //public String getbName() O


    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

    public String getInformation(){
        return "Bread[name= " + name + ", preice= " + price + "]";
    }


}
