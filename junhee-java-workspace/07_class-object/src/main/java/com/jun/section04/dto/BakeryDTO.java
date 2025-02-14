package com.jun.section04.dto;

public class BakeryDTO {
    //빵집명, 빵집주소,빵

    private String bakeryName;
    private  String bakeryAddr;
    private  BreadDTO bread;// has a 관계
//    private  BreadDTO[] bread;// has many 관계

    public BakeryDTO (){}
    public BakeryDTO(String bakeryName, String bakeryAddr, BreadDTO bread){
        this.bakeryName=bakeryName;
        this.bakeryAddr=bakeryAddr;
        this.bread = bread;
    }
    public void setBakeryName(String bakeryName){
        this.bakeryName=bakeryName;
    }
    public void setBakeryAddr(String bakeryaddr){
        this.bakeryAddr=bakeryaddr;
    }
    public void setBread(BreadDTO bread){ // BreadDTO bread = new BreadDTO("크로와상",4000)
        this.bread = bread;
    }
    public String getBakeryName(){return bakeryName;}

    public String getBakeryAddr(){return bakeryAddr;}

    public BreadDTO getBread(){return bread;}

    public  String getInformation(){

        String str =  "Bakery[bakeryName= " + bakeryName + ", bakeryAddr= " + bakeryAddr ;

        if(bread == null) {
            str += ", 판매하는 빵= 없습니다";
        }else {
            str += ", 판매하는 빵= " + bread.getInformation() +"]";
        }
        return  str;
    }
}
