package com.sotogito.section5.finalkeyword;

public class Application {

    public static void main(String[] args) {
        FinalKeyword fk = new FinalKeyword("qwe");
        System.out.println(fk.getName());
        System.out.println(fk.getNum());

        System.out.println(FinalKeyword.TEAM);
        System.out.println("PI" + Math.PI); //Math 클래스의 생성자는 private임 -> 어차피 다 static
    }
}
