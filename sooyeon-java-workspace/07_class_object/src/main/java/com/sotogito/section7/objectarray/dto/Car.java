package com.sotogito.section7.objectarray.dto;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, String brand, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

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

    public String getInformation() {
        return "모델 : " + model + "\n" +
                "브랜드 : " + brand + "\n" +
                "최대속도 : " + maxSpeed + "\n";
    }


}
