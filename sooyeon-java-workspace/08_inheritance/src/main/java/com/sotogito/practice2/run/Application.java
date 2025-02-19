package com.sotogito.practice2.run;

import com.sotogito.practice2.dto.Circle;
import com.sotogito.practice2.dto.Point;
import com.sotogito.practice2.dto.Rectangle;

public class Application {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 2, 3);
        Circle circle2 = new Circle(3, 3, 4);

        Rectangle rectangle1 = new Rectangle(-1, -2, 5, 2);
        Rectangle rectangle2 = new Rectangle(-2, 5, 2, 8);

        System.out.println("===== circle =====");
        circle1.draw();
        circle2.draw();
        System.out.println("===== rectangle =====");
        rectangle1.draw();
        rectangle2.draw();
    }

}
