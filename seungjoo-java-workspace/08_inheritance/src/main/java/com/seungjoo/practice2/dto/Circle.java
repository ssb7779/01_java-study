package com.seungjoo.practice2.dto;

import java.awt.*;

public class Circle extends Point {

    private int radius;
    public Circle(){}

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }



    public void draw(){
        super.draw();

        System.out.printf("면적: %.1f\n",  radius * radius * Math.PI);

        System.out.printf("둘레: %.1f", Math.PI * radius * 2);
        System.out.println();
    }

}
