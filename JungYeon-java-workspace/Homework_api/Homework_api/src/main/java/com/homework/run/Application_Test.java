package com.homework.run;

import com.homework.controller.Calculator;

import java.util.Scanner;

public class Application_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cc = new Calculator();
        cc.makeCalendar();
        System.out.println("\n* 년도, 월, 일을 정수형으로 입력해주세요 *\n");
        String year
        // 년도, 월, 일(모두다 String타입)을 입력받은 후
        // Calculator 클래스의 makeCalendar 메소드 호출시 전달하여 결과받기

        // 위의 결과로 돌려받은 Calendar객체를 Calculator 클래스의 printFormat메소드 호출시 전달하여 실행하기


    }
}
