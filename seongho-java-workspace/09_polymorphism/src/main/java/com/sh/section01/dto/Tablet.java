package com.sh.section01.dto;

public class Tablet extends Electronic{
    private boolean penFlag;
    public Tablet(){}


    public Tablet(String brand, String name, int pri, boolean penFlag) {
        super(brand, name, pri);
        this.penFlag = penFlag;
    }

    public boolean isPenFlag() {
        return penFlag;
    }

    public void setPenFlag(boolean penFlag) {
        this.penFlag = penFlag;
    }

    @Override
    public String toString() {
        return "Tablet{" + super.toString()+
                "penFlag=" + (penFlag ? "있" :"없") +
                '}';
    }
}
