package com.personal.practice2.dto;

public class Rectangle extends Point {
    private int width;   // 너비
    private int height;  // 높이

    // 기본 생성자
    public Rectangle() {}

    // 모든 필드를 초기화하는 생성자
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Getter & Setter
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // 오버라이딩: 사각형을 그리는 메서드
    @Override
    public void draw() {
        System.out.println("Rectangle 위치: (" + getX() + ", " + getY() + "), 너비: " + width + ", 높이: " + height);
    }
}
