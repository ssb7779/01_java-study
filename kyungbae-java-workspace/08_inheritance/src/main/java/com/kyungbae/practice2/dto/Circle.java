package com.kyungbae.practice2.dto;

public class Circle extends Point{

    private int radious;


    public Circle(){}

    public Circle(int x, int y, int radious) {
        super(x, y);
        this.radious = radious;
    }

    public void draw(){
        super.draw();
        System.out.printf("면적 : %.1f\n", (Math.PI * radious * radious));
        System.out.printf("둘레 : %.1f\n",  (Math.PI * radious * 2));
    }


    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

}
