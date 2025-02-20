package com.seongho.section01.conditional.controller;

import javax.swing.*;
import java.util.Scanner;

public class If {
    /*
    ##단일 if문


     */
    public void  testIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수");
        int score = sc.nextInt();

        if(score >= 60 ){
            System.out.println("통과");

        }

    }
    public void testEIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수");
        int score = sc.nextInt();

        if(score >= 60 ) {
            System.out.println("통과");

        }else {
            System.out.println(("탈락"));
        }

    }
    public void testEIf2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수:");
        int score= sc.nextInt();
        if(score>=80){
            System.out.println("통과");
        }else if(score>=60){
            System.out.println("재평가");
        }else{
            System.out.println(("탈락"));
        }
    }
    public void testIfEx(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이:");
        int age = sc.nextInt();
        /*if(age > 19){
            System.out.println("성인");
        }else if(age > 13){
            System.out.println("청소년");
        }else {
            System.out.println("어린이");
        }*/
        String result; //결과기록변수
        if (age <=13){
            result = "으린이";
        } else if (age<=19) {
            result ="청소년";
        }else {
            result = "성인";
        }
        System.out.println(result);
    }
    public void testIfEx2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String name = sc.nextLine();

        System.out.print("성별(M/F)");
        char gen = sc.nextLine().toUpperCase().charAt(0);
        /*                            //ㄴ다 대문자
        if(gen=='M'){
            System.out.println(name +"님 남자");;
        }else if(gen=='F'){
            System.out.println(name +"님 여자");
        }*/
        String result ="";
        if(gen=='M'){
            result="남자";
        }else if(gen=='F'){
            result="여자";
        }else {
            System.out.println("바보");
            return;//메소드 강제 종료
        }
        System.out.println(name+ "님은 " +result);
    }

    public void testIfEx3(){
        /*
        이름 입력받고
        홍길동이랑 일치하면 반갑습니다 출력 일치 안 하면 가십쇼
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름:");
        String name = sc.nextLine();
        /*
        if (name == "홍길동"){
            System.out.println("반갑소");
        }else {
            System.out.println("가시오");
        }

         */
        /*
        ##동등비교
        기본자료형 (boolean, char,byte,short,int,long,float,double)
            - 일치 :==
            - 불일치:!=
        참조자료형 (위에 빼고 다)
            -일치 : 비교대상.equals(비교대상2)
            -불일치: 일치하지 않는지 앞에 느낌표   !비교대상.equals(비교대상2)
         */
        if (name.equals("홍길동")){
            System.out.println("반갑소");
        }else {
            System.out.println("가시오");
        }

    }
    //#############조건문 중첩
    public void testNIf(){
        /*
        정수받고
        양수 아니면 양수아니다
        양수 맞는데 3의 배수면 3의 배수다\
        아니면 3의 배수 아니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수(양수)입력:");
        int num = sc.nextInt();

        if(num>0){
            if(num%3==0){
                System.out.println("3의 배수");
            }else {
                System.out.println("3의 배수 아니다");
            }
        }else {
            System.out.println("양수아니다");
        }
    }
    public void testNIfEx1(){
        /*
        사용자 학년 점수 입력 합격 여부
        학년 1~3 60점이상 합x불
        4~6 70점 이상 합 x불
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("학년:");
        int cl = sc.nextInt();
        System.out.print("점수");
        int sco = sc.nextInt();

        /*
        if (cl >3){
            if (sco>=70){
                System.out.println("합");
            }else {
                System.out.println("불");
            }

        }else if (sco >= 60 ){
            System.out.println("합");
        }else System.out.println("불");

         */
        int passSco =0;
        if (cl>=1 && cl<=3){
            passSco= 60;
        }else if (cl>=4 && cl <=6){
            passSco= 70;
        }
        if (sco>=passSco){
            System.out.println("합");
        }else {
            System.out.println("불");
        }
    }
    public void testNIfEx2(){
        /*
        주민번호 입력 받고 (-포함전부)
        잘입력하면 =>성별판별  출력 못했을시 잘못했어
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("주민:");
        String hu = sc.nextLine();

        if(14!=hu.length()){
            System.out.println("잘못했어");

        }else if(hu.charAt(7)=='1'||hu.charAt(7)=='3'){
            System.out.println("남자");

        }else if(hu.charAt(7)=='2'||hu.charAt(7)=='4'){
            System.out.println("여자");
        }else {
            System.out.println("바보");
        }
    }
}
