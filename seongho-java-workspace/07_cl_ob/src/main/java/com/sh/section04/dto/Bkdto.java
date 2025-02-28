package com.sh.section04.dto;

public class Bkdto {
    //빵집 , 빵집 주소

    private String bkName;
    private String bkAddr;

    private Bdto bread; //has a 관계

    public Bkdto(){}
    public Bkdto (String bkName, String bkAddr, Bdto bread){
        this.bkName = bkName;
        this.bkAddr =bkAddr;
        this.bread = bread;
    }

    public String getBkName() {
        return bkName;
    }

    public void setBkName(String bkName) {
        this.bkName = bkName;
    }

    public String getBkAddr() {
        return bkAddr;
    }

    public void setBkAddr(String bkAddr) {
        this.bkAddr = bkAddr;
    }

    public Bdto getBread() {
        return bread;
    }

    public void setBread(Bdto bread) {
        this.bread = bread;
    }

    public String toString() {

        String str =

                "Bkdto{" +
                "bkName='" + bkName + '\'' +
                ", bkAddr='" + bkAddr + '\'' +
                ", bread=" + bread+
                '}';
        if (bread== null){
            str += "빵없음";
        }else {
            str += "빵 = "+bread.toString()+"]";
        }


        return str;
    }

}
