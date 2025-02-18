package com.younggalee.section03.isA_hasA;

public class Pen {
    private String kindOf;
    private String color;

    public Pen(){}

    public Pen(String kindOf, String color) {
        this.kindOf = kindOf;
        this.color = color;
    }

    public String getKindOf() {
        return kindOf;
    }

    public void setKindOf(String kindOf) {
        this.kindOf = kindOf;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInformation(){
        return "펜 종류 : " + kindOf +  "색상 : " + color;
    }
}
