package com.sh.section07.run;

import com.sh.section07.car.Car;

public class Application {
    public static void main(String[] args) {
        //5대 차 인스턴스 관리 (각 인스턴스들을 따로 변수로 관리
        Car car1 = new Car("911","차1",900);
        Car car2 = new Car("912","차2",800);
        Car car3 = new Car("913","차3",700);
        Car car4 = new Car("914","차4",600);
        Car car5 = new Car("915","차5",500);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());

        int sum= car1.getMaxSpeed()+car2.getMaxSpeed()
        +car3.getMaxSpeed()+car4.getMaxSpeed()+car5.getMaxSpeed();
        System.out.println(sum/5);

        System.out.println("++++++++++++++++++++++++++++++++++++");
        /*
        객체 배열
        레퍼런스 변수에 대한 배여얼
        동일한 타입 여러 인스턴스들을 각각 취급하지 않고 연속 처리할 수 있어서 유용(반복문 가능
        다수의 인스턴스 전달하거나 반환해야될때 객체 배열에 담아서 전다알
         */

        //car 타입의 인스턴스 주소들을 보관할 5칸짜리 배열 할당

        Car[] cararr1 = new Car[5];//0~4 인덱스 배열요소마다 car 타입(처음에는 null 초기화

        // cararr1 배열 요소에 각 인스턴스ㅡ 생성 대입
        cararr1[0] = new Car("911","차1",900);
        cararr1[1] = new Car("912","차2",800);
        cararr1[2] = new Car("913","차3",700);
        cararr1[3] = new Car("914","차4",600);
        cararr1[4] = new Car("915","차5",500);
        int speedSum = 0;
        for (int i = 0 ; i<cararr1.length; i++){
            System.out.println(cararr1[i].toString());
            speedSum += cararr1[i].getMaxSpeed();
        }
        System.out.println("평최"+speedSum/ cararr1.length);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        Car[] cararr2 = {
                new Car("car1","차1", 100),
                new Car("car2","차2", 200),
                new Car("car3","차3", 300),
        };
        //향상된 for문\
        for (Car c :cararr2) {
            System.out.println(c.toString());

        }
    }
}
