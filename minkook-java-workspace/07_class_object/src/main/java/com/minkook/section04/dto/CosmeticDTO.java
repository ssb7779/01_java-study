package com.minkook.section04.dto;

public class CosmeticDTO {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean discout;

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
    
    public String getdiscout(boolean discout) {
        if(discout == false){
            return "할인안함";
        }else{
            return "할인함";
        }
    }



    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDiscout() {
        return discout;
    }

    public void setDiscout(boolean discout) {
        this.discout = discout;
        

    }

    public CosmeticDTO() {

    }

    public CosmeticDTO(String name, int price, String brand, String category, boolean discout) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discout = discout;
    }

    public String  pritCosmeticDTO(){
        return   name + " " + price + " " + brand + " " + category + " " + getdiscout(discout);
    }
}
