package com.seungjoo.section07.objcetarray.dto;

public class Car {


    private String model;
    private String brand;
    private int maxSpeed;

    public Car(){}

    public Car(String model, String brand, int maxSpeed) {
        this.model = model;
        this.brand = brand;
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

    public String getInformation(){
        return "모델은" + model + "이고," + "브랜드는 " + brand + "이고 " + "스피드는" + maxSpeed + " 입니다.";
    }
}
