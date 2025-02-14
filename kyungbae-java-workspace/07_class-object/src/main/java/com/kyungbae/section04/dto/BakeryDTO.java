package com.kyungbae.section04.dto;

public class BakeryDTO {
    // 빵집명, 빵집주소, 메인 빵

    private String name;
    private String address;
    private BreadDTO bread; // has a relationship => 한가지
//    private BreadDTO[] bread; // has many relationship => 여러개를 담을 수 있다

    public BakeryDTO() {
    }

    public BakeryDTO(String name, String address, BreadDTO bread) {
        this.name = name;
        this.address = address;
        this.bread = bread;
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

    public BreadDTO getBread() {
        return bread;
    }

    public void setBread(BreadDTO bread) {
        this.bread = bread;
    }

    /*
    public String getInformation(){
        return "Bakery[name : " + name + ", address " + address + ", 판매하는 빵 : "
                + (bread == null ? "판매중인 빵이 없습니다." : bread.getInformation()) + "]";
    }
    */

    public String getInformation(){
        String str = "Bakery[name : " + name + ", address " + address;
        if (bread == null) {
            str += ", 판매하는 빵이 없습니다.]";
        } else {
            str += ", 판매하는 빵 : " + bread.getInformation() + "]";
        }
        return str;
    }

} // class end
