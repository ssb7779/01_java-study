package com.inyong.section07.dto;

public class Phone {
    private int price;
    private String name;
    private String series;

    public Phone(){}

    public Phone(int price, String name, String series){
        this.price = price;
        this.name = name;
        this.series = series;

    }

    public String getModel() {
        return series;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String series) {
        this.series = series;
    }

    public String getInformation (){
        return name + series + price;
    }
}
