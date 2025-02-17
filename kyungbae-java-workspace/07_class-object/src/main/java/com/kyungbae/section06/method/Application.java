package com.kyungbae.section06.method;

import com.kyungbae.section04.dto.UserDTO;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        ParameterTest pt = new ParameterTest();
        pt.testPrimitiveTypeParam(10);
        pt.testPrimitiveTypeParam(20);

        int[] iArr = {1,2,3,4,5};
        System.out.println("전달할 배열 (원본): " + iArr.hashCode());
        System.out.println("전달할 배열 요소(원본): " + Arrays.toString(iArr));

        pt.testArrayTypeParam(iArr); // shallow copy
//        pt.testArrayTypeParam(iArr.clone()); // deep copy
        System.out.println("메소드 종류 후 배열 요소: " + Arrays.toString(iArr));

        System.out.println("=================================");

        UserDTO user = new UserDTO("user01", "pass01", "김첨지");

        System.out.println("전달할 인스턴스: " + user);
        System.out.println("전달할 인스턴스 정보: " + user.getInformation());

        pt.testClassTypeParam(user); // shallow copy
        System.out.println("매소드 종료 후 인스턴스 정보: " + user.getInformation());

        pt.testVariableArgsParam(10);
        pt.testVariableArgsParam(10, 20);
        pt.testVariableArgsParam(10, 20, 30);

        pt.testVariableArgsParam("최종일","축구","농구","야구");
        pt.testVariableArgsParam("스티브잡스","당구");
        pt.testVariableArgsParam("뽀로로");

    }


} // class end
