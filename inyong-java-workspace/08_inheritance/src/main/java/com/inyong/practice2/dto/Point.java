package com.inyong.practice2.dto;

public class Point {
    protected int x;
    protected int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing a point at (" + x + ", " + y + ")");
    }
}