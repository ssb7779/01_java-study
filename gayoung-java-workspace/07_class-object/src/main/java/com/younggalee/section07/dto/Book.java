package com.younggalee.section07.dto;

public class Book {
    private String title;
    private String author;
    private int price;
    private String publisher;
    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Book () {}

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(String title, String author, String publisher, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
        return title + " " + author + " " + price;
    }

}
