package com.ibe6.section07.objectarray.dto;

import java.awt.image.ImageObserver;

public class Car {

    private String model;
    private String brand;
    private int maxSpeed;

    // 기본생성자, 매개변수 생성자
    public Car() {} // 항상 필수!

    public Car(String model, String brand, int maxSpeed) {
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    // getter/setter 메소드
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    // getInformation 메소드
    public String getInformation(){
        return "model: " + model + ", Brand: " + brand + ", Max Speed: " + maxSpeed;
    }
}
