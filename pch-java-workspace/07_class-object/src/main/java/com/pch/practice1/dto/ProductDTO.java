package com.pch.practice1.dto;

public class ProductDTO {
    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(String productId, String productName, String productArea, int price, double tax) {
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

    public String getInformation() {
        return productId + " " + productName  + " " + productArea + " " + price + " " + tax;
    }

    public String getRealprice() {
        int realPrice = (int) (price + price*tax);
        return "상품명 = " + productName + "\n" +
                "부가세 포함 가격 = " + String.valueOf(realPrice);
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
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
}
