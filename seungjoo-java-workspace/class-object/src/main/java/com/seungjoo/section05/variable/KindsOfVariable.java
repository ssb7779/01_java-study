package com.seungjoo.section05.variable;

public class KindsOfVariable {

    private int globalNum;

   private static int staticNum;

   public void test(int paramNum){
       int localNum;


       System.out.println("매개변수:" + paramNum);


       System.out.println("인스턴스 변수:" + globalNum);
       System.out.println("클래스 변수: " + staticNum);
   }




}
