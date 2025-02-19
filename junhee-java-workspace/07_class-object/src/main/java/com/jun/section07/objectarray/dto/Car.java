package com.jun.section07.objectarray.dto;

public class Car {

    private String model;
    private String brand;
    private int maxSpeed;

    //기본생성자, 매개변수 생성자

    // getter/setter 메소드

    // getInformation 메소드

    public Car(){}

    public Car(String model, String brand, int maxSpeed){
        this.model = model;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public String getModel(){return model;}
    public String getBrand(){return brand;}
    public  int getMaxSpeed(){return maxSpeed;}

    public void setModel(String model){
        this.model=model;
    }
    public  void setBrand (String brand){
        this.brand=brand;
    }
    public void setMaxSpeed (int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public  String getInformation(){return "model: " + model + ", brand: " + brand + ", maxSpeed: " + maxSpeed;}

}
