package com.seungjoo.practice3.controller;

public class Function {
    public void printLottoNumbers(){
        int num1 = (int)(Math.random() * 45) + 1;
        int num2 = (int)(Math.random() * 45) + 1;
        int num3 = (int)(Math.random() * 45) + 1;
        int num4 = (int)(Math.random() * 45) + 1;
        int num5 = (int)(Math.random() * 45) + 1;
        int num6 = (int)(Math.random() * 45) + 1;
        System.out.print("랜덤값 : ");
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");
        System.out.print(num4 + " ");
        System.out.print(num5 + " ");
        System.out.print(num6 + " ");
        System.out.println();
    }

    public void outputChar(int num, char c){
        System.out.print(c + "문자 " + num + "개 출력:");
        for (int i = 0; i < num; i++) {
            System.out.print(c + " ");

        }
        System.out.println();
    }

    public char alphabette() {
        if (Math.random() < 0.5) {
            System.out.print("랜덤 영문자 출력:");
            return (char) (Math.random() * 26 + 'a');
        } else {
            System.out.print("랜덤 영문자 출력:");
            return (char) (Math.random() * 26 + 'A');
        }
    }

    public String mySubstring(String str,int index1, int index2 ){
        if(str == "") {
            return null;
        }
        String st = "";
        for(int i = index1; i <index2; i++){
            st += str.charAt(i);
        }
        System.out.println(str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력 : " + st);
        return st;
    }







    }



























