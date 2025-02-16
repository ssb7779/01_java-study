package com.younggalee.section04.dto;

public class CosmeticDTO {
    // 필드
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean discount;

    //기본생성자
    public CosmeticDTO(){ }

    //매개변수생성자
    public CosmeticDTO(String name, int price, String brand, String category, boolean discount) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setIsDiscount(boolean discount){
        this.discount = discount;
    }
    public boolean isDiscout(){ return discount; }

    public String getInformation(){
        return name + " " + price + " " + brand + " " + category + " " + discount;
    }


}
