package com.inyong.section07.dto;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;

    // 기본생성자, 매개변수 생성자
    public Car() {
    }

    public Car(String model, String brand, int maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    // getter/setter

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //getInformation

    public String getInformation() {
        return model + brand + " " + maxSpeed;
    }
}
