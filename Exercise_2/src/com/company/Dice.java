/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Random;

/**
 * @author lbwagnerm
 */

public class Dice {

    private static int numberOfDices = 0;
    private Random rand = new Random();
    private int numberOfEyes = 0;

    // SETTER NumberOfDices
    public static void setNumberOfDices(int numberOfDices) {
        Dice.numberOfDices = numberOfDices;
    }

    // SETTER NumberOfEyes
    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }


    public Dice() {
        // TODO write some code
        this.numberOfEyes = 6;
        increaseNumberOfDices();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }


    /**
     * Constructor of a dice
     *
     * @param numOfEyes the number of sides (max eyes) the dice have.
     */
    public Dice(int numOfEyes) {
        // TODO write some code
        this.numberOfEyes = numOfEyes;
        increaseNumberOfDices();
        System.out.println("DICE --> Constructor: Dice nr: " + numberOfDices
                + " created with " + numberOfEyes + " eyes.");
    }


    /**
     * Function to increase the number of actual available dices.
     */
    private static void increaseNumberOfDices() {
        System.out.println("DICE --> Increasing number of dices.");
        // write some code
        int num = getNumberOfDices();
        setNumberOfDices(num + 1);
    }


    /**
     * Function to increase the number of actual available dices.
     */
    private static void decreaseNumberOfDices() {
        System.out.println("DICE --> Decreasing number of dices.");
        // write some code
        setNumberOfDices(getNumberOfDices() - 1);
    }


    /**
     * Function returning the actual number of created dices.
     *
     * @return The actual number of dices <code>int</code>.
     */
    public static int getNumberOfDices() {
        System.out.println("DICE --> Returning number of dices.");
        return Dice.numberOfDices;
    }


    public static int throwDices(Dice... dices) {
        int sumOfEyes = 0;
        // write some code
        for (Dice currentDice: dices) {
            int currentNumber = currentDice.throwDice();
            sumOfEyes = sumOfEyes + currentNumber;
            System.out.println("Number is: " + currentNumber);
        }
        return sumOfEyes; //correct return value
    }


    @Override // DO NOT TOUCH THIS :-)
    protected void finalize() {
        System.out.println("DICE --> Destructor: Dice nr: " + numberOfDices
                + " destroyed.");
        decreaseNumberOfDices();
    }


    public int getNumberOfEyes() {
        System.out.println("DICE --> Returning number of dice eyes.");
        return this.numberOfEyes; // write some code --> you need to find the correct return value
    }


    public int throwDice() {
        System.out.println("DICE --> Throwing the dice.");
        return getRandomNumberInRange(1,getNumberOfEyes()); // write some code --> you need to find the correct return value
    }


    public int[] throwDiceNTimes(int n) {
        System.out.println("DICE --> Throwing the dice " + n + " times");
        // TODO write some code
        return new int[1]; // TODO write some code --> you need to find the correct return value
    }


    private int getRandomNumberInRange(int min, int max) {
        // TODO write some code
        System.out.println("DICE --> Generating new random number.");
        return rand.nextInt(max - min) + min; // TODO write some code --> you need to find the correct return value
    }
}
