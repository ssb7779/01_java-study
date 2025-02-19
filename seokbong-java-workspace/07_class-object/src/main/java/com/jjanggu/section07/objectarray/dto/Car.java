package com.jjanggu.section07.objectarray.dto;

public class Car {

    private String model;
    private String brand;
    private int maxSpeed;

    // 기본생성자, 매개변수 생성자
    public Car(){}

    public Car(String model, String brand, int maxSpeed){
        this.model = model;
        this.brand = brand;
        this. maxSpeed = maxSpeed;
    }

    // getter/setter 메소드

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // getInformation 메소드
    public String getInformation(){
        return "Model: " + model + ", Brand: " + brand + ", MaxSpeed: " + maxSpeed;
    }

}
