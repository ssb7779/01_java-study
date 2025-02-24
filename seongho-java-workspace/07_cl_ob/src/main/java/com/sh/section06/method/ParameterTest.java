package com.sh.section06.method;

import com.sh.section04.dto.UserDTO;

import java.util.Arrays;

public class ParameterTest {
    /*
    매개변수로 작성 가능한 자료형
    기본 자료형
    기본 자료형 배열
    클래스 자료형
    클래스 자료형 배열
    가변인자
     */
    public void testPrimitiveTypeParam(int num){
        System.out.println("매개변수 전달된 값"+num);
    }
    public void testATP(int[] arr){
        System.out.println("매개변수 전달된 값"+arr);


        System.out.println("매개변수 전달된 배열 요소"+ Arrays.toString(arr));

        arr[0]=100;
    }

    public void testCTP(UserDTO u){
        System.out.println("매개변수 전달 값"+u);
        System.out.println("매개변수 전달 인스턴스 정보"+ u.getIF());

        u.setPw("1111");

    }
    /*
    public void testVAP(int num1){}
    public void testVAP(int num1, int num2){}
    public void testVAP(int num1, int num2,int num3){}
*/
    public void testVAP(int... nums){
        //가변길이배열인자:넘어오는 인자값들을 기록하고 있는 배열
        System.out.println("매개변수로 전달된 값"+nums);
        System.out.println("매개변수로 전달된 요소"+ Arrays.toString(nums));

    }
    //public void testVAP(String... hobby,String name){

    public void testVAP(String name, String...hobby){
        System.out.println(name );
        System.out.println(Arrays.toString(hobby));

        }





}
