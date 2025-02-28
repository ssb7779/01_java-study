package com.minkook.section07.dto;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public Car(String model, String brand, int maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getInformaiton() {
        return model + " " + brand + " " + maxSpeed;
    }
}
