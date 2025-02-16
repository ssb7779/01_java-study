package com.minkook.section04.dto;

public class BakeryDTO {
    private String name;
    private String address;
    private BreadDTO breadDTO; //has a 관계

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public BreadDTO getBreadDTO() {
        return breadDTO;
    }

    public void setBreadDTO(BreadDTO breadDTO) {
        this.breadDTO = breadDTO;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BakeryDTO() {

    }

    public BakeryDTO(String name, String address,BreadDTO breadDTO) {
        this.name = name;
        this.address = address;
        this.breadDTO = breadDTO;

    }

    public String getInformation() {
        String str =  "빵집은 " + name + " Adress는 " + address + " 빵이름:";
        if(breadDTO == null){
            str += " 빵없음";
        }else{
            str +=  breadDTO.getInformation();
        }
        return str;
    }
}
