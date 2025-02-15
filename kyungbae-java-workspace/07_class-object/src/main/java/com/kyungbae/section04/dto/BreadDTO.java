package com.kyungbae.section04.dto;

public class BreadDTO {
    // 빵의 이름, 빵 가격

    private String name;
    private int price;

    public BreadDTO(){}

    public BreadDTO(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
//        return "빵 이름 : " + name + ", 빵 가격 : " + price;
        return "Bread[name : " + name + ", price : " + price+ "]";
    }





} // class end
