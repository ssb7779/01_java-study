package com.personal.practice2.dto;

public class Circle extends Point {
    private int radius;  // 반지름

    // 기본 생성자
    public Circle() {}

    // 모든 필드를 초기화하는 생성자
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    // Getter & Setter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // 오버라이딩: 원을 그리는 메서드
    @Override
    public void draw() {
        System.out.println("Circle 위치: (" + getX() + ", " + getY() + "), 반지름: " + radius);
    }
}
