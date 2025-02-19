package com.jjanggu.section06.method;

import com.jjanggu.section04.dto.UserDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        ParameterTest pt = new ParameterTest();
        pt.testPrimitiveTypeParam(10);
        pt.testPrimitiveTypeParam(20);

        System.out.println("============================");

        int[] iArr = {1, 2, 3, 4, 5};
        System.out.println("전달할 배열(원본): " + iArr);
        System.out.println("전달할 배열(원본) 요소: " + Arrays.toString(iArr));

        pt.testArrayTypeParam(iArr);
        System.out.println("메소드 종료 후 배열 요소: " + Arrays.toString(iArr));

        System.out.println("====================================");

        UserDTO user = new UserDTO("user01","pass01","홍길동");

        System.out.println("전달할 인스턴스: " + user);
        System.out.println("전달할 인스턴스 정보: " + user.getInformation());

        pt.testClassTypeParam(user);
        System.out.println("메소드 종료 후 인스턴스 정보: " + user.getInformation());

        System.out.println("=============================================");

        pt.testVariableArgsParam(10);
        pt.testVariableArgsParam(10, 20);
        pt.testVariableArgsParam(10, 20, 30);

        pt.testVariableArgsParam("홍길동", "축구", "농구", "야구");
        pt.testVariableArgsParam("김말똥", "당구");
        pt.testVariableArgsParam("김말순");

    }
}
