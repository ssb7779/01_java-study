package com.jjanggu.practice1.dto;

public class ProductDTO {
    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;

    public ProductDTO(){}

    public ProductDTO(String productId, String productName, String productArea, int price, double tax){
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }


    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductArea(){
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

    public String getInformation1(){
        return productId + " " + productName + " " + productArea + " " + price + " " + tax;
    }

    private static int staticPrice;
    private static double staticTax;

    public static int getStaticPrice(){ return staticPrice;}
    public static void setStaticPrice(int staticPrice){
        ProductDTO.staticPrice = staticPrice;
    }
    public static double getStaticTax(){ return staticTax; }
    public static void setStaticTax(double staticTax){
        ProductDTO.staticTax = staticTax;
    }

    public String getInformation2(){
        return productId + " " + productName + " " + productArea + " " + staticPrice + " " + staticTax;
    }

}
