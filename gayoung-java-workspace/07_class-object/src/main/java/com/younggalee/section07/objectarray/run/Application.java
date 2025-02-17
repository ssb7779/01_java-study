package com.younggalee.section07.objectarray.run;

import com.younggalee.section07.dto.Book;
import com.younggalee.section07.dto.Car;

public class Application {
    public static void main(String[] args) {
        // 5대의 자동차 인스턴스 관리 (각 인스턴스들을 따로 변수로 관리)
        Car car1 = new Car("911", "포르쉐", 300);
        Car car2 = new Car("912", "포르쉐2", 302);
        Car car3 = new Car("913", "포르쉐3", 303);
        Car car4 = new Car("914", "포르쉐4", 304);
        Car car5 = new Car("915", "포르쉐5", 305);

        System.out.println(car1.getInformation());
        System.out.println(car2.getInformation());
        System.out.println(car3.getInformation());
        System.out.println(car4.getInformation());
        System.out.println(car5.getInformation());

        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed() + car5.getMaxSpeed();
        System.out.println(sum / 5);

        System.out.println("==================================================");

        /*
            ## 객체 배열 ##
            1. 레퍼런스 변수에 대한 배열
            2. 동일한 타입의 여러 인스턴스들을 각각 취급하지 않고 연속적으로 처리할 수 있어서 유용함.
            3. 다수의 인스턴스들을 전달한다거나 반환해야할때, 객체배열에 담아서 하게 되면 용이함.
         */

        // Car 타입의 인스턴스 주소들을 보관할 5칸짜리 배열 할당
        Car[] carArr1  = new Car[5]; // 0~4 인덱스 배열 요소마다 Car 타입 (처음에는 null로 초기화되어있을 것임)
        carArr1[0] = new Car("911", "포르쉐", 300);
        carArr1[1] = new Car("912", "포르쉐2", 302);
        carArr1[2] = new Car("913", "포르쉐3", 303);
        carArr1[3] = new Car("914", "포르쉐4", 304);
        carArr1[4] = new Car("915", "포르쉐5", 305);

        int speedSum = 0;
        for(int i=0; i<carArr1.length; i++){
            System.out.println(carArr1[i].getInformation());
            speedSum += carArr1[i].getMaxSpeed();
        }
        System.out.println(speedSum/carArr1.length);

        Car[] carArr2 = {new Car("one", "아" , 300)
                , new Car("two", "아우", 200)
                , new Car("three", "아우디", 100)};

        //향상된 for문도 가능
        for (Car car:carArr2){
            System.out.println(car.getInformation());
        }

    }



}
