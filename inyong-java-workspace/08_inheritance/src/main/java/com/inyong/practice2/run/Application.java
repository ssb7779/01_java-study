package com.inyong.practice2.run;

import com.inyong.practice2.dto.*;

public class Application {
    public static void main(String[] args) {
        Circle[] circles = { new Circle(1, 2, 3), new Circle(3, 3, 4) };
        Rectangle[] rectangles = { new Rectangle(-1, -2, 5, 2), new Rectangle(-2, 5, 2, 8) };

        System.out.println("===== circle =====");
        for (Circle circle : circles) {
            circle.draw();
        }

        System.out.println("===== rectangle =====");
        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
