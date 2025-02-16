package com.sotogito.practice2.dto;

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


    public String getAuthor() {
        return author;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return String.format("%s\t%d\t%.1f\t%s",
                title, price, discountRate, author);
    }

}
