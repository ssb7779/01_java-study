package com.inyong.section04.dto;

public class BakeryDTO {
    private String name;
    private String address;



    BakeryDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInformation(){
        BreadDTO breadDTO = new BreadDTO("소금", "3000");
        return breadDTO.getInformation();
    }
}
