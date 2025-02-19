package com.ibe6.section04.dto;

import java.util.SplittableRandom;

public class CosmeticDTO {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean Discount;

    public CosmeticDTO(){}

    public CosmeticDTO(String name, int price, String brand, String category, boolean isDiscount) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.Discount = isDiscount;
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
        this.Discount = isDiscount;
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
        return Discount;
    }

    public String getInformation(){
        return "name: " + name + ", price: " + price + ", brand: "
                + brand + ", category: " + category + ", discount: "
                + Discount;
    }
}
