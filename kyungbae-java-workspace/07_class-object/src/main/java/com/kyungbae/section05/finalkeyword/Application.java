package com.kyungbae.section05.finalkeyword;

public class Application {

    public static void main(String[] args) {

//        FinalKeyword fk = new FinalKeyword(); // default constructor 가 존재하지 않아 오류
        FinalKeyword fk = new FinalKeyword("꼬막");
        System.out.println(fk.getNUM());
        System.out.println(fk.getNAME());

        System.out.println(FinalKeyword.TEAM);
//        FinalKeyword.TEAM = "nr";

        System.out.println("PI=" + Math.PI);
        // PI는 고정값이므로 constant field 로 만들어져 있다.

    }

} // class end
