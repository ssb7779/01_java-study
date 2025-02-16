package com.sotogito.section6.method;

import com.sotogito.section4.dto.UserDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();
        /*
        pt.testPrimitiveTypeParam(1);

        System.out.println("=============================");

        int[] num = new int[]{1, 2, 3, 4, 5};
        pt.testArrayTypePAram(num);
        System.out.println(Arrays.toString(num));

        System.out.println("=============================");

        UserDTO user = new UserDTO("qwe", "pasfd", "홍길동");

        System.out.println("전달할 인스턴스: " + user);
        System.out.println("전달할 인스턴스 정보: " + user.getInfo());
        pt.testClassTypeParam(user);
        System.out.println("변경후 인스턴스 정보: " + user.getInfo());

        System.out.println("=============================");

         */

//        pt.testVariableArgsParam(10);
//        pt.testVariableArgsParam(10, 11, 12);
//        pt.testVariableArgsParam(10, 124, 14, 412, 124);

        pt.testVariableArgsParam("홍길동","축구","농구","야구");
    }
}
