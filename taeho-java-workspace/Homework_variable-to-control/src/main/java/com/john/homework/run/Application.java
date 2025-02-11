package com.john.homework.run;

import com.john.homework.controller.Function;
import com.john.homework.view.Menu;

public class Application {
    public static void main(String[] args) {
        Function f = new Function();
//        f.calculator();
//        f.totalCalculator();
//        f.printProfile();
//        f.printScore();
//        f.printStarNumber();
//        f.sumRandom();
//        f.exceptGugu();
//        f.diceGame();
        Menu menu = new Menu();
        menu.displayMenu();

    }

}
