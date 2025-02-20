package com.inyong.practice2.dto;

public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        int area = width * height;
        int perimeter = (width + height) * 2;
        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + perimeter);
    }
}