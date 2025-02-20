package com.sh.string;

public class Shop{
    private int sNum;
    private String sName;
    private String sAdr;
    private String sHNum;
    private String gori;
    private String StartN;

    public Shop(){}

    public Shop(int sNum, String sName, String sAdr, String sHNum, String gori, String startN) {
        this.sNum = sNum;
        this.sName = sName;
        this.sAdr = sAdr;
        this.sHNum = sHNum;
        this.gori = gori;
        this.StartN = startN;
    }

    public int getsNum() {
        return sNum;
    }

    public void setsNum(int sNum) {
        this.sNum = sNum;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAdr() {
        return sAdr;
    }

    public void setsAdr(String sAdr) {
        this.sAdr = sAdr;
    }

    public String getsHNum() {
        return sHNum;
    }

    public void setsHNum(String sHNum) {
        this.sHNum = sHNum;
    }

    public String getGori() {
        return gori;
    }

    public void setGori(String gori) {
        this.gori = gori;
    }

    public String getStartN() {
        return StartN;
    }

    public void setStartN(String startN) {
        StartN = startN;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "sNum=" + sNum +
                ", sName='" + sName + '\'' +
                ", sAdr='" + sAdr + '\'' +
                ", sHNum='" + sHNum + '\'' +
                ", gori='" + gori + '\'' +
                ", StartN='" + StartN + '\'' +
                '}';
    }
}
