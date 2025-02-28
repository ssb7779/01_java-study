package com.jun.section03.isA_hasA;

public class Pen {

    private String kind;
    private  String color;

    private Pen(){}

    public Pen(String kind, String color) {
        this.kind = kind;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInformation(){
        return "pen[kind=" + kind + ", color=" + color + "]";
    }
}
