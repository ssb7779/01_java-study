package com.ibe6.section04.dto;

import java.util.SplittableRandom;

public class CosmeticDTO {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean isDiscount;

    public CosmeticDTO(){}

    public CosmeticDTO(String name, int price, String brand, String category, boolean isDiscount) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isDiscount = isDiscount;
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
    public void setDiscount(boolean isDiscount){
        this.isDiscount = isDiscount;
    }


    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public String getCategory(){
        return category;
    }
    public boolean isDiscount(){
        return isDiscount;
    }

    public String getInformation(){
        return "name: " + name + ", price: " + price + ", brand: " + brand + ", category: " + category + ", discount: " + (isDiscount? true : false);
    }
}
