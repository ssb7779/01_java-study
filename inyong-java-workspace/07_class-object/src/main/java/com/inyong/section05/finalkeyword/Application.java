package com.inyong.section05.finalkeyword;

public class Application {
    public static void main(String[] args) {
//        FinalKeyword fk = new FinalKeyword();
        FinalKeyword fk = new FinalKeyword("캥가루");
        System.out.println(fk.getNAME());
        System.out.println(fk.getNUm());

        System.out.println(FinalKeyword.TEAM);

    }
}
