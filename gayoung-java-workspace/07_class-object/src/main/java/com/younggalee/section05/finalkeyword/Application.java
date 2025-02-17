package com.younggalee.section05.finalkeyword;

public class Application {
    public static void main(String[] args){
        FinalKeyword fk = new FinalKeyword("이가영");
        System.out.println(fk.getNUM());
        System.out.println(fk.getNAME());

        System.out.println(FinalKeyword.TEAM);
        //new 생성없이 team 호출할 수 있다는 의미
        //그래서 그동안 static으로 선언된 것들은 import 없이 사용할 수 있었음.
        // 생성자가 private이면 new로 생성안됨.

        //ex
        System.out.println(Math.PI);

    }
}
