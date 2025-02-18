package com.personal.practice2.dto;

public class Point {
    private int x;
    private int y;

    // 기본 생성자
    public Point() {}

    // 매개변수 있는 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 도형을 그리는 메서드 (오버라이딩할 용도)
    public void draw() {
        System.out.println("Point 위치: (" + x + ", " + y + ")");
    }
}
