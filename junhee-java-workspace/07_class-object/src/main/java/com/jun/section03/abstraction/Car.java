package com.jun.section03.abstraction;

public class Car {

    /*
        ## 속성 필드 ##
        시동여부
        현재시속
     */
    private boolean isOn; // 초기에는 시동이 꺼진 false상태;
    private int speed; // 초기에는  시속이 0인 상태
    /*
        ## 시동을 걸어라 메소드 ##
        현재 시동이 걸려있는 상태일 경우 별도로 할일 없고
        시동이 꺼져있는 상태일 경우 시동을 건다
     */
    public void startUp(){
        if(this.isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다");
        }
    }

    /*
        ## 앞으로 가라 메소드 ##
        시동이 걸린 상태일 경우에만 10km/h 씩 속도를 증가시킨다
     */
    public void go(){
        if(this.isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        }else{
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    /*
         ## 멈춰라 메소드 ##
         시동이 걸려있고 달리는 상태일 경우에만 멈출 수 있다
     */
    public void stop(){
        if(this.isOn){

            if(this.speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            }else{
                System.out.println("차는 이미 멈춰있는 상태입니다");
            }

        }else{
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    /*
        ## 시동을 꺼라 메소드 ##
        시동이 걸려있고 멈춰있는 상태일때만 시동을 끌 수 있음
        달리고 있거나 이미 꺼져있는 상태일 경우 끌 수 없음
     */
    public void turnOff(){
        if(this.isOn){
            if(this.speed > 0){
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
            }else{
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
            }

        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요");
        }
    }
}
