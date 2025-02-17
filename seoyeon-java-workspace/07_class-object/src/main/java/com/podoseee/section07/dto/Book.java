package com.podoseee.section07.dto;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int price;

    public Book(){}

    public Book(int price, String publisher, String author, String title) {
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.title = title;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
        return "title : " + title + " author : " + author + " publisher : " + publisher + " price : " + price;
    }
}
