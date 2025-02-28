package com.minkook.section02.super_package;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Product() {
        System.out.println("Product클래스의 기본생성자 호출됨");

    }


    public Product(String code, String brand, String name, int price) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        System.out.println("Product클래스의 매개변수생성자 호출됨");
    }


    public String getInformation() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
