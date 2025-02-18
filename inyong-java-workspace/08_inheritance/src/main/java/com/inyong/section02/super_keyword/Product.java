package com.inyong.section02.super_keyword;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;


    public Product() {
        System.out.println("Computer 기본 생성자 호출");
    }

    public Product(String code, String brand, String name, int price) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        System.out.println("클래스의 매개변수 생성자 호출");
    }

    public String getBrand() {
        return brand;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public String getInformation() {
        return "\ncode : " + code + "\nbrand : "  + brand + "\nname : " + name + "\nprice : " + price;
    }
}
