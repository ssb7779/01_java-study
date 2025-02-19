package com.minkook.section01.extend;

public class Application {
    public static void main(String [] args){
        /*
            ## 상속 ##
            1. inheritance
            2. 부모(상위), 자식(하위) 간의 구조로 클래스를 구성하는 개념

            ## 상속의 장점 ##
            새로운 클래스 작성시 기존에 작성된 클래스를 재사용할 수 있음
                1) 재사용시 새롭게 작성하는거소다 빠르게 작성 가능(생산성 향상)
            >> 상속은 IS-A 관계로 구분되는 경우에만 사용해야 함

            ## 상속 특징##
            1. 클래스와 클래스 간에 있어서 다중상속 불가(즉, 부모클래스를 여러개 둘 수 없음)
            2. 자식 클래스 타입으로 객체 생성시 부모 생성자가 항상 먼저 호출됨(즉, 부모객체가 내부적으로 먼저 생성)
            3. 부모 클래스에 있는 메소드를 자식 클래스에서 재정의 할 수 있음(오버라이딩)
            4. 모든 클래스들은 OBject 클래스를 상속받고 있음(Object 클래스는 최상위클래스)
               
         */
       Car car = new Car();
//        car.run();
//        car.soundHorn();
//
//        car.stop();
//        car.soundHorn();

        FireCar f = new FireCar();
        f.soundHorn();
        f.run();
        f.soundHorn();
        f.stop();
        f.soundHorn();
        f.sprayWater();

        RacingCar rc = new RacingCar();


        //car.sprayWater();



    }
}
