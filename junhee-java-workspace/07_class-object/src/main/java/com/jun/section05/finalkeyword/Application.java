package com.jun.section05.finalkeyword;

public class Application {
    public static void main(String[] args) {

        FinalKeyword fk = new FinalKeyword("캥거루");
        System.out.println(fk.getNum());
        System.out.println(fk.getName());

        System.out.println(FinalKeyword.TEAM);

//        FinalKeyword.TEAM = "BR";


        System.out.println("PI: " + Math.PI );
    }
}
