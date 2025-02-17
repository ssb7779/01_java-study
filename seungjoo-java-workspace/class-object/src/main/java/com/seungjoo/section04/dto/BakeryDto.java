package com.seungjoo.section04.dto;

public class BakeryDto {

    private String name;
    private String address;
    private BreadDto bread; //has a 관계

    public BakeryDto(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public BakeryDto(){}

    public BreadDto getBread() {
        return bread;
    }

    public void setBread(BreadDto bread) {
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BakeryDto(String name, String address, BreadDto bread) {
        this.name = name;
        this.address = address;
        this.bread = bread;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
