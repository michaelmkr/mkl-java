/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 * @author lbwagnerm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice d1 = new Dice();
        Dice d2 = new Dice(12);
        System.out.println("-----\nMAIN --> Actual number of created dices: "
                + Dice.getNumberOfDices());
        System.out.println("-----\nMAIN --> Dice 1 was thrown, number is: "
                + d1.throwDice());
        System.out.println("-----\nMAIN --> Dice 2 was thrown, number is: "
                + d2.throwDice());
        Dice d3 = new Dice(9);
        System.out.println("-----\nMAIN --> Actual number of created dices: "
                + Dice.getNumberOfDices());
        System.out.println("-----\nMAIN --> Dice 3 was thrown, number is: "
                + d3.throwDice());
        System.out.println("-----\nMAIN --> Dices 1 and 2 are thrown together: "
                + Dice.throwDices(d1, d2));
        System.out.println("-----\nMAIN --> Dices 1, 2 and 3 are thrown together: "
                + Dice.throwDices(d1, d2, d3));
        System.out.println("-----\nMAIN --> Dices 1, 3 and X are thrown together: "
                + Dice.throwDices(d1, d3, new Dice()));
        d1 = null;
        System.gc();    // Calling garbidge collector --> needed for example
        d2.throwDiceNTimes(5);
        int deltaTime = 0;
        long startTime = System.nanoTime();
        while (5 > deltaTime) {   // checking for seconds
            long time = System.nanoTime();
            deltaTime = (int) ((time - startTime) / 1000000000); // nsec to sec
        }
        System.out.println("-----\nMAIN --> Actual number of created dices: "
                + Dice.getNumberOfDices());
    }
}
