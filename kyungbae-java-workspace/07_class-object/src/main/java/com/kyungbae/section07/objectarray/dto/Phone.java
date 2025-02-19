package com.kyungbae.section07.objectarray.dto;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation(){
        return "brand : " + brand + "\t" + "name : " + name + "\t" + "series : " + series + "\t" + "price : " + price;
    }

} // class end
