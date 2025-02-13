package com.jjanggu.section04.dto;

public class CosmeticDTO {

    private String name;
    private int price;
    private String brand;
    private String cat;
    private boolean isdc;

    public CosmeticDTO(){}

    public CosmeticDTO(String name, int price, String brand, String cat, boolean isdc){
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.cat = cat;
        this.isdc = isdc;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getCat(){
        return cat;
    }
    public void setCat(String cat){
        this.cat = cat;
    }

    public boolean getIsdc(){
        return isdc;
    }
    public void setIsdc(boolean isdc) {
        this.isdc = isdc;
    }

    public String getInformation(){
        return "- 화장품명: " + name + "\n- 가격: " + price +
                "\n- 브랜드: " + brand + "\n- 카테고리: " +
                cat + "\n- 할인여부: "+ (isdc ? "할인함" : "할인안함");
    }
}
