package com.podoseee.section04.dto;

public class CosmeticDTO {

    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean discount;

    public CosmeticDTO(){} // 꼭 적기!

    public CosmeticDTO(String name, int price, String brand, String category, boolean discount){
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
    }

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public int getPrice() {return price;}
    public void setPrice(int price){this.price = price;}

    public String getBrand() {return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public String getCategory() {return category;}
    public void setCategory(String category){this.category = category;}

    public boolean isDiscount() {return discount;}
    public void setDiscount(boolean discount){this.discount = discount;}

    public String getInformation(){
        return "name=" + name + ", price=" + price + ", brand=" + brand + ", category=" + category + ", discount=" + discount;
    }
}
