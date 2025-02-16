package com.minkook.section04.dto;

public class BreadDTO {
    //빵집명, 빵집주소, 빵
    private String bName;
    private int bPrice;

    public String getbName() {
        return bName;
    }
    
    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbPrice() {
        return bPrice;
    }

    public void setbPrice(int bPrice) {
        this.bPrice = bPrice;
    }

    public BreadDTO() {

    }

    public BreadDTO(String bName, int bPrice) {
        this.bName = bName;
        this.bPrice = bPrice;
    }

    public String getInformation() {
        return "[bName " + bName + " bPrice " + bPrice + "]";
    }
}
