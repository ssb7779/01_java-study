package com.jmk.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("변수 사용 전");
        System.out.println(9860 * 8 );                    // 일당: 최저 시급 * 근무시간
        System.out.println(9860 * 8 * 5);                 // 주급: 최저 시급 * 근무시간 * 근무요일
        System.out.println(9860 * 8 * 5 * 4);             // 월급: 최저 시급 * 근무시간 * 근무요일 * 근무주수
        System.out.println(9860 * 8 * 5 * 4 * 0.1);       // 세금: 월급 * 0.1

        /*
            특정 값을 메모리상에 기록하기 위한 공간(박스)
            ##메모리##
            1. 램(ram)
            2. 프로그램 동작시 필요한 값들이 저장되는 장소
            3. 휘발성이기 때문에 프로그램 종료시 메모리상에 존재하는 것들은 사라짐
            4. 특정값을 메모리상에 보관(기록)하고자 할 경우 변수를 먼저 생성해야함
         */
         System.out.println("변수 사용후 ");
         int pay = 9860; //최저 시급
         int hour = 8;   //하루 중 근무시간
         int day  = 5;   //하루 중 근무일수
         int week = 4;   //한달 중 근무주수
         double tax = 0.1;

         System.out.println(pay * hour);                          // 일당: 최저 시급 * 근무시간
         System.out.println(pay * hour * day);                    // 주급: 최저 시급 * 근무시간 * 근무요일
         System.out.println(pay * hour * day * week);             // 월급: 최저 시급 * 근무시간 * 근무요일 * 근무주수
         System.out.println(pay * hour * day * week * tax);       // 세금: 월급 * 0.1

         System.out.println(pay);                                 // 최저시급

         
         /*
             ##변수사용목적##
             1. 값에 의미를 부여할 수 있음(가독성이 좋아짐)
             2. 자주 사용하는 값을 변수에 담아두면 동일한 값을 계속 사용할 수 있음
             3. 유지보수에 용이해짐(일괄적으로 값을 변경해야 할 때 변수 초기값만 변경하면됨
          */


    }
}
