package com.inyong.section07.objectarray.run;

import com.inyong.section07.dto.Car;

public class Application {
    public static void main(String[] args) {


        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("아벤", "람보르", 350);
        Car car3 = new Car("720S", "맥라렌", 320);
        Car car4 = new Car("M4", "BMW", 250);
        Car car5 = new Car("488", "페라리", 400);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());


        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed() + car5.getMaxSpeed();
        System.out.println("최대 속도" + sum / 5);

        System.out.println("-------");

        /*
        객체 배열
        1. 레퍼런스 변수에 대한 배열
        2. 동일한 타입의 여러 인스턴스들을 가각 취급하지 않고 연속 처리할 수 있어서 유용
        3. 다수의 인스턴스들을 전달하거나 반환해야될 때 객체배열에 담아서 하게 되면 용이함
         */

        // Car 타입의 인스턴스 주소들을 보관할 5칸짜리의 배열 할당

        Car[] carArr1 = new Car[5];

        carArr1[0] = new Car("911", "포르쉐", 300);
        carArr1[1] = new Car("아벤", "람보르", 350);
        carArr1[2] = new Car("720S", "맥라렌", 320);
        carArr1[3] = new Car("M4", "BMW", 250);
        carArr1[4] = new Car("488", "페라리", 400);

        int speedSum = 0;
        for (int i = 0; i<carArr1.length; i++) {
            System.out.println(carArr1[i].getInformation());
            speedSum += carArr1[i].getMaxSpeed();
        }

        System.out.println("평균 최대속도" + speedSum / carArr1.length);

        Car[] carArr2 = {
                new Car("R8", "아우디", 300),
                new Car("X5", "BMW", 200),
                new Car("머스탱", "포드", 250),
        };


        for(Car car :carArr2){
            System.out.println(car.getInformation());
        }


    }

}
