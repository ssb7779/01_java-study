package com.sotogito.section4.dto;

public class BakeryDTO {

    private String name;
    private String address;
    private BreadDTO bread; //has-a 관계
//    private BreadDTO[] breads; //has-many 관계

    public BakeryDTO() {
    }

    public BakeryDTO(String address, String name, BreadDTO bread) {
        this.address = address;
        this.name = name;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BreadDTO getBread() {
        return bread;
    }

    public void setBread(BreadDTO bread) {
        this.bread = bread;
    }

    public String getInfo() {
        return String.format("이름 : %s, 주소 : %s\n, " +
                        "빵정보 : %s",
                name, address,
                (bread == null ? "없음" : bread.getInfo()));
    }
}
