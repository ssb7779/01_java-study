package com.pch.practice2.dto;

public class BookDTO {
    private String title;
    private int price;
    private double discountRate;
    private String author;

    public BookDTO() {
    }

    public BookDTO(String title, int price, double discountRate, String author) {
        this.title = title;
        this.price = price;
        this.discountRate = discountRate;
        this.author = author;
    }

    public String getInformation() {
        return title + "\t" + price + "\t" + discountRate + "\t" + author;
    }

    public String getRealprice() {
        int realPrice = price - (int) (price * discountRate);
        return "도서명 = "+title+"\n할인된 가격 = "+realPrice+"원";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
