package com.podoseee.section04.dto;

public class BakeryDTO {

    // 빵집명, 빵집주소, 빵
    private String bakeryName;
    private String address;
    private BreadDTO bread; // has a 관계
    //private BreadDTO[] bread; has many 관계

    public BakeryDTO(){}
    public BakeryDTO(String bakeryName, String address, BreadDTO bread){
        this.bakeryName = bakeryName;
        this.address = address;
        this.bread = bread;
    }

    public String getBakeryName(){return bakeryName;}
    public void setBakeryName(String bakeryName){this.bakeryName = bakeryName;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public BreadDTO getBread(){return bread;}
    public void setBread(BreadDTO bread){this.bread = bread;} // BreadDTO bread = new BreadDTO("크로와상", 4000);

    public String getInformation(){
        String str = "Bakery[bakeryname= " + bakeryName + ", address= " + address;

        // 오류발생 : NullPointerException -> 개발자가 직접 수정해줘야 함
        if(bread == null){
            str += ", 판매하는 빵=없습니다]";
        }else{
            str += ", 판매하는 빵= " + bread.getInformation() + "]"; // BreadDTO 안에 있기 때문에 주소값을 갖고오니, bread.getInformation()으로 적기
        }

        return str;
    }
}

