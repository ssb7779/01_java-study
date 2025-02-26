package com.podoseee.section03.unchecked_checked;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /*
            ## Unchecked Exception ##
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("0이 아닌 숫자만 입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(num);

        if(num != 0) { // 조건문으로 해결 가능
            System.out.println("나눗셈결과 : " + 10 / num);
        }

    }
}
