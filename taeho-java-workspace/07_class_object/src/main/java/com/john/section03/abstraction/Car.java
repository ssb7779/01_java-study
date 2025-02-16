package com.john.section03.abstraction;


public class Car {

    private boolean isOn;
    private int speed;

    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동이 걸린 상태입니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 수 있어요");
        }
    }

    public void go() {
        if (this.isOn) {
            System.out.println("차가 앞으로 움직입니다");
            this.speed += 10;
            System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다");
        } else {
            System.out.println("시동이 걸려있지 않은 상태입니다, 시동을 우선 걸어주세요");
        }
    }

    public void stop() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟아서 차를 멈춥니다");
            } else {
                System.out.println("이미 멈춰있는 상태입니다");
            }
        } else {
            System.out.println("시동이 걸려있지 않은 상태입니다");
        }
    }

    public void turnOff() {
        if (this.isOn) {
            if (this.speed > 0) {
                System.out.println("현재 차량이 달리는 상태입니다. 우선 차량을 멈춰주세요");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 꺼져있는 상태입니다.");
        }
    }
}
