package com.pch.section01.condotional.run;

import com.pch.section01.condotional.controller.If;
import com.pch.section01.condotional.controller.Switch;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        If i = new If();

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번 예제를 테스트하시겠습니까? : ");
        num = sc.nextInt();
        sc.nextLine();

        switch (num) {
            case 1:
                i.testBaseicElse();
                break;
            case 2:
                i.testBaseicElse2();
                break;
            case 3:
                i.testIfExample1();
                break;
            case 4:
                i.testIfExample2();
                break;
            case 5:
                i.testIfExample3();
                break;
            case 6:
                i.testNestedIf();
                break;
            case 7:
                i.testNestedIfExample1();
                break;
            case 8:
                i.testNestedIfExample2();
                break;
            default:
                break;
        }

        Switch sw = new Switch();

        sw.switch1();

    }
}