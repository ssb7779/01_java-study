package com.younggalee.Section03.abstraction;

public class Car {

    /*
    ## 속성 필드 ##
    시동여부
    현재시속
     */
    private boolean isOn;  //booleanw 자료형일 때 변수명 is~로 시작하는 경향 있음
    // 초기에는 시동이 꺼진 false 상태
    // 초기값 : false 가 자동으로 지정되므로 따로 작성하지 않겠다.
    private int speed;  // 초기 시속은 0인 상태, 이때도 초기화 마찬가지

    /*
    ## 메소드 (메세지, 행동) ##
    - 시동을 걸어라 : startUp
      if ) 현재 시동이 걸려 있는 상태일 경우 > 별 할일 없음
      if ) 시동이 꺼져있는 상태일 경우 > 시동을 건다

    - 앞으로 가라 : go
      if ) 시동이 걸린 상태일 경우 > 10km/h씩 속도를 증가시킨다.

     - 멈춰라 : stop
      if ) 시동이 걸려있고(시동여부), 달리는 경우(시속) > 시속을 0으로 만든다.

     - 시동을 꺼라 : turnOff
      if ) 시동이 걸려있고, 멈춰있는 상태일 경우 > 시동을 끌 수 있음
      if ) 달리고 있거나 이미 꺼져있는 상태일 경우 > 끌 수 없음
     */

    public void startUp(){
        if(this.isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 준비가 되었어요.");
        }
    }

    public void go(){
        if(this.isOn){
            System.out.println("차가 앞으로 움직입니다. ");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다." );
        } else {
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop(){
        if(this.isOn){
            if(this.speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        }else{
            System.out.println("시동이 걸려있지 않습니다. 시동을 걸어주세요.");
        }
    }

    public void turnOff(){
        if(this.isOn){
            if (this.speed > 0){
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 멈춰주세요.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
        }
    }


}
