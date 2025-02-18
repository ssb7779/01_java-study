package com.pch.practice7.dto;

public class Product {
    private int pid;
    private String pName;
    private int price;
    private double tax;

    public Product(int pid, String pName, int price, double tax) {
        this.pid = pid;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public Product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
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

    public String getInformation() {
        return "Product{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                '}';
    }
}
