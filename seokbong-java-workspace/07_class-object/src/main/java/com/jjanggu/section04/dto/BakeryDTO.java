package com.jjanggu.section04.dto;

public class BakeryDTO {

        // 빵집명, 빵집주소 , 빵
    private String bakeryName;
    private String bakeryAddr;
    private BreadDTO bread; // has a 관계

    public BakeryDTO(){}
    public BakeryDTO(String bakeryName, String bakeryAddr, BreadDTO bread){
        this.bakeryName = bakeryName;
        this.bakeryAddr = bakeryAddr;
        this.bread = bread;
    }

    public String getBakeryName() {
        return bakeryName;
    }
    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    public String getBakeryAddr() {
        return bakeryAddr;
    }
    public void setBakeryAddr(String bakeryAddr) {
        this.bakeryAddr = bakeryAddr;
    }

    public BreadDTO getBread() {
        return bread;
    }
    public void setBread(BreadDTO bread) {
        this.bread = bread;
    }

    public String getInformation(){

        String str = "Bakery[bakeryName= " + bakeryName + ", bakeryAddr= " + bakeryAddr;

        if(bread == null){
            str += ", 판매하는 빵 = 없습니다]";
        }else{
            str += ", 판매하는 빵=" + bread.getInformation() + "]";
        }
        return str;

    } // 그냥 bread로 출력시 bread의 주소값이 출력됨
}
