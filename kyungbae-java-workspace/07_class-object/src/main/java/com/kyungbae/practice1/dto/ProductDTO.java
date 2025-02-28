package com.kyungbae.practice1.dto;

public class ProductDTO {


    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;

    public ProductDTO () {}
    public ProductDTO (String productId, String productName, String productArea, int price, double tax) {
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

//    public void setProductId(String productId){
//        this.productId = productId;
//    }

    public String getProductId(){
        return productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public String getProductArea(){
        return productArea;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setTax(double tax){
        this.tax = tax;
    }

    public double getTax(){
        return tax;
    }

    public String getInformation(){
        return productId + "\t" + productName + "\t" + productArea + "\t" + price + "\t" + tax;
    }

}
