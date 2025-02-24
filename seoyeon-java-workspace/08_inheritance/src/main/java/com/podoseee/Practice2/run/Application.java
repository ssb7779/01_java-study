package com.podoseee.Practice2.run;

import com.podoseee.Practice2.dto.Circle;
import com.podoseee.Practice2.dto.Rectangle;

public class Application {
    public static void main(String[] args) {
        // 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
        Circle[] circles = new Circle[2];
        Rectangle[] rectangles = new Rectangle[2];
        // 위의 사용 데이터를 참고하여 각각 초기화
        circles[0] = new Circle();
        circles[1] = new Circle();
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();

        // 각 도형의 draw 메소드 실행	    		 --> 향상된 for문 이용해서
        for (Circle c : circles){
            Circle.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}
