package com.john.section04.bread;

public class BreadDTO {
    private String breadName;
    private int price;

    public BreadDTO() {}

    public BreadDTO(String name, int price) {
        this.breadName = name;
        this.price = price;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation() {
        return "Bread[Name: " + breadName + ", Price: " + price + "]";
    }
}
