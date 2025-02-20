package com.sh.section05.finalkeyword;

public class Application {
    public static void main(String[] args) {
        //Finalkeyword fk = new Finalkeyword();
        Finalkeyword fk = new Finalkeyword("고라니");
        System.out.println(fk.getNAME());
        System.out.println(fk.getNUM());
        System.out.println(Finalkeyword.TEAM);
        System.out.println(Math.PI);
    }
}
