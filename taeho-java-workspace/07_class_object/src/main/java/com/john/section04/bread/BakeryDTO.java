package com.john.section04.bread;

public class BakeryDTO {
    private String bakeryName;
    private String address;
    // has a 관계
    private BreadDTO bread;
    // has many 관계
//    private BreadDTO[] breadArray;

    public BakeryDTO() {
    }

    public BakeryDTO(String name, String address, BreadDTO bread) {
        this.bakeryName = name;
        this.address = address;
        this.bread = new BreadDTO();
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    public String getAddress() {
        return address;
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

    public String getInformation() {
        String str = "Bakery[bakeryName=" + bakeryName + ", address=" + address + ", ";
        if (bread == null) {
            str += "현재 판매하는 빵이 없습니다]";
        } else {
            str += "베이커리 대표 빵 정보=" + bread.getInformation() + "]";
        }
        return str;
    }
}
