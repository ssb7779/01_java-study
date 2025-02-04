package com.seungjoo.section02.variable;

public class Application1 {
    public static void main(String[] args){
        System.out.println("변수 사용 전");
        System.out.println(9860*8); //일당
        System.out.println(9860*8*5); //주급
        System.out.println(9860*8*5*4); //월급
        System.out.println(9860*8*5*4*0.1); //세금


        /*
         변수
         특정 값을 메모리상에 기록하기 위한 공간(박스)

         메모리
         1.램(RAM)
         2. 프로그램 동작시 필요한 값들이 저장되는 장소
         3.휘발성이기 때문에 프로그램 종료시 메모리상에 존재하는 것들은 사라짐
         4. 특정값을 메모리상에 보관(기록)하고자 할 경우 변수를 먼저 생성해야 됨
         */
        System.out.println("변수 사용 후");

        int pay = 9860;
        int hour = 8;
        int day = 5;
        int week = 4;
        double tax = 0.1;
        System.out.println(pay*hour);
        System.out.println(pay*hour*day);
        System.out.println(pay* hour* day*week);

        System.out.println(pay*hour*day*week*tax);

        System.out.println("최저 시급: " +  pay);

        /*
        변수 사용 목적
        1.값에 의미를 부여할 수 있음.(가독성이 좋아짐)
        2. 자주 사용하는 값을 변수에 담아두면 동일한 값을 계속 사용할 수 있음.
        3. 유지보수에 용이함.(일괄적으로 값을 변경해야될 때, 변수 초기값만 변경하면 됨.
         */

    }
}
