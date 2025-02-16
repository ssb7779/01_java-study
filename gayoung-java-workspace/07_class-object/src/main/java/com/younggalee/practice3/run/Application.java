package main.java.com.younggalee.practice3.run;

import main.java.com.younggalee.practice3.cotroller.Function;

public class Application {
    public static void main(String[] args) {
        Function f = new Function();
        f.printLottoNumbers();
        f.outputChar(5,'a');
        char randomAlphabet = f.alphabette();
        System.out.println("\n3. 랜덤 영문자 출력 : " + randomAlphabet);
        String splitStr = f.mySubstring("apple", 2, 4);
        System.out.println(splitStr);
    }
}
