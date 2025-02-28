package com.pch.section07.objectarray.dto;

public class PhoneDto {

    private String name;
    private String series;
    private int price;

    public PhoneDto() {
    }

    public PhoneDto(String name, String series, int price) {
        this.name = name;
        this.series = series;
        this.price = price;
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

    public String getInformation() {
        return "PhoneDto{" +
                "name='" + name + '\'' +
                ", series='" + series + '\'' +
                ", price=" + price +
                '}';
    }
}
