package com.pch.practice2.dto;

public class Circle extends Point {
    private int radius;

    public Circle() {
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.printf("면적 : %.1f\n", 3.14*radius*radius);
        System.out.printf("둘레 : %.1f\n", 3.14*radius*2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
