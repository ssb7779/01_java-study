package com.younggalee.section07.dto;

public class Car {
    private String model;
    private String brand;
    private int maxSpeed;

    public Car(){}

    // 기본 생성자, 매개변수 생성자
    public Car(String model, String brand, int maxSpeed){
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    // getter, setter 메소드
    public void setModel(String model){this.model = model;}
    public void setBrand(String brand){this.brand = brand;}
    public void setMaxSpeed(int maxSpeed){this.maxSpeed = maxSpeed;}

    public String getModel(){return model;}
    public String getBrand(){return brand;}
    public int getMaxSpeed(){return maxSpeed;}

    // getInformation 메소드
    public String getInformation(){
        return model + " " + brand + " " + maxSpeed;
    }
}
