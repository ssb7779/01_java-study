package com.seungjoo.section04.dto;

public class Cosmetic {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean isAccount;



    public Cosmetic(){}

    public Cosmetic(String name, int price, String brand, String category, String str) {
        if (str.equals("할인안함")) {
            this.isAccount = false;
        } else if (str.equals("할인함")) {
            this.isAccount = true;
        }
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;

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

    public void setisAccount(String str) {
        if (str.equals("할인안함")) {
            this.isAccount = false;
        } else if (str.equals("할인함")) {
            this.isAccount = true;
        }
    }
    public String info(){
        String str = "";
        if(isAccount){

            str = "할인함";
        }else{
            str = "할인안함";
        }

        return "화장품의 이름은 " + name + "이고 브랜드는 " + brand + "이고 가격은 " + price + "이고  카테코리는 " + category + " 이고 할인 여부는 " + str;
    }



}
