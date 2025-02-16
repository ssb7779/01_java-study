package com.kyungbae.section04.dto;

public class CosmeticDTO {
    // field
    private String product;
    private int price;
    private String brand;
    private String category;
    private boolean isDiscount;

    // default constructor
    public CosmeticDTO(){}

    // parameter constructor
    public CosmeticDTO(String product, int price, String brand, String category, boolean isDiscount){
        this.product = product;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isDiscount = isDiscount;
    }

    // method (setter, getter)
    public void setProduct(String product){
        this.product = product;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDiscount(boolean isDiscount){
        this.isDiscount = isDiscount;
    }

    public String getProduct(){
        return product;
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
        return "화장품명 : " + product + "\n가격 : " + price + "\n브랜드 : " + brand + "\n카테고리 : " + category + "\n할인여부 : " + (isDiscount ? "할인함" : "할인안함");
    }

} // class end
