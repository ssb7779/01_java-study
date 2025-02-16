package com.younggalee.Section03.method;

import com.younggalee.section04.dto.UserDTO;

public class Application {
    public static void main(String[] args){
        ParameterTest pt = new ParameterTest();

        pt.testPrimitiveTypeParam(10);

        int[] irArr = {1, 2, 3, 4, 5};
//        System.out.println(irArr);
        pt.testArrayTypeParam(irArr);
        UserDTO user = new UserDTO("user1", "pwd1","이가영");
        System.out.println(user.getInformation()); //com.younggalee.section04.dto.UserDTO@77459877 주소값
        pt.testClassTypeParam(user); // 같은걸 참조중
        System.out.println(user.getInformation());

        pt.testVariableArgsParam(10);
        pt.testVariableArgsParam(10, 20, 30);

        pt.testVariableArgsParam("이가영","축구", "농구", "야구");
        pt.testVariableArgsParam("인용", "a","b","d", "f","a","eg");

    }
}
