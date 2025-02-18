package com.sotogito.section7.objectarray.run;

import com.sotogito.section7.objectarray.dto.Car;

public class Application1 {
    public static void main(String[] args) {
        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤타도르", "람보르기니", 350);
        Car car3 = new Car("720S", "멕라렌", 320);
        Car car4 = new Car("M4", "BMW", 250);
        Car car5 = new Car("488", "페라리", 400);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());

//        int sum = car1.getMaxSpeed()
//                + car2.getMaxSpeed()
//                + car3.getMaxSpeed()
//                + car4.getMaxSpeed()
//                + car5.getMaxSpeed();


        System.out.println("===============================================================================");

        /**
         * ##객체 배열
         * 1. 래퍼런스 변수에 대한 배열
         * 2. 동일한 타입의 여러 인스턴스들을 각각 취급하지 않고 연속적으로 처리 가능 - 반복문
         * 3. 다수의 인스턴스를 전달이나 반환할 때 유리
         */

        Car[] cars1 = new Car[5];
        cars1[0] = car1;
        cars1[1] = car2;
        cars1[2] = car3;
        cars1[3] = car4;
        cars1[4] = car5;

        int sum = 0;
        for(Car car : cars1){
            sum += car.getMaxSpeed();
        }
        System.out.println("최대속도 : " + (sum / 5));

        System.out.println("===============================================================================");

        Car[] cars2 ={
                new Car("R8","아우디",300),
                new Car("X8","BMW",200),
                new Car("머스탱","포드",250)
        };

        for(Car car : cars2){
            System.out.println(car.getInformation());
        }
    }
}
