package com.jun.section02.super_keyword;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;

    public Product(){
        System.out.println("Product클래스의 기본생성자 호출됨");
    }

    public Product(String code, String brand, String name, int price) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        System.out.println("Product클래스의 매개변수생성자 호출됨");
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getInformation(){
        return "code= " + code + ", brand= " + brand +", name= " + name +", price= " + price;
    }
}
