package com.seungjoo.section07.objcetarray.run;

import com.seungjoo.section07.objcetarray.dto.Car;

public class Application1 {
    public static void main(String[] args) {
        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤타도르", "람보르기니", 350);
        Car car3 = new Car("720S", "맥라렌", 320);
        Car car4 = new Car("M4", "BMW", 250);
        Car car5 = new Car("488", "페라리", 400);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());
        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed();
        System.out.println("평균 최대속도: " + sum / 5);


        Car[] carArr1 = new Car[5];
        carArr1[0] = new Car("911", "포르쉐", 300);
        carArr1[1] = new Car("아벤타도르", "람보르기니", 350);
        carArr1[2] = new Car("720S", "맥라렌", 320);
        carArr1[3] = new Car("M4", "BMW", 250);
        carArr1[4] = new Car("488", "페라리", 400);


        int speedSum = 0;
        for (int i = 0; i < carArr1.length; i++) {
            System.out.println(carArr1[i].getInformation());
            speedSum += carArr1[i].getMaxSpeed();
        }

        System.out.println("평균 최대속도 : " + speedSum / 5);

        System.out.println("=============");

        Car[] carArr2 = {
                new Car("R8", "아우디", 300),
        new Car("X5", "BMW", 200),
                new Car("머스탱", "포드", 250)

        };

        for(Car c : carArr2) {
            System.out.println(c.getInformation());
        }


    }


}
