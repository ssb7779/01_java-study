package com.minkook.practice2.dto;

public class Circle extends Point {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }
    @Override
    public void draw(){
        super.draw();
        System.out.printf("면적: %.1f" ,(radius * radius * (Math.PI)));
        System.out.println();
        System.out.printf("둘레: %.1f " ,2 * (radius * (Math.PI)));
        System.out.println();
 ;
    }
}
