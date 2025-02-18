package com.seungjoo.practice1.dto;

public class ProductDTO {
        private String productId;
        private String productName;
        private String productArea;
        private int price;
        private double tax;

        public ProductDTO(){}

    public ProductDTO(String productId, String productName, String productArea, int price, double tax) {
            this.productId = productId;
            this.productName = productName;
            this.productArea = productArea;
            this.price = price;
            this.tax = tax;
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

    public String getInformation(){
            return "상품 아이디는 " + productId + "이고 " + "상품명은 " + productName + "이고" + " 생산지는 " + productArea + "이고 " + " 가격은 " + price +"이고 부가세 비율은 " + tax + "입니다. ";
    }

}
