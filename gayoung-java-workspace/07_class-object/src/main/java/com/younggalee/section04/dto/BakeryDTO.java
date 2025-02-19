package com.younggalee.section04.dto;

public class BakeryDTO {
    private String bakeryName;
    private String address;
    private BreadDTO bread;

    public BakeryDTO(){}

    public BakeryDTO(String bakeryName, String address) {
        this.bakeryName = bakeryName;
        this.address = address;
    }

    public BreadDTO getBread() {
        return bread;
    }

    public void setBread(BreadDTO bread) {   //********************
        this.bread = bread;  // bread가 가르키는 주소값들어가게 됨.
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public String getAddress() {
        return address;
    }

    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getInformation(){
        String str = "Bakery [ 빵집이름 : " + bakeryName + " / 주소 : " + address;
        if (bread == null) {
            str += " / 판매하는 빵이 없습니다. ";
        } else {
            str += " / 판매하는 빵 :" + bread.getInformation() + " ]";
        }

        return str;
    }
}
