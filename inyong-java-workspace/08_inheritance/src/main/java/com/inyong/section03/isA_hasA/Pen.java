package com.inyong.section03.isA_hasA;

public class Pen {

    private String kind;
    private String color;

    public Pen() {

    }

    public Pen(String kind, String color) {
        this.kind = kind;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public String getKind() {
        return kind;
    }

    public String getInformation() {
        return "Pen[kind=" + kind + ", color=" + color + "]";
    }
}
