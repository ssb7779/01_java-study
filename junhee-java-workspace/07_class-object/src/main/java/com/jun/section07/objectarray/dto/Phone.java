package com.jun.section07.objectarray.dto;

public class Phone {

    private String brand;
    private String name;
    private String series;
    private int price;

    public Phone(){}

    public Phone(String brand, String name, String series, int price) {
        this.brand = brand;
        this.name = name;
        this.series = series;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getSeries() {
        return series;
    }

    public int getPrice() {
        return price;
    }
    public String getInformation(){
        return "brand=" + brand + ", name&series=" + name + " " + series + ", price=" + price;
    }
}
