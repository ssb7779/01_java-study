package com.pch.section07.objectarray.run;

import com.pch.section07.objectarray.car.Car;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤타도르", "람보르기니", 350);
        Car car3 = new Car("7205", "맥라렌", 320);
        Car car4 = new Car("M4", "BMW", 250);
        Car car5 = new Car("488", "페라리", 400);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());

        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed() + car5.getMaxSpeed();
        System.out.println(sum);
    }
}
