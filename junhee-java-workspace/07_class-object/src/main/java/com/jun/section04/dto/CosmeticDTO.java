package com.jun.section04.dto;

import org.w3c.dom.ls.LSOutput;

public class CosmeticDTO {

    private String productName;
    private int price;
    private String brand;
    private String category;
    private boolean isDiscounted;

    public CosmeticDTO(){}

    public CosmeticDTO(String productName, int price, String brand,
                       String cateogry, boolean isDiscounted){
        this.productName = productName; // this는 대입
        this.price = price;
        this.brand = brand;
        this.category = cateogry;
        this.isDiscounted = isDiscounted;

    }
    // 순서 상관없음
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public boolean getIsDiscounted(){ // getter는 is를 붙여야함
        return isDiscounted;
    }
    public void setIsDiscounted(boolean isDiscounted){
        this.isDiscounted=isDiscounted;

    }
    public String getInformation(){
        return  "화장품명: " + productName + "\n" +
                "가격: " + price + "원" + "\n" +
                "브랜드: " + brand + "\n" +
                "카테고리: " + category + "\n" +
                "할인여부: " + (isDiscounted ? "할인함": "할인안함" );
    }


}

