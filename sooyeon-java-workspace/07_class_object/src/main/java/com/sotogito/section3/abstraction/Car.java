package com.sotogito.section3.abstraction;

public class Car {
    private boolean isOn;
    private int speed;

    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동이 걸려있슴");
            return;
        }
        this.isOn = true;
    }

    public void go() {
        if (!this.isOn) {
            System.out.println("시동거세요");
            return;
        }
        System.out.println("움직입니다.");
        this.speed += 10;
        System.out.println("형재 차의 시속은" + this.speed + "입니다.");
    }

    public void stop() {
        if (!this.isOn) {
            System.out.println("시동이 걸려있지 안아.");
            return;
        }
        if (this.speed == 0) {
            System.out.println("이미 멈춤");
            return;
        }
        this.speed = 0;
        System.out.println("브레이크를 밟았습니다. 차멈춥니다");
    }

    public void turnOff(){
        if(!this.isOn){
            System.out.println("이미 시동이 꺼져있습니다");
            return;
        }
        if(this.speed > 0){
            System.out.println("달리는 상태에서는 시동을 끌 수 없습니다.");
            return;
        }
        this.isOn = false;
    }
}
