package com.sotogito.practice3.controller;

public class Function {
    public void printLottoNumbers() {
        int count = 6;

        for (int i = 0; i < count; i++) {
            System.out.println(
                    (int) (Math.random() * 45 + 1)
            );
        }
    }

    public void outputChar(int num, char c) {
        for (int i = 0; i < num; i++) {
            System.out.println('c');
        }
    }

    public char alphabette() {
        boolean isUpperCase = (int) (Math.random() * 2 + 0) == 0;
        if (isUpperCase) {
            return (char) (Math.random() * ((90 - 65) + 1) + 65);
        }
        return (char) (Math.random() * ((122 - 97) + 1) + 97);
    }

    public String mySubstring(String str, int index1, int index2) {
        String result = "";
        char[] token = new char[str.length()];

        for (int i = index1; i <= index2; i++) {
            result += str.charAt(i);
        }
        return result;
    }

}
