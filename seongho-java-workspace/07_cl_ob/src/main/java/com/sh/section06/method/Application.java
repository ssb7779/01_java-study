package com.sh.section06.method;

import com.sh.section04.dto.UserDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();
        pt.testPrimitiveTypeParam(10);
        pt.testPrimitiveTypeParam(20);


        System.out.println("==========================");
        int[] iArr={1,2,3,4,5};

        System.out.println(iArr);
        System.out.println(Arrays.toString(iArr));
        pt.testATP(iArr);
        System.out.println(Arrays.toString(iArr));


        System.out.println("=================");

        UserDTO user = new UserDTO("user01","pw","skh");
        System.out.println("전달 인스턴스 정보"+user);
        System.out.println("전달 인스턴스 정보"+user.getIF());

        pt.testCTP(user);
        System.out.println("메소드 종료 후 인스턴스 저옵" +user.getIF());

        pt.testVAP(10);
        pt.testVAP(10,20);
        pt.testVAP(10,20,30);

        pt.testVAP("ksh","asdf","asfads","asdfasa");
        pt.testVAP("kvv","zcva");
        pt.testVAP("kbh");
    }

}
