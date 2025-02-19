package com.inyong.practice7.dto;

import com.inyong.practice7.controller.ProductManager;

public class Product {
    private int pId;       // 제품 ID
    private String pName;  // 제품명
    private int price;     // 가격
    private double tax;    // 세금

    // 기본 생성자
    public Product() {
        ProductManager.incrementCount(); // Product 객체 생성 시 count 증가
    }

    // 매개변수 생성자
    public Product(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductManager.incrementCount(); // Product 객체 생성 시 count 증가
    }

    // Getter & Setter
    public int getpId() { return pId; }
    public void setpId(int pId) { this.pId = pId; }

    public String getpName() { return pName; }
    public void setpName(String pName) { this.pName = pName; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }

    // 제품 정보 반환
    public String getInformation() {
        return "제품 ID: " + pId + ", 제품명: " + pName + ", 가격: " + price + ", 세금: " + tax;
    }
}