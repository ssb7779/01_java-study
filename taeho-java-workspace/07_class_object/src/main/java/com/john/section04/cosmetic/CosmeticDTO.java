package com.john.section04.cosmetic;

public class CosmeticDTO {
    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean isDiscount;

    public CosmeticDTO() {}

    public CosmeticDTO(String name, int price, String brand, String category, boolean isDiscount) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isDiscount = isDiscount;
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

    public boolean isDiscount() {
        return isDiscount;
    }
    public void setDiscount(boolean discount) {
        this.isDiscount = discount;
    }

    public String getInformation() {
        // 굳이 변수를 선언하지 않고 내부에 삼항연산자를 바로 사용하는 것도 가능
        String discount = isDiscount ? "할인함" : "할인안함";
        return "화장품명: " + name + "\n" +
                "가격: " + price + "\n" +
                "브랜드: " + brand + "\n" +
                "카테고리: " + category + "\n" +
                "할인여부: " + discount;
    }


}
