package com.john.section07.run;

import com.john.section07.dto.Car;
/*
    객체 배열
    1. 레퍼런스 변수에 대한 배열
    2. 동일한 타입의 여러 인스턴스들을 각각 취급하지 않고 연속 처리할 수 있어서 유용함(반복문 활용 가능)
    3. 다수의 인스턴스를 전달하거나 반환해야할 때 객체 배열에 담아서 하게 되면 용이함
 */

public class Application {
    public static void main(String[] args) {

        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤타도르", "람보르기니", 350);
        Car car3 = new Car("720S", "맥라렌", 320);
        Car car4 = new Car("m4", "비엠더블유", 320);
        Car car5 = new Car("488", "페라리", 400);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());

        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed() + car5.getMaxSpeed();
        System.out.println("평균최대속도: " + sum / 5);

        System.out.println("==========================");

        Car[] carArr = new Car[5];
        carArr[0] = new Car("911", "포르쉐", 300);
        carArr[1] = new Car("아벤타도르", "람보르기니", 350);
        carArr[2] = new Car("720S", "맥라렌", 320);
        carArr[3] = new Car("m4", "비엠더블유", 320);
        carArr[4] = new Car("488", "페라리", 400);

        int speedSum = 0;
        for(int i = 0; i < carArr.length; i++) {
            System.out.println(carArr[i]);
            System.out.println(carArr[i].getInformation());
            speedSum += carArr[i].getMaxSpeed();
        }
        System.out.println("평균최대속도: " + speedSum / carArr.length);

        Car[] carArr2 = {
                new Car("R8", "아우디", 300),
                new Car("X5", "BMW", 200),
                new Car("머스탱", "포드", 250)
        };

    }
}
