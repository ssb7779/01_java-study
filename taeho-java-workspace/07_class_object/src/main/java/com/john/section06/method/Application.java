package com.john.section06.method;

import com.john.section04.dto.UserDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        ParameterTest pt = new ParameterTest();

        pt.testPrimitiveTypeParameter(10);
        pt.testPrimitiveTypeParameter(20);

        System.out.println("==========================================");

        int[] intArr = {1,2,3,4,5};

        System.out.println("전달할 배열: " + intArr);
        System.out.println("전달할 배열요소: " + Arrays.toString(intArr));

        pt.testArrayTypeParameter(intArr);

        System.out.println("메서드 종료후 배열요소: " + Arrays.toString(intArr));
        System.out.println("==========================================");

        UserDTO user = new UserDTO("user01", "pass01", "지미핸드릭스");

        System.out.println("전달할 인스턴스: " + user);
        System.out.println("전달할 인스턴스 정보: " + user.getInfomation());

        pt.testClassTypeParameter(user);
        System.out.println("메서드 종료후 인스턴스 정보: " + user.getInfomation());

        pt.testVariableArgsParameter(10);
        pt.testVariableArgsParameter(10, 20);
        pt.testVariableArgsParameter(10, 20, 30);

        pt.testVariableArgsParameter("제스퍼","코딩","독서");
        
        pt.testVariableArgsParameter("장길산", "등산");
        pt.testVariableArgsParameter("코타나");

    }
}
