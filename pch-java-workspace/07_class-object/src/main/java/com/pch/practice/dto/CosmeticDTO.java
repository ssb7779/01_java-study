package com.pch.practice.dto;

public class CosmeticDTO {
    private String name;        // 이름
    private int price;          // 가격
    private String brand;       // 브랜드
    private String category;    // 카테고리
    private boolean isOnSale;   // 할인여부

    public CosmeticDTO(String name, int price, String brand, String category, boolean isOnSale) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isOnSale = isOnSale;
    }

    public CosmeticDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    @Override
    public String toString() {
        return "CosmeticDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", isOnSale=" + isOnSale +
                '}';
    }
}
