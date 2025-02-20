package com.inyong.practice2.dto;

public class Circle extends Point {
    private int radius;
    private static final double PI = 3.14;

    public Circle() {}

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        double area = PI * radius * radius;
        double perimeter = PI * radius * 2;
        System.out.printf("면적 : %.1f\n", area);
        System.out.printf("둘레 : %.1f\n", perimeter);
    }
}