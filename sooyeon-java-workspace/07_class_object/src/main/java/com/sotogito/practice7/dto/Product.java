package com.sotogito.practice7.dto;

public class Product {
    private int pId;
    private String pName;
    private int price;
    private double tax;

    public Product() {
    }

    public Product(int pId, String pName, int price, double tax) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public int getId() {
        return pId;
    }

    public void setId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return pName;
    }

    public void setName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    public String getInfromation() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }

}
