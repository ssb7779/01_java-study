package com.jun.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
            ## 상속 ##
            1. inheritance
            2. 부모(상위), 자식(하위) 간의 구조로 클래스를 구성하는 개념
            3. 상위 클래슥 가지고 있는 멤버를 하위 클래스에서 새로 작성할 필요 없이
               마치 내것처럼 사용 가능
            4. 단순히 물려받는 개념보다 조금 더 나아가면
               부모(상위) 클래스를 확장(extend) 한다는 개념을 가짐
               => 부모꺼를 내것처럼 사용하는거 뿐만 아니라 추가적으로 본인만의 멤버도 작성 가능

            ## 상속의 장점 ##
            1. 새로운 클래스 작성시 기존에 작성된 클래스를 재사용할 수 있음
               1) 재사용시 새롭게 작성하는것 보다 빠르게 작성 가능 (생산성 향상)
               2) 공통코드가 부모 클래스에 존재하므로 수정사항 발생시
                  부모 클래스 수정만으로 전체적으로 적용 가능 (유지보수성 증가)
            2. 클래스간의 계층 관계가 형성되어 "다형성"의 문법적인 토대가 됨

            ## 상속의 단점 ##
            1. 부모 클래스의 기능을 추가/변경시 자식 클래스가 정상적으로 동작하는지 예측이 힘듬
               => 상속 구조가 복잡해질수록 예측이 힘들어 유지보수에 악영향을 끼칠 수 있음
            2. 자식 클래스에서 중요하게 사용되고 있는 기능일 경우 부모 클래스의 변경이 쉽지 않음
            3. 부모 클래스에서 의미 있었던 기능이 자식 클래스에서 무의미 할 수 있음 (불필요한 기능 추가)

            >> 상속은 IS-A 관계로 구분되는 경우에만 사용해야됨


         */

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        // car.sprayWater();

        System.out.println("=====================================");

        /*
            FireCar is a Car (o)  /  Car is a FireCar (x)
            RacingCar is a Car (o) /  Car is a RacingCar (x)

            자식클래스 is a 부모클래스
            자식클래스 extend 부모클래스
            자식클래스 ----|> 부모클래스
         */

        FireCar firecar = new FireCar();
        firecar.soundHorn();
        firecar.run();
        firecar.soundHorn();
        firecar.stop();
        firecar.soundHorn();
        // Car 클래스에 있는 모든 메소드를 전부 사용 가능
        // 오바라이딩(재정의)후에는 자식메소드가 실행됨

        firecar.sprayWater();


        System.out.println("=====================================");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

        /*
            레이싱카는 경적 소리를 내는게 적합하지 않음
            하지만 Car를 상속받았기 때문에 어쩔 수 없이 경적소리가 나고 있음
            => 상속으로 인해 불필요한 기능이 추가됨 (단점)
         */


        /*
            ## 상속 특징 ##
            1. 클래스와 클래스 간에 있어서 다중상속 불가(즉, 부모클래스를 여러개 둘 수 없음)
            2. 자식 클래스 타입으로 객체 생성시 부모 생성자가 항상 먼저 호출됨 (즉, 부모 객체가 내부적으로 먼저 생성)
            3. 부모클래스에 있는 메소드를 자식클래스에서 재정의 할 수 있음(오버라이딩)
            4. 모든 클래스들은 Object 클래스를 상속 받고 있음 (Object 클래스는 최상위 클래스)
               => 즉, 모든 클래스들은 Object의 하위 클래스
               => 즉, 모든 클래스들은 Object의 멤버를 사용할 수 있다.
               => + 오버라이딩을 통해 재정의도 가능
         */











    }
}
