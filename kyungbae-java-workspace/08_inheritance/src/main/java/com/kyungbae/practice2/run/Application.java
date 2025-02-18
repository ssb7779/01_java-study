package com.kyungbae.practice2.run;

import com.kyungbae.practice2.dto.Circle;
import com.kyungbae.practice2.dto.Rectangle;

public class Application {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,2,3);
        Circle c2 = new Circle(3,3,4);

        Rectangle r1 = new Rectangle(-1, -2, 5, 2);
        Rectangle r2 = new Rectangle(-2,5,2,8);

        System.out.println("===== circle =====");
        c1.draw();
        c2.draw();

        System.out.println("===== rectangle =====");
        r1.draw();
        r2.draw();


    }
}
