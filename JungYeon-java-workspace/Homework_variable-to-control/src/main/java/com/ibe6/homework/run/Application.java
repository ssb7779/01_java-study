package com.ibe6.homework.run;

import com.ibe6.homework.controller.Function;
import com.ibe6.homework.view.Menu;

public class Application {
    public static void main(String[] args){

        Function fc = new Function();
//        fc.calculator();
//        fc.totalCalculator();
//        fc.printProfile();
//        fc.printScore();
//        fc.printStarNumber();
//        fc.exceptGugu();
//        fc.sumRandom();
//        fc.diceGame();

        Menu mn = new Menu();
        mn.displayMenu();
    }
}
