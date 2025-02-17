package com.kyungbae.section03.abstraction;

public class Car {

    /*
    자동차 클래스
 - 속성 : 시동상태, 현재시속
 - 메소드 : 시동을걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
     */

    private boolean isOn; // 초기화 상태 = false; (시동이 꺼진 상태)
    private int speed; // 초기화 상태 0; (초기 시속 0)

    /*
        # 시동을 걸어라 method
        시동이 걸려있는 상태의 경우 할일없음
        시동이 꺼져있으면 시동을 건다
     */
    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다.");
        }

    } // startUp end

    /*
        # 앞으로 가라 method
        시동이 걸린 상태일 경우에만 10km/h 씩 속도를 증가
     */
    public void go() {
        if (this.isOn) {
            System.out.println("시속 증가");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        } else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 걸어주세요.");
        }
    } // go end

    /*
        # 멈춰라 method
        시동이 걸려있고 달리는 상태일 경우에만 멈출 수 있다.
     */
    public void stop() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 꺼진 채로 멈춰있습니다.");
        }

    } // stop end

    /*
        # 시동을 꺼라 method
        시동이 걸려있고 멈춰있는 상태일때만 시동을 끌 수 있음
        달리고 있거나 이미 시동이 꺼져있는 상태일 경우 끌 수 없음
     */

    public void turnOff() {
        if (this.isOn) {
            if (this.speed > 0) {
                System.out.println("움직이는 상태입니다. 시동을 끌 수 없습니다.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져있습니다.");
        }
    } // turnOff end


} // class end
