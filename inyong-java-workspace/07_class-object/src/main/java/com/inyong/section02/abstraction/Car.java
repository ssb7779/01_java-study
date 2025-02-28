package com.inyong.section02.abstraction;

public class Car {

    private boolean isOn; //초기에는 시동이꺼진상태 false
    private int speed; // 초기에는 시속이 0인 상태

    /*
    현재 시동이 걸려있는 상태일 경우 별도로 할일 없음
     시동이 꺼져있으면 시동을 건다

     */

    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동이 걸려 있슴다");
        } else {
            this.isOn = true;
            System.out.println("시동 걸었으니 출발가능 ㄱㄱ");
        }
    }

    public void go() {
        if (this.isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println(this.speed + "km/h");
        } else {
            System.out.println("시동이 걸려 있지 않아서 시동을 먼저 걸어주세요");
        }
    }

    public void 묻고_더블로가() {
        if (this.isOn) {
            System.out.println("차가 앞으로 움직입니다.");
            this.speed *= 2;
            System.out.println(this.speed + "km/h");
        } else {
            System.out.println("시동이 걸려 있지 않아서 시동을 먼저 걸어주세요");
        }
    }

    public void stop() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("멈췄다~");
                System.out.println(this.speed + "km");
            } else {
                System.out.println("이미 멈춰있음요!");
            }
        } else {
            System.out.println("시동이 걸려 있지 않아서 시동을 먼저 걸어주세요");
        }
    }

    public void turnOff(){
        if(this.isOn){
            if (this.speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 멈춰!");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태 입니다.");
        }
    }


}
