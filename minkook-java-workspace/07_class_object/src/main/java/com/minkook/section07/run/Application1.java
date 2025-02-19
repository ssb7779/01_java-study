package com.minkook.section07.run;

import com.minkook.section07.dto.Car;

public class Application1 {
    public static void main(String [] args){
        Car car1 = new Car("911","포르쉐",300);
        Car car2 = new Car("아벤타도르","람보르기니",350);
        Car car3 = new Car("720S","맥라렌",320);
        Car car4 = new Car("M4","BMW",250);
        Car car5 = new Car("488","페라리",400);

        System.out.println(car1.getInformaiton());
        System.out.println(car2.getInformaiton());
        System.out.println(car3.getInformaiton());
        System.out.println(car4.getInformaiton());
        System.out.println(car5.getInformaiton());

        int sum = car1.getMaxSpeed() + car2.getMaxSpeed() + car3.getMaxSpeed() + car4.getMaxSpeed() + car5.getMaxSpeed();

        System.out.println("평균최대속도: " + sum/5);

        /*
            ## 객체 배열 ##
            1. 레퍼런스 변수에 대한 배열
            2. 동일한 타입의 여러 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용함(반복문 활용가능)
            3. 다수의 인스턴스를 전달하거나 반환해야할 때 객체배열에 담아서 하게되면 용이함
         */
        //Car 타입의 인스턴스 주소들을 보관할 5칸짜리의 배열 할당

        Car [] carArr1 = new Car[5];
        carArr1[0] = new Car("911","포르쉐",300);
        carArr1[1] = new Car("아벤타도르","람보르기니",350);
        carArr1[2] = new Car("720S","맥라렌",320);
        carArr1[3] = new Car("M4","BMW",250);
        carArr1[4]= new Car("488","페라리",400);
        int speedSum = 0;
        for(int i = 0; i < carArr1.length; i++){
            speedSum += carArr1[i].getMaxSpeed();

        }
        System.out.println("평균최대속도: " + (speedSum / carArr1.length));


        Car [] carArr2 = new Car[]{new Car("911","포르쉐",300)
        ,new Car("아벤타도르","람보르기니",350)
        ,new Car("720S","맥라렌",320)
        };


        for(Car c : carArr2){
            System.out.println(c.getInformaiton());

        }

    }
}
