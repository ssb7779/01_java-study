package com.younggalee.practice7.dto;

public class Product {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public Product() { }

    public Product(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String getInformation() {
        return "ID: " + pId + ", Name: " + pName + ", Price: " + price + ", Tax: " + tax;
    }

    public int getPId() { return pId; }
    public void setPId(int pId) { this.pId = pId; }

    public String getPName() { return pName; }
    public void setPName(String pName) { this.pName = pName; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }
}
